/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.services.samples.youtube.cmdline.Auth;
import com.google.api.services.youtube.YouTube;
import com.google.common.collect.Lists;
import myprocess.render;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Point;
import static java.awt.SystemColor.window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultEditorKit;
import myprocess.download;
import myprocess.download1;
import myprocess.uploadtopbuzz;
import myprocess.uploadyoutube;

/**
 *
 * @author gg
 */
public class main extends javax.swing.JFrame {

    private String getCurrentWorkingDir() {
        return System.getProperty("user.dir");
    }

    public main() {
        setUndecorated(true); // Remove title bar
        this.setResizable(false);
        initComponents();
        components1();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Logo = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Dowload = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Render = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Upload = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Uploadtopbuzz = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Live = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        About = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        renderform = new keeptoo.KGradientPanel();
        txtinput = new javax.swing.JTextField();
        btnrun1 = new javax.swing.JPanel();
        lbruntxt1 = new javax.swing.JLabel();
        jaboutlink1 = new javax.swing.JLabel();
        listCodeFile = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtOutCode = new javax.swing.JTextArea();
        txtCutTime = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        listSpeed = new javax.swing.JComboBox<>();
        listbitratevideo = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        listAspect = new javax.swing.JComboBox<>();
        listQuality = new javax.swing.JComboBox<>();
        listBitrateAudio = new javax.swing.JComboBox<>();
        listFrequency = new javax.swing.JComboBox<>();
        listChannels = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        btnsave1 = new javax.swing.JLabel();
        checkformtuychinh = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        txtSave1 = new javax.swing.JTextField();
        btnfolderinput = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtaudiofile = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        listSpeedofcode = new javax.swing.JComboBox<>();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtintrofile = new javax.swing.JTextField();
        txtoutrofile = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txtcuttimecode = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtlogofile = new javax.swing.JTextField();
        btnlogoinput = new javax.swing.JLabel();
        btnoutroinput = new javax.swing.JLabel();
        btnintroinput = new javax.swing.JLabel();
        btnaudioinput = new javax.swing.JLabel();
        Uploadform = new keeptoo.KGradientPanel();
        txtinputupload = new javax.swing.JTextField();
        btnrunupload = new javax.swing.JPanel();
        lbruntxt3 = new javax.swing.JLabel();
        jaboutlink3 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        btnfolderinputupload = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtConsole1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableupload = new javax.swing.JTable();
        cpublic = new javax.swing.JRadioButton();
        cprivate = new javax.swing.JRadioButton();
        cunlisted = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtdes = new javax.swing.JTextArea();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txttag = new javax.swing.JTextArea();
        jLabel60 = new javax.swing.JLabel();
        listupload = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnrun5 = new javax.swing.JPanel();
        lbruntxt5 = new javax.swing.JLabel();
        Homeform = new keeptoo.KGradientPanel();
        jLabel32 = new javax.swing.JLabel();
        lbUsername1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblinkhomeform = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        iconlink = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jaboutlink2 = new javax.swing.JLabel();
        lbslngay = new javax.swing.JLabel();
        UploadTopbuzzform = new keeptoo.KGradientPanel();
        txtinputupload1 = new javax.swing.JTextField();
        btnrunupload1 = new javax.swing.JPanel();
        lbruntxt4 = new javax.swing.JLabel();
        jaboutlink4 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        btnfolderinputupload1 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableupload1 = new javax.swing.JTable();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtdes1 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablecontent1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cuploadtopbuzz = new javax.swing.JCheckBox();
        jLabel65 = new javax.swing.JLabel();
        txtlinkupload = new javax.swing.JTextField();
        btnaddlinkupload = new javax.swing.JButton();
        downloadstatus1 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        inforform = new keeptoo.KGradientPanel();
        jaboutlink7 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        liveform = new keeptoo.KGradientPanel();
        btnrunlive = new javax.swing.JPanel();
        lbruntxt2 = new javax.swing.JLabel();
        jaboutlink5 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtConsolelive = new javax.swing.JTextArea();
        jLabel84 = new javax.swing.JLabel();
        txtloop1 = new javax.swing.JTextField();
        btnfilelive = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtlive1 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtlive2 = new javax.swing.JTextField();
        btnfilelive2 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        txtluong1 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        clive1 = new javax.swing.JCheckBox();
        txtloop2 = new javax.swing.JTextField();
        txtluong2 = new javax.swing.JTextField();
        cluong2 = new javax.swing.JCheckBox();
        cluong3 = new javax.swing.JCheckBox();
        jLabel97 = new javax.swing.JLabel();
        txtluong4 = new javax.swing.JTextField();
        cluong4 = new javax.swing.JCheckBox();
        cluong1 = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        clive2 = new javax.swing.JCheckBox();
        txtluong3 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        clive3 = new javax.swing.JCheckBox();
        jLabel87 = new javax.swing.JLabel();
        txtlive3 = new javax.swing.JTextField();
        btnfilelive3 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        txtluong5 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        clive4 = new javax.swing.JCheckBox();
        txtlive4 = new javax.swing.JTextField();
        txtluong6 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        clive5 = new javax.swing.JCheckBox();
        jLabel89 = new javax.swing.JLabel();
        txtlive5 = new javax.swing.JTextField();
        btnfilelive4 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        txtloop3 = new javax.swing.JTextField();
        listcodelive = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtluong = new javax.swing.JTextField();
        txtluong7 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        Download = new keeptoo.KGradientPanel();
        jLabel23 = new javax.swing.JLabel();
        txturl = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        checkSoluong = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        txtminview = new javax.swing.JTextField();
        checkminview = new javax.swing.JCheckBox();
        txtmaxview = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        checkmaxview = new javax.swing.JCheckBox();
        txtSave = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablecontent = new javax.swing.JTable();
        btnload = new javax.swing.JPanel();
        lbloadtxt = new javax.swing.JLabel();
        btnrun = new javax.swing.JPanel();
        lbruntxt = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        downloadstatus = new javax.swing.JLabel();
        jaboutlink = new javax.swing.JLabel();
        btnDeleterow = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        btnDeleteall = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zero - Nguyễn Đức Thiện");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        Logo.setBackground(new java.awt.Color(0, 153, 153));

        Home.setBackground(new java.awt.Color(0, 153, 153));
        Home.setPreferredSize(new java.awt.Dimension(235, 70));
        Home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HomeMouseMoved(evt);
            }
        });
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Male_User_50px_3.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
        );

        Dowload.setBackground(new java.awt.Color(0, 153, 153));
        Dowload.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DowloadMouseMoved(evt);
            }
        });
        Dowload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DowloadMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DowloadMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Double_Down_50px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Download");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DowloadLayout = new javax.swing.GroupLayout(Dowload);
        Dowload.setLayout(DowloadLayout);
        DowloadLayout.setHorizontalGroup(
            DowloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DowloadLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DowloadLayout.setVerticalGroup(
            DowloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Render.setBackground(new java.awt.Color(0, 153, 153));
        Render.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RenderMouseMoved(evt);
            }
        });
        Render.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RenderMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RenderMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Process_50px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Render");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RenderLayout = new javax.swing.GroupLayout(Render);
        Render.setLayout(RenderLayout);
        RenderLayout.setHorizontalGroup(
            RenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RenderLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RenderLayout.setVerticalGroup(
            RenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Upload.setBackground(new java.awt.Color(0, 153, 153));
        Upload.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UploadMouseMoved(evt);
            }
        });
        Upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UploadMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UploadMouseExited(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Double_Up_50px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Upload");

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout UploadLayout = new javax.swing.GroupLayout(Upload);
        Upload.setLayout(UploadLayout);
        UploadLayout.setHorizontalGroup(
            UploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UploadLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UploadLayout.setVerticalGroup(
            UploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Uploadtopbuzz.setBackground(new java.awt.Color(0, 153, 153));
        Uploadtopbuzz.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UploadtopbuzzMouseMoved(evt);
            }
        });
        Uploadtopbuzz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UploadtopbuzzMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UploadtopbuzzMouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Double_Up_50px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Upload Topbuzz");

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout UploadtopbuzzLayout = new javax.swing.GroupLayout(Uploadtopbuzz);
        Uploadtopbuzz.setLayout(UploadtopbuzzLayout);
        UploadtopbuzzLayout.setHorizontalGroup(
            UploadtopbuzzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UploadtopbuzzLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        UploadtopbuzzLayout.setVerticalGroup(
            UploadtopbuzzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Live.setBackground(new java.awt.Color(0, 153, 153));
        Live.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LiveMouseMoved(evt);
            }
        });
        Live.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LiveMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LiveMouseExited(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Video_Call_50px.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Live Stream");

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout LiveLayout = new javax.swing.GroupLayout(Live);
        Live.setLayout(LiveLayout);
        LiveLayout.setHorizontalGroup(
            LiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LiveLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LiveLayout.setVerticalGroup(
            LiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Perfect Dark (BRK)", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ZERO TOOL");

        About.setBackground(new java.awt.Color(0, 153, 153));
        About.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AboutMouseMoved(evt);
            }
        });
        About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutMouseExited(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Info_50px.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("About");

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AboutLayout = new javax.swing.GroupLayout(About);
        About.setLayout(AboutLayout);
        AboutLayout.setHorizontalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel29)
                .addGap(30, 30, 30)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AboutLayout.setVerticalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel52.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel52MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LogoLayout.createSequentialGroup()
                .addGroup(LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(About, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Live, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Uploadtopbuzz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Upload, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Render, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dowload, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LogoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel22)
                    .addGap(0, 297, Short.MAX_VALUE)))
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addGroup(LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Dowload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Render, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Upload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Uploadtopbuzz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Live, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LogoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel22)
                    .addGap(0, 621, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.CardLayout());

        renderform.setkEndColor(new java.awt.Color(0, 153, 153));
        renderform.setkGradientFocus(300);
        renderform.setkStartColor(new java.awt.Color(255, 255, 153));

        txtinput.setEditable(false);
        txtinput.setBackground(new java.awt.Color(255, 255, 255));
        txtinput.setText("Downloads\\");
            txtinput.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtinputActionPerformed(evt);
                }
            });

            btnrun1.setBackground(new java.awt.Color(255, 102, 102));
            btnrun1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnrun1MouseClicked(evt);
                }
            });

            lbruntxt1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
            lbruntxt1.setForeground(new java.awt.Color(255, 255, 255));
            lbruntxt1.setText("RUN");

            javax.swing.GroupLayout btnrun1Layout = new javax.swing.GroupLayout(btnrun1);
            btnrun1.setLayout(btnrun1Layout);
            btnrun1Layout.setHorizontalGroup(
                btnrun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnrun1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(lbruntxt1)
                    .addContainerGap(15, Short.MAX_VALUE))
            );
            btnrun1Layout.setVerticalGroup(
                btnrun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnrun1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(lbruntxt1)
                    .addGap(5, 5, 5))
            );

            jaboutlink1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jaboutlink1.setForeground(new java.awt.Color(255, 255, 255));
            jaboutlink1.setText("This tool developed by Nguyễn Đức Thiện");
            jaboutlink1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseMoved(java.awt.event.MouseEvent evt) {
                    jaboutlink1MouseMoved(evt);
                }
            });
            jaboutlink1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jaboutlink1MouseClicked(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jaboutlink1MouseExited(evt);
                }
            });

            listCodeFile.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    listCodeFileActionPerformed(evt);
                }
            });

            txtOutCode.setColumns(20);
            txtOutCode.setLineWrap(true);
            txtOutCode.setRows(5);
            txtOutCode.setWrapStyleWord(true);
            jScrollPane4.setViewportView(txtOutCode);

            txtCutTime.setText("5");

            jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel18.setText("Giây");

            listSpeed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "copy", "libx265", "libx264", "libxvid", "libvpx", "libvpx-vp9", "mpeg4", "mpeg1video", "mpeg2video" }));
            listSpeed.setOpaque(false);

            listbitratevideo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "800k", "1000k", "1200k", "1400k", "1600k", "1800k", "2000k", "2200k", "2400k", "2600k", "2800k", "-crf 28", "-crf 26", "-crf 24", "-crf 22", "-crf 20", "-crf 18" }));
            listbitratevideo.setToolTipText("");

            jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel28.setText("Code :");

            jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel31.setText("Cut times :");

            jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel42.setText("Quality :");

            jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel44.setText("Codec :");

            jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel45.setText("Aspect ratio :");

            jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel46.setText("Bitrate audio :");

            jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel47.setText("Bitrate video:");

            jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel48.setText("Channels :");

            jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel49.setText("Frequency :");

            listAspect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "2:35", "19:10", "16:10", "16:9", "3:2", "4:3" }));
            listAspect.setToolTipText("");

            listQuality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "1920x1080", "1280x720", "1024x576", "854x480", "640x360", "1600x1200", "1024x768", "800x600", "768x576", "640x480" }));
            listQuality.setToolTipText("");

            listBitrateAudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "34k", "48k", "64k", "96k", "128k", "160k", "192k", "256k", "384k", "576k" }));
            listBitrateAudio.setToolTipText("");

            listFrequency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "11025", "22050", "44100", "48000", "88200", "96000" }));
            listFrequency.setToolTipText("");

            listChannels.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "6" }));
            listChannels.setToolTipText("");

            txtConsole.setEditable(false);
            txtConsole.setBackground(new java.awt.Color(51, 51, 51));
            txtConsole.setColumns(20);
            txtConsole.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
            txtConsole.setForeground(new java.awt.Color(255, 255, 255));
            txtConsole.setLineWrap(true);
            txtConsole.setRows(5);
            txtConsole.setText("Author: Nguyễn Đức Thiện\nEmail : Thienndse05883@gmail.com\nFacebook : https://www.facebook.com/nguyenducthien1998\n--------------------Donate ủng hộ--------------------------\nChủ tài khoản : Nguyen Duc Thien\nNgân Hàng : Agribank\nChi nhánh : Hòa Lạc\nSố tài khoản : 9704050764097478\nSố tài khoản nội bộ : 2215205142010\n===========================================================");
            txtConsole.setWrapStyleWord(true);
            txtConsole.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jScrollPane1.setViewportView(txtConsole);

            jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel50.setText("Folder input :");

            btnsave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
            btnsave1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnsave1MouseClicked(evt);
                }
            });

            checkformtuychinh.setText("Enable");
            checkformtuychinh.setOpaque(false);
            checkformtuychinh.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    checkformtuychinhActionPerformed(evt);
                }
            });

            jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            jLabel51.setText("Tùy Chỉnh :");

            txtSave1.setEditable(false);
            txtSave1.setBackground(new java.awt.Color(255, 255, 255));
            txtSave1.setText("Downloads\\");
                txtSave1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        txtSave1ActionPerformed(evt);
                    }
                });

                btnfolderinput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                btnfolderinput.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        btnfolderinputMouseClicked(evt);
                    }
                });

                jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel54.setText("Output:");

                txtaudiofile.setText("Link đến file audio");

                jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel55.setText("Audio file :");

                jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel56.setText("Speed :");

                listSpeedofcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.7", "0.8", "0.9", "1.0", "1.1", "1.15", "1.2", "1.25", "1.5", "2.0" }));
                listSpeedofcode.setOpaque(false);

                jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel74.setText("Outro file :");

                jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel75.setText("Intro file :");

                txtintrofile.setText("Link đến file intro");
                txtintrofile.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        txtintrofileActionPerformed(evt);
                    }
                });

                txtoutrofile.setText("Link đến file outtro");

                jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel76.setText("Cut times:");

                txtcuttimecode.setText("số giây cần cắt");
                txtcuttimecode.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        txtcuttimecodeMouseClicked(evt);
                    }
                });

                jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel77.setText("Logo file :");

                txtlogofile.setText("Link đến file logo");

                btnlogoinput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                btnlogoinput.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        btnlogoinputMouseClicked(evt);
                    }
                });

                btnoutroinput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                btnoutroinput.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        btnoutroinputMouseClicked(evt);
                    }
                });

                btnintroinput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                btnintroinput.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        btnintroinputMouseClicked(evt);
                    }
                });

                btnaudioinput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                btnaudioinput.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        btnaudioinputMouseClicked(evt);
                    }
                });

                javax.swing.GroupLayout renderformLayout = new javax.swing.GroupLayout(renderform);
                renderform.setLayout(renderformLayout);
                renderformLayout.setHorizontalGroup(
                    renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(renderformLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(renderformLayout.createSequentialGroup()
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, renderformLayout.createSequentialGroup()
                                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel42))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, renderformLayout.createSequentialGroup()
                                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel54)
                                            .addComponent(jLabel47))
                                        .addGap(18, 18, 18)))
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(renderformLayout.createSequentialGroup()
                                        .addComponent(txtSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnsave1))
                                    .addGroup(renderformLayout.createSequentialGroup()
                                        .addGap(618, 618, 618)
                                        .addComponent(btnrun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(renderformLayout.createSequentialGroup()
                                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, renderformLayout.createSequentialGroup()
                                                .addComponent(txtCutTime, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel18))
                                            .addComponent(listQuality, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(listbitratevideo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(listSpeed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(listFrequency, javax.swing.GroupLayout.Alignment.LEADING, 0, 267, Short.MAX_VALUE)
                                            .addComponent(listBitrateAudio, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(listAspect, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(listChannels, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
                            .addGroup(renderformLayout.createSequentialGroup()
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, renderformLayout.createSequentialGroup()
                                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel55)
                                                    .addComponent(jLabel56)
                                                    .addComponent(jLabel28))
                                                .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel50))
                                        .addGap(18, 18, 18)
                                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(renderformLayout.createSequentialGroup()
                                                .addComponent(txtinput)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnfolderinput))
                                            .addComponent(listCodeFile, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane4)
                                            .addGroup(renderformLayout.createSequentialGroup()
                                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(listSpeedofcode, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtcuttimecode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                                                    .addGroup(renderformLayout.createSequentialGroup()
                                                        .addComponent(txtaudiofile, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btnaudioinput)))
                                                .addGap(28, 28, 28)
                                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel77)
                                                    .addComponent(jLabel74)
                                                    .addComponent(jLabel75))
                                                .addGap(18, 18, 18)
                                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtintrofile)
                                                    .addComponent(txtoutrofile)
                                                    .addComponent(txtlogofile))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnlogoinput)
                                                    .addComponent(btnintroinput)
                                                    .addComponent(btnoutroinput))))
                                        .addGap(25, 25, 25))
                                    .addGroup(renderformLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkformtuychinh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10))))
                    .addGroup(renderformLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jaboutlink1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                renderformLayout.setVerticalGroup(
                    renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(renderformLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel50))
                            .addComponent(btnfolderinput))
                        .addGap(10, 10, 10)
                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(listCodeFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel55)
                            .addComponent(txtaudiofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnaudioinput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75)
                            .addComponent(txtintrofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnintroinput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel56)
                            .addComponent(listSpeedofcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74)
                            .addComponent(txtoutrofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnoutroinput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel76)
                            .addComponent(txtcuttimecode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77)
                            .addComponent(txtlogofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlogoinput))
                        .addGap(5, 5, 5)
                        .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(renderformLayout.createSequentialGroup()
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkformtuychinh)
                                        .addComponent(jLabel51)))
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel31)
                                    .addComponent(txtCutTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel45)
                                    .addComponent(listAspect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel44)
                                    .addComponent(listSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46)
                                    .addComponent(listBitrateAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel42)
                                    .addComponent(listQuality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49)
                                    .addComponent(listFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listbitratevideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48)
                                    .addComponent(listChannels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(renderformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel54)
                                    .addComponent(txtSave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnsave1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jaboutlink1)
                        .addGap(10, 10, 10))
                );

                jPanel7.add(renderform, "card2");

                Uploadform.setkEndColor(new java.awt.Color(0, 153, 153));
                Uploadform.setkGradientFocus(300);
                Uploadform.setkStartColor(new java.awt.Color(255, 255, 153));

                txtinputupload.setEditable(false);
                txtinputupload.setBackground(new java.awt.Color(255, 255, 255));
                txtinputupload.setText("Downloads\\");
                    txtinputupload.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            txtinputuploadActionPerformed(evt);
                        }
                    });

                    btnrunupload.setBackground(new java.awt.Color(255, 102, 102));
                    btnrunupload.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            btnrunuploadMouseClicked(evt);
                        }
                    });

                    lbruntxt3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                    lbruntxt3.setForeground(new java.awt.Color(255, 255, 255));
                    lbruntxt3.setText("RUN");

                    javax.swing.GroupLayout btnrunuploadLayout = new javax.swing.GroupLayout(btnrunupload);
                    btnrunupload.setLayout(btnrunuploadLayout);
                    btnrunuploadLayout.setHorizontalGroup(
                        btnrunuploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnrunuploadLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(lbruntxt3)
                            .addContainerGap(15, Short.MAX_VALUE))
                    );
                    btnrunuploadLayout.setVerticalGroup(
                        btnrunuploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnrunuploadLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(lbruntxt3)
                            .addGap(5, 5, 5))
                    );

                    jaboutlink3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                    jaboutlink3.setForeground(new java.awt.Color(255, 255, 255));
                    jaboutlink3.setText("This tool developed by Nguyễn Đức Thiện");
                    jaboutlink3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseMoved(java.awt.event.MouseEvent evt) {
                            jaboutlink3MouseMoved(evt);
                        }
                    });
                    jaboutlink3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            jaboutlink3MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            jaboutlink3MouseExited(evt);
                        }
                    });

                    jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                    jLabel66.setText("Folder Upload :");

                    btnfolderinputupload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                    btnfolderinputupload.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            btnfolderinputuploadMouseClicked(evt);
                        }
                    });

                    txtConsole1.setEditable(false);
                    txtConsole1.setBackground(new java.awt.Color(51, 51, 51));
                    txtConsole1.setColumns(20);
                    txtConsole1.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
                    txtConsole1.setForeground(new java.awt.Color(255, 255, 255));
                    txtConsole1.setLineWrap(true);
                    txtConsole1.setRows(5);
                    txtConsole1.setText("Author: Nguyễn Đức Thiện\nEmail : Thienndse05883@gmail.com\nFacebook : https://www.facebook.com/nguyenducthien1998\nGroup : https://www.facebook.com/groups/zeroyoutubetool\n--------------------Donate ủng hộ--------------------------\nChủ tài khoản : Nguyen Duc Thien\nNgân Hàng : Agribank\nChi nhánh : Hòa Lạc\nSố tài khoản : 9704050764097478\nSố tài khoản nội bộ : 2215205142010\n===========================================================");
                    txtConsole1.setWrapStyleWord(true);
                    txtConsole1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                    jScrollPane5.setViewportView(txtConsole1);

                    tableupload.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {null, null, null, null, null},
                            {null, null, null, null, null},
                            {null, null, null, null, null},
                            {null, null, null, null, null}
                        },
                        new String [] {
                            "STT", "Tiêu Đề", "Mô Tả", "Thẻ", "Status"
                        }
                    ));
                    jScrollPane6.setViewportView(tableupload);
                    if (tableupload.getColumnModel().getColumnCount() > 0) {
                        tableupload.getColumnModel().getColumn(0).setMinWidth(30);
                        tableupload.getColumnModel().getColumn(0).setMaxWidth(30);
                        tableupload.getColumnModel().getColumn(3).setHeaderValue("Thẻ");
                        tableupload.getColumnModel().getColumn(4).setMinWidth(150);
                        tableupload.getColumnModel().getColumn(4).setMaxWidth(150);
                    }

                    buttonGroup1.add(cpublic);
                    cpublic.setText("Công Khai");
                    cpublic.setOpaque(false);

                    buttonGroup1.add(cprivate);
                    cprivate.setText("Riêng Tư");
                    cprivate.setOpaque(false);

                    buttonGroup1.add(cunlisted);
                    cunlisted.setText("Không Công Khai");
                    cunlisted.setOpaque(false);

                    jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                    jLabel57.setText("Trạng thái :");

                    jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                    jLabel58.setText("Mô Tả :");

                    txtdes.setColumns(20);
                    txtdes.setRows(5);
                    txtdes.setText("Zero tool\n=======================================\nGroup : https://www.facebook.com/groups/zeroyoutubetool");
                    jScrollPane7.setViewportView(txtdes);

                    jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                    jLabel59.setText("Thẻ :");

                    txttag.setColumns(20);
                    txttag.setRows(5);
                    txttag.setText("Zero tool,Zero");
                    jScrollPane8.setViewportView(txttag);

                    jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                    jLabel60.setText("Name :");

                    listupload.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            listuploadActionPerformed(evt);
                        }
                    });

                    jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                    jLabel61.setText("Account :");

                    jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                    jLabel62.setText("Upload To:");

                    txtname.setText("Zero");

                    btnrun5.setBackground(new java.awt.Color(0, 102, 255));
                    btnrun5.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            btnrun5MouseClicked(evt);
                        }
                    });

                    lbruntxt5.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                    lbruntxt5.setForeground(new java.awt.Color(255, 255, 255));
                    lbruntxt5.setText("ADD");

                    javax.swing.GroupLayout btnrun5Layout = new javax.swing.GroupLayout(btnrun5);
                    btnrun5.setLayout(btnrun5Layout);
                    btnrun5Layout.setHorizontalGroup(
                        btnrun5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnrun5Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lbruntxt5)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    btnrun5Layout.setVerticalGroup(
                        btnrun5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btnrun5Layout.createSequentialGroup()
                            .addGap(0, 0, 0)
                            .addComponent(lbruntxt5))
                    );

                    javax.swing.GroupLayout UploadformLayout = new javax.swing.GroupLayout(Uploadform);
                    Uploadform.setLayout(UploadformLayout);
                    UploadformLayout.setHorizontalGroup(
                        UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UploadformLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jaboutlink3)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UploadformLayout.createSequentialGroup()
                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(UploadformLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnrunupload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(UploadformLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(UploadformLayout.createSequentialGroup()
                                            .addComponent(jLabel61)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSeparator4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UploadformLayout.createSequentialGroup()
                                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel66)
                                                .addComponent(jLabel57)
                                                .addComponent(jLabel58))
                                            .addGap(18, 18, 18)
                                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(UploadformLayout.createSequentialGroup()
                                                    .addComponent(txtinputupload)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnfolderinputupload))
                                                .addGroup(UploadformLayout.createSequentialGroup()
                                                    .addComponent(cpublic)
                                                    .addGap(20, 20, 20)
                                                    .addComponent(cunlisted)
                                                    .addGap(20, 20, 20)
                                                    .addComponent(cprivate)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(jScrollPane7)))
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5)
                                        .addGroup(UploadformLayout.createSequentialGroup()
                                            .addGap(83, 83, 83)
                                            .addComponent(jLabel59)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane8))
                                        .addGroup(UploadformLayout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel60)
                                                .addComponent(jLabel62))
                                            .addGap(18, 18, 18)
                                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(UploadformLayout.createSequentialGroup()
                                                    .addComponent(txtname)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnrun5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(listupload, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGap(10, 10, 10))
                    );
                    UploadformLayout.setVerticalGroup(
                        UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UploadformLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtinputupload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66))
                                .addComponent(btnfolderinputupload))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addGap(10, 10, 10)
                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cpublic)
                                .addComponent(cprivate)
                                .addComponent(cunlisted)
                                .addComponent(jLabel57))
                            .addGap(11, 11, 11)
                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel58)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel59)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UploadformLayout.createSequentialGroup()
                                    .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel61))
                                    .addGap(10, 10, 10)
                                    .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel60)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnrun5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(UploadformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(listupload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel62))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnrunupload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jaboutlink3)
                            .addContainerGap())
                    );

                    jPanel7.add(Uploadform, "card2");

                    Homeform.setkEndColor(new java.awt.Color(0, 153, 153));
                    Homeform.setkGradientFocus(300);
                    Homeform.setkStartColor(new java.awt.Color(255, 255, 153));

                    jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                    jLabel32.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel32.setText("Xin Chào");

                    lbUsername1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                    lbUsername1.setForeground(new java.awt.Color(255, 255, 255));
                    lbUsername1.setText("UserName");

                    jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel34.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel34.setText("Liên hệ :");

                    lblinkhomeform.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    lblinkhomeform.setForeground(new java.awt.Color(255, 255, 255));
                    lblinkhomeform.setText("https://www.facebook.com/nguyenducthien1998");
                    lblinkhomeform.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseMoved(java.awt.event.MouseEvent evt) {
                            lblinkhomeformMouseMoved(evt);
                        }
                    });
                    lblinkhomeform.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblinkhomeformMouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lblinkhomeformMouseExited(evt);
                        }
                    });

                    jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                    jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Gói 1", "3 Ngày", "Free", "0"},
                            {"Gói 2", "1 Tháng", "200k", "0"},
                            {"Gói 3", "3 Tháng", "500k", "15 Ngày"},
                            {"Gói 4", "6 Tháng", "800k", "30 Ngày"},
                            {"Gói 5", "12 Tháng", "1400k", "60 Ngày"},
                            {"Gói 6", "36 Tháng", "1500k", "90 Ngày"}
                        },
                        new String [] {
                            "Name", "Time", "Price", "Bonus"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, false, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jTable2.setGridColor(new java.awt.Color(255, 255, 255));
                    jScrollPane2.setViewportView(jTable2);
                    if (jTable2.getColumnModel().getColumnCount() > 0) {
                        jTable2.getColumnModel().getColumn(0).setResizable(false);
                        jTable2.getColumnModel().getColumn(1).setResizable(false);
                        jTable2.getColumnModel().getColumn(2).setResizable(false);
                        jTable2.getColumnModel().getColumn(3).setResizable(false);
                    }

                    iconlink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_Source_30px.png"))); // NOI18N
                    iconlink.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            iconlinkMouseClicked(evt);
                        }
                    });

                    jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                    jLabel40.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel40.setText("Bảng giá dịch vụ");

                    jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel43.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel43.setText("Thời gian còn lại :");

                    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/male-circle-512.png"))); // NOI18N

                    jaboutlink2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                    jaboutlink2.setForeground(new java.awt.Color(255, 255, 255));
                    jaboutlink2.setText("This tool developed by Nguyễn Đức Thiện");
                    jaboutlink2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseMoved(java.awt.event.MouseEvent evt) {
                            jaboutlink2MouseMoved(evt);
                        }
                    });
                    jaboutlink2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            jaboutlink2MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            jaboutlink2MouseExited(evt);
                        }
                    });

                    lbslngay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    lbslngay.setForeground(new java.awt.Color(255, 255, 255));
                    lbslngay.setText("1 Ngày");

                    javax.swing.GroupLayout HomeformLayout = new javax.swing.GroupLayout(Homeform);
                    Homeform.setLayout(HomeformLayout);
                    HomeformLayout.setHorizontalGroup(
                        HomeformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomeformLayout.createSequentialGroup()
                            .addContainerGap(132, Short.MAX_VALUE)
                            .addGroup(HomeformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeformLayout.createSequentialGroup()
                                    .addGroup(HomeformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel32)
                                        .addComponent(lbUsername1)
                                        .addComponent(iconlink)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel40)
                                        .addComponent(jLabel8)
                                        .addGroup(HomeformLayout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addGap(26, 26, 26)
                                            .addComponent(lblinkhomeform))
                                        .addGroup(HomeformLayout.createSequentialGroup()
                                            .addComponent(jLabel43)
                                            .addGap(26, 26, 26)
                                            .addComponent(lbslngay)))
                                    .addGap(78, 78, 78))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeformLayout.createSequentialGroup()
                                    .addComponent(jaboutlink2)
                                    .addContainerGap())))
                    );
                    HomeformLayout.setVerticalGroup(
                        HomeformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomeformLayout.createSequentialGroup()
                            .addGap(0, 0, 0)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbUsername1)
                            .addGap(10, 10, 10)
                            .addGroup(HomeformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel43)
                                .addComponent(lbslngay))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(HomeformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblinkhomeform)
                                .addComponent(jLabel34))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(iconlink)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel40)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jaboutlink2)
                            .addGap(12, 12, 12))
                    );

                    jPanel7.add(Homeform, "card2");

                    UploadTopbuzzform.setkEndColor(new java.awt.Color(0, 153, 153));
                    UploadTopbuzzform.setkGradientFocus(300);
                    UploadTopbuzzform.setkStartColor(new java.awt.Color(255, 255, 153));

                    txtinputupload1.setEditable(false);
                    txtinputupload1.setBackground(new java.awt.Color(255, 255, 255));
                    txtinputupload1.setText("Downloads\\");
                        txtinputupload1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtinputupload1ActionPerformed(evt);
                            }
                        });

                        btnrunupload1.setBackground(new java.awt.Color(255, 102, 102));
                        btnrunupload1.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnrunupload1MouseClicked(evt);
                            }
                        });

                        lbruntxt4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                        lbruntxt4.setForeground(new java.awt.Color(255, 255, 255));
                        lbruntxt4.setText("RUN");

                        javax.swing.GroupLayout btnrunupload1Layout = new javax.swing.GroupLayout(btnrunupload1);
                        btnrunupload1.setLayout(btnrunupload1Layout);
                        btnrunupload1Layout.setHorizontalGroup(
                            btnrunupload1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnrunupload1Layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(lbruntxt4)
                                .addContainerGap(8, Short.MAX_VALUE))
                        );
                        btnrunupload1Layout.setVerticalGroup(
                            btnrunupload1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnrunupload1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lbruntxt4)
                                .addGap(5, 5, 5))
                        );

                        jaboutlink4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                        jaboutlink4.setForeground(new java.awt.Color(255, 255, 255));
                        jaboutlink4.setText("This tool developed by Nguyễn Đức Thiện");
                        jaboutlink4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                            public void mouseMoved(java.awt.event.MouseEvent evt) {
                                jaboutlink4MouseMoved(evt);
                            }
                        });
                        jaboutlink4.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jaboutlink4MouseClicked(evt);
                            }
                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                jaboutlink4MouseExited(evt);
                            }
                        });

                        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel67.setText("Folder Upload :");

                        btnfolderinputupload1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                        btnfolderinputupload1.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnfolderinputupload1MouseClicked(evt);
                            }
                        });

                        tableupload1.setModel(new javax.swing.table.DefaultTableModel(
                            new Object [][] {

                            },
                            new String [] {
                                "STT", "Tiêu Đề", "Mô Tả", "Status"
                            }
                        ));
                        jScrollPane10.setViewportView(tableupload1);
                        if (tableupload1.getColumnModel().getColumnCount() > 0) {
                            tableupload1.getColumnModel().getColumn(0).setMinWidth(30);
                            tableupload1.getColumnModel().getColumn(0).setMaxWidth(30);
                            tableupload1.getColumnModel().getColumn(3).setMinWidth(150);
                            tableupload1.getColumnModel().getColumn(3).setMaxWidth(150);
                        }

                        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel64.setText("Mô Tả :");

                        txtdes1.setColumns(20);
                        txtdes1.setRows(5);
                        txtdes1.setText("Zero tool\n=======================================\nGroup : https://www.facebook.com/groups/zeroyoutubetool");
                        jScrollPane11.setViewportView(txtdes1);

                        tablecontent1.setModel(new javax.swing.table.DefaultTableModel(
                            new Object [][] {

                            },
                            new String [] {
                                "STT", "Link", "Title", "Description", "Status"
                            }
                        ) {
                            Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                            };
                            boolean[] canEdit = new boolean [] {
                                false, false, false, false, true
                            };

                            public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                            }

                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                            }
                        });
                        jScrollPane9.setViewportView(tablecontent1);
                        if (tablecontent1.getColumnModel().getColumnCount() > 0) {
                            tablecontent1.getColumnModel().getColumn(0).setMinWidth(40);
                            tablecontent1.getColumnModel().getColumn(0).setMaxWidth(40);
                            tablecontent1.getColumnModel().getColumn(4).setMinWidth(100);
                            tablecontent1.getColumnModel().getColumn(4).setMaxWidth(100);
                        }

                        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                        jLabel9.setText("Upload From youtube :");

                        cuploadtopbuzz.setText("Enable");
                        cuploadtopbuzz.setOpaque(false);
                        cuploadtopbuzz.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cuploadtopbuzzActionPerformed(evt);
                            }
                        });

                        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel65.setText("Link :");

                        btnaddlinkupload.setText("ADD");
                        btnaddlinkupload.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnaddlinkuploadActionPerformed(evt);
                            }
                        });

                        downloadstatus1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                        downloadstatus1.setForeground(new java.awt.Color(255, 0, 0));
                        downloadstatus1.setText("Null");
                        downloadstatus1.setAutoscrolls(true);

                        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel53.setText("Status:");

                        javax.swing.GroupLayout UploadTopbuzzformLayout = new javax.swing.GroupLayout(UploadTopbuzzform);
                        UploadTopbuzzform.setLayout(UploadTopbuzzformLayout);
                        UploadTopbuzzformLayout.setHorizontalGroup(
                            UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UploadTopbuzzformLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UploadTopbuzzformLayout.createSequentialGroup()
                                            .addGap(69, 69, 69)
                                            .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel65)
                                                .addComponent(jLabel53))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(downloadstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtlinkupload, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(10, 10, 10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UploadTopbuzzformLayout.createSequentialGroup()
                                            .addGap(556, 556, 556)
                                            .addComponent(jaboutlink4)))
                                    .addGroup(UploadTopbuzzformLayout.createSequentialGroup()
                                        .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UploadTopbuzzformLayout.createSequentialGroup()
                                                .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel67)
                                                    .addComponent(jLabel64))
                                                .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(UploadTopbuzzformLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtinputupload1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnfolderinputupload1))
                                                    .addGroup(UploadTopbuzzformLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jScrollPane10)
                                                            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)))))
                                            .addGroup(UploadTopbuzzformLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(cuploadtopbuzz)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnaddlinkupload, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnrunupload1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10))))
                        );
                        UploadTopbuzzformLayout.setVerticalGroup(
                            UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UploadTopbuzzformLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtinputupload1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel67))
                                    .addComponent(btnfolderinputupload1))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel64)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(UploadTopbuzzformLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(cuploadtopbuzz)))
                                    .addGroup(UploadTopbuzzformLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel65)
                                    .addComponent(txtlinkupload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnaddlinkupload))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(UploadTopbuzzformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel53)
                                    .addComponent(downloadstatus1)
                                    .addComponent(btnrunupload1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jaboutlink4)
                                .addContainerGap())
                        );

                        jPanel7.add(UploadTopbuzzform, "card2");

                        inforform.setkEndColor(new java.awt.Color(0, 153, 153));
                        inforform.setkGradientFocus(300);
                        inforform.setkStartColor(new java.awt.Color(255, 255, 153));

                        jaboutlink7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                        jaboutlink7.setForeground(new java.awt.Color(255, 255, 255));
                        jaboutlink7.setText("This tool developed by Nguyễn Đức Thiện");
                        jaboutlink7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                            public void mouseMoved(java.awt.event.MouseEvent evt) {
                                jaboutlink7MouseMoved(evt);
                            }
                        });
                        jaboutlink7.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jaboutlink7MouseClicked(evt);
                            }
                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                jaboutlink7MouseExited(evt);
                            }
                        });

                        jLabel39.setFont(new java.awt.Font("Perfect Dark (BRK)", 1, 36)); // NOI18N
                        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel39.setText("ZERO TOOL");

                        jLabel69.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel69.setText("Author: Nguyễn Đức Thiện");

                        jLabel70.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel70.setText("--------------------Donate ủng hộ--------------------------");

                        jLabel71.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel71.setText("Email : Thienndse05883@gmail.com");

                        jLabel72.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel72.setText("Chủ tài khoản : Nguyen Duc Thien");

                        jLabel73.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel73.setText("Facebook : https://www.facebook.com/nguyenducthien1998");

                        jLabel78.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel78.setText("Ngân Hàng : Agribank");

                        jLabel79.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel79.setText("Số tài khoản nội bộ : 2215205142010");

                        jLabel80.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel80.setText("Chi nhánh : Hòa Lạc");

                        jLabel81.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel81.setText("Số tài khoản : 9704050764097478");

                        javax.swing.GroupLayout inforformLayout = new javax.swing.GroupLayout(inforform);
                        inforform.setLayout(inforformLayout);
                        inforformLayout.setHorizontalGroup(
                            inforformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inforformLayout.createSequentialGroup()
                                .addContainerGap(588, Short.MAX_VALUE)
                                .addComponent(jaboutlink7)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inforformLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(inforformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel79)
                                    .addComponent(jSeparator5)
                                    .addComponent(jLabel80)
                                    .addComponent(jLabel81)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel72))
                                .addGap(22, 22, 22))
                        );
                        inforformLayout.setVerticalGroup(
                            inforformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inforformLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel69)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel71)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel73)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel70)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel72)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel78)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel80)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel81)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jaboutlink7)
                                .addContainerGap())
                        );

                        jPanel7.add(inforform, "card2");

                        liveform.setkEndColor(new java.awt.Color(0, 153, 153));
                        liveform.setkGradientFocus(300);
                        liveform.setkStartColor(new java.awt.Color(255, 255, 153));

                        btnrunlive.setBackground(new java.awt.Color(255, 102, 102));
                        btnrunlive.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnrunliveMouseClicked(evt);
                            }
                        });

                        lbruntxt2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                        lbruntxt2.setForeground(new java.awt.Color(255, 255, 255));
                        lbruntxt2.setText("RUN");

                        javax.swing.GroupLayout btnrunliveLayout = new javax.swing.GroupLayout(btnrunlive);
                        btnrunlive.setLayout(btnrunliveLayout);
                        btnrunliveLayout.setHorizontalGroup(
                            btnrunliveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnrunliveLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbruntxt2)
                                .addContainerGap(12, Short.MAX_VALUE))
                        );
                        btnrunliveLayout.setVerticalGroup(
                            btnrunliveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnrunliveLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lbruntxt2)
                                .addGap(5, 5, 5))
                        );

                        jaboutlink5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                        jaboutlink5.setForeground(new java.awt.Color(255, 255, 255));
                        jaboutlink5.setText("This tool developed by Nguyễn Đức Thiện");
                        jaboutlink5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                            public void mouseMoved(java.awt.event.MouseEvent evt) {
                                jaboutlink5MouseMoved(evt);
                            }
                        });
                        jaboutlink5.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jaboutlink5MouseClicked(evt);
                            }
                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                jaboutlink5MouseExited(evt);
                            }
                        });

                        txtConsolelive.setEditable(false);
                        txtConsolelive.setBackground(new java.awt.Color(51, 51, 51));
                        txtConsolelive.setColumns(20);
                        txtConsolelive.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
                        txtConsolelive.setForeground(new java.awt.Color(255, 255, 255));
                        txtConsolelive.setLineWrap(true);
                        txtConsolelive.setRows(5);
                        txtConsolelive.setText("Author: Nguyễn Đức Thiện\nEmail : Thienndse05883@gmail.com\nFacebook : https://www.facebook.com/nguyenducthien1998\n--------------------Donate ủng hộ--------------------------\nChủ tài khoản : Nguyen Duc Thien\nNgân Hàng : Agribank\nChi nhánh : Hòa Lạc\nSố tài khoản : 9704050764097478\nSố tài khoản nội bộ : 2215205142010\n===========================================================");
                        txtConsolelive.setWrapStyleWord(true);
                        txtConsolelive.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                        jScrollPane13.setViewportView(txtConsolelive);

                        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel84.setText("File input :");

                        btnfilelive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                        btnfilelive.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnfileliveMouseClicked(evt);
                            }
                        });

                        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jLabel37.setText("Live a file :");

                        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel85.setText("Lặp lại :");

                        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel86.setText("File input :");

                        btnfilelive2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                        btnfilelive2.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnfilelive2MouseClicked(evt);
                            }
                        });

                        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel93.setText("Lặp lại :");

                        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel94.setText("Luồng 1 :");

                        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel95.setText("Luồng 2 :");

                        clive1.setOpaque(false);
                        clive1.addChangeListener(new javax.swing.event.ChangeListener() {
                            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                clive1StateChanged(evt);
                            }
                        });

                        cluong2.setOpaque(false);
                        cluong2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cluong2ActionPerformed(evt);
                            }
                        });

                        cluong3.setOpaque(false);
                        cluong3.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cluong3ActionPerformed(evt);
                            }
                        });

                        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel97.setText("Luồng 4 :");

                        cluong4.setOpaque(false);
                        cluong4.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cluong4ActionPerformed(evt);
                            }
                        });

                        cluong1.setOpaque(false);
                        cluong1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cluong1ActionPerformed(evt);
                            }
                        });

                        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jLabel38.setText("Live đa luồng :");

                        clive2.setOpaque(false);
                        clive2.addChangeListener(new javax.swing.event.ChangeListener() {
                            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                clive2StateChanged(evt);
                            }
                        });

                        jLabel98.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel98.setText("Luồng 3 :");

                        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jLabel41.setText("Live folder :");

                        clive3.setOpaque(false);
                        clive3.addChangeListener(new javax.swing.event.ChangeListener() {
                            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                clive3StateChanged(evt);
                            }
                        });

                        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel87.setText("Folder input :");

                        btnfilelive3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                        btnfilelive3.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnfilelive3MouseClicked(evt);
                            }
                        });

                        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel96.setText("Luồng :");

                        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jLabel63.setText("Live from link :");

                        clive4.setOpaque(false);
                        clive4.addChangeListener(new javax.swing.event.ChangeListener() {
                            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                clive4StateChanged(evt);
                            }
                        });

                        jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel99.setText("Luồng :");

                        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel88.setText("Link :");

                        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jLabel68.setText("Live Code :");

                        clive5.setOpaque(false);
                        clive5.addChangeListener(new javax.swing.event.ChangeListener() {
                            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                clive5StateChanged(evt);
                            }
                        });

                        jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel89.setText("File input :");

                        btnfilelive4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                        btnfilelive4.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnfilelive4MouseClicked(evt);
                            }
                        });

                        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel90.setText("Lặp lại :");

                        listcodelive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel91.setText("Code:");

                        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel100.setText("Luồng :");

                        jLabel101.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel101.setText("Luồng :");

                        javax.swing.GroupLayout liveformLayout = new javax.swing.GroupLayout(liveform);
                        liveform.setLayout(liveformLayout);
                        liveformLayout.setHorizontalGroup(
                            liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(liveformLayout.createSequentialGroup()
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(liveformLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jaboutlink5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                        .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                                .addGap(747, 747, 747)
                                                .addComponent(btnrunlive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addComponent(clive1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addComponent(clive2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator7))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                                .addGap(159, 159, 159)
                                                .addComponent(clive3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                                .addGap(159, 159, 159)
                                                .addComponent(clive4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                                .addGap(159, 159, 159)
                                                .addComponent(clive5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator9)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(liveformLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(liveformLayout.createSequentialGroup()
                                                .addComponent(jLabel86)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel93))
                                            .addComponent(jLabel95)
                                            .addComponent(jLabel97)
                                            .addComponent(jLabel96)
                                            .addComponent(jLabel99)
                                            .addComponent(jLabel90))
                                        .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(liveformLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, liveformLayout.createSequentialGroup()
                                                        .addComponent(txtluong4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cluong4))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, liveformLayout.createSequentialGroup()
                                                        .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, liveformLayout.createSequentialGroup()
                                                                .addComponent(txtloop2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(txtluong2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(1, 1, 1))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, liveformLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtluong5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtluong6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtloop3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, liveformLayout.createSequentialGroup()
                                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel98, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(liveformLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(liveformLayout.createSequentialGroup()
                                                                .addComponent(txtlive1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnfilelive)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel85)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtloop1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(txtluong)
                                                            .addGroup(liveformLayout.createSequentialGroup()
                                                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(txtluong1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(txtluong3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                                                    .addComponent(txtlive2, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(cluong3)
                                                                    .addComponent(cluong1)
                                                                    .addComponent(btnfilelive2))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                    .addGroup(liveformLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(liveformLayout.createSequentialGroup()
                                                                .addComponent(txtlive3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnfilelive3))
                                                            .addComponent(txtlive4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(liveformLayout.createSequentialGroup()
                                                                .addComponent(txtlive5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnfilelive4))))
                                                    .addGroup(liveformLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtluong7)
                                                            .addComponent(listcodelive, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(21, 21, 21))
                        );
                        liveformLayout.setVerticalGroup(
                            liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(liveformLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clive1)
                                    .addComponent(jLabel37))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel84)
                                    .addComponent(txtlive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnfilelive, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel85)
                                    .addComponent(txtloop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel101)
                                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(clive2)
                                    .addComponent(jLabel38)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel86)
                                    .addComponent(txtlive2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel93)
                                    .addComponent(txtloop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cluong2)
                                    .addComponent(btnfilelive2))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel94)
                                    .addComponent(txtluong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cluong1)
                                    .addComponent(jLabel95)
                                    .addComponent(txtluong2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel98)
                                    .addComponent(txtluong3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cluong3)
                                    .addComponent(jLabel97)
                                    .addComponent(txtluong4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cluong4))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel41)
                                    .addComponent(clive3)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel87)
                                    .addComponent(txtlive3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel96)
                                    .addComponent(btnfilelive3)
                                    .addComponent(txtluong5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel63)
                                    .addComponent(clive4))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel88)
                                    .addComponent(txtlive4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtluong6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel99))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clive5)
                                    .addComponent(jLabel68))
                                .addGap(7, 7, 7)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel89)
                                    .addComponent(txtlive5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnfilelive4)
                                    .addComponent(txtloop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel90))
                                .addGap(5, 5, 5)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel100)
                                    .addComponent(txtluong7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(liveformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel91)
                                    .addComponent(listcodelive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnrunlive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(jaboutlink5)
                                .addContainerGap())
                        );

                        liveformLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtlive3, txtlive4, txtlive5, txtloop1});

                        liveformLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtlive1, txtlive2, txtloop2, txtluong1, txtluong3});

                        jPanel7.add(liveform, "card2");

                        Download.setkEndColor(new java.awt.Color(0, 153, 153));
                        Download.setkGradientFocus(300);
                        Download.setkStartColor(new java.awt.Color(255, 255, 153));

                        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel23.setText("URL :");

                        txturl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                        txturl.setForeground(new java.awt.Color(255, 255, 255));
                        txturl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
                        txturl.setOpaque(false);

                        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel24.setText("Số Lượng :");

                        txtsoluong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                        txtsoluong.setForeground(new java.awt.Color(255, 255, 255));
                        txtsoluong.setText("Số video cần download");
                        txtsoluong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
                        txtsoluong.setOpaque(false);

                        checkSoluong.setText("Enable");
                        checkSoluong.setOpaque(false);
                        checkSoluong.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                checkSoluongActionPerformed(evt);
                            }
                        });

                        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel25.setText("Save to :");

                        txtminview.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                        txtminview.setForeground(new java.awt.Color(255, 255, 255));
                        txtminview.setText("Download videos lớn hơn Min");
                        txtminview.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
                        txtminview.setOpaque(false);

                        checkminview.setText("Enable");
                        checkminview.setOpaque(false);
                        checkminview.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                checkminviewActionPerformed(evt);
                            }
                        });

                        txtmaxview.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                        txtmaxview.setForeground(new java.awt.Color(255, 255, 255));
                        txtmaxview.setText("Download videos nhỏ hơn Max");
                        txtmaxview.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
                        txtmaxview.setOpaque(false);
                        txtmaxview.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtmaxviewActionPerformed(evt);
                            }
                        });

                        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        jLabel26.setText("Max Views :");

                        checkmaxview.setText("Enable");
                        checkmaxview.setOpaque(false);
                        checkmaxview.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                checkmaxviewActionPerformed(evt);
                            }
                        });

                        txtSave.setEditable(false);
                        txtSave.setBackground(new java.awt.Color(255, 255, 255));
                        txtSave.setText("Downloads\\");
                            txtSave.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    txtSaveActionPerformed(evt);
                                }
                            });

                            jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            jLabel27.setText("Min Views :");

                            tablecontent.setModel(new javax.swing.table.DefaultTableModel(
                                new Object [][] {

                                },
                                new String [] {
                                    "STT", "Link", "Title", "View", "Duration", "Status"
                                }
                            ) {
                                Class[] types = new Class [] {
                                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Double.class, java.lang.String.class
                                };
                                boolean[] canEdit = new boolean [] {
                                    false, false, false, false, false, true
                                };

                                public Class getColumnClass(int columnIndex) {
                                    return types [columnIndex];
                                }

                                public boolean isCellEditable(int rowIndex, int columnIndex) {
                                    return canEdit [columnIndex];
                                }
                            });
                            jScrollPane3.setViewportView(tablecontent);
                            if (tablecontent.getColumnModel().getColumnCount() > 0) {
                                tablecontent.getColumnModel().getColumn(0).setMinWidth(40);
                                tablecontent.getColumnModel().getColumn(0).setMaxWidth(40);
                                tablecontent.getColumnModel().getColumn(3).setMinWidth(100);
                                tablecontent.getColumnModel().getColumn(3).setMaxWidth(100);
                                tablecontent.getColumnModel().getColumn(4).setMinWidth(75);
                                tablecontent.getColumnModel().getColumn(4).setMaxWidth(75);
                                tablecontent.getColumnModel().getColumn(5).setMinWidth(100);
                                tablecontent.getColumnModel().getColumn(5).setMaxWidth(100);
                            }

                            btnload.setBackground(new java.awt.Color(0, 153, 153));
                            btnload.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    btnloadMouseClicked(evt);
                                }
                            });

                            lbloadtxt.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                            lbloadtxt.setForeground(new java.awt.Color(255, 255, 255));
                            lbloadtxt.setText("LOAD");

                            javax.swing.GroupLayout btnloadLayout = new javax.swing.GroupLayout(btnload);
                            btnload.setLayout(btnloadLayout);
                            btnloadLayout.setHorizontalGroup(
                                btnloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnloadLayout.createSequentialGroup()
                                    .addContainerGap(40, Short.MAX_VALUE)
                                    .addComponent(lbloadtxt)
                                    .addGap(37, 37, 37))
                            );
                            btnloadLayout.setVerticalGroup(
                                btnloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnloadLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(lbloadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            );

                            btnrun.setBackground(new java.awt.Color(255, 102, 102));
                            btnrun.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    btnrunMouseClicked(evt);
                                }
                            });

                            lbruntxt.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                            lbruntxt.setForeground(new java.awt.Color(255, 255, 255));
                            lbruntxt.setText("RUN");

                            javax.swing.GroupLayout btnrunLayout = new javax.swing.GroupLayout(btnrun);
                            btnrun.setLayout(btnrunLayout);
                            btnrunLayout.setHorizontalGroup(
                                btnrunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(btnrunLayout.createSequentialGroup()
                                    .addContainerGap(43, Short.MAX_VALUE)
                                    .addComponent(lbruntxt)
                                    .addContainerGap(43, Short.MAX_VALUE))
                            );
                            btnrunLayout.setVerticalGroup(
                                btnrunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(btnrunLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(lbruntxt)
                                    .addContainerGap())
                            );

                            jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            jLabel33.setText("Status:");

                            downloadstatus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                            downloadstatus.setForeground(new java.awt.Color(255, 0, 0));
                            downloadstatus.setText("Null");
                            downloadstatus.setAutoscrolls(true);

                            jaboutlink.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                            jaboutlink.setForeground(new java.awt.Color(255, 255, 255));
                            jaboutlink.setText("This tool developed by Nguyễn Đức Thiện");
                            jaboutlink.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                                public void mouseMoved(java.awt.event.MouseEvent evt) {
                                    jaboutlinkMouseMoved(evt);
                                }
                            });
                            jaboutlink.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    jaboutlinkMouseClicked(evt);
                                }
                                public void mouseExited(java.awt.event.MouseEvent evt) {
                                    jaboutlinkMouseExited(evt);
                                }
                            });

                            btnDeleterow.setBackground(new java.awt.Color(102, 102, 102));
                            btnDeleterow.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    btnDeleterowMouseClicked(evt);
                                }
                            });

                            jLabel35.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                            jLabel35.setForeground(new java.awt.Color(255, 255, 255));
                            jLabel35.setText("DELETE ROW");

                            javax.swing.GroupLayout btnDeleterowLayout = new javax.swing.GroupLayout(btnDeleterow);
                            btnDeleterow.setLayout(btnDeleterowLayout);
                            btnDeleterowLayout.setHorizontalGroup(
                                btnDeleterowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDeleterowLayout.createSequentialGroup()
                                    .addContainerGap(14, Short.MAX_VALUE)
                                    .addComponent(jLabel35)
                                    .addContainerGap())
                            );
                            btnDeleterowLayout.setVerticalGroup(
                                btnDeleterowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(btnDeleterowLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel35)
                                    .addGap(5, 5, 5))
                            );

                            btnDeleteall.setBackground(new java.awt.Color(102, 102, 102));
                            btnDeleteall.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    btnDeleteallMouseClicked(evt);
                                }
                            });

                            jLabel36.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
                            jLabel36.setForeground(new java.awt.Color(255, 255, 255));
                            jLabel36.setText("DELETE ALL");

                            javax.swing.GroupLayout btnDeleteallLayout = new javax.swing.GroupLayout(btnDeleteall);
                            btnDeleteall.setLayout(btnDeleteallLayout);
                            btnDeleteallLayout.setHorizontalGroup(
                                btnDeleteallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDeleteallLayout.createSequentialGroup()
                                    .addContainerGap(19, Short.MAX_VALUE)
                                    .addComponent(jLabel36)
                                    .addGap(10, 10, 10))
                            );
                            btnDeleteallLayout.setVerticalGroup(
                                btnDeleteallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(btnDeleteallLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel36)
                                    .addGap(5, 5, 5))
                            );

                            jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Open_20px.png"))); // NOI18N
                            jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    jLabel17MouseClicked(evt);
                                }
                            });

                            javax.swing.GroupLayout DownloadLayout = new javax.swing.GroupLayout(Download);
                            Download.setLayout(DownloadLayout);
                            DownloadLayout.setHorizontalGroup(
                                DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(DownloadLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(DownloadLayout.createSequentialGroup()
                                            .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane3)
                                                .addGroup(DownloadLayout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jaboutlink)
                                                        .addGroup(DownloadLayout.createSequentialGroup()
                                                            .addComponent(btnDeleteall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btnDeleterow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btnload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btnrun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGap(6, 6, 6))
                                        .addGroup(DownloadLayout.createSequentialGroup()
                                            .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel25)
                                                .addComponent(jLabel23)
                                                .addComponent(jLabel27)
                                                .addComponent(jLabel33))
                                            .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(downloadstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DownloadLayout.createSequentialGroup()
                                                    .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(DownloadLayout.createSequentialGroup()
                                                            .addComponent(txtSave)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jLabel17))
                                                        .addGroup(DownloadLayout.createSequentialGroup()
                                                            .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(DownloadLayout.createSequentialGroup()
                                                                    .addComponent(txtminview)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(checkminview))
                                                                .addGroup(DownloadLayout.createSequentialGroup()
                                                                    .addComponent(txturl)
                                                                    .addGap(1, 1, 1)))
                                                            .addGap(48, 48, 48)
                                                            .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel24)
                                                                .addComponent(jLabel26))
                                                            .addGap(10, 10, 10)
                                                            .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtmaxview, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                                                                .addComponent(txtsoluong))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(checkSoluong)
                                                                .addComponent(checkmaxview))))
                                                    .addGap(29, 29, 29))))))
                            );

                            DownloadLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeleteall, btnDeleterow, btnload, btnrun});

                            DownloadLayout.setVerticalGroup(
                                DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DownloadLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(txturl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24)
                                        .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkSoluong))
                                    .addGap(20, 20, 20)
                                    .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtminview, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkminview)
                                        .addComponent(jLabel26)
                                        .addComponent(txtmaxview, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkmaxview)
                                        .addComponent(jLabel27))
                                    .addGap(20, 20, 20)
                                    .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25)
                                            .addComponent(txtSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(20, 20, 20)
                                    .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(downloadstatus))
                                    .addGap(27, 27, 27)
                                    .addGroup(DownloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnload, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDeleteall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDeleterow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnrun, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jaboutlink)
                                    .addContainerGap())
                            );

                            jPanel7.add(Download, "card2");

                            kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
                            kGradientPanel1.setkGradientFocus(2500);
                            kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 153));

                            jLabel19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                                public void mouseDragged(java.awt.event.MouseEvent evt) {
                                    jLabel19MouseDragged(evt);
                                }
                            });

                            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Cancel_30px.png"))); // NOI18N
                            jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    jLabel21MouseClicked(evt);
                                }
                            });

                            jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Minus_30px.png"))); // NOI18N
                            jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    jLabel20MouseClicked(evt);
                                }
                            });

                            jLabel16.setFont(new java.awt.Font("Perfect Dark (BRK)", 1, 18)); // NOI18N
                            jLabel16.setForeground(new java.awt.Color(255, 102, 0));
                            jLabel16.setText("ZERO");

                            javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
                            kGradientPanel1.setLayout(kGradientPanel1Layout);
                            kGradientPanel1Layout.setHorizontalGroup(
                                kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel21)
                                    .addContainerGap())
                            );
                            kGradientPanel1Layout.setVerticalGroup(
                                kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel16)
                                    .addGap(5, 5, 5))
                            );

                            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                            getContentPane().setLayout(layout);
                            layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 826, Short.MAX_VALUE)
                                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            );
                            layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                            );

                            pack();
                        }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseMoved
        Home.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBackground(Color.WHITE);
    }//GEN-LAST:event_HomeMouseMoved

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_HomeMouseExited

    private void DowloadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DowloadMouseMoved
        Dowload.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBackground(Color.WHITE);
    }//GEN-LAST:event_DowloadMouseMoved

    private void DowloadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DowloadMouseExited
        Dowload.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_DowloadMouseExited

    private void RenderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RenderMouseMoved
        Render.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBackground(Color.WHITE);
    }//GEN-LAST:event_RenderMouseMoved

    private void RenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RenderMouseExited
        Render.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_RenderMouseExited

    private void UploadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadMouseMoved
        Upload.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBackground(Color.WHITE);
    }//GEN-LAST:event_UploadMouseMoved

    private void UploadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadMouseExited
        Upload.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_UploadMouseExited

    private void UploadtopbuzzMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadtopbuzzMouseMoved
        Uploadtopbuzz.setBackground(new java.awt.Color(0, 204, 204));
        jPanel8.setBackground(Color.WHITE);
    }//GEN-LAST:event_UploadtopbuzzMouseMoved

    private void UploadtopbuzzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadtopbuzzMouseExited
        Uploadtopbuzz.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_UploadtopbuzzMouseExited

    private void LiveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiveMouseMoved
        Live.setBackground(new java.awt.Color(0, 204, 204));
        jPanel9.setBackground(Color.WHITE);
    }//GEN-LAST:event_LiveMouseMoved

    private void LiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiveMouseExited
        Live.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_LiveMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Download.setVisible(false);
        renderform.setVisible(false);
        Homeform.setVisible(true);
        Uploadform.setVisible(false);
        UploadTopbuzzform.setVisible(false);
        liveform.setVisible(false);
        inforform.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void DowloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DowloadMouseClicked
        Homeform.setVisible(false);
        renderform.setVisible(false);
        Uploadform.setVisible(false);
        UploadTopbuzzform.setVisible(false);
        liveform.setVisible(false);
        Download.setVisible(true);
        inforform.setVisible(false);
    }//GEN-LAST:event_DowloadMouseClicked

    private void RenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RenderMouseClicked
        Download.setVisible(false);
        Homeform.setVisible(false);
        UploadTopbuzzform.setVisible(false);
        liveform.setVisible(false);
        renderform.setVisible(true);
        Uploadform.setVisible(false);
        inforform.setVisible(false);
    }//GEN-LAST:event_RenderMouseClicked

    private void UploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadMouseClicked
        Download.setVisible(false);
        Homeform.setVisible(false);
        UploadTopbuzzform.setVisible(false);
        renderform.setVisible(false);
        Uploadform.setVisible(true);
        liveform.setVisible(false);
        inforform.setVisible(false);
    }//GEN-LAST:event_UploadMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel19MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseDragged
        Point p = evt.getLocationOnScreen();
        this.setLocation(p);
    }//GEN-LAST:event_jLabel19MouseDragged

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        int p = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Zero", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_jLabel21MouseClicked

    private void AboutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseMoved
        About.setBackground(new java.awt.Color(0, 204, 204));
        jPanel11.setBackground(Color.WHITE);
    }//GEN-LAST:event_AboutMouseMoved

    private void AboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseExited
        About.setBackground(new java.awt.Color(0, 153, 153));
        jPanel11.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_AboutMouseExited

    private void lblinkhomeformMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinkhomeformMouseMoved
        lblinkhomeform.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblinkhomeformMouseMoved

    private void lblinkhomeformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinkhomeformMouseClicked
        lblinkhomeform.setForeground(Color.RED);
        onpenfacebook();
    }//GEN-LAST:event_lblinkhomeformMouseClicked

    private void lblinkhomeformMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinkhomeformMouseExited
        lblinkhomeform.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblinkhomeformMouseExited

    private void iconlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconlinkMouseClicked
        onpenfacebook();
    }//GEN-LAST:event_iconlinkMouseClicked

    private void jaboutlinkMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlinkMouseMoved
        jaboutlink.setForeground(Color.BLUE);
    }//GEN-LAST:event_jaboutlinkMouseMoved

    private void jaboutlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlinkMouseClicked
        onpenfacebook();
    }//GEN-LAST:event_jaboutlinkMouseClicked

    private void jaboutlinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlinkMouseExited
        jaboutlink.setForeground(Color.white);
    }//GEN-LAST:event_jaboutlinkMouseExited

    private void checkSoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSoluongActionPerformed
        if (checkSoluong.isSelected()) {
            txtsoluong.setEnabled(true);
            txtsoluong.setText("");
        } else {
            txtsoluong.setEnabled(false);
            txtsoluong.setText("Số video cần download");
        }
    }//GEN-LAST:event_checkSoluongActionPerformed

    private void checkminviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkminviewActionPerformed
        if (checkminview.isSelected()) {
            txtminview.setEnabled(true);
            checkmaxview.setSelected(false);
            txtmaxview.setEnabled(false);
            txtmaxview.setText("Download videos nhỏ hơn Max");
            txtminview.setText("");
        } else {
            txtminview.setText("Download videos lớn hơn Min");
            txtminview.setEnabled(false);
        }
    }//GEN-LAST:event_checkminviewActionPerformed

    private void checkmaxviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkmaxviewActionPerformed
        if (checkmaxview.isSelected()) {
            txtmaxview.setEnabled(true);
            checkminview.setSelected(false);
            txtminview.setEnabled(false);
            txtminview.setText("Download videos lớn hơn Min");
            txtmaxview.setText("");
        } else {
            txtmaxview.setText("Download videos nhỏ hơn Max");
            txtmaxview.setEnabled(false);
        }
    }//GEN-LAST:event_checkmaxviewActionPerformed

    boolean checkLoad = true;
    private void btnloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloadMouseClicked
        if (checkLoad) {
            String Url = txturl.getText().trim();
            String SoLuong = "";
            String MinViews = "";
            String MaxViews = "";
            btnload.setBackground(Color.RED);
            downloadstatus.setForeground(Color.RED);
            if (checkSoluong.isSelected()) {
                SoLuong = "--max-downloads " + txtsoluong.getText().trim();
            } else {
                SoLuong = "";
            }
            if (checkmaxview.isSelected()) {
                MaxViews = "--max-views " + txtmaxview.getText().trim();
            } else {
                MaxViews = "";
            }
            if (checkminview.isSelected()) {
                MinViews = "--min-views " + txtminview.getText().trim();
            } else {
                MinViews = "";
            }
            lbloadtxt.setText("STOP");
            loadtable.cmd(Url, SoLuong, MinViews, MaxViews, this);
            checkLoad = false;
        } else {
            loadtable.stopLoading();
            checkLoad = true;
        }

    }//GEN-LAST:event_btnloadMouseClicked

    boolean checkfistRun = true;
    private void btnrunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrunMouseClicked
        if (checkfistRun) {
            btnrun.setBackground(Color.RED);
            loadtable.downloadVideo(folderSave);
            checkfistRun = false;
        } else {
            loadtable.stopRunning();
            checkfistRun = true;

        }
    }//GEN-LAST:event_btnrunMouseClicked

    private void txtmaxviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaxviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaxviewActionPerformed

    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaveActionPerformed

    private void jaboutlink2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink2MouseMoved

    private void jaboutlink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink2MouseClicked

    private void jaboutlink2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink2MouseExited

    private void btnDeleteallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteallMouseClicked
        model.setRowCount(0);
        model.fireTableDataChanged();
    }//GEN-LAST:event_btnDeleteallMouseClicked

    private void btnDeleterowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleterowMouseClicked
        if (tablecontent.getSelectedRow() != -1) {
            model.removeRow(tablecontent.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn hàng cần xóa!");
        }
        model.fireTableDataChanged();
    }//GEN-LAST:event_btnDeleterowMouseClicked

    private void txtinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinputActionPerformed


    private void btnrun1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrun1MouseClicked
        if (checkrun) {
            run();

        } else {
            stopRunning();
        }

    }//GEN-LAST:event_btnrun1MouseClicked

    private void jaboutlink1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink1MouseMoved

    private void jaboutlink1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink1MouseClicked

    private void jaboutlink1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink1MouseExited

    private void listCodeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCodeFileActionPerformed
        loadFileTxt();
        if (listCodeFile.getSelectedItem().toString().equals("1 - GHEP INTRO OUTRO LOGO.txt")) {
            hidealltypecode(false);
            txtlogofile.setEnabled(true);
            txtintrofile.setEnabled(true);
            txtoutrofile.setEnabled(true);
            btnoutroinput.setEnabled(true);
            btnintroinput.setEnabled(true);
            btnlogoinput.setEnabled(true);
            txtcuttimecode.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("2 - Add Audio To Video.txt")) {
            hidealltypecode(false);
            txtaudiofile.setEnabled(true);
            btnaudioinput.setEnabled(true);
            txtcuttimecode.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("3 - DOI  MD5 Hash, XOA ID3 Tags.txt")) {
            hidealltypecode(false);
            txtcuttimecode.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("4 - LACH AM THANH.txt")) {
            hidealltypecode(false);
            txtcuttimecode.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("5 - LACH AM THANH 2.txt")) {
            hidealltypecode(false);
            txtcuttimecode.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("6 -  LAT VIDEO DOI TAG.txt")) {
            hidealltypecode(false);
            txtcuttimecode.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("7 - GHEP INTRO OUTRO.txt")) {
            hidealltypecode(false);
            txtcuttimecode.setEnabled(true);
            txtlogofile.setEnabled(true);
            txtintrofile.setEnabled(true);
            btnintroinput.setEnabled(true);
            btnlogoinput.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("8 - Change Video Speed.txt")) {
            hidealltypecode(false);
            txtcuttimecode.setEnabled(true);
            listSpeedofcode.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("9 - code ghep logo.txt")) {
            hidealltypecode(false);
            txtcuttimecode.setEnabled(true);
            txtlogofile.setEnabled(true);
            btnlogoinput.setEnabled(true);
        } else if (listCodeFile.getSelectedItem().toString().equals("code thu nhỏ.txt")) {
            hidealltypecode(false);
            txtcuttimecode.setEnabled(true);
        } else {
            hidealltypecode(false);
        }


    }//GEN-LAST:event_listCodeFileActionPerformed
    chooseFolder folderChooser;
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        folderChooser.setType(1);
        folderChooser.setVisible(true);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void btnsave1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsave1MouseClicked
        folderChooser.setType(2);
        folderChooser.setVisible(true);
    }//GEN-LAST:event_btnsave1MouseClicked

    private void checkformtuychinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkformtuychinhActionPerformed
        if (checkformtuychinh.isSelected()) {
            rendertypeB(true);
            rendertypeA(false);
        } else {
            rendertypeB(false);
            rendertypeA(true);
        }
    }//GEN-LAST:event_checkformtuychinhActionPerformed

    private void jLabel52MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseDragged
        Point p = evt.getLocationOnScreen();
        this.setLocation(p);
    }//GEN-LAST:event_jLabel52MouseDragged

    private void txtSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSave1ActionPerformed

    private void btnfolderinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfolderinputMouseClicked
        folderChooser.setType(3);
        folderChooser.setVisible(true);

        if (mp4Files.length != 0) {
            tablerender.loadTable(mp4Files);
        }
    }//GEN-LAST:event_btnfolderinputMouseClicked
    chooseFile choosefile;
    private void btnlogoinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoinputMouseClicked
        if (btnlogoinput.isEnabled()) {
            choosefile.setType(1);
            choosefile.setVisible(true);
        }

    }//GEN-LAST:event_btnlogoinputMouseClicked

    private void btnoutroinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnoutroinputMouseClicked
        if (btnoutroinput.isEnabled()) {
            choosefile.setType(2);
            choosefile.setVisible(true);
        }
    }//GEN-LAST:event_btnoutroinputMouseClicked

    private void btnintroinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnintroinputMouseClicked
        if (btnintroinput.isEnabled()) {
            choosefile.setType(3);
            choosefile.setVisible(true);

        }
    }//GEN-LAST:event_btnintroinputMouseClicked

    private void btnaudioinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaudioinputMouseClicked
        if (btnaudioinput.isEnabled()) {
            choosefile.setType(4);
            choosefile.setVisible(true);
        }
    }//GEN-LAST:event_btnaudioinputMouseClicked

    private void txtcuttimecodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcuttimecodeMouseClicked
        txtcuttimecode.setText("");
    }//GEN-LAST:event_txtcuttimecodeMouseClicked

    private void txtinputuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinputuploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinputuploadActionPerformed

    private void btnrunuploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrunuploadMouseClicked
        runUpload();
        if (check2) {
            check2 = false;
            a.start();
            lbruntxt3.setText("STOP");

        } else {
            check2 = true;
            lbruntxt3.setText("RUN");
        }


    }//GEN-LAST:event_btnrunuploadMouseClicked

    private void jaboutlink3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink3MouseMoved

    private void jaboutlink3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink3MouseClicked

    private void jaboutlink3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink3MouseExited

    private void btnfolderinputuploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfolderinputuploadMouseClicked
        folderChooser.setType(5);
        folderChooser.setVisible(true);
       
        loaduploadtable();
    }//GEN-LAST:event_btnfolderinputuploadMouseClicked

    private void listuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listuploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listuploadActionPerformed
    private static YouTube youtube;
    private void btnrun5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrun5MouseClicked
        try {
            String name = txtname.getText().trim();
            List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube.upload");
            Credential credential = Auth.authorize(scopes, name);
            System.out.println(credential.toString());
            youtube = new YouTube.Builder(Auth.HTTP_TRANSPORT, Auth.JSON_FACTORY, credential).setApplicationName(
                    "youtube-cmdline-uploadvideo-sample").build();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IOException: " + e.getMessage());
        }
    }//GEN-LAST:event_btnrun5MouseClicked

    private void UploadtopbuzzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadtopbuzzMouseClicked
        Download.setVisible(false);
        Homeform.setVisible(false);
        renderform.setVisible(false);
        Uploadform.setVisible(false);
        UploadTopbuzzform.setVisible(true);
        liveform.setVisible(false);
        inforform.setVisible(false);

    }//GEN-LAST:event_UploadtopbuzzMouseClicked

    private void btnfolderinputupload1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfolderinputupload1MouseClicked
        folderChooser.setType(4);
        folderChooser.setVisible(true);
        loaduploadtable2();
    }//GEN-LAST:event_btnfolderinputupload1MouseClicked

    private void jaboutlink4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink4MouseExited

    private void jaboutlink4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink4MouseClicked

    private void jaboutlink4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink4MouseMoved
    boolean checkRunUp = true;

    public void setRuntxtup() {
        lbruntxt4.setText("RUN");
    }
    private void btnrunupload1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrunupload1MouseClicked
        if (cuploadtopbuzz.isSelected()) {
            if (checkRunUp) {
                btnrunupload1.setBackground(Color.RED);
                lbruntxt4.setText("STOP");
                loadtable2.downloadVideo2(getCurrentWorkingDir() + "\\Downloads2\\");
                checkRunUp = false;

            } else {
                loadtable2.stopRunning();
                lbruntxt4.setText("RUN");
                checkRunUp = true;
            }
        } else {
            if (cuptop) {
                btnrunupload1.setBackground(Color.RED);
                cuptop = false;
                lbruntxt4.setText("STOP");
                ut.setrun1(folderuploadtop, mp4Files3, this, true);

            } else {
                lbruntxt4.setText("RUN");
                cuptop = true;
                ut.setrun1(folderuploadtop, mp4Files3, this, false);
            }

        }
    }//GEN-LAST:event_btnrunupload1MouseClicked

    private void txtinputupload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinputupload1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinputupload1ActionPerformed

    private void cuploadtopbuzzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuploadtopbuzzActionPerformed
        setTypeUploadTop();
    }//GEN-LAST:event_cuploadtopbuzzActionPerformed

    private void btnaddlinkuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddlinkuploadActionPerformed
        String URL = txtlinkupload.getText();
        btnaddlinkupload.setText("ADDING");
        loadtable2.cmd2(URL, "", this);
    }//GEN-LAST:event_btnaddlinkuploadActionPerformed

    private void LiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LiveMouseClicked
        Download.setVisible(false);
        Homeform.setVisible(false);
        renderform.setVisible(false);
        Uploadform.setVisible(false);
        UploadTopbuzzform.setVisible(false);
        liveform.setVisible(true);
        inforform.setVisible(false);
    }//GEN-LAST:event_LiveMouseClicked
    public void setFileLive5(String str) {
        if (checkvideo(str)) {
            txtlive5.setText(str);
        } else {
            JOptionPane.showMessageDialog(null, "định dạng file video phải là mp4,mov,avi!");
            txtlive5.setText("Link đến file intro");
        }
    }
    private void btnfilelive4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfilelive4MouseClicked
        if (btnfilelive.isEnabled()) {
            choosefile.setType(7);
            choosefile.setVisible(true);
        }
    }//GEN-LAST:event_btnfilelive4MouseClicked

    private void clive5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_clive5StateChanged
        if (clive5.isSelected()) {
            txtlive5.setEnabled(true);
            btnfilelive4.setEnabled(true);
            txtloop3.setEnabled(true);
            listcodelive.setEnabled(true);
            txtluong7.setEnabled(true);
            clive1.setSelected(false);
            clive2.setSelected(false);
            clive3.setSelected(false);
            clive4.setSelected(false);
        } else {
            hideAllLiveForm();

        }
    }//GEN-LAST:event_clive5StateChanged

    private void clive4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_clive4StateChanged
        if (clive4.isSelected()) {
            txtlive4.setEnabled(true);
            txtluong6.setEnabled(true);
            clive5.setSelected(false);
            clive2.setSelected(false);
            clive3.setSelected(false);
            clive1.setSelected(false);
        } else {
            hideAllLiveForm();

        }
    }//GEN-LAST:event_clive4StateChanged

    private void btnfilelive3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfilelive3MouseClicked
        folderChooser.setType(6);
        folderChooser.setVisible(true);

    }//GEN-LAST:event_btnfilelive3MouseClicked

    private void clive3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_clive3StateChanged
        if (clive3.isSelected()) {
            txtlive3.setEnabled(true);
            btnfilelive3.setEnabled(true);
            txtluong5.setEnabled(true);
            clive1.setSelected(false);
            clive2.setSelected(false);
            clive5.setSelected(false);
            clive4.setSelected(false);
        } else {
            hideAllLiveForm();

        }
    }//GEN-LAST:event_clive3StateChanged

    private void clive2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_clive2StateChanged
        if (clive2.isSelected()) {
            txtlive2.setEnabled(true);
            btnfilelive2.setEnabled(true);
            txtloop2.setEnabled(true);
            cluong2.setEnabled(true);
            cluong3.setEnabled(true);
            cluong4.setEnabled(true);
            cluong1.setEnabled(true);
            clive1.setSelected(false);
            clive5.setSelected(false);
            clive3.setSelected(false);
            clive4.setSelected(false);

        } else {
            hideAllLiveForm();

        }
    }//GEN-LAST:event_clive2StateChanged

    private void cluong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cluong1ActionPerformed
        if (cluong1.isSelected()) {
            txtluong1.setEnabled(true);
        } else {
            txtluong1.setEnabled(false);
        }
    }//GEN-LAST:event_cluong1ActionPerformed

    private void cluong4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cluong4ActionPerformed
        if (cluong4.isSelected()) {
            txtluong4.setEnabled(true);
        } else {
            txtluong4.setEnabled(false);
        }
    }//GEN-LAST:event_cluong4ActionPerformed

    private void cluong3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cluong3ActionPerformed
        if (cluong3.isSelected()) {
            txtluong3.setEnabled(true);
        } else {
            txtluong3.setEnabled(false);
        }
    }//GEN-LAST:event_cluong3ActionPerformed

    private void cluong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cluong2ActionPerformed
        if (cluong2.isSelected()) {
            txtluong2.setEnabled(true);
        } else {
            txtluong2.setEnabled(false);
        }
    }//GEN-LAST:event_cluong2ActionPerformed

    private void clive1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_clive1StateChanged
        if (clive1.isSelected()) {

            clive5.setSelected(false);
            clive2.setSelected(false);
            clive3.setSelected(false);
            clive4.setSelected(false);
            txtluong.setEnabled(true);
            txtlive1.setEnabled(true);
            btnfilelive.setEnabled(true);

            txtloop1.setEnabled(true);
        } else {
            hideAllLiveForm();

        }
    }//GEN-LAST:event_clive1StateChanged

    public void setFileLive2(String str) {
        if (checkvideo(str)) {
            txtlive2.setText(str);
        } else {
            JOptionPane.showMessageDialog(null, "định dạng file video phải là mp4,mov,avi!");
            txtlive2.setText("Link đến file intro");
        }
    }
    private void btnfilelive2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfilelive2MouseClicked
        if (btnfilelive.isEnabled()) {
            choosefile.setType(6);
            choosefile.setVisible(true);
        }
    }//GEN-LAST:event_btnfilelive2MouseClicked
    public void setFileLive1(String str) {
        if (checkvideo(str)) {
            txtlive1.setText(str);
        } else {
            JOptionPane.showMessageDialog(null, "định dạng file video phải là mp4,mov,avi!");
            txtlive1.setText("Link đến file intro");
        }
    }
    private void btnfileliveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfileliveMouseClicked
        if (btnfilelive.isEnabled()) {
            choosefile.setType(5);
            choosefile.setVisible(true);
        }
    }//GEN-LAST:event_btnfileliveMouseClicked

    private void jaboutlink5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink5MouseExited

    private void jaboutlink5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink5MouseClicked

    private void jaboutlink5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink5MouseMoved

    private void btnrunliveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrunliveMouseClicked
        String fileLive, loop, luong, exce;
        if (clive1.isSelected()) {
            fileLive = txtlive1.getText().trim();
            loop = txtloop1.getText().trim();
            luong = txtluong.getText().trim();
            exce = "ffmpeg -re -stream_loop -" + loop + " -i \"" + fileLive + "\""
                    + " -vcodec libx264 -preset veryfast"
                    + " -maxrate 500k -bufsize 2500k -vf \"format=yuv420p\" -g 60 -acodec libmp3lame"
                    + " -b:a 198k -ar 44100"
                    + " -f flv \"" + luong + "\"";
            System.out.println(exce);
        } else if (clive2.isSelected()) {
            String luong1, luong2, luong3, luong4;
            luong1 = setLuong(cluong1, txtluong1);
            luong2 = setLuong(cluong2, txtluong2);
            luong3 = setLuong(cluong3, txtluong3);
            luong4 = setLuong(cluong4, txtluong4);
            loop = txtloop2.getText().trim();
            fileLive = txtlive2.getText().trim();
            exce = "ffmpeg -re -stream_loop -" + loop
                    + " -i \"" + fileLive + "\" "
                    + luong1 + luong2 + luong3 + luong4;
            System.out.println(exce);
        } else if (clive3.isSelected()) {

        } else if (clive4.isSelected()) {
            fileLive = txtlive4.getText().trim();
            luong = txtluong6.getText().trim();
            exce = "livestreamer " + fileLive
                    + " best -o - | ffmpeg -i - -c:v copy -c:a aac -ar 44100"
                    + " -ab 128k -ac 2 -flags +global_header -bsf:a aac_adtstoasc"
                    + " -bufsize 5000k -f flv " + luong;
        }
    }//GEN-LAST:event_btnrunliveMouseClicked

    private void txtintrofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtintrofileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtintrofileActionPerformed

    private void jaboutlink7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink7MouseMoved

    private void jaboutlink7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink7MouseClicked

    private void jaboutlink7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutlink7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jaboutlink7MouseExited

    private void AboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMouseClicked
        Download.setVisible(false);
        Homeform.setVisible(false);
        UploadTopbuzzform.setVisible(false);
        liveform.setVisible(false);
        renderform.setVisible(false);
        Uploadform.setVisible(false);
        inforform.setVisible(true);
    }//GEN-LAST:event_AboutMouseClicked
