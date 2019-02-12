/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprocess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import view.main;

/**
 *
 * @author gg
 */
public class uploadtopbuzz {

    void writeFile(String s) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(getCurrentWorkingDir() + "\\Bin\\rename.ps1"));
            writer.write(s);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(uploadtopbuzz.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(uploadtopbuzz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void renamefile(String folderupload2) {
        try {
            writeFile("cd " + folderupload2 + " ; dir | rename-item -NewName {$_.name.Replace(\" \",\"_\")};");
            Thread.sleep(500);
            String command = "powershell -NoProfile -ExecutionPolicy Bypass -File " + getCurrentWorkingDir() + "\\Bin\\rename.ps1";// Executing the command
            Process powerShellProcess = Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            Logger.getLogger(uploadtopbuzz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(uploadtopbuzz.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private String getCurrentWorkingDir() {
        return System.getProperty("user.dir");
    }
    static ChromeDriver chromeDriver;

    public void run(String folderupload2, String fileName2, String des2, int i) {
        try {
            System.out.println(folderupload2);
            renamefile(folderupload2);
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--disable-notifications");
//        option.addArguments("headless");
            String user = System.getenv("USERNAME");
            option.addArguments("user-data-dir=C:/" + user + "/user_name/AppData/Local/Google/Chrome/User Data");
            chromeDriver = new ChromeDriver(option);
            Thread.sleep(500);
            chromeDriver.get("https://www.topbuzz.com/profile_v2/video");
            chromeDriver.findElementsByClassName("tb-btn-wrapper").get(0).click();
            Thread.sleep(500);
            System.out.println(des2);
            System.out.println(getCurrentWorkingDir() + "\\Downloads2\\" + fileName2 + ".mp4");
            Runtime.getRuntime().exec(getCurrentWorkingDir() + "\\Bin\\AutoItScript.exe " + getCurrentWorkingDir() + "\\Downloads2\\" + fileName2 + ".mp4");
            while (true) {
                if (chromeDriver.findElementsByClassName("video-play-stage").isEmpty() == false) {
                    chromeDriver.findElementsByTagName("textarea").get(0).sendKeys(fileName2.replace("_", " "));
                    Thread.sleep(500);
                    chromeDriver.findElementsByTagName("textarea").get(1).sendKeys(des2);
                    Thread.sleep(1000);
                    chromeDriver.findElementsByClassName("tb-btn-wrapper").get(0).click();
                    while (true) {
                        if (chromeDriver.findElementsByClassName("dash-container").isEmpty() == false) {
//                            mainFrame.model4.setValueAt("Done", i, 4);
                            chromeDriver.close();
                            break;
                        }

                    }
                    break;
                }
            }
        } catch (InterruptedException ex) {
            chromeDriver.close();
        } catch (IOException ex) {
            chromeDriver.close();
        }
    }
    Thread a;

    public void runUpload() {
        a = new Thread() {
            public void run() {
                run1();
            }
        };
    }
    main mainFrame;
    File[] mp4Files;
    String folderupload;

    public void setrun1(String folderupload, File[] mp4Files, javax.swing.JFrame frame, boolean check) {
        mainFrame = (main) frame;
        runUpload();
        this.folderupload = folderupload;
        this.mp4Files = mp4Files;
        this.check = check;
        if (!a.isAlive()) {
            a.start();
        }
    }
    boolean check;

    public void run1() {
        if (check) {
            try {
                renamefile(folderupload);
                ChromeOptions option = new ChromeOptions();
                option.addArguments("--disable-notifications");
//        option.addArguments("headless");
                String user = System.getenv("USERNAME");
                option.addArguments("user-data-dir=C:/" + user + "/user_name/AppData/Local/Google/Chrome/User Data");
                chromeDriver = new ChromeDriver(option);
                Thread.sleep(500);
                int i = 0;

                for (File mp4File : mp4Files) {
                    if (check) {
                        chromeDriver.get("https://www.topbuzz.com/profile_v2/video");
                        chromeDriver.findElementsByClassName("tb-btn-wrapper").get(0).click();
                        Thread.sleep(500);
                        String fileName = mp4File.getPath().replace(" ", "_");
                        System.out.println(fileName);
                        Runtime.getRuntime().exec(getCurrentWorkingDir() + "\\Bin\\AutoItScript.exe " + fileName);

                        while (true) {
                            if (chromeDriver.findElementsByClassName("video-play-stage").isEmpty() == false) {
                                chromeDriver.findElementsByTagName("textarea").get(0).sendKeys(mp4File.getName());
                                Thread.sleep(500);
                                chromeDriver.findElementsByTagName("textarea").get(1).sendKeys(mainFrame.model3.getValueAt(i, 2).toString());
                                Thread.sleep(1000);
                                chromeDriver.findElementsByClassName("tb-btn-wrapper").get(0).click();
                                while (true) {
                                    if (chromeDriver.findElementsByClassName("dash-container").isEmpty() == false) {
                                        mainFrame.model3.setValueAt("Done", i, 3);
                                        break;
                                    }

                                }
                                break;
                            }
                        }
                    }
                    if (!check) {
                        break;
                    }
                    i++;
                }
                chromeDriver.close();

            } catch (InterruptedException ex) {
                chromeDriver.close();
            } catch (IOException ex) {
                chromeDriver.close();
            }
        }
        System.out.println(" ");
    }
}
