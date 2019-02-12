/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprocess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import view.main;
import view.tablerender;

/**
 *
 * @author gg
 */
public class render {

    private Thread d;
    private main mainFrame = null;
    private String command;
    File[] mp4Files;
    String ouput;
    tablerender t;

    public void cmd(String s, File[] mp4Files, String ouput, javax.swing.JFrame frame) {
        mainFrame = (main) frame;
        this.mp4Files = mp4Files;
        this.ouput = ouput;
        command = getCurrentWorkingDir()
                + "\\Bin\\" + s;
        startRender();
        t = new tablerender(mainFrame, false);
        t.loadTable(mp4Files);

        if (!d.isAlive()) {
            d.start();
            t.setVisible(true);
        }
    }

    public void cmd2(String s, File[] mp4Files, int cut, String ouput, javax.swing.JFrame frame) {
        mainFrame = (main) frame;
        this.mp4Files = mp4Files;
        this.ouput = ouput;
        command = "";
        command = getCurrentWorkingDir()
                + "\\Bin\\ffmpeg" + " " + "-y -ss " + cut + " " + s;
        startRender();
        t = new tablerender(mainFrame, false);
        t.loadTable(mp4Files);

        if (!d.isAlive()) {
            d.start();
            t.setVisible(true);
        }
    }

    public void stop() {
        if (d.isAlive()) {
            p3.destroy();
            d.stop();
            System.out.println("stopped");
            t.dispose();

        } else {
            System.out.println("no thread running");
        }
    }
    Process p3;

    public void startRender() {
        d = new Thread() {
            public void run() {
                try {
                    int i = 0;
                    String commanrender;
                    for (File mp4File : mp4Files) {
                        boolean check = false;
                        setStatusTable(i, 3, "Waiting");
                        commanrender = command.replace("\"{input}.*\"", "\"" + mp4File.getPath() + "\"");
                        commanrender = commanrender.replace("\"{output}.mp4\"", "\"" + ouput + mp4File.getName() + "\"");
                        System.out.println(commanrender);
                        Thread.sleep(500);
                        mainFrame.setRunTxt();
                        p3 = new ProcessBuilder("cmd.exe", "/c", commanrender).redirectErrorStream(true).start();
                        StringBuilder strBuild = new StringBuilder();
                        try (BufferedReader processOutputReader = new BufferedReader(new InputStreamReader(p3.getInputStream(), Charset.defaultCharset()));) {
                            String line;
                            String s = "";
                            String txtArea;
                            int c = 0;
                            while ((line = processOutputReader.readLine()) != null) {
                                if (c == 0 || c == 4) {
                                    s = "Running";
                                    c = 0;
                                }
                                setStatusTable(i, 3, s);
                                s += ".";
                                c++;
                                txtArea = mainFrame.getConsoleText();
                                txtArea += "\n" + line;
                                mainFrame.setConsoleText(txtArea);
                                if (line.contains("frame=")) {
                                    check = true;
                                }
                            }

                        }
                        if (check == false) {
                            setStatusTable(i, 3, "Error");
                        } else {
                            setStatusTable(i, 3, "Done");
                        }
                        i++;

                    }
                    mainFrame.stopRunning();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Lỗi : render");
                    mainFrame.stopRunning();

                }
            }
        };
    }

    void writeFile(String s, String name) {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(name + ".bat"))) {
            writer.write(s);
        } catch (IOException ex) {
            Logger.getLogger(render.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setStatusTable(int i, int j, String s) {
        t.model.setValueAt(s, i, j);
    }

    private String getCurrentWorkingDir() {
        return System.getProperty("user.dir");
    }

}