//https://chiaseall.com/tong-hop-code-live-stream-youtube-bang-ffmpeg/

    String setLuong(JCheckBox c, JTextField t) {
        if (c.isSelected()) {
            return " -vcodec copy -acodec copy"
                    + " -f flv \"" + t.getText().trim() + "\"";
        } else {
            return "";
        }
    }

    public void setadd() {
        btnaddlinkupload.setText("ADD");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JPanel Dowload;
    private keeptoo.KGradientPanel Download;
    private javax.swing.JPanel Home;
    private keeptoo.KGradientPanel Homeform;
    private javax.swing.JPanel Live;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel Render;
    private javax.swing.JPanel Upload;
    private keeptoo.KGradientPanel UploadTopbuzzform;
    private keeptoo.KGradientPanel Uploadform;
    private javax.swing.JPanel Uploadtopbuzz;
    private javax.swing.JPanel btnDeleteall;
    private javax.swing.JPanel btnDeleterow;
    private javax.swing.JButton btnaddlinkupload;
    private javax.swing.JLabel btnaudioinput;
    private javax.swing.JLabel btnfilelive;
    private javax.swing.JLabel btnfilelive2;
    private javax.swing.JLabel btnfilelive3;
    private javax.swing.JLabel btnfilelive4;
    private javax.swing.JLabel btnfolderinput;
    private javax.swing.JLabel btnfolderinputupload;
    private javax.swing.JLabel btnfolderinputupload1;
    private javax.swing.JLabel btnintroinput;
    private javax.swing.JPanel btnload;
    private javax.swing.JLabel btnlogoinput;
    private javax.swing.JLabel btnoutroinput;
    private javax.swing.JPanel btnrun;
    private javax.swing.JPanel btnrun1;
    private javax.swing.JPanel btnrun5;
    private javax.swing.JPanel btnrunlive;
    private javax.swing.JPanel btnrunupload;
    private javax.swing.JPanel btnrunupload1;
    private javax.swing.JLabel btnsave1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkSoluong;
    private javax.swing.JCheckBox checkformtuychinh;
    private javax.swing.JCheckBox checkmaxview;
    private javax.swing.JCheckBox checkminview;
    private javax.swing.JCheckBox clive1;
    private javax.swing.JCheckBox clive2;
    private javax.swing.JCheckBox clive3;
    private javax.swing.JCheckBox clive4;
    private javax.swing.JCheckBox clive5;
    private javax.swing.JCheckBox cluong1;
    private javax.swing.JCheckBox cluong2;
    private javax.swing.JCheckBox cluong3;
    private javax.swing.JCheckBox cluong4;
    private javax.swing.JRadioButton cprivate;
    private javax.swing.JRadioButton cpublic;
    private javax.swing.JRadioButton cunlisted;
    private javax.swing.JCheckBox cuploadtopbuzz;
    private javax.swing.JLabel downloadstatus;
    private javax.swing.JLabel downloadstatus1;
    private javax.swing.JLabel iconlink;
    private keeptoo.KGradientPanel inforform;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jaboutlink;
    private javax.swing.JLabel jaboutlink1;
    private javax.swing.JLabel jaboutlink2;
    private javax.swing.JLabel jaboutlink3;
    private javax.swing.JLabel jaboutlink4;
    private javax.swing.JLabel jaboutlink5;
    private javax.swing.JLabel jaboutlink7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbUsername1;
    private javax.swing.JLabel lblinkhomeform;
    private javax.swing.JLabel lbloadtxt;
    private javax.swing.JLabel lbruntxt;
    private javax.swing.JLabel lbruntxt1;
    private javax.swing.JLabel lbruntxt2;
    private javax.swing.JLabel lbruntxt3;
    private javax.swing.JLabel lbruntxt4;
    private javax.swing.JLabel lbruntxt5;
    private javax.swing.JLabel lbslngay;
    private javax.swing.JComboBox<String> listAspect;
    private javax.swing.JComboBox<String> listBitrateAudio;
    private javax.swing.JComboBox<String> listChannels;
    private javax.swing.JComboBox<String> listCodeFile;
    private javax.swing.JComboBox<String> listFrequency;
    private javax.swing.JComboBox<String> listQuality;
    private javax.swing.JComboBox<String> listSpeed;
    private javax.swing.JComboBox<String> listSpeedofcode;
    private javax.swing.JComboBox<String> listbitratevideo;
    private javax.swing.JComboBox<String> listcodelive;
    private javax.swing.JComboBox<String> listupload;
    private keeptoo.KGradientPanel liveform;
    private keeptoo.KGradientPanel renderform;
    private javax.swing.JTable tablecontent;
    private javax.swing.JTable tablecontent1;
    private javax.swing.JTable tableupload;
    private javax.swing.JTable tableupload1;
    private javax.swing.JTextArea txtConsole;
    private javax.swing.JTextArea txtConsole1;
    private javax.swing.JTextArea txtConsolelive;
    private javax.swing.JTextField txtCutTime;
    private javax.swing.JTextArea txtOutCode;
    private javax.swing.JTextField txtSave;
    private javax.swing.JTextField txtSave1;
    private javax.swing.JTextField txtaudiofile;
    private javax.swing.JTextField txtcuttimecode;
    private javax.swing.JTextArea txtdes;
    private javax.swing.JTextArea txtdes1;
    private javax.swing.JTextField txtinput;
    private javax.swing.JTextField txtinputupload;
    private javax.swing.JTextField txtinputupload1;
    private javax.swing.JTextField txtintrofile;
    private javax.swing.JTextField txtlinkupload;
    private javax.swing.JTextField txtlive1;
    private javax.swing.JTextField txtlive2;
    private javax.swing.JTextField txtlive3;
    private javax.swing.JTextField txtlive4;
    private javax.swing.JTextField txtlive5;
    private javax.swing.JTextField txtlogofile;
    private javax.swing.JTextField txtloop1;
    private javax.swing.JTextField txtloop2;
    private javax.swing.JTextField txtloop3;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtluong1;
    private javax.swing.JTextField txtluong2;
    private javax.swing.JTextField txtluong3;
    private javax.swing.JTextField txtluong4;
    private javax.swing.JTextField txtluong5;
    private javax.swing.JTextField txtluong6;
    private javax.swing.JTextField txtluong7;
    private javax.swing.JTextField txtmaxview;
    private javax.swing.JTextField txtminview;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtoutrofile;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextArea txttag;
    private javax.swing.JTextField txturl;
    // End of variables declaration//GEN-END:variables

    String codeLocal = "Code\\";

    private final download loadtable = new download();
    private final download1 loadtable2 = new download1();
    static Point compCoords;
    public DefaultTableModel model3, model4, model2, model;
    private String folderSave = getCurrentWorkingDir() + "\\Downloads\\";
    private String folderSave1 = getCurrentWorkingDir() + "\\Rendered\\";
    private String folderinput = getCurrentWorkingDir() + "\\Input\\";
    private String folderinput2 = getCurrentWorkingDir() + "\\Input\\";
    private String folderuploadtop = getCurrentWorkingDir() + "\\Input\\";
    private String foldelive = getCurrentWorkingDir() + "\\Input\\";
    File[] mp4Files;
    File[] mp4Files2;
    File[] mp4Files3;
    File[] mp4Files4;
    File[] txtFiles;
    File[] OauthCredentials;
    tablerender tablerender;
    render r = new render();
    boolean checkrun = true, cuptop = true, check2 = true;
    uploadtopbuzz ut = new uploadtopbuzz();
    private Thread a, b;

    public void checkFile() {
        File dir = new File(codeLocal);
        txtFiles = dir.listFiles(new TxtFilenameFilter());
        for (File txtFile : txtFiles) {
            listCodeFile.addItem(txtFile.getName());
        }
    }

    public void checkFileOauthCredentials() {
        File dir = new File("oauth-credentials\\");
        OauthCredentials = dir.listFiles();
        for (File txtFile : OauthCredentials) {
            listupload.addItem(txtFile.getName());
        }
    }

    public class TxtFilenameFilter implements FilenameFilter {

        // Chấp nhận các đường dẫn (path) có hậu tố là '.txt'
        @Override
        public boolean accept(File dir, String name) {
            if (name.endsWith(".txt")) {
                return true;
            }
            return false;
        }
    }

    private void initAutoScroll() {
        DefaultCaret caret = (DefaultCaret) txtConsole.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        DefaultCaret caret1 = (DefaultCaret) txtConsole1.getCaret();
        caret1.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }

    public void loadFileTxt() {
        String sCurrentLine = "";
        String s = "";
        String fileCode = listCodeFile.getSelectedItem().toString();
        System.out.println(fileCode);
        String FILENAME = codeLocal + fileCode;
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            while ((sCurrentLine = br.readLine()) != null) {
                s += sCurrentLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        txtOutCode.setText(s);

    }

    public String gettextTxtdes1() {
        return txtdes1.getText().trim();
    }

    public void setFolderSave(String str) {
        str += "\\";
        folderSave = str;
        txtSave.setText(str);
    }

    public void setFolderSave1(String str) {
        str += "\\";
        folderSave1 = str;
        txtSave1.setText(str);
    }

    public void setFolderinput(String str) {
        str += "\\";
        folderinput = str;
        txtinput.setText(str);
    }

    public void setFolderinput2(String str) {
        str += "\\";
        folderinput2 = str;
        txtinputupload.setText(str);
    }

    public void setFolderinputlive(String str) {
        str += "\\";
        txtlive3.setText(str);
    }

    public void setFolderinput3(String str) {
        str += "\\";
        folderuploadtop = str;
        txtinputupload1.setText(str);
    }

    public void setFilelogo(String str) {
        if (checkimage(str)) {
            txtlogofile.setText(str);
        } else {
            JOptionPane.showMessageDialog(null, "định dạng file logo phải là PNG!");
            txtlogofile.setText("Link đến file logo");
        }
    }

    boolean checkimage(String s) {
        if (s.endsWith(".png") || s.endsWith(".PNG")) {
            return true;
        }
        return false;
    }

    public void setFileintro(String str) {
        if (checkvideo(str)) {
            txtintrofile.setText(str);
        } else {
            JOptionPane.showMessageDialog(null, "định dạng file video phải là mp4,mov,avi!");
            txtintrofile.setText("Link đến file intro");
        }
    }

    public void setFileoutro(String str) {
        if (checkvideo(str)) {
            txtoutrofile.setText(str);
        } else {
            JOptionPane.showMessageDialog(null, "định dạng file video phải là mp4,mov,avi!");
            txtoutrofile.setText("Link đến file outtro");
        }
    }

    boolean checkvideo(String s) {
        if (s.endsWith(".mp4") || s.endsWith(".MP4") || s.endsWith(".avi") || s.endsWith(".AVI") || s.endsWith(".mov") || s.endsWith(".MOV")) {
            return true;
        }
        return false;
    }

    public void setFileaudio(String str) {
        if (checkaudio(str)) {
            txtaudiofile.setText(str);
        } else {
            JOptionPane.showMessageDialog(null, "định dạng file audio phải là mp3,wav!");
            txtaudiofile.setText("Link đến file audio");
        }
    }

    boolean checkaudio(String s) {
        if (s.endsWith(".mp3") || s.endsWith(".MP3") || s.endsWith(".wav") || s.endsWith(".WAV")) {
            return true;
        }
        return false;
    }

    public boolean checkFileMp4(String s) {
        this.folderinput = s;
        File dir = new File(folderinput);
        mp4Files = dir.listFiles(new mp4FilenameFilter());
//        for (File txtFile : mp4Files) {
//            System.out.println(txtFile.toPath());
//            .loadTable(txtFile.toPath().toString() , "Not Started");
//        }
        if (mp4Files.length == 0) {
            JOptionPane.showMessageDialog(null, "Thư mục bạn chọn không có bất kì file video nào!");
            txtinput.setText("");
            return false;
        }
        return true;

    }

    public boolean checkFileMp42(String s) {
        this.folderinput2 = s;
        File dir = new File(folderinput2);
        mp4Files2 = dir.listFiles(new mp4FilenameFilter());
//        for (File txtFile : mp4Files) {
//            System.out.println(txtFile.toPath());
//            .loadTable(txtFile.toPath().toString() , "Not Started");
//        }
        if (mp4Files2.length == 0) {
            JOptionPane.showMessageDialog(null, "Thư mục bạn chọn không có bất kì file video nào!");
            txtinputupload.setText("");
            return false;
        }
return true;
    }

    public boolean checkFileMp43(String s) {
        this.folderuploadtop = s;
        File dir = new File(folderuploadtop);
        mp4Files3 = dir.listFiles(new mp4FilenameFilter());
//        for (File txtFile : mp4Files) {
//            System.out.println(txtFile.toPath());
//            .loadTable(txtFile.toPath().toString() , "Not Started");
//        }
        if (mp4Files3.length == 0) {
            JOptionPane.showMessageDialog(null, "Thư mục bạn chọn không có bất kì file video nào!");
            txtinputupload1.setText("");
            return false;
        }
        return true;

    }

    public boolean checkFileMp44(String folder) {
        this.foldelive = folder;
        File dir = new File(foldelive);
        mp4Files4 = dir.listFiles(new mp4FilenameFilter());
//        for (File txtFile : mp4Files) {
//            System.out.println(txtFile.toPath());
//            .loadTable(txtFile.toPath().toString() , "Not Started");
//        }
        if (mp4Files3.length == 0) {
            JOptionPane.showMessageDialog(null, "Thư mục bạn chọn không có bất kì file video nào!");
            txtinputupload1.setText("");
            return false;
        }
        return true;
    }

    public String getConsoleText() {
        return txtConsole.getText().trim();
    }

    public void setConsoleText(String txtArea) {
        txtConsole.setText(txtArea);
    }

    public class mp4FilenameFilter implements FilenameFilter {

        // Chấp nhận các đường dẫn (path) có hậu tố là '.txt'
        @Override
        public boolean accept(File dir, String name) {
            if (name.endsWith(".mp4") || name.endsWith(".mov") || name.endsWith(".mpeg") || name.endsWith(".avi")) {
                return true;
            }
            return false;
        }
    }

    public int getRowCount() {
        model.fireTableDataChanged();
        return tablecontent.getRowCount();
    }

    public void addTable(int stt, String Link, String Title, long view, double duration, String Status) {
        model.fireTableDataChanged();
        model.addRow(new Object[]{
            stt, Link, Title, view, duration, Status
        });

    }

    void components1() {
        Download.setVisible(false);
        Homeform.setVisible(true);
        renderform.setVisible(false);
        Uploadform.setVisible(false);
        UploadTopbuzzform.setVisible(false);
        liveform.setVisible(false);
        txtsoluong.setEnabled(false);
        txtminview.setEnabled(false);
        txtmaxview.setEnabled(false);
        inforform.setVisible(false);
        model = (DefaultTableModel) tablecontent.getModel();
        model2 = (DefaultTableModel) tableupload.getModel();
        model3 = (DefaultTableModel) tableupload1.getModel();
        model4 = (DefaultTableModel) tablecontent1.getModel();
        initContextMenu();
        checkFile();
        // setIcon();
        checkFileOauthCredentials();
        rendertypeB(false);
        rendertypeA(true);
        hideAllLiveForm();
        hidealltypecode(false);
        txtlogofile.setEnabled(true);
        txtintrofile.setEnabled(true);
        txtoutrofile.setEnabled(true);
        btnoutroinput.setEnabled(true);
        btnintroinput.setEnabled(true);
        btnlogoinput.setEnabled(true);
        txtcuttimecode.setEnabled(true);
        txtSave.setText(folderSave);
        txtSave1.setText(folderSave1);
        txtinput.setText(folderinput);
        txtinputupload.setText(folderinput2);
        setTypeUploadTop();
        loaduploadtable();
        tablerender = new tablerender(this, true);
        tablerender.loadTable(mp4Files);
        initAutoScroll();
        folderChooser = new chooseFolder(this, true);
        choosefile = new chooseFile(this, true);
    }

    private void setIcon() {
        Image im = null;
        try {
            im = ImageIO.read(getClass().getResource("Icon/icon.png"));
        } catch (IOException ex) {
            System.out.println("a");
        }
        setIconImage(im);
    }

    private void initContextMenu() {
        JPopupMenu menu = new JPopupMenu();

        Action paste = new DefaultEditorKit.PasteAction();
        paste.putValue(Action.NAME, "Paste");
        menu.add(paste);

        txturl.setComponentPopupMenu(menu);
    }

    public void setDownloadStatus(String s) {
        downloadstatus.setText(s);

    }

    public void setDownloadStatus2(String s) {
        downloadstatus1.setText(s);
        if (downloadstatus1.getForeground() == Color.RED) {
            downloadstatus1.setForeground(Color.BLUE);
        } else {
            downloadstatus1.setForeground(Color.RED);
        }
    }

    public void setConsoleUpload(String s) {
        txtConsole1.setText(txtConsole1.getText() + "\n" + s);
    }

    public void setConsoleLive(String s) {
        txtConsolelive.setText(txtConsolelive.getText() + "\n" + s);
    }

    public void onpenfacebook() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/nguyenducthien1998").toURI());
        } catch (Exception e) {
        }

    }

    public void setLoading(boolean a) {
        btnload.setBackground(Color.RED);
        while (a) {
            if (downloadstatus.getForeground().equals(Color.RED)) {
                downloadstatus.setForeground(Color.WHITE);
            } else {
                downloadstatus.setForeground(Color.RED);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        btnload.setBackground(new java.awt.Color(0, 153, 153));
        lbloadtxt.setText("LOAD");
    }

    public void setRunningDownload(boolean a) {
        lbruntxt.setText("STOP");
        while (a) {
            if (downloadstatus.getForeground() == Color.RED) {
                downloadstatus.setForeground(Color.BLUE);
            } else {
                downloadstatus.setForeground(Color.RED);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        btnrun.setBackground(new java.awt.Color(255, 102, 102));
        lbruntxt.setText("RUN");
    }

    int checkINT(String a) {
        int x;
        if (a.matches("^[0-9]+$")) {
            return x = Integer.parseInt(a);
        }
        JOptionPane.showMessageDialog(null, "Cut Times must be greater than -1");
        return -1;
    }

    boolean checkinfo(String s) {
        if (s.equals("Link đến file intro")) {
            JOptionPane.showMessageDialog(null, "bạn cần điền link đến file intro");
            return false;
        } else if (s.equals("Link đến file outtro")) {
            JOptionPane.showMessageDialog(null, "bạn cần điền link đến file outro");
            return false;
        } else if (s.equals("Link đến file logo")) {
            JOptionPane.showMessageDialog(null, "bạn cần điền link đến file logo");
            return false;
        } else if (s.equals("Link đến file audio")) {
            JOptionPane.showMessageDialog(null, "bạn cần điền link đến file audio");
            return false;
        }

        return true;
    }

    void run() {
        int cuttime;
        String speed, audioFile, introFile, outroFile, logoFile, code, output;
        output = txtSave1.getText();
        if (checkformtuychinh.isSelected()) {
            cuttime = checkINT(txtCutTime.getText().trim());
            String videoIN = "-i \"{input}.*\" ";
            String bitrate = listbitratevideo.getSelectedItem().toString();

            if (bitrate.equals("Default")) {
                bitrate = "";
            } else if (bitrate.contains("-crf")) {
                bitrate = bitrate + " ";
            } else {
                bitrate = "-b:v:0 " + bitrate + " ";
            }
            String fameSize = listQuality.getSelectedItem().toString();
            if (fameSize.equals("Default")) {
                fameSize = "";
            } else {
                fameSize = "-filter:v:0 \"scale=" + fameSize + "\"";
            }
            String aspect = listAspect.getSelectedItem().toString();
            if (aspect.equals("Default")) {
                aspect = "";
            } else {
                aspect = "-aspect:v:0 " + aspect + " ";
            }
            String bitrateAudio = listBitrateAudio.getSelectedItem().toString();
            if (bitrateAudio.equals("Default")) {
                bitrateAudio = "";
            } else {
                bitrateAudio = "-b:a:0 " + bitrateAudio + " ";
            }
            String frequence = listFrequency.getSelectedItem().toString();
            if (frequence.equals("Default")) {
                frequence = "";
            } else {
                frequence = "-ar:a:0 " + frequence + " ";
            }
            String channel = listChannels.getSelectedItem().toString();
            if (channel.equals("Default")) {
                channel = "";
            } else {
                channel = "-ac:a:0 " + channel + " ";
            }
            String codec = listSpeed.getSelectedItem().toString();
            if (codec.equals("Default")) {
                codec = "";
            } else {
                codec = "-c:v:0 " + codec + " ";
            }
            String command = videoIN
                    + "-strict experimental -f matroska -map_chapters -1 -map 0:0 -map 0:1 -sn -c:a:0 aac "
                    + bitrateAudio
                    + frequence
                    + channel
                    + codec
                    + bitrate
                    + aspect
                    + "-mbd:v:0 rd -mbcmp:v:0 rd -cmp:v:0 rd -precmp:v:0 rd -subcmp:v:0 rd -trellis:v:0 1 "
                    + fameSize
                    + " -y " + "\"{output}.mp4\"";
            if (cuttime != -1) {
                r.cmd2(command, mp4Files, cuttime, output, this);
            }
        } else {
            cuttime = checkINT(txtcuttimecode.getText().trim());
            introFile = txtintrofile.getText().trim();
            outroFile = txtoutrofile.getText().trim();
            logoFile = txtlogofile.getText().trim();
            code = txtOutCode.getText().trim();
            audioFile = txtaudiofile.getText().trim();
            speed = listSpeedofcode.getSelectedItem().toString();
            if (cuttime != -1) {
                if (listCodeFile.getSelectedItem().toString().equals("1 - GHEP INTRO OUTRO LOGO.txt")) {
                    if (checkinfo(logoFile) && checkinfo(introFile) && checkinfo(outroFile)) {
                        code = code.replace("\"logo.png\"", "\"" + logoFile + "\"");
                        code = code.replace("\"intro.mp4\"", "\"" + introFile + "\"");
                        code = code.replace("\"outro.mp4\"", "\"" + outroFile + "\"");
                        code = code.replace("-ss 10", "-ss " + cuttime);
                        r.cmd(code, mp4Files, output, this);

                    }
                } else if (listCodeFile.getSelectedItem().toString().equals("2 - Add Audio To Video.txt")) {
                    if (checkinfo(audioFile)) {
                        code = code.replace("\"audio.wav\"", "\"" + audioFile + "\"");
                        code = code.replace("-ss 10", "-ss " + cuttime);
                        r.cmd(code, mp4Files, output, this);
                    }
                } else if (listCodeFile.getSelectedItem().toString().equals("3 - DOI  MD5 Hash, XOA ID3 Tags.txt")) {
                    code = code.replace("-ss 10", "-ss " + cuttime);
                    r.cmd(code, mp4Files, output, this);
                } else if (listCodeFile.getSelectedItem().toString().equals("4 - LACH AM THANH.txt")) {
                    code = code.replace("-ss 10", "-ss " + cuttime);
                    r.cmd(code, mp4Files, output, this);
                } else if (listCodeFile.getSelectedItem().toString().equals("5 - LACH AM THANH 2.txt")) {
                    code = code.replace("-ss 10", "-ss " + cuttime);
                    r.cmd(code, mp4Files, output, this);
                } else if (listCodeFile.getSelectedItem().toString().equals("6 -  LAT VIDEO DOI TAG.txt")) {
                    code = code.replace("-ss 10", "-ss " + cuttime);
                    r.cmd(code, mp4Files, output, this);
                } else if (listCodeFile.getSelectedItem().toString().equals("7 - GHEP INTRO OUTRO.txt")) {
                    code = code.replace("\"intro.mp4\"", "\"" + introFile + "\"");
                    code = code.replace("\"filter.png\"", "\"" + logoFile + "\"");
                    code = code.replace("-ss 10", "-ss " + cuttime);
                    r.cmd(code, mp4Files, output, this);
                } else if (listCodeFile.getSelectedItem().toString().equals("8 - Change Video Speed.txt")) {
                    code = code.replace("-ss 10", "-ss " + cuttime);
                    code = code.replace("\"setpts=PTS/1.6; atempo=1.6\"", "\"setpts=PTS/" + speed + "; atempo=" + speed + "\"");
                    r.cmd(code, mp4Files, output, this);
                } else if (listCodeFile.getSelectedItem().toString().equals("9 - code ghep logo.txt")) {
                    code = code.replace("-ss 10", "-ss " + cuttime);
                    code = code.replace("\"inputlogo.png\"", "\"" + logoFile + "\"");
                    r.cmd(code, mp4Files, output, this);
                } else if (listCodeFile.getSelectedItem().toString().equals("code thu nhỏ.txt")) {
                    code = code.replace("-ss 10", "-ss " + cuttime);
                    r.cmd(code, mp4Files, output, this);
                } else {
                    r.cmd(code, mp4Files, output, this);
                }
            }
        }
    }

    public void stopRunning() {
        btnrun1.setBackground(new java.awt.Color(255, 102, 102));
        lbruntxt1.setText("RUN");
        checkrun = true;
        r.stop();
    }

    public void setRunTxt() {
        lbruntxt1.setText("STOP");
        btnrun1.setBackground(Color.RED);
        checkrun = false;
    }

    void setTypeUploadTop() {
        if (!cuploadtopbuzz.isSelected()) {
            txtlinkupload.setEnabled(false);
            btnaddlinkupload.setEnabled(false);
            tablecontent1.setEnabled(false);
            txtinputupload1.setEnabled(true);
            btnfolderinputupload1.setEnabled(true);
            tableupload1.setEnabled(true);

        } else {
            txtinputupload1.setEnabled(false);
            btnfolderinputupload1.setEnabled(false);
            tableupload1.setEnabled(false);
            txtlinkupload.setEnabled(true);
            btnaddlinkupload.setEnabled(true);
            tablecontent1.setEnabled(true);
        }
    }

    void loaduploadtable() {
        model2.setRowCount(0);
        model2.fireTableDataChanged();
        String des = txtdes.getText();
        String tag = txttag.getText();
        int i = model2.getRowCount() + 1;
        for (File mp4File2 : mp4Files2) {
            model2.addRow(new Object[]{
                i, mp4File2.getName(), des, tag, "Not Started"
            });
            i++;
        }
    }

    void loaduploadtable2() {
        model3.setRowCount(0);
        model3.fireTableDataChanged();
        String des = txtdes1.getText();
        int i = model3.getRowCount() + 1;
        for (File mp4File2 : mp4Files3) {
            model3.addRow(new Object[]{
                i, mp4File2.getName(), des, "Not Started"
            });
            i++;
        }
    }

    public void runUpload() {
        a = new Thread() {
            public void run() {
                upload();
            }
        };
    }

    void upload() {
        String acc = listupload.getSelectedItem().toString();
        String st = "public";
        if (cprivate.isSelected()) {
            st = "private";
        }
        if (cpublic.isSelected()) {
            st = "public";
        }
        if (cunlisted.isSelected()) {
            st = "unlisted";
        }
        uploadyoutube u = new uploadyoutube();
        int i = 0;
        for (File file : mp4Files2) {
            if (check2 == false) {
                u.upload(i, acc, model2.getValueAt(i, 1).toString(), file.getPath(), st, model2.getValueAt(i, 1).toString(), model2.getValueAt(i, 2).toString(), model2.getValueAt(i, 3).toString(), this);
            }
            i++;
        }

    }

    public void rendertypeB(boolean a) {

        txtCutTime.setEnabled(a);
        listAspect.setEnabled(a);
        listBitrateAudio.setEnabled(a);
        listChannels.setEnabled(a);
        listFrequency.setEnabled(a);
        listQuality.setEnabled(a);
        listSpeed.setEnabled(a);
        listbitratevideo.setEnabled(a);

    }

    void hidealltypecode(boolean a) {
        listSpeedofcode.setEnabled(a);
        txtcuttimecode.setEnabled(a);
        txtintrofile.setEnabled(a);
        txtoutrofile.setEnabled(a);
        txtlogofile.setEnabled(a);
        btnaudioinput.setEnabled(a);
        btnlogoinput.setEnabled(a);
        btnintroinput.setEnabled(a);
        btnoutroinput.setEnabled(a);
        txtaudiofile.setEnabled(a);
    }

    public void rendertypeA(boolean a) {
        txtaudiofile.setEnabled(a);
        txtOutCode.setEnabled(a);
        listSpeedofcode.setEnabled(a);
        txtcuttimecode.setEnabled(a);
        txtintrofile.setEnabled(a);
        txtoutrofile.setEnabled(a);
        txtlogofile.setEnabled(a);
        listCodeFile.setEnabled(a);
        btnaudioinput.setEnabled(a);
        btnlogoinput.setEnabled(a);
        btnintroinput.setEnabled(a);
        btnoutroinput.setEnabled(a);
    }

    void hideAllLiveForm() {
        txtlive1.setEnabled(false);
        txtlive2.setEnabled(false);
        txtlive3.setEnabled(false);
        txtlive4.setEnabled(false);
        txtlive5.setEnabled(false);
        txtloop1.setEnabled(false);
        txtloop2.setEnabled(false);
        txtloop3.setEnabled(false);
        txtluong.setEnabled(false);
        txtluong1.setEnabled(false);
        txtluong2.setEnabled(false);
        txtluong3.setEnabled(false);
        txtluong4.setEnabled(false);
        txtluong5.setEnabled(false);
        txtluong6.setEnabled(false);
        txtluong7.setEnabled(false);
        listcodelive.setEnabled(false);
        btnfilelive.setEnabled(false);
        btnfilelive2.setEnabled(false);
        btnfilelive3.setEnabled(false);
        btnfilelive4.setEnabled(false);
        cluong2.setEnabled(false);
        cluong3.setEnabled(false);
        cluong4.setEnabled(false);
        cluong1.setEnabled(false);

    }
}
