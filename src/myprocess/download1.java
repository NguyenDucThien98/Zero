package myprocess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import view.main;

public class download1 {

    private Thread a, b, c;
    private ProcessBuilder builder2;
    private Process p2;
    private JSONParser parser;
    private String command;
    private main mainFrame = null;

    public download1() {
    }
    String folderSave = "";
    String folderSave2 = "";
    boolean checkRunning = true;

    public void downloadVideo2(String folderSave) {
        this.folderSave2 = folderSave;
        download2();
        loadCMD2();
        c.start();
        b.start();
    }
    String name = "";
    String commandDownload = "";
    String des2 = "";

    public void loadCMD2() {
        b = new Thread() {
            public void run() {
                checkRunning = true;
                for (int i = 0; i < mainFrame.model4.getRowCount(); i++) {
                    if (checkRunning) {
                        String strURL = mainFrame.model4.getValueAt(i, 1).toString();
                        name = mainFrame.model4.getValueAt(i, 2).toString();
                        des2 = mainFrame.model4.getValueAt(i, 3).toString();
                        commandDownload = getCurrentWorkingDir()
                                + "\\Bin\\youtube-dl -f 136 "
                                + " --output " + '"' + folderSave2 + "%(title)s.%(ext)s" + '"' + " "
                                + '"' + strURL + '"';

                        synchronized (c) {
                            c.notify();
                        }
                        synchronized (b) {
                            try {
                                b.wait();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(download1.class.getName()).log(Level.SEVERE, null, ex);

                            }
                        }
                    }
                }

            }
        };

    }
    uploadtopbuzz u = new uploadtopbuzz();

    public void download2() {
        c = new Thread() {
            public void run() {
                for (int i = 0; i < mainFrame.model4.getRowCount(); i++) {

                    try {
                        synchronized (c) {
                            try {
                                c.wait();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(download1.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        mainFrame.model4.setValueAt("Downloading...", i, 4);
                        ProcessBuilder builder3 = new ProcessBuilder("cmd.exe", "/c", commandDownload);
                        Process p3 = builder3.start();
                        BufferedReader r3 = new BufferedReader(new InputStreamReader(p3.getInputStream()));
                        String line;
                        int c = 0;
                        while ((line = r3.readLine()) != null) {
                            if (line.contains("[download]")) {
                                mainFrame.setDownloadStatus2(line);
                                c = 0;
                            } else {
                                c = 1;
                            }
                        }
                        if (c == 0) {
                            mainFrame.setDownloadStatus2("đã tải " + name);
                            mainFrame.model4.setValueAt("Done", i, 4);
                            name = name.replace(" ", "_");
                            name = name.replace("/", "_");
                            name = name.replace("\\", "_");
                            name = name.replace(":", "_");
                            name = name.replace("*", "_");
                            name = name.replace("?", "_");
                            name = name.replace("\"", "_");
                            name = name.replace("<", "_");
                            name = name.replace(">", "_");
                            name = name.replace("|", "_");
                            u.run(folderSave2, name, des2, i);

                        } else {
                            mainFrame.setDownloadStatus2("Error : " + name);
                            mainFrame.model4.setValueAt("Error: <720P", i, 4);
                        }

                    } catch (IOException ex) {
                        Logger.getLogger(download1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    synchronized (b) {
                        b.notify();
                    }
                }
                mainFrame.setRuntxtup();
                checkRunning = false;
                b.stop();
                c.stop();

            }
        };
    }
    public void stopRunning() {
        checkRunning = false;
        b.stop();
        c.stop();
    }
    boolean checkFirst = false;

    void revomeJson() {
        String s = "rd /s /q " + getCurrentWorkingDir() + "\\json2";
        ProcessBuilder builder2 = new ProcessBuilder("cmd.exe", "/c", s);
        try {
            Process p2 = builder2.start();
        } catch (IOException ex) {
            Logger.getLogger(download1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cmd2(String URL, String Soluong, javax.swing.JFrame frame) {
        mainFrame = (main) frame;
        command = getCurrentWorkingDir()
                + "\\Bin\\youtube-dl "
                + Soluong + " "
                + "--write-info-json --skip-download "
                + URL + " --o json2/%(title)s";
        System.out.println(command);
        loadID2();
        if (checkFirst == false) {
            revomeJson();
            checkFirst = true;
        }
        if (!a.isAlive()) {
            a.start();
        }
    }

    public void loadID2() {
        a = new Thread() {
            public void run() {
                try {
                    ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
                    Process p = builder.start();
                    BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    String line;
                    String s = ".";
                    int count = 0;
                    while ((line = r.readLine()) != null) {
                        mainFrame.setDownloadStatus2(line);
                    }
                    Thread.sleep(2000);
                    readjson2();
                } catch (Exception e) {
                    mainFrame.setadd();
                    JOptionPane.showMessageDialog(null, "Lỗi : Get ID ");
                }
            }
        };
    }

    void addTB(Object obj, JSONObject jsonObject, File xjsonFile, int i) throws FileNotFoundException, IOException, ParseException {
        obj = parser.parse(new FileReader(xjsonFile));
        jsonObject = (JSONObject) obj;
        String Title = (String) jsonObject.get("fulltitle");
        mainFrame.setDownloadStatus2("Reading " + Title);
        String Des = mainFrame.gettextTxtdes1();
        String webpage_url = (String) jsonObject.get("webpage_url");
        mainFrame.model4.addRow(new Object[]{
            i, webpage_url, Title, Des, "Not Started"
        });
        mainFrame.model4.fireTableDataChanged();
    }

    void readjson2() throws ParseException, IOException {
        File dir = new File("json2\\");
        int i = mainFrame.model4.getRowCount() + 1;
        JSONObject jsonObject = null;
        Object obj = null;
        jsonFiles2 = dir.listFiles(new TxtFilenameFilter());
        parser = new JSONParser();
        for (File xjsonFile : jsonFiles2) {

            System.out.println(xjsonFile);
            if (i == 1) {
                addTB(obj, jsonObject, xjsonFile, i);
                i++;
                mainFrame.setDownloadStatus2("Done");
            } else {
                boolean check = false;
                for (int j = 0; j < i - 1; j++) {
                    obj = parser.parse(new FileReader(xjsonFile));
                    jsonObject = (JSONObject) obj;
                    String name1 = (String) jsonObject.get("webpage_url");
                    String name2 = mainFrame.model4.getValueAt(j, 1).toString();
                    System.out.println(name1);
                    System.out.println(name2);
                    if (name1.equals(name2)) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
                if (check == true) {
                    addTB(obj, jsonObject, xjsonFile, i);
                    i++;
                }
                mainFrame.setDownloadStatus2("Done");
            }

        }
        mainFrame.setadd();
        a.stop();
    }
    File[] jsonFiles2;

    public class TxtFilenameFilter implements FilenameFilter {

        // Chấp nhận các đường dẫn (path) có hậu tố là '.txt'
        @Override
        public boolean accept(File dir, String name) {
            if (name.endsWith(".json")) {
                return true;
            }
            return false;
        }
    }

    private String getCurrentWorkingDir() {
        return System.getProperty("user.dir");
    }

}
