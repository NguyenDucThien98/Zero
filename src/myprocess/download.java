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

public class download {

    private Thread a, b, c, d, e;
    private ProcessBuilder builder2;
    private Process p2;
    private JSONParser parser;
    private String command;
    private main mainFrame = null;

    String folderSave = "";

    public void downloadVideo(String folderSave) {
        this.folderSave = folderSave;
        download();
        loadCMD();
        setrunning();
        c.start();
        e.start();
        b.start();
    }

    String name = "";
    String commandDownload = "";

    boolean checkRunning = true;

    public void setrunning() {
        e = new Thread() {
            public void run() {

                mainFrame.setRunningDownload(true);

            }
        };
    }

    public void loadCMD() {
        b = new Thread() {
            public void run() {
                  checkRunning = true;
                for (int i = 0; i < mainFrame.getRowCount(); i++) {
                    if (checkRunning) {
                        String strURL = mainFrame.model.getValueAt(i, 1).toString();
                        name = mainFrame.model.getValueAt(i, 2).toString();
                        commandDownload = getCurrentWorkingDir()
                                + "\\Bin\\youtube-dl -f 136 "
                                + " --output " + '"' + folderSave + "%(title)s.%(ext)s" + '"' + " "
                                + '"' + strURL + '"';
                        System.out.println(commandDownload);
                        synchronized (c) {
                            c.notify();
                        }
                        synchronized (b) {
                            try {
                                b.wait();
                            } catch (InterruptedException ex) {
                                System.out.println("Error b.wait()");
                            }
                        }
                    }
                }
            }
        };
    }
  

    public void download() {
        c = new Thread() {
            public void run() {
                checkRunning = true;
                for (int i = 0; i < mainFrame.getRowCount(); i++) {
                    if (checkRunning) {
                        synchronized (c) {
                            try {
                                c.wait();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        mainFrame.model.setValueAt("Downloading...", i, 5);
                        ProcessBuilder builder3 = new ProcessBuilder("cmd.exe", "/c", commandDownload);
                        Process p3;
                        try {
                            p3 = builder3.start();
                            BufferedReader r3 = new BufferedReader(new InputStreamReader(p3.getInputStream()));
                            String line;
                            int c = 0;
                            while ((line = r3.readLine()) != null) {
                                if (line.contains("[download]")) {
                                    mainFrame.setDownloadStatus(line);
                                    c = 0;
                                } else {
                                    c = 1;
                                }

                            }
                            if (c == 0) {
                                mainFrame.setDownloadStatus("đã tải " + name);
                                mainFrame.model.setValueAt("Done", i, 5);
                            } else {
                                mainFrame.setDownloadStatus("Error : " + name);
                                mainFrame.model.setValueAt("Error: <720P", i, 5);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        synchronized (b) {
                            b.notify();
                        }

                    }
                }
                mainFrame.setRunningDownload(false);
                checkRunning = false;
                e.stop();
                b.stop();
                c.stop();
            }
        };
    }

    public void stopRunning() {
        checkRunning = false;
        e.stop();
        b.stop();
        c.stop();
    }

    uploadtopbuzz u = new uploadtopbuzz();

    boolean checkFirst = false;

    void revomeJson() {
        String s = "rd /s /q " + getCurrentWorkingDir() + "\\json";
        ProcessBuilder builder2 = new ProcessBuilder("cmd.exe", "/c", s);
        try {
            Process p2 = builder2.start();
        } catch (IOException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    boolean checkLoading = true;

    public void setloading() {
        d = new Thread() {
            public void run() {
                mainFrame.setLoading(true);
            }
        };
    }

    public void cmd(String URL, String Soluong, String MinViews, String MaxViews, javax.swing.JFrame frame) {
        mainFrame = (main) frame;
        command = getCurrentWorkingDir()
                + "\\Bin\\youtube-dl "
                + Soluong + " "
                + MinViews + " "
                + MaxViews + " "
                + "--write-info-json --skip-download "
                + URL + " --o json/%(title)s";
        loadID();
        setloading();
        if (checkFirst == false) {
            revomeJson();
            checkFirst = true;
        }
        if (!a.isAlive() && !d.isAlive()) {
            a.start();
            d.start();
        }
    }

    public void loadID() {
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
                        mainFrame.setDownloadStatus(line);
                    }
                    Thread.sleep(2000);
                    readjson();
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Lỗi : Get ID ");
                }
            }
        };
    }

    public void addTable(Object obj, JSONObject jsonObject, File xjsonFile, int i) {
        try {
            obj = parser.parse(new FileReader(xjsonFile));
            jsonObject = (JSONObject) obj;
            String Title = (String) jsonObject.get("fulltitle");
//            String Des = (String) jsonObject.get("description");
            String webpage_url = (String) jsonObject.get("webpage_url");
            long viewcount = (long) jsonObject.get("view_count");
            long duration = (long) jsonObject.get("duration");
            double ax = Double.parseDouble(duration + "") / 60;
//            JSONArray Tags = (JSONArray) jsonObject.get("tags");
//            String xTags = "";
//            for (int i1 = 0; i1 < Tags.size(); i1++) {
//                xTags += Tags.get(i1) + ",";
//            }
            mainFrame.addTable(i, webpage_url, Title, viewcount, ax, "Not started");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void readjson() throws ParseException {
        checkLoading = true;
        File dir = new File("json\\");
        int i = mainFrame.getRowCount() + 1;
        System.out.println(i);
        JSONObject jsonObject = null;
        Object obj = null;
        jsonFiles = dir.listFiles(new TxtFilenameFilter());
        parser = new JSONParser();
        for (File xjsonFile : jsonFiles) {
            if (checkLoading) {
                System.out.println(xjsonFile);
                if (i == 1) {
                    addTable(obj, jsonObject, xjsonFile, i);
                    i++;
                    mainFrame.setDownloadStatus("Done");
                } else {
                    boolean check = false;
                    System.out.println(a);
                    for (int j = 0; j < i - 1; j++) {
                        try {
                            obj = parser.parse(new FileReader(xjsonFile));
                            jsonObject = (JSONObject) obj;
                            String name1 = (String) jsonObject.get("webpage_url");
                            String name2 = mainFrame.model.getValueAt(j, 1).toString();
                            System.out.println(name1);
                            System.out.println(name2);
                            if (name1.equals(name2)) {
                                check = false;
                                break;
                            } else {
                                check = true;
                            }
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(download.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    System.out.println(check);
                    if (check == true) {
                        addTable(obj, jsonObject, xjsonFile, i);
                        i++;
                    }
                    mainFrame.setDownloadStatus("Done");
                }
            }
        }
        d.stop();
        mainFrame.setLoading(false);
        checkLoading = false;
        a.stop();
    }

    public void stopLoading() {
        a.stop();
        d.stop();
        mainFrame.setLoading(false);
        this.checkLoading = false;
    }

    File[] jsonFiles;

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
