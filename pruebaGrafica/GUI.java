package pruebaGrafica;

import Estructuras_de_datos.*;
import javax.swing.JOptionPane;
import data.*;
import static data.DataBase.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

public class GUI extends javax.swing.JFrame {

     int x,y;
    
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);               
        Menu.setVisible(false);       
//             jpCM.setVisible(false);
//             jpUser.setVisible(false);
             jpControl.setVisible(false);
             jpSearchP.setVisible(false);
             jpCreateP.setVisible(false);
             jpRegister.setVisible(false);
             jpCreateS.setVisible(false);
             jpCreateM.setVisible(false);
        Menu.repaint();
        Menu.revalidate();
             
        Main.setVisible(true); 
              jpNewUser.setVisible(false);    
//            jpCM2.setVisible(true);
//            jpInfo.setVisible(true);
//            jpSignIn.setVisible(true);    
        Main.repaint();
        Main.revalidate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        jpCM2 = new javax.swing.JPanel();
        jlClose1 = new javax.swing.JLabel();
        jlMinimize1 = new javax.swing.JLabel();
        jpInfo = new javax.swing.JPanel();
        infoTitle1 = new javax.swing.JLabel();
        imageLabel1 = new javax.swing.JLabel();
        infoText3 = new javax.swing.JLabel();
        infoText4 = new javax.swing.JLabel();
        jpSignIn = new javax.swing.JPanel();
        signInTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        userLabel = new javax.swing.JLabel();
        jTextL1 = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        jTextL2 = new javax.swing.JPasswordField();
        signInButton = new javax.swing.JButton();
        registerLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jpNewUser = new javax.swing.JPanel();
        jTextR4 = new javax.swing.JTextField();
        jTextR3 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextR1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextR5 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        goBackButton0 = new javax.swing.JButton();
        jTextR2 = new javax.swing.JTextField();
        Menu = new javax.swing.JPanel();
        jpCM = new javax.swing.JPanel();
        jlClose = new javax.swing.JLabel();
        jlMinimize = new javax.swing.JLabel();
        jpUser = new javax.swing.JPanel();
        userLogoLabel = new javax.swing.JLabel();
        userLabel1 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        signOutButton = new javax.swing.JButton();
        jpControl = new javax.swing.JPanel();
        controlPanelTitle = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        createPanel = new javax.swing.JPanel();
        createLabel1 = new javax.swing.JLabel();
        createLabel2 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        managePanel = new javax.swing.JPanel();
        manageButton = new javax.swing.JButton();
        manageLabel1 = new javax.swing.JLabel();
        manageLabel2 = new javax.swing.JLabel();
        registryPanel = new javax.swing.JPanel();
        registryButton = new javax.swing.JButton();
        registryLabel1 = new javax.swing.JLabel();
        registryLabel2 = new javax.swing.JLabel();
        jpCreateP = new javax.swing.JPanel();
        goBackButton3 = new javax.swing.JButton();
        controlPanelTitle1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        editProductionPanel = new javax.swing.JPanel();
        productionIDLabel = new javax.swing.JLabel();
        jTextCp1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextCp5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextCp4 = new javax.swing.JComboBox<>();
        jTextCp2 = new javax.swing.JComboBox<>();
        jTextCp3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        productionIDLabel1 = new javax.swing.JLabel();
        addingPanel1 = new javax.swing.JPanel();
        addMaterialButton1 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        materialL = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        stagesL = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        addStageButton1 = new javax.swing.JButton();
        addStageButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        addStageButton3 = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        addMaterialButton12 = new javax.swing.JButton();
        doneButton1 = new javax.swing.JButton();
        jpRegister = new javax.swing.JPanel();
        goBackButton4 = new javax.swing.JButton();
        controlPanelTitle2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        generateButton = new javax.swing.JButton();
        jTextCr = new javax.swing.JTextField();
        searchjLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        resgisterF = new javax.swing.JTextArea();
        nRdeP0 = new javax.swing.JTextField();
        nRdeP = new javax.swing.JLabel();
        jlBackCr = new javax.swing.JLabel();
        jlNextCr = new javax.swing.JLabel();
        jpSearchP = new javax.swing.JPanel();
        controlPanelTitle3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        seeRegisterButton = new javax.swing.JButton();
        ImageP1 = new javax.swing.JLabel();
        ImageP2 = new javax.swing.JLabel();
        ImageP3 = new javax.swing.JLabel();
        ImageP4 = new javax.swing.JLabel();
        ImageP5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namePjL0 = new javax.swing.JLabel();
        jTextSp1 = new javax.swing.JTextField();
        searchPjLabel = new javax.swing.JLabel();
        nSdeP = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ProductionLSp = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        StageLSp = new javax.swing.JList<>();
        nSdeP3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ImageS5 = new javax.swing.JLabel();
        ImageS4 = new javax.swing.JLabel();
        ImageS3 = new javax.swing.JLabel();
        ImageS2 = new javax.swing.JLabel();
        ImageS1 = new javax.swing.JLabel();
        searchSjLabel = new javax.swing.JLabel();
        jTextSp2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        MaterialLSp = new javax.swing.JList<>();
        nSdeP5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ImageM5 = new javax.swing.JLabel();
        ImageM4 = new javax.swing.JLabel();
        ImageM3 = new javax.swing.JLabel();
        ImageM2 = new javax.swing.JLabel();
        ImageM1 = new javax.swing.JLabel();
        searchMjLabel = new javax.swing.JLabel();
        jTextSp3 = new javax.swing.JTextField();
        namePjL = new javax.swing.JLabel();
        nSdeP4 = new javax.swing.JTextField();
        nSdeP2 = new javax.swing.JTextField();
        nSdeP0 = new javax.swing.JTextField();
        goBackButton5 = new javax.swing.JButton();
        jpCreateM = new javax.swing.JPanel();
        goBackButton6 = new javax.swing.JButton();
        controlPanelTitle5 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        addMaterialButton4 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextCm8 = new javax.swing.JTextArea();
        jTextCm3 = new javax.swing.JComboBox<>();
        jTextCm2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jTextCm11 = new javax.swing.JTextField();
        jTextCm4 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jTextCm5 = new javax.swing.JComboBox<>();
        jTextCm6 = new javax.swing.JComboBox<>();
        jTextCm7 = new javax.swing.JComboBox<>();
        jTextCm1 = new javax.swing.JTextField();
        jTextCm9 = new javax.swing.JTextField();
        jTextCm10 = new javax.swing.JTextField();
        addMaterialButton6 = new javax.swing.JButton();
        addMaterialButton5 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        ParameterL = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jTextCm0 = new javax.swing.JTextField();
        addMaterialButton7 = new javax.swing.JButton();
        jpCreateS = new javax.swing.JPanel();
        goBackButton7 = new javax.swing.JButton();
        controlPanelTitle6 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        addMaterialButton8 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextCs8 = new javax.swing.JTextArea();
        jTextCs3 = new javax.swing.JComboBox<>();
        jTextCs2 = new javax.swing.JComboBox<>();
        jTextCs1 = new javax.swing.JLabel();
        jTextCs11 = new javax.swing.JTextField();
        jTextCs4 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jTextCs5 = new javax.swing.JComboBox<>();
        jTextCs6 = new javax.swing.JComboBox<>();
        jTextCs7 = new javax.swing.JComboBox<>();
        jTextCs9 = new javax.swing.JTextField();
        jTextCs10 = new javax.swing.JTextField();
        addMaterialButton9 = new javax.swing.JButton();
        addMaterialButton10 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        ParameterL1 = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jTextCs0 = new javax.swing.JTextField();
        addMaterialButton11 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 541));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main.setMaximumSize(new java.awt.Dimension(1024, 541));
        Main.setName(""); // NOI18N
        Main.setPreferredSize(new java.awt.Dimension(1024, 541));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCM2.setBackground(new java.awt.Color(28, 28, 28));
        jpCM2.setMinimumSize(new java.awt.Dimension(50, 30));
        jpCM2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incorrecto.png"))); // NOI18N
        jlClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlClose1MouseClicked(evt);
            }
        });
        jpCM2.add(jlClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 8, -1, -1));

        jlMinimize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/linea.png"))); // NOI18N
        jlMinimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimize1MouseClicked(evt);
            }
        });
        jpCM2.add(jlMinimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, -1, -1));

        Main.add(jpCM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 30));

        jpInfo.setBackground(new java.awt.Color(0, 56, 142));
        jpInfo.setMaximumSize(new java.awt.Dimension(472, 541));
        jpInfo.setMinimumSize(new java.awt.Dimension(472, 541));
        jpInfo.setName(""); // NOI18N
        jpInfo.setRequestFocusEnabled(false);
        jpInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        infoTitle1.setForeground(new java.awt.Color(255, 255, 255));
        infoTitle1.setText("Bienvenid@ a SGP");
        jpInfo.add(infoTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 64, -1, -1));

        imageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/estrategia.png"))); // NOI18N
        imageLabel1.setToolTipText("");
        imageLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        imageLabel1.setDoubleBuffered(true);
        jpInfo.add(imageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 146, -1, -1));

        infoText3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoText3.setForeground(new java.awt.Color(255, 255, 255));
        infoText3.setText("Está a un paso de gestionar toda su producción");
        jpInfo.add(infoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 435, -1, -1));

        infoText4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoText4.setForeground(new java.awt.Color(255, 255, 255));
        infoText4.setText("con los mejores estándares de calidad.");
        jpInfo.add(infoText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 455, -1, -1));

        Main.add(jpInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 472, 541));

        jpSignIn.setBackground(new java.awt.Color(28, 28, 28));
        jpSignIn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jpSignIn.setMaximumSize(new java.awt.Dimension(552, 541));
        jpSignIn.setMinimumSize(new java.awt.Dimension(552, 541));
        jpSignIn.setPreferredSize(new java.awt.Dimension(552, 541));
        jpSignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signInTitle.setBackground(new java.awt.Color(203, 203, 204));
        signInTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        signInTitle.setForeground(new java.awt.Color(255, 255, 255));
        signInTitle.setText("Iniciar sesión");
        jpSignIn.add(signInTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 59, -1, 46));

        jSeparator1.setBackground(new java.awt.Color(0, 69, 173));
        jSeparator1.setForeground(new java.awt.Color(0, 69, 173));
        jSeparator1.setToolTipText("");
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 56, 142)));
        jpSignIn.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 111, 292, -1));

        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(202, 202, 202));
        userLabel.setText("Usuario");
        jpSignIn.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 161, -1, -1));

        jTextL1.setBackground(new java.awt.Color(48, 48, 48));
        jTextL1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextL1.setForeground(new java.awt.Color(204, 204, 204));
        jTextL1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextL1.setText("Admnistrador");
        jTextL1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 8));
        jTextL1.setCaretColor(new java.awt.Color(188, 188, 188));
        jpSignIn.add(jTextL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 187, 267, 32));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(202, 202, 202));
        passwordLabel.setText("Contraseña");
        jpSignIn.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 231, -1, -1));

        jTextL2.setBackground(new java.awt.Color(48, 48, 48));
        jTextL2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextL2.setForeground(new java.awt.Color(204, 204, 204));
        jTextL2.setText("1234");
        jTextL2.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 8));
        jTextL2.setCaretColor(new java.awt.Color(188, 188, 188));
        jpSignIn.add(jTextL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 257, 267, 30));

        signInButton.setBackground(new java.awt.Color(0, 56, 142));
        signInButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Ingresar");
        signInButton.setBorder(null);
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInButtonMouseClicked(evt);
            }
        });
        jpSignIn.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 315, 195, 33));

        registerLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(202, 202, 202));
        registerLabel.setText("¿No tiene un usuario?");
        jpSignIn.add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 407, -1, -1));

        registerButton.setBackground(new java.awt.Color(0, 56, 142));
        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Registrarse");
        registerButton.setBorder(null);
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });
        jpSignIn.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 433, 195, 33));

        Main.add(jpSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 0, 552, 541));

        jpNewUser.setBackground(new java.awt.Color(28, 28, 28));
        jpNewUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jpNewUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextR4.setBackground(new java.awt.Color(48, 48, 48));
        jTextR4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextR4.setForeground(new java.awt.Color(204, 204, 204));
        jTextR4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextR4.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 8));
        jTextR4.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextR4ActionPerformed(evt);
            }
        });
        jpNewUser.add(jTextR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 267, 32));

        jTextR3.setBackground(new java.awt.Color(48, 48, 48));
        jTextR3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextR3.setForeground(new java.awt.Color(204, 204, 204));
        jTextR3.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 8));
        jTextR3.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextR3ActionPerformed(evt);
            }
        });
        jpNewUser.add(jTextR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 312, 267, 30));

        jLabel1.setBackground(new java.awt.Color(203, 203, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario Nuevo");
        jpNewUser.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 30, -1, 46));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 202, 202));
        jLabel2.setText("Usuario");
        jpNewUser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 216, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(202, 202, 202));
        jLabel3.setText("ID");
        jpNewUser.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 354, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 69, 173));
        jSeparator2.setForeground(new java.awt.Color(0, 69, 173));
        jSeparator2.setToolTipText("");
        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 56, 142)));
        jpNewUser.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 82, 334, -1));

        jButton2.setBackground(new java.awt.Color(0, 56, 142));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correcto.png"))); // NOI18N
        jButton2.setText("Crear usuario");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jpNewUser.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 496, 195, 33));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(202, 202, 202));
        jLabel9.setText("Nombre");
        jpNewUser.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 146, -1, -1));

        jTextR1.setBackground(new java.awt.Color(48, 48, 48));
        jTextR1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextR1.setForeground(new java.awt.Color(204, 204, 204));
        jTextR1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextR1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 8));
        jTextR1.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextR1ActionPerformed(evt);
            }
        });
        jpNewUser.add(jTextR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 172, 267, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(202, 202, 202));
        jLabel4.setText("Administrador");
        jpNewUser.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 416, -1, -1));

        jTextR5.setBackground(new java.awt.Color(48, 48, 48));
        jTextR5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextR5.setForeground(new java.awt.Color(204, 204, 204));
        jTextR5.setText("soyadm");
        jTextR5.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 8));
        jTextR5.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextR5.setFocusable(false);
        jpNewUser.add(jTextR5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 448, 267, 30));

        jCheckBox1.setBackground(new java.awt.Color(28, 28, 28));
        jCheckBox1.setForeground(new java.awt.Color(28, 28, 28));
        jCheckBox1.setBorder(null);
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jpNewUser.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(202, 202, 202));
        jLabel10.setText("Contraseña");
        jpNewUser.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 286, -1, -1));

        goBackButton0.setBackground(new java.awt.Color(28, 28, 28));
        goBackButton0.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        goBackButton0.setForeground(new java.awt.Color(77, 147, 255));
        goBackButton0.setText("< Regresar");
        goBackButton0.setBorder(null);
        goBackButton0.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        goBackButton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButton0MouseClicked(evt);
            }
        });
        jpNewUser.add(goBackButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTextR2.setBackground(new java.awt.Color(48, 48, 48));
        jTextR2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextR2.setForeground(new java.awt.Color(204, 204, 204));
        jTextR2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextR2.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 8, 2, 8));
        jTextR2.setCaretColor(new java.awt.Color(188, 188, 188));
        jTextR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextR2ActionPerformed(evt);
            }
        });
        jpNewUser.add(jTextR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 242, 267, 32));

        Main.add(jpNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 0, 552, 541));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 541));

        Menu.setMinimumSize(new java.awt.Dimension(1024, 541));
        Menu.setPreferredSize(new java.awt.Dimension(1024, 541));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCM.setBackground(new java.awt.Color(0, 56, 142));
        jpCM.setMinimumSize(new java.awt.Dimension(50, 30));
        jpCM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incorrecto.png"))); // NOI18N
        jlClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCloseMouseClicked(evt);
            }
        });
        jpCM.add(jlClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 8, -1, -1));

        jlMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/linea.png"))); // NOI18N
        jlMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizeMouseClicked(evt);
            }
        });
        jpCM.add(jlMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, -1, -1));

        Menu.add(jpCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 30));

        jpUser.setBackground(new java.awt.Color(0, 56, 142));
        jpUser.setMinimumSize(new java.awt.Dimension(1024, 110));
        jpUser.setPreferredSize(new java.awt.Dimension(1024, 110));
        jpUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuario.png"))); // NOI18N
        jpUser.add(userLogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 21, -1, -1));

        userLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(255, 255, 255));
        userLabel1.setText("Username");
        jpUser.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 21, -1, -1));

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID: XXXXXXXXXX");
        jpUser.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 53, 114, -1));

        roleLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(255, 255, 255));
        roleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roleLabel.setText("User role");
        jpUser.add(roleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 220, -1));

        signOutButton.setBackground(new java.awt.Color(0, 56, 142));
        signOutButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        signOutButton.setForeground(new java.awt.Color(255, 255, 255));
        signOutButton.setText("Cerrar sesión");
        signOutButton.setBorder(null);
        signOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutButtonMouseClicked(evt);
            }
        });
        jpUser.add(signOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 23, 132, 52));

        Menu.add(jpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 110));

        jpControl.setBackground(new java.awt.Color(28, 28, 28));
        jpControl.setMinimumSize(new java.awt.Dimension(1024, 431));
        jpControl.setPreferredSize(new java.awt.Dimension(1024, 431));
        jpControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        controlPanelTitle.setBackground(new java.awt.Color(203, 203, 204));
        controlPanelTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        controlPanelTitle.setForeground(new java.awt.Color(255, 255, 255));
        controlPanelTitle.setText("Panel de control");
        jpControl.add(controlPanelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 28, -1, 46));

        jSeparator3.setBackground(new java.awt.Color(0, 69, 173));
        jSeparator3.setForeground(new java.awt.Color(0, 69, 173));
        jSeparator3.setToolTipText("");
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 56, 142)));
        jpControl.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 80, 368, -1));

        createPanel.setBackground(new java.awt.Color(48, 48, 48));

        createLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        createLabel1.setForeground(new java.awt.Color(202, 202, 202));
        createLabel1.setText("Crear");

        createLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        createLabel2.setForeground(new java.awt.Color(202, 202, 202));
        createLabel2.setText("producción");

        createButton.setBackground(new java.awt.Color(48, 48, 48));
        createButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mas.png"))); // NOI18N
        createButton.setBorder(null);
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addComponent(createLabel2)
                .addGap(106, 106, 106))
            .addGroup(createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(createLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createLabel1)
                .addGap(0, 0, 0)
                .addComponent(createLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpControl.add(createPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 118, -1, 278));

        managePanel.setBackground(new java.awt.Color(48, 48, 48));

        manageButton.setBackground(new java.awt.Color(48, 48, 48));
        manageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tarea.png"))); // NOI18N
        manageButton.setBorder(null);
        manageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageButtonMouseClicked(evt);
            }
        });

        manageLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        manageLabel1.setForeground(new java.awt.Color(202, 202, 202));
        manageLabel1.setText("Gestionar");

        manageLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        manageLabel2.setForeground(new java.awt.Color(202, 202, 202));
        manageLabel2.setText("producción");

        javax.swing.GroupLayout managePanelLayout = new javax.swing.GroupLayout(managePanel);
        managePanel.setLayout(managePanelLayout);
        managePanelLayout.setHorizontalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managePanelLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(manageLabel2)
                    .addComponent(manageLabel1))
                .addGap(103, 103, 103))
        );
        managePanelLayout.setVerticalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageLabel1)
                .addGap(0, 0, 0)
                .addComponent(manageLabel2)
                .addGap(29, 29, 29))
        );

        jpControl.add(managePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 118, -1, -1));

        registryPanel.setBackground(new java.awt.Color(48, 48, 48));

        registryButton.setBackground(new java.awt.Color(48, 48, 48));
        registryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/registro.png"))); // NOI18N
        registryButton.setBorder(null);
        registryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registryButtonMouseClicked(evt);
            }
        });

        registryLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        registryLabel1.setForeground(new java.awt.Color(202, 202, 202));
        registryLabel1.setText("Crear");

        registryLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        registryLabel2.setForeground(new java.awt.Color(202, 202, 202));
        registryLabel2.setText("registro");
        registryLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout registryPanelLayout = new javax.swing.GroupLayout(registryPanel);
        registryPanel.setLayout(registryPanelLayout);
        registryPanelLayout.setHorizontalGroup(
            registryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registryPanelLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(registryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(registryLabel2)
                    .addComponent(registryLabel1))
                .addGap(117, 117, 117))
        );
        registryPanelLayout.setVerticalGroup(
            registryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registryLabel1)
                .addGap(0, 0, 0)
                .addComponent(registryLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jpControl.add(registryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 118, -1, 278));

        Menu.add(jpControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1024, 431));

        jpCreateP.setBackground(new java.awt.Color(28, 28, 28));
        jpCreateP.setMinimumSize(new java.awt.Dimension(1024, 431));
        jpCreateP.setPreferredSize(new java.awt.Dimension(1024, 431));
        jpCreateP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBackButton3.setBackground(new java.awt.Color(28, 28, 28));
        goBackButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        goBackButton3.setForeground(new java.awt.Color(77, 147, 255));
        goBackButton3.setText("< Regresar");
        goBackButton3.setBorder(null);
        goBackButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        goBackButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButton3MouseClicked(evt);
            }
        });
        jpCreateP.add(goBackButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 20, 132, 30));

        controlPanelTitle1.setBackground(new java.awt.Color(203, 203, 204));
        controlPanelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        controlPanelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        controlPanelTitle1.setText("Crear producción");
        jpCreateP.add(controlPanelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 28, -1, 46));

        jSeparator4.setBackground(new java.awt.Color(0, 69, 173));
        jSeparator4.setForeground(new java.awt.Color(0, 69, 173));
        jSeparator4.setToolTipText("");
        jSeparator4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 56, 142)));
        jpCreateP.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 80, 388, -1));

        editProductionPanel.setBackground(new java.awt.Color(28, 28, 28));

        productionIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productionIDLabel.setForeground(new java.awt.Color(202, 202, 202));
        productionIDLabel.setText("ID de la producción: ");

        jTextCp1.setBackground(new java.awt.Color(48, 48, 48));
        jTextCp1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCp1.setForeground(new java.awt.Color(204, 204, 204));
        jTextCp1.setText("Nombre de la producción");
        jTextCp1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCp1ActionPerformed(evt);
            }
        });

        jTextCp5.setBackground(new java.awt.Color(48, 48, 48));
        jTextCp5.setColumns(20);
        jTextCp5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCp5.setForeground(new java.awt.Color(204, 204, 204));
        jTextCp5.setRows(5);
        jTextCp5.setText("Descripción");
        jTextCp5.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCp5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextCp5);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Resumen: 0 material/es, 0 etapa/s.");

        jTextCp4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCp4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2029", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039" }));

        jTextCp2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jTextCp3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCp3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Fecha de finalización: ");

        productionIDLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productionIDLabel1.setForeground(new java.awt.Color(202, 202, 202));
        productionIDLabel1.setText("XXXX");

        javax.swing.GroupLayout editProductionPanelLayout = new javax.swing.GroupLayout(editProductionPanel);
        editProductionPanel.setLayout(editProductionPanelLayout);
        editProductionPanelLayout.setHorizontalGroup(
            editProductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProductionPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(editProductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(editProductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(editProductionPanelLayout.createSequentialGroup()
                            .addComponent(productionIDLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(productionIDLabel1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                        .addComponent(jTextCp1))
                    .addGroup(editProductionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCp2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCp3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCp4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        editProductionPanelLayout.setVerticalGroup(
            editProductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProductionPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(editProductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productionIDLabel)
                    .addComponent(productionIDLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jpCreateP.add(editProductionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        addingPanel1.setBackground(new java.awt.Color(28, 28, 28));

        addMaterialButton1.setBackground(new java.awt.Color(65, 69, 71));
        addMaterialButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton1.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar_azul.png"))); // NOI18N
        addMaterialButton1.setBorder(null);
        addMaterialButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton1MouseClicked(evt);
            }
        });

        materialL.setBackground(new java.awt.Color(48, 48, 48));
        materialL.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        materialL.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane8.setViewportView(materialL);

        stagesL.setBackground(new java.awt.Color(48, 48, 48));
        stagesL.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        stagesL.setForeground(new java.awt.Color(204, 204, 204));
        stagesL.setPreferredSize(new java.awt.Dimension(36, 88));
        jScrollPane9.setViewportView(stagesL);

        jLabel14.setBackground(new java.awt.Color(48, 48, 48));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Etapas");

        addStageButton1.setBackground(new java.awt.Color(65, 69, 71));
        addStageButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStageButton1.setForeground(new java.awt.Color(204, 204, 204));
        addStageButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar_azul.png"))); // NOI18N
        addStageButton1.setBorder(null);
        addStageButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStageButton1MouseClicked(evt);
            }
        });

        addStageButton2.setBackground(new java.awt.Color(65, 69, 71));
        addStageButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStageButton2.setForeground(new java.awt.Color(204, 204, 204));
        addStageButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incorrecto.png"))); // NOI18N
        addStageButton2.setBorder(null);
        addStageButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStageButton2MouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(48, 48, 48));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Materias primas");

        addStageButton3.setBackground(new java.awt.Color(65, 69, 71));
        addStageButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStageButton3.setForeground(new java.awt.Color(204, 204, 204));
        addStageButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incorrecto.png"))); // NOI18N
        addStageButton3.setBorder(null);
        addStageButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStageButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addingPanel1Layout = new javax.swing.GroupLayout(addingPanel1);
        addingPanel1.setLayout(addingPanel1Layout);
        addingPanel1Layout.setHorizontalGroup(
            addingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(addingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addingPanel1Layout.createSequentialGroup()
                        .addGroup(addingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addingPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addStageButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addStageButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(addingPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addMaterialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addStageButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        addingPanel1Layout.setVerticalGroup(
            addingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMaterialButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStageButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addStageButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addStageButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        jpCreateP.add(addingPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, 230));

        doneButton.setBackground(new java.awt.Color(0, 56, 142));
        doneButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doneButton.setForeground(new java.awt.Color(204, 204, 204));
        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correcto.png"))); // NOI18N
        doneButton.setText("Guardar");
        doneButton.setBorder(null);
        doneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneButtonMouseClicked(evt);
            }
        });
        jpCreateP.add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 143, 35));

        addMaterialButton12.setBackground(new java.awt.Color(0, 56, 142));
        addMaterialButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addMaterialButton12.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correcto2.png"))); // NOI18N
        addMaterialButton12.setText("Nuevo");
        addMaterialButton12.setBorder(null);
        addMaterialButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton12MouseClicked(evt);
            }
        });
        jpCreateP.add(addMaterialButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 143, 35));

        doneButton1.setBackground(new java.awt.Color(0, 56, 142));
        doneButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doneButton1.setForeground(new java.awt.Color(204, 204, 204));
        doneButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correcto.png"))); // NOI18N
        doneButton1.setText("Ver lista de procesos");
        doneButton1.setBorder(null);
        doneButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneButton1MouseClicked(evt);
            }
        });
        jpCreateP.add(doneButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 180, 35));

        Menu.add(jpCreateP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1024, 431));

        jpRegister.setBackground(new java.awt.Color(28, 28, 28));
        jpRegister.setMinimumSize(new java.awt.Dimension(1024, 431));
        jpRegister.setPreferredSize(new java.awt.Dimension(1024, 431));
        jpRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBackButton4.setBackground(new java.awt.Color(28, 28, 28));
        goBackButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        goBackButton4.setForeground(new java.awt.Color(77, 147, 255));
        goBackButton4.setText("< Regresar");
        goBackButton4.setBorder(null);
        goBackButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        goBackButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButton4MouseClicked(evt);
            }
        });
        jpRegister.add(goBackButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 20, 132, 30));

        controlPanelTitle2.setBackground(new java.awt.Color(203, 203, 204));
        controlPanelTitle2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        controlPanelTitle2.setForeground(new java.awt.Color(255, 255, 255));
        controlPanelTitle2.setText("Crear registro");
        jpRegister.add(controlPanelTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 28, -1, 46));

        jSeparator5.setBackground(new java.awt.Color(0, 69, 173));
        jSeparator5.setForeground(new java.awt.Color(0, 69, 173));
        jSeparator5.setToolTipText("");
        jSeparator5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 56, 142)));
        jpRegister.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 80, 310, -1));

        generateButton.setBackground(new java.awt.Color(0, 56, 142));
        generateButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generateButton.setForeground(new java.awt.Color(204, 204, 204));
        generateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/documento.png"))); // NOI18N
        generateButton.setText("  Generar documento");
        generateButton.setBorder(null);
        generateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateButtonMouseClicked(evt);
            }
        });
        jpRegister.add(generateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 368, 186, 35));

        jTextCr.setBackground(new java.awt.Color(48, 48, 48));
        jTextCr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCr.setForeground(new java.awt.Color(204, 204, 204));
        jTextCr.setText("Nombre de la producción");
        jTextCr.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCrActionPerformed(evt);
            }
        });
        jpRegister.add(jTextCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 88, 251, 34));

        searchjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        searchjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchjLabelMouseClicked(evt);
            }
        });
        jpRegister.add(searchjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 88, 21, 34));

        resgisterF.setBackground(new java.awt.Color(48, 48, 48));
        resgisterF.setColumns(20);
        resgisterF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resgisterF.setForeground(new java.awt.Color(204, 204, 204));
        resgisterF.setRows(5);
        resgisterF.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        resgisterF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resgisterF.setFocusable(false);
        jScrollPane4.setViewportView(resgisterF);

        jpRegister.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 740, 216));

        nRdeP0.setBackground(new java.awt.Color(48, 48, 48));
        nRdeP0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nRdeP0.setForeground(new java.awt.Color(204, 204, 204));
        nRdeP0.setText(" XX");
        nRdeP0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        nRdeP0.setFocusable(false);
        nRdeP0.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nRdeP0InputMethodTextChanged(evt);
            }
        });
        jpRegister.add(nRdeP0, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 26, -1));

        nRdeP.setBackground(new java.awt.Color(48, 48, 48));
        nRdeP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nRdeP.setForeground(new java.awt.Color(204, 204, 204));
        nRdeP.setText("de XX");
        jpRegister.add(nRdeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, 20));

        jlBackCr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        jlBackCr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBackCrMouseClicked(evt);
            }
        });
        jpRegister.add(jlBackCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, -1, 20));

        jlNextCr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/siguiente.png"))); // NOI18N
        jlNextCr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlNextCrMouseClicked(evt);
            }
        });
        jpRegister.add(jlNextCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, -1, 20));

        Menu.add(jpRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1024, 431));

        jpSearchP.setBackground(new java.awt.Color(28, 28, 28));
        jpSearchP.setEnabled(false);
        jpSearchP.setFocusable(false);
        jpSearchP.setMinimumSize(new java.awt.Dimension(1024, 431));
        jpSearchP.setPreferredSize(new java.awt.Dimension(1024, 431));
        jpSearchP.setRequestFocusEnabled(false);
        jpSearchP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        controlPanelTitle3.setBackground(new java.awt.Color(203, 203, 204));
        controlPanelTitle3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        controlPanelTitle3.setForeground(new java.awt.Color(255, 255, 255));
        controlPanelTitle3.setText("Buscador de producciones");
        jpSearchP.add(controlPanelTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 28, -1, 46));

        jSeparator6.setBackground(new java.awt.Color(0, 69, 173));
        jSeparator6.setForeground(new java.awt.Color(0, 69, 173));
        jSeparator6.setToolTipText("");
        jSeparator6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 56, 142)));
        jpSearchP.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 80, 592, -1));

        seeRegisterButton.setBackground(new java.awt.Color(0, 56, 142));
        seeRegisterButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seeRegisterButton.setForeground(new java.awt.Color(204, 204, 204));
        seeRegisterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/play.png"))); // NOI18N
        seeRegisterButton.setText("Ver registro completo");
        seeRegisterButton.setBorder(null);
        seeRegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seeRegisterButtonMouseClicked(evt);
            }
        });
        jpSearchP.add(seeRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 186, 35));

        ImageP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 182, -1, -1));

        ImageP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 204, -1, -1));

        ImageP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 226, -1, -1));

        ImageP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 248, -1, -1));

        ImageP5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 267, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/siguiente.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jpSearchP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 299, -1, 29));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jpSearchP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 299, -1, 29));

        namePjL0.setBackground(new java.awt.Color(48, 48, 48));
        namePjL0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namePjL0.setForeground(new java.awt.Color(204, 204, 204));
        namePjL0.setText("Nombre de la producción: ");
        jpSearchP.add(namePjL0, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, 20));

        jTextSp1.setBackground(new java.awt.Color(48, 48, 48));
        jTextSp1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextSp1.setForeground(new java.awt.Color(204, 204, 204));
        jTextSp1.setText("Nombre de la producción");
        jTextSp1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextSp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSp1ActionPerformed(evt);
            }
        });
        jpSearchP.add(jTextSp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 136, 259, 34));

        searchPjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        searchPjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchPjLabelMouseClicked(evt);
            }
        });
        jpSearchP.add(searchPjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 136, 21, 34));

        nSdeP.setBackground(new java.awt.Color(48, 48, 48));
        nSdeP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nSdeP.setForeground(new java.awt.Color(204, 204, 204));
        nSdeP.setText("de XX");
        jpSearchP.add(nSdeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 299, -1, 29));

        ProductionLSp.setBackground(new java.awt.Color(48, 48, 48));
        ProductionLSp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProductionLSp.setForeground(new java.awt.Color(204, 204, 204));
        ProductionLSp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductionLSpMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ProductionLSp);

        jpSearchP.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 176, 259, 117));

        StageLSp.setBackground(new java.awt.Color(48, 48, 48));
        StageLSp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StageLSp.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane6.setViewportView(StageLSp);

        jpSearchP.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 176, 259, 117));

        nSdeP3.setBackground(new java.awt.Color(48, 48, 48));
        nSdeP3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nSdeP3.setForeground(new java.awt.Color(204, 204, 204));
        nSdeP3.setText("de XX");
        jpSearchP.add(nSdeP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 299, -1, 29));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jpSearchP.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 299, -1, 29));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/siguiente.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jpSearchP.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 299, -1, 29));

        ImageS5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 267, -1, -1));

        ImageS4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 248, -1, -1));

        ImageS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 226, -1, -1));

        ImageS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 204, -1, -1));

        ImageS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 182, -1, -1));

        searchSjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        searchSjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchSjLabelMouseClicked(evt);
            }
        });
        jpSearchP.add(searchSjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 136, 21, 34));

        jTextSp2.setBackground(new java.awt.Color(48, 48, 48));
        jTextSp2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextSp2.setForeground(new java.awt.Color(204, 204, 204));
        jTextSp2.setText("Nombre de la etapa");
        jTextSp2.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextSp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSp2ActionPerformed(evt);
            }
        });
        jpSearchP.add(jTextSp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 136, 259, 34));

        MaterialLSp.setBackground(new java.awt.Color(48, 48, 48));
        MaterialLSp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MaterialLSp.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane7.setViewportView(MaterialLSp);

        jpSearchP.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 176, 259, 117));

        nSdeP5.setBackground(new java.awt.Color(48, 48, 48));
        nSdeP5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nSdeP5.setForeground(new java.awt.Color(204, 204, 204));
        nSdeP5.setText("de XX");
        jpSearchP.add(nSdeP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(894, 299, -1, 29));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jpSearchP.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 299, -1, 29));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/siguiente.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jpSearchP.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 299, -1, 29));

        ImageM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 267, -1, -1));

        ImageM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 248, -1, -1));

        ImageM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 226, -1, -1));

        ImageM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 204, -1, -1));

        ImageM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nothing.png"))); // NOI18N
        jpSearchP.add(ImageM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 182, -1, -1));

        searchMjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        searchMjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMjLabelMouseClicked(evt);
            }
        });
        jpSearchP.add(searchMjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 136, 21, 34));

        jTextSp3.setBackground(new java.awt.Color(48, 48, 48));
        jTextSp3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextSp3.setForeground(new java.awt.Color(204, 204, 204));
        jTextSp3.setText("Nombre del material");
        jTextSp3.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextSp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSp3ActionPerformed(evt);
            }
        });
        jpSearchP.add(jTextSp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 136, 259, 34));

        namePjL.setBackground(new java.awt.Color(48, 48, 48));
        namePjL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namePjL.setForeground(new java.awt.Color(204, 204, 204));
        jpSearchP.add(namePjL, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 130, 20));

        nSdeP4.setBackground(new java.awt.Color(48, 48, 48));
        nSdeP4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nSdeP4.setForeground(new java.awt.Color(204, 204, 204));
        nSdeP4.setText(" XX");
        nSdeP4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        nSdeP4.setFocusable(false);
        jpSearchP.add(nSdeP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 302, 26, -1));

        nSdeP2.setBackground(new java.awt.Color(48, 48, 48));
        nSdeP2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nSdeP2.setForeground(new java.awt.Color(204, 204, 204));
        nSdeP2.setText(" XX");
        nSdeP2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        nSdeP2.setFocusable(false);
        jpSearchP.add(nSdeP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 302, 26, -1));

        nSdeP0.setBackground(new java.awt.Color(48, 48, 48));
        nSdeP0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nSdeP0.setForeground(new java.awt.Color(204, 204, 204));
        nSdeP0.setText(" XX");
        nSdeP0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        nSdeP0.setFocusable(false);
        jpSearchP.add(nSdeP0, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 302, 26, -1));

        goBackButton5.setBackground(new java.awt.Color(28, 28, 28));
        goBackButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        goBackButton5.setForeground(new java.awt.Color(77, 147, 255));
        goBackButton5.setText("< Regresar");
        goBackButton5.setBorder(null);
        goBackButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        goBackButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButton5MouseClicked(evt);
            }
        });
        jpSearchP.add(goBackButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 20, 132, 30));

        Menu.add(jpSearchP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1024, 431));

        jpCreateM.setBackground(new java.awt.Color(28, 28, 28));
        jpCreateM.setMinimumSize(new java.awt.Dimension(1024, 431));
        jpCreateM.setPreferredSize(new java.awt.Dimension(1024, 431));
        jpCreateM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBackButton6.setBackground(new java.awt.Color(28, 28, 28));
        goBackButton6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        goBackButton6.setForeground(new java.awt.Color(77, 147, 255));
        goBackButton6.setText("< Regresar");
        goBackButton6.setBorder(null);
        goBackButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        goBackButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButton6MouseClicked(evt);
            }
        });
        jpCreateM.add(goBackButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 20, 132, 30));

        controlPanelTitle5.setBackground(new java.awt.Color(203, 203, 204));
        controlPanelTitle5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        controlPanelTitle5.setForeground(new java.awt.Color(255, 255, 255));
        controlPanelTitle5.setText("Agregar material");
        jpCreateM.add(controlPanelTitle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 28, -1, 46));

        jSeparator8.setBackground(new java.awt.Color(0, 69, 173));
        jSeparator8.setForeground(new java.awt.Color(0, 69, 173));
        jSeparator8.setToolTipText("");
        jSeparator8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 56, 142)));
        jpCreateM.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 80, 388, -1));

        addMaterialButton4.setBackground(new java.awt.Color(65, 69, 71));
        addMaterialButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton4.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar_azul.png"))); // NOI18N
        addMaterialButton4.setText("  Agregar");
        addMaterialButton4.setBorder(null);
        addMaterialButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton4MouseClicked(evt);
            }
        });
        jpCreateM.add(addMaterialButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 110, 30));

        jTextCm8.setBackground(new java.awt.Color(48, 48, 48));
        jTextCm8.setColumns(20);
        jTextCm8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm8.setForeground(new java.awt.Color(204, 204, 204));
        jTextCm8.setRows(5);
        jTextCm8.setText("Descripción");
        jTextCm8.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCm8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane10.setViewportView(jTextCm8);

        jpCreateM.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 420, 110));

        jTextCm3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jpCreateM.add(jTextCm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 110, -1));

        jTextCm2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jpCreateM.add(jTextCm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Fecha de compra: ");
        jpCreateM.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jTextCm11.setBackground(new java.awt.Color(48, 48, 48));
        jTextCm11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm11.setForeground(new java.awt.Color(204, 204, 204));
        jTextCm11.setText("Limite inferior");
        jTextCm11.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCm11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCm11ActionPerformed(evt);
            }
        });
        jpCreateM.add(jTextCm11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 150, 28));

        jTextCm4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2029", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039" }));
        jpCreateM.add(jTextCm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Fecha de vencimiento: ");
        jpCreateM.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jTextCm5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jpCreateM.add(jTextCm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jTextCm6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jpCreateM.add(jTextCm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 110, -1));

        jTextCm7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2029", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039" }));
        jpCreateM.add(jTextCm7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 90, -1));

        jTextCm1.setBackground(new java.awt.Color(48, 48, 48));
        jTextCm1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm1.setForeground(new java.awt.Color(204, 204, 204));
        jTextCm1.setText("Lote");
        jTextCm1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCm1ActionPerformed(evt);
            }
        });
        jpCreateM.add(jTextCm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 100, 28));

        jTextCm9.setBackground(new java.awt.Color(48, 48, 48));
        jTextCm9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm9.setForeground(new java.awt.Color(204, 204, 204));
        jTextCm9.setText("Nombre de parametro");
        jTextCm9.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCm9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCm9ActionPerformed(evt);
            }
        });
        jpCreateM.add(jTextCm9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 320, 28));

        jTextCm10.setBackground(new java.awt.Color(48, 48, 48));
        jTextCm10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm10.setForeground(new java.awt.Color(204, 204, 204));
        jTextCm10.setText("Limite superior");
        jTextCm10.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCm10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCm10ActionPerformed(evt);
            }
        });
        jpCreateM.add(jTextCm10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 150, 28));

        addMaterialButton6.setBackground(new java.awt.Color(0, 56, 142));
        addMaterialButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton6.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correcto.png"))); // NOI18N
        addMaterialButton6.setText("  Guardar material     ");
        addMaterialButton6.setBorder(null);
        addMaterialButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton6MouseClicked(evt);
            }
        });
        jpCreateM.add(addMaterialButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 180, 30));

        addMaterialButton5.setBackground(new java.awt.Color(65, 69, 71));
        addMaterialButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton5.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incorrecto.png"))); // NOI18N
        addMaterialButton5.setText(" Eliminar ");
        addMaterialButton5.setBorder(null);
        addMaterialButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton5MouseClicked(evt);
            }
        });
        jpCreateM.add(addMaterialButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 110, 30));

        ParameterL.setBackground(new java.awt.Color(48, 48, 48));
        ParameterL.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ParameterL.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane13.setViewportView(ParameterL);

        jpCreateM.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 320, 66));

        jLabel13.setBackground(new java.awt.Color(48, 48, 48));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Parametros del material");
        jpCreateM.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jTextCm0.setBackground(new java.awt.Color(48, 48, 48));
        jTextCm0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCm0.setForeground(new java.awt.Color(204, 204, 204));
        jTextCm0.setText("Nombre del material");
        jTextCm0.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCm0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCm0ActionPerformed(evt);
            }
        });
        jpCreateM.add(jTextCm0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 310, 28));

        addMaterialButton7.setBackground(new java.awt.Color(0, 56, 142));
        addMaterialButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton7.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correcto2.png"))); // NOI18N
        addMaterialButton7.setText("Nuevo");
        addMaterialButton7.setBorder(null);
        addMaterialButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton7MouseClicked(evt);
            }
        });
        jpCreateM.add(addMaterialButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 100, 30));

        Menu.add(jpCreateM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1024, 431));

        jpCreateS.setBackground(new java.awt.Color(28, 28, 28));
        jpCreateS.setMinimumSize(new java.awt.Dimension(1024, 431));
        jpCreateS.setPreferredSize(new java.awt.Dimension(1024, 431));
        jpCreateS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBackButton7.setBackground(new java.awt.Color(28, 28, 28));
        goBackButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        goBackButton7.setForeground(new java.awt.Color(77, 147, 255));
        goBackButton7.setText("< Regresar");
        goBackButton7.setBorder(null);
        goBackButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        goBackButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButton7MouseClicked(evt);
            }
        });
        jpCreateS.add(goBackButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 20, 132, 30));

        controlPanelTitle6.setBackground(new java.awt.Color(203, 203, 204));
        controlPanelTitle6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        controlPanelTitle6.setForeground(new java.awt.Color(255, 255, 255));
        controlPanelTitle6.setText("Agregar etapa");
        jpCreateS.add(controlPanelTitle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 28, -1, 46));

        jSeparator9.setBackground(new java.awt.Color(0, 69, 173));
        jSeparator9.setForeground(new java.awt.Color(0, 69, 173));
        jSeparator9.setToolTipText("");
        jSeparator9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 56, 142)));
        jpCreateS.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 80, 388, -1));

        addMaterialButton8.setBackground(new java.awt.Color(65, 69, 71));
        addMaterialButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton8.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar_azul.png"))); // NOI18N
        addMaterialButton8.setText("  Agregar");
        addMaterialButton8.setBorder(null);
        addMaterialButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton8MouseClicked(evt);
            }
        });
        jpCreateS.add(addMaterialButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 110, 30));

        jTextCs8.setBackground(new java.awt.Color(48, 48, 48));
        jTextCs8.setColumns(20);
        jTextCs8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs8.setForeground(new java.awt.Color(204, 204, 204));
        jTextCs8.setRows(5);
        jTextCs8.setText("Descripción");
        jTextCs8.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCs8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane11.setViewportView(jTextCs8);

        jpCreateS.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 420, 110));

        jTextCs3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jpCreateS.add(jTextCs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 110, -1));

        jTextCs2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jpCreateS.add(jTextCs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jTextCs1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs1.setForeground(new java.awt.Color(204, 204, 204));
        jTextCs1.setText("XXXX");
        jpCreateS.add(jTextCs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 60, 30));

        jTextCs11.setBackground(new java.awt.Color(48, 48, 48));
        jTextCs11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs11.setForeground(new java.awt.Color(204, 204, 204));
        jTextCs11.setText("Limite inferior");
        jTextCs11.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCs11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCs11ActionPerformed(evt);
            }
        });
        jpCreateS.add(jTextCs11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 150, 28));

        jTextCs4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2029", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039" }));
        jpCreateS.add(jTextCs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Fecha de finalización: ");
        jpCreateS.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jTextCs5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jTextCs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCs5ActionPerformed(evt);
            }
        });
        jpCreateS.add(jTextCs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jTextCs6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jpCreateS.add(jTextCs6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 110, -1));

        jTextCs7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2029", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039" }));
        jpCreateS.add(jTextCs7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 90, -1));

        jTextCs9.setBackground(new java.awt.Color(48, 48, 48));
        jTextCs9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs9.setForeground(new java.awt.Color(204, 204, 204));
        jTextCs9.setText("Nombre del parametro");
        jTextCs9.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCs9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCs9ActionPerformed(evt);
            }
        });
        jpCreateS.add(jTextCs9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 320, 28));

        jTextCs10.setBackground(new java.awt.Color(48, 48, 48));
        jTextCs10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs10.setForeground(new java.awt.Color(204, 204, 204));
        jTextCs10.setText("Limite superior");
        jTextCs10.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCs10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCs10ActionPerformed(evt);
            }
        });
        jpCreateS.add(jTextCs10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 150, 28));

        addMaterialButton9.setBackground(new java.awt.Color(0, 56, 142));
        addMaterialButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton9.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correcto.png"))); // NOI18N
        addMaterialButton9.setText("  Guardar etapa     ");
        addMaterialButton9.setBorder(null);
        addMaterialButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton9MouseClicked(evt);
            }
        });
        jpCreateS.add(addMaterialButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 170, 28));

        addMaterialButton10.setBackground(new java.awt.Color(65, 69, 71));
        addMaterialButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton10.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/incorrecto.png"))); // NOI18N
        addMaterialButton10.setText(" Eliminar ");
        addMaterialButton10.setBorder(null);
        addMaterialButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton10MouseClicked(evt);
            }
        });
        jpCreateS.add(addMaterialButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 110, 30));

        ParameterL1.setBackground(new java.awt.Color(48, 48, 48));
        ParameterL1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ParameterL1.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane14.setViewportView(ParameterL1);

        jpCreateS.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 320, 66));

        jLabel18.setBackground(new java.awt.Color(48, 48, 48));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Parametros de la etapa");
        jpCreateS.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jTextCs0.setBackground(new java.awt.Color(48, 48, 48));
        jTextCs0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCs0.setForeground(new java.awt.Color(204, 204, 204));
        jTextCs0.setText("Nombre del etapa");
        jTextCs0.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        jTextCs0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCs0ActionPerformed(evt);
            }
        });
        jpCreateS.add(jTextCs0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 320, 28));

        addMaterialButton11.setBackground(new java.awt.Color(0, 56, 142));
        addMaterialButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMaterialButton11.setForeground(new java.awt.Color(204, 204, 204));
        addMaterialButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/correcto2.png"))); // NOI18N
        addMaterialButton11.setText("Nuevo");
        addMaterialButton11.setBorder(null);
        addMaterialButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMaterialButton11MouseClicked(evt);
            }
        });
        jpCreateS.add(addMaterialButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 100, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Fecha de inicio: ");
        jpCreateS.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("ID:");
        jpCreateS.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 30, 30));

        Menu.add(jpCreateS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1024, 431));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 541));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextR4ActionPerformed

    private void jTextR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextR3ActionPerformed

    private void jTextR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextR1ActionPerformed

    private void jTextCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCrActionPerformed

    private void jTextSp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSp1ActionPerformed

    private void jTextSp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSp2ActionPerformed

    private void jTextSp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSp3ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x= evt.getX();   
         y= evt.getY(); 
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX()-x,this.getLocation().y+evt.getY()-y);
    }//GEN-LAST:event_formMouseDragged

    private void jlCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseClicked
       int dialog = JOptionPane.YES_NO_OPTION;
       int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?","Exit",dialog);
       if(result ==0){         
           System.exit(0);
       }
    }//GEN-LAST:event_jlCloseMouseClicked

    private void jlClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlClose1MouseClicked
         int dialog = JOptionPane.YES_NO_OPTION;
       int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?","Exit",dialog);
       if(result ==0){
          System.exit(0);
       }
    }//GEN-LAST:event_jlClose1MouseClicked

    private void jlMinimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimize1MouseClicked
       this.setState(GUI.ICONIFIED);
    }//GEN-LAST:event_jlMinimize1MouseClicked

    private void jlMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizeMouseClicked
       this.setState(GUI.ICONIFIED);
    }//GEN-LAST:event_jlMinimizeMouseClicked

    private void goBackButton0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButton0MouseClicked
         jpSignIn.setVisible(true);
         jpNewUser.setVisible(false);       

    }//GEN-LAST:event_goBackButton0MouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        jpSignIn.setVisible(false);
        jpNewUser.setVisible(true);          
    }//GEN-LAST:event_registerButtonMouseClicked
    private static Boolean adm=false;
    private void signInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseClicked
        Boolean correct=false;
        try{
            
        for(int i=0; i<singlyLinkedListUser.getSize(); i++){
                if (singlyLinkedListUser.getItem(i).getUser().equals(jTextL1.getText())){
                   if (singlyLinkedListUser.getItem(i).getPassword().equals(jTextL2.getText())){  
                   correct=true;
                   adm=singlyLinkedListUser.getItem(i).getAdm();
                   userLabel1.setText(singlyLinkedListUser.getItem(i).getUser());
                   idLabel.setText("ID: "+String.valueOf(singlyLinkedListUser.getItem(i).getId()));
                   break;
                     }
                }
           }
        if(correct ){
            if(adm){
                
            Main.setVisible(false);               
            Main.repaint();
            Main.revalidate();
        
            Menu.setVisible(true); 
            goBackButton5.setVisible(true);
            roleLabel.setText("Usuario administrador");
            jpControl.setVisible(true);            
             Menu.repaint();
             Menu.revalidate();   
            }else{
            Main.setVisible(false);               
            Main.repaint();
            Main.revalidate();
            
            sLIDP2 = new SinglyLinkedList<>();
            if(myArrayListProduction.getSize()>0){
                ProductionLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<myArrayListProduction.getSize(); i++){
                        sLIDP2.pushBack(i);
                }
                for(int i=0; i<5; i++){
                    if(i<myArrayListProduction.getSize()){
                        namep[i]=myArrayListProduction.getItem(i).getName();
                   if(!myArrayListProduction.getItem(i).isIsActive()){
                        iconSeeP(i+1);
                   }else if(myArrayListProduction.getItem(i).isIsFinished()){
                        iconSeeP((i+1)+5);
                   }else if(myArrayListProduction.getItem(i).isIsActive()){
                        iconSeeP((i+1)+10);
                   }
                    }else{
                        iconSeeP((i+1)+15);
                    }
                   
                }
                
                   ProductionLSp.setListData(namep);
                 indexSpp=1;
                 String auxS;
                 int sizep=myArrayListProduction.getSize()%5;
                 int aux=myArrayListProduction.getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                 nSdeP.setText("de "+aux);
                 nSdeP0.setText("1");
                 namePjL.setText("");
                 namePjL0.setText("Todos las producciónes");
            }
            
            Menu.setVisible(true);  
            goBackButton5.setVisible(false);
            roleLabel.setText("Usuario estandar");
            jpSearchP.setVisible(true);
            Menu.repaint();
            Menu.revalidate();   
            }
        
        }else{
            JOptionPane.showMessageDialog(this,"Usuario y/o contraseña no validos."); 
        }
        
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
       
        
           
    }//GEN-LAST:event_signInButtonMouseClicked
    private void cleanJPRegister(){
        jTextCr.setText("Nombre de la producción");
        nRdeP0.setText("X");
        nRdeP.setText("de XX");
        indexCr=1;
        resgisterF.setText("");
    }
    
    private void cleanJPSearchP(){
        jTextSp1.setText("Nombre de la producción");
        jTextSp2.setText("Nombre de la etapa");
        jTextSp3.setText("Nombre del material");
        nSdeP0.setText("X");
        nSdeP.setText("de XX");
        
        nSdeP0.setText("X");
        nSdeP.setText("de XX");
        
        nSdeP2.setText("X");
        nSdeP3.setText("de XX");
        
        nSdeP4.setText("X");
        nSdeP5.setText("de XX");
        
        for(int i=0; i<5; i++){
                iconSeeP((i+1)+15);
                iconSeeS((i+1)+15);
                iconSeeM((i+1)+15);
            }
        
          ProductionLSp.removeAll();
          StageLSp.removeAll();
          MaterialLSp.removeAll();
            String [] namep= new  String[0];
         
          ProductionLSp.setListData(namep);
          StageLSp.setListData(namep);
          MaterialLSp.setListData(namep);
        
    }
    private void signOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutButtonMouseClicked
       
        try{
              int dialog = JOptionPane.YES_NO_OPTION;
       int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?","Cerrar sesión",dialog);
       if(result ==0){
           cleanJPCreatM();
           cleanJPRegister();
           cleanJPCreatS();
            cleanCreateP();
            cleanJPSearchP();
           Menu.setVisible(false); 
//            jpCM.setVisible(false);
//            jpUser.setVisible(false);
            jpSearchP.setVisible(false);
            jpCreateP.setVisible(false);
            jpRegister.setVisible(false);
            jpControl.setVisible(false); 
            jpCreateS.setVisible(false);
            jpCreateM.setVisible(false);
        Menu.repaint();
        Menu.revalidate(); 
        
        
        
        jTextL1.setText("");
        jTextL2.setText("");
        
        Main.setVisible(true);  
        jpNewUser.setVisible(false);   
        Main.repaint();
        Main.revalidate();
       }
              
        }catch(Exception e){
            
        }
               
      
       
    }//GEN-LAST:event_signOutButtonMouseClicked

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseClicked
        jpControl.setVisible(false);
        jpCreateP.setVisible(true);
        
    }//GEN-LAST:event_createButtonMouseClicked

    private void manageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageButtonMouseClicked
         jpControl.setVisible(false);
        //.setVisible(true);   
    }//GEN-LAST:event_manageButtonMouseClicked

    private void registryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registryButtonMouseClicked
        jpControl.setVisible(false);
        jpRegister.setVisible(true);
    }//GEN-LAST:event_registryButtonMouseClicked

    private void goBackButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButton3MouseClicked
        jpCreateP.setVisible(false);
        jpControl.setVisible(true);
    }//GEN-LAST:event_goBackButton3MouseClicked

    private void goBackButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButton4MouseClicked
        jpRegister.setVisible(false);
        
        if(adm){
           if(SegoRe){
            jpSearchP.setVisible(true);
            SegoRe=false;
            selectproduction=-1;
        }else{
             jpControl.setVisible(true);   
           } 
        
        }else{
        jpSearchP.setVisible(true);
        }
    }//GEN-LAST:event_goBackButton4MouseClicked

    private void jTextR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextR2ActionPerformed
    
    private Boolean AdmC=false;
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       Boolean aux=false;
       Boolean correct=true;       
       User user=new User();
       try{
           try{
                   Integer.parseInt (jTextR4.getText());
               }catch(Exception e1){
                   JOptionPane.showMessageDialog(this,"Valor no valido para ID.");
                   correct=false;
               }
           for(int i=0; i<singlyLinkedListUser.getSize(); i++){
                if (singlyLinkedListUser.getItem(i).getUser().equals(jTextR2.getText())){
                   JOptionPane.showMessageDialog(this,"El usuario ya existe.");
                   correct=false; 
                   break;
                }
                if (singlyLinkedListUser.getItem(i).getId()==Integer.parseInt (jTextR4.getText())){
                   JOptionPane.showMessageDialog(this,"El ID ya existe.");
                   correct=false; 
                   break;
                }
           }
           if(AdmC && correct){
                if (jTextR5.getText().equals("soyadm")){
                   user = new User(jTextR1.getText(),Integer.parseInt (jTextR4.getText()),jTextR2.getText(),jTextR3.getText(),AdmC);
                   //AdmC=false;
                   jTextR5.setText("Constraseña");
                }else{
                      JOptionPane.showMessageDialog(this,"Contraseña de administrador incorrecta.");
                      correct=false;
                }
           }else if(!AdmC && correct){
                user = new User(jTextR1.getText(),Integer.parseInt (jTextR4.getText()),jTextR2.getText(),jTextR3.getText(),AdmC);
           }
           
           if(correct){
           int dialog = JOptionPane.YES_NO_OPTION;
           int result = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos?","Guardar",dialog);
           
           if(result==0){
               singlyLinkedListUser.pushBack(user);
           }
           }
          
       }catch (Exception e){
              JOptionPane.showMessageDialog(this,"Error al guardar.");
       }
        
        
        
        
    }//GEN-LAST:event_jButton2MouseClicked

  
    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        
        if(AdmC){
        AdmC=false;
        jTextR5.setFocusable(AdmC);
        }else{
        AdmC=true;
        jTextR5.setFocusable(AdmC);
        }
        
    }//GEN-LAST:event_jCheckBox1MouseClicked
    
    
    private Boolean SegoRe=false;
    private void seeRegisterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeRegisterButtonMouseClicked

        try{
            if(selectproduction!=-1 && sLIDP2.getSize()>0 && sLIDP2.getSize()>selectproduction+(5*(indexSpp-1))){
               jpSearchP.setVisible(false);
               SegoRe=true;
               jpRegister.setVisible(true); 
                sLIDP = new SinglyLinkedList<>();
                sLIDP.pushBack(sLIDP2.getItem(selectproduction+(5*(indexSpp-1))));
                          
                printProduction(1);
                nRdeP.setText("de "+sLIDP.getSize());
                nRdeP0.setText("1");
            }else{
               if(myArrayListProduction.getSize()<=0){
                 JOptionPane.showMessageDialog(this,"Para ver registros debe crear producciónes."); 
                }else{
                 JOptionPane.showMessageDialog(this,"Por favor seleccione una producción. Para ello debe dar click en la imagen de la lupa del buscador de producciones para ver todas las producciónes"+"\n"+
                         "o en el caso que desee buscar una producción en especifico, puede escribir el nombre de la producción y dar click en la lupa respectivamente.");   
                 }
            }
             
            
        }catch(Exception e){
          JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");  
        }
       
        
    }//GEN-LAST:event_seeRegisterButtonMouseClicked

    public String convertMonth(String month){
        switch (month) {
             case "Enero":
                   return "01";
             case "Febrero":
                   return "02";
             case "Marzo":
                   return "03";
             case "Abril":
                   return "04";
             case "Mayo":
                   return "05";
             case "Junio":
                   return "06";
             case "Julio":
                   return "07";
             case "Agosto":
                   return "08";
             case "Septiembre":
                   return "09";
             case "Octubre":
                   return "10";
             case "Noviembre":
                   return "11";
             case "Diciembre":
                   return "12";
                   
             default:
                 return "Novalido";
        }
   
    }
    private static int numberProduction=0;
    
    private void cleanCreateP(){
        jTextCp1.setText("Nombre de la producción");
            jTextCp3.removeAllItems();
            jTextCp3.addItem("Mes");
            jTextCp3.addItem("Enero");
            jTextCp3.addItem("Febrero");
            jTextCp3.addItem("Marzo");
            jTextCp3.addItem("Abril");
            jTextCp3.addItem("Mayo");
            jTextCp3.addItem("Junio");
            jTextCp3.addItem("Julio");
            jTextCp3.addItem("Agosto");
            jTextCp3.addItem("Septiembre");
            jTextCp3.addItem("Octubre");
            jTextCp3.addItem("Noviembre");
            jTextCp3.addItem("Diciembre");
             
            jTextCp4.removeAllItems();  
           
            jTextCp4.addItem("Año");
           
            for(int i=0; i<10; i++){
            jTextCp4.addItem("202"+Integer.toString(i));
           
            }   
            for(int i=0; i<10; i++){
            jTextCp4.addItem("203"+Integer.toString(i));
           
            }
            
            jTextCp2.removeAllItems();
            jTextCp2.addItem("Dia");
            for(int i=1; i<32; i++){
            jTextCp2.addItem(Integer.toString(i));
            }
            jTextCp5.setText("Descripción");
            materialL.removeAll();
            stagesL.removeAll();
            String [] namep= new  String[0];
            materialL.setListData(namep);
            stagesL.setListData(namep);            
            ListMaux= new MyArrayList<>();
            ListSaux= new MyArrayList<>();
            jLabel5.setText("Resumen: "+String.valueOf(ListMaux.getSize())+" material/es, "+String.valueOf(ListSaux.getSize()) +" etapa/s.");
    }
    private void doneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneButtonMouseClicked
        Production production=new Production();
        Boolean correct=true;
        int countP=1;
        try{
           
           try{
               Integer.parseInt(jTextCp2.getSelectedItem().toString());
               Integer.parseInt(convertMonth(jTextCp3.getSelectedItem().toString()));
               Integer.parseInt(jTextCp4.getSelectedItem().toString());               
            }catch(Exception e){
                correct=false;
                 JOptionPane.showMessageDialog(this,"Valores no validos para fecha.");
            }
           
           if(correct && (ListMaux.getSize()<=0 || ListSaux.getSize()<=0)){
               correct=false;
               JOptionPane.showMessageDialog(this,"Antes de guardar, debe agregar materiales y etapas a la producción.");
             }
           if(correct){
               int dialog = JOptionPane.YES_NO_OPTION;
           int result = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos?","Guardar la producción",dialog);
           if(result==0){
            production=new Production(jTextCp1.getText(), jTextCp5.getText(),ListMaux, ListSaux);
            production.setStartDate("No iniciado");
            production.setEndDate(Integer.parseInt(jTextCp2.getSelectedItem().toString())+"/"+Integer.parseInt(convertMonth(jTextCp3.getSelectedItem().toString()))+"/"+Integer.parseInt(jTextCp4.getSelectedItem().toString()));
            production.setIsActive(false);
            production.setIsFinished(false);
            myArrayListProduction.pushBack(production);
            
            productionIDLabel1.setText(String.valueOf(countP+1));
            cleanCreateP();
            
           }

           }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
    }//GEN-LAST:event_doneButtonMouseClicked

    private void jTextCp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCp1ActionPerformed

    private void jTextCm11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCm11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCm11ActionPerformed

    private void jTextCm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCm1ActionPerformed

    private void jTextCm9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCm9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCm9ActionPerformed

    private void jTextCm10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCm10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCm10ActionPerformed

    private void addMaterialButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton1MouseClicked
        jpCreateP.setVisible(false);
        jpCreateM.setVisible(true);        
    }//GEN-LAST:event_addMaterialButton1MouseClicked

    private void goBackButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButton6MouseClicked
         jpCreateM.setVisible(false); 
         jpCreateP.setVisible(true);
         jLabel5.setText("Resumen: "+String.valueOf(ListMaux.getSize())+" material/es, "+String.valueOf(ListSaux.getSize()) +" etapa/s.");
          materialL.removeAll();
                String [] namep= new  String[ListMaux.getSize()];
                for (int i = 0; i < ListMaux.getSize(); i++) {
                namep[i]=ListMaux.getItem(i).getName();
                }
          materialL.setListData(namep);
    }//GEN-LAST:event_goBackButton6MouseClicked
    private static MyArrayList<Parameter> listPaux = new MyArrayList<>();
    private void addMaterialButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton4MouseClicked
        Parameter parameter;
        
        Boolean correct=true;
        try{
            try{
                Double.parseDouble(jTextCm10.getText());
                Double.parseDouble(jTextCm11.getText());
            }catch(Exception e){
             JOptionPane.showMessageDialog(this,"Valor no valido para los limites en el parametro");
             correct=false;
             }
            if(correct &&(Double.parseDouble( jTextCm10.getText())<0.0 || Double.parseDouble(jTextCm11.getText())<0.0)){
                 JOptionPane.showMessageDialog(this,"El valor del limite debe ser mayor o igual a 0.");
                 correct=false;
            }
            if(correct && (Double.parseDouble(jTextCm10.getText())<Double.parseDouble(jTextCm11.getText()))){
              correct=false;
                JOptionPane.showMessageDialog(this,"El limite inferior no puede ser mayor al limite superior");
             }
            if(correct){
              parameter =new Parameter(jTextCm9.getText(),-1.0,Double.parseDouble( jTextCm11.getText()),Double.parseDouble(jTextCm10.getText()));   
              listPaux.pushBack(parameter);
              jTextCm9.setText("Nombre de parametro");
              jTextCm10.setText("Limite superior");
              jTextCm11.setText("Limite inferior");
              
              ParameterL.removeAll();
                String [] namep= new  String[listPaux.getSize()];
                for (int i = 0; i < listPaux.getSize(); i++) {
                namep[i]=listPaux.getItem(i).getName();
                }
                ParameterL.setListData(namep);
            }
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
    }//GEN-LAST:event_addMaterialButton4MouseClicked

    private void addMaterialButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton5MouseClicked
        int selected =ParameterL.getSelectedIndex();
        if(selected!=-1){
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el parametro?","Eliminar parametro",dialog);
            if(result==0){
            listPaux.removeIndex(selected);
             ParameterL.removeAll();
                String [] namep= new  String[listPaux.getSize()];
                for (int i = 0; i < listPaux.getSize(); i++) {
                namep[i]=listPaux.getItem(i).getName();
                }
                ParameterL.setListData(namep);
         }
        }
        
    }//GEN-LAST:event_addMaterialButton5MouseClicked

   private static MyArrayList<RawMaterial> ListMaux= new MyArrayList<>();
    private void addMaterialButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton6MouseClicked
        Boolean correct=true;
        try{
            try{
               Integer.parseInt(jTextCm2.getSelectedItem().toString());
               Integer.parseInt(convertMonth(jTextCm3.getSelectedItem().toString()));
               Integer.parseInt(jTextCm4.getSelectedItem().toString());
               Integer.parseInt(jTextCm5.getSelectedItem().toString());
               Integer.parseInt(convertMonth(jTextCm6.getSelectedItem().toString()));
               Integer.parseInt(jTextCm7.getSelectedItem().toString());
            }catch(Exception e){
                correct=false;
                 JOptionPane.showMessageDialog(this,"Valores no validos para fecha.");
            }
            if(correct && listPaux.getSize()==0){
                 JOptionPane.showMessageDialog(this,"Antes de guardar, agregue parametros al material.");
                correct=false;
            }
            
            if(correct && Integer.parseInt(jTextCm4.getSelectedItem().toString())>Integer.parseInt(jTextCm7.getSelectedItem().toString())){
                correct=false;
                 JOptionPane.showMessageDialog(this,"La fecha de inicio debe ser menor a la fecha de finalización.");
                
            }else  if(correct && Integer.parseInt(jTextCm4.getSelectedItem().toString())==Integer.parseInt(jTextCm7.getSelectedItem().toString())){
                
                if(Integer.parseInt(convertMonth(jTextCm3.getSelectedItem().toString()))>Integer.parseInt(convertMonth(jTextCm6.getSelectedItem().toString()))){
                    correct=false;
                     JOptionPane.showMessageDialog(this,"La fecha de inicio debe ser menor a la fecha de finalización.");
                }else if(Integer.parseInt(convertMonth(jTextCm3.getSelectedItem().toString()))==Integer.parseInt(convertMonth(jTextCm6.getSelectedItem().toString()))){
                    if(Integer.parseInt(jTextCm2.getSelectedItem().toString())>Integer.parseInt(jTextCm5.getSelectedItem().toString())){
                        correct=false;
                        JOptionPane.showMessageDialog(this,"La fecha de inicio debe ser menor a la fecha de finalización.");
                     }
                }
            }
            
            
            if(correct){
             int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos?","Guardar material",dialog);
            if(result==0){
            RawMaterial rawMaterial;
            String dataS=Integer.parseInt(jTextCm2.getSelectedItem().toString())+"/"+Integer.parseInt(convertMonth(jTextCm3.getSelectedItem().toString()))+"/"+Integer.parseInt(jTextCm4.getSelectedItem().toString());
            String dataE=Integer.parseInt(jTextCm5.getSelectedItem().toString())+"/"+Integer.parseInt(convertMonth(jTextCm6.getSelectedItem().toString()))+"/"+Integer.parseInt(jTextCm7.getSelectedItem().toString());
            rawMaterial= new RawMaterial(jTextCm0.getText(),dataS,dataE,jTextCm1.getText(),jTextCm8.getText(),listPaux);           
            ListMaux.pushBack(rawMaterial);
           }
            }
      
          
        }catch(Exception e){
              JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
    }//GEN-LAST:event_addMaterialButton6MouseClicked

    private void jTextCm0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCm0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCm0ActionPerformed
    private void cleanJPCreatM(){
            listPaux = new MyArrayList<>();
            jTextCm0.setText("Nombre del material");
            jTextCm1.setText("Lote");
            jTextCm8.setText("Descripción");
                
            jTextCm3.removeAllItems();
            jTextCm3.addItem("Mes");
           
            jTextCm3.addItem("Enero");
            jTextCm3.addItem("Febrero");
            jTextCm3.addItem("Marzo");
            jTextCm3.addItem("Abril");
            jTextCm3.addItem("Mayo");
            jTextCm3.addItem("Junio");
            jTextCm3.addItem("Julio");
            jTextCm3.addItem("Agosto");
            jTextCm3.addItem("Septiembre");
            jTextCm3.addItem("Octubre");
            jTextCm3.addItem("Noviembre");
            jTextCm3.addItem("Diciembre");
            
            jTextCm6.removeAllItems();
            jTextCm6.addItem("Mes");
           
            jTextCm6.addItem("Enero");
            jTextCm6.addItem("Febrero");
            jTextCm6.addItem("Marzo");
            jTextCm6.addItem("Abril");
            jTextCm6.addItem("Mayo");
            jTextCm6.addItem("Junio");
            jTextCm6.addItem("Julio");
            jTextCm6.addItem("Agosto");
            jTextCm6.addItem("Septiembre");
            jTextCm6.addItem("Octubre");
            jTextCm6.addItem("Noviembre");
            jTextCm6.addItem("Diciembre");
            
            jTextCm4.removeAllItems();  
            jTextCm7.removeAllItems(); 
            jTextCm4.addItem("Año");
            jTextCm7.addItem("Año");
            for(int i=0; i<10; i++){
            jTextCm4.addItem("202"+Integer.toString(i));
            jTextCm7.addItem("202"+Integer.toString(i));
            }   
            for(int i=0; i<10; i++){
            jTextCm4.addItem("203"+Integer.toString(i));
            jTextCm7.addItem("203"+Integer.toString(i));
            }
            
            jTextCm2.removeAllItems();
            jTextCm5.removeAllItems();
            jTextCm2.addItem("Dia");
            jTextCm5.addItem("Dia");
            for(int i=1; i<32; i++){
            jTextCm2.addItem(Integer.toString(i));
            jTextCm5.addItem(Integer.toString(i));
            }
            
            jTextCm9.setText("Nombre de parametro");
            jTextCm10.setText("Limite superior");
            jTextCm11.setText("Limite inferior");
            ParameterL.removeAll();
            String [] namep= new  String[0];
             ParameterL.setListData(namep);
    }
    private void addMaterialButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton7MouseClicked
         try{
           int dialog = JOptionPane.YES_NO_OPTION;
           int result = JOptionPane.showConfirmDialog(null, "¿Desea agregar un nuevo material?","Nuevo material",dialog);
           if(result==0){
             cleanJPCreatM();
           }
          
        }catch(Exception e){
              JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
    }//GEN-LAST:event_addMaterialButton7MouseClicked

    private void addStageButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStageButton3MouseClicked
        int selected =materialL.getSelectedIndex();
        if(selected!=-1){
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar la materia prima?","Eliminar material",dialog);
            if(result==0){
            ListMaux.removeIndex(selected);
            jLabel5.setText("Resumen: "+String.valueOf(ListMaux.getSize())+" material/es, "+String.valueOf(ListSaux.getSize()) +" etapa/s.");
            materialL.removeAll();
                String [] namep= new  String[ListMaux.getSize()];
                for (int i = 0; i < ListMaux.getSize(); i++) {
                namep[i]=listPaux.getItem(i).getName();
                }
                materialL.setListData(namep);
         }
        }
         
    }//GEN-LAST:event_addStageButton3MouseClicked

    private void goBackButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButton7MouseClicked
        jpCreateS.setVisible(false); 
        jpCreateP.setVisible(true);
        jLabel5.setText("Resumen: "+String.valueOf(ListMaux.getSize())+" material/es, "+String.valueOf(ListSaux.getSize()) +" etapa/s.");
          stagesL.removeAll();
                String [] namep= new  String[ListSaux.getSize()];
                for (int i = 0; i < ListSaux.getSize(); i++) {
                namep[i]=ListSaux.getItem(i).getName();
                }
          stagesL.setListData(namep);
    }//GEN-LAST:event_goBackButton7MouseClicked
    private static MyArrayList<Parameter> listPaux2 = new MyArrayList<>();
    private void addMaterialButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton8MouseClicked
       Parameter parameter;
        
        Boolean correct=true;
        try{
            try{
                Double.parseDouble(jTextCs10.getText());
                Double.parseDouble(jTextCs11.getText());
            }catch(Exception e){
             JOptionPane.showMessageDialog(this,"Valor no valido para los limites en el parametro");
             correct=false;
             }
            if(correct &&(Double.parseDouble( jTextCs10.getText())<0.0 || Double.parseDouble(jTextCs11.getText())<0.0)){
                 JOptionPane.showMessageDialog(this,"El valor del limite debe ser mayor o igual a 0.");
                 correct=false;
            }
             if(correct && (Double.parseDouble( jTextCs10.getText())<Double.parseDouble(jTextCs11.getText()))){
             correct=false;
                JOptionPane.showMessageDialog(this,"El limite inferior no puede ser mayor al limite superior");
             }
            
            if(correct){
              parameter =new Parameter(jTextCs9.getText(),-1.0,Double.parseDouble( jTextCs11.getText()),Double.parseDouble(jTextCs10.getText()));   
              listPaux2.pushBack(parameter);
              jTextCs9.setText("Nombre del parametro");
              jTextCs10.setText("Limite superior");
              jTextCs11.setText("Limite inferior");
              
              ParameterL1.removeAll();
                String [] namep= new  String[listPaux2.getSize()];
                for (int i = 0; i < listPaux2.getSize(); i++) {
                namep[i]=listPaux2.getItem(i).getName();
                }
                ParameterL1.setListData(namep);
            }
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
    }//GEN-LAST:event_addMaterialButton8MouseClicked

    private void jTextCs11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCs11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCs11ActionPerformed

    private void jTextCs9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCs9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCs9ActionPerformed

    private void jTextCs10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCs10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCs10ActionPerformed
    private static MyArrayList<Stage> ListSaux= new MyArrayList<>();
    private void addMaterialButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton9MouseClicked
         Boolean correct=true;
        try{
           
            //
             try{
               Integer.parseInt(jTextCs2.getSelectedItem().toString());
               Integer.parseInt(convertMonth(jTextCs3.getSelectedItem().toString()));
               Integer.parseInt(jTextCs4.getSelectedItem().toString());
               Integer.parseInt(jTextCs5.getSelectedItem().toString());
               Integer.parseInt(convertMonth(jTextCs6.getSelectedItem().toString()));
               Integer.parseInt(jTextCs7.getSelectedItem().toString());
            }catch(Exception e){
                correct=false;
                 JOptionPane.showMessageDialog(this,"Valores no validos para fecha.");
            }
             
                if(correct && listPaux2.getSize()==0){
                 JOptionPane.showMessageDialog(this,"Antes de guardar, agregue parametros a la etapa.");
                correct=false;
             }
                
                 if(correct && Integer.parseInt(jTextCs4.getSelectedItem().toString())>Integer.parseInt(jTextCs7.getSelectedItem().toString())){
                correct=false;
                JOptionPane.showMessageDialog(this,"La fecha de inicio debe ser menor a la fecha de finalización.");
                
            }else  if(correct && Integer.parseInt(jTextCs4.getSelectedItem().toString())==Integer.parseInt(jTextCs7.getSelectedItem().toString())){
                
                if(Integer.parseInt(convertMonth(jTextCs3.getSelectedItem().toString()))>Integer.parseInt(convertMonth(jTextCs6.getSelectedItem().toString()))){
                    correct=false;
                    JOptionPane.showMessageDialog(this,"La fecha de inicio debe ser menor a la fecha de finalización.");
                }else if(Integer.parseInt(convertMonth(jTextCs3.getSelectedItem().toString()))==Integer.parseInt(convertMonth(jTextCs6.getSelectedItem().toString()))){
                    if(Integer.parseInt(jTextCs2.getSelectedItem().toString())>Integer.parseInt(jTextCs5.getSelectedItem().toString())){
                        correct=false;
                        JOptionPane.showMessageDialog(this,"La fecha de inicio debe ser menor a la fecha de finalización.");
                     }
                }
            }
            
            
            //
            if(correct){
                int dialog = JOptionPane.YES_NO_OPTION;
           int result = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos?","Guardar etapa",dialog);
           if(result==0){
            Stage stage;
            String dataS=Integer.parseInt(jTextCs2.getSelectedItem().toString())+"/"+Integer.parseInt(convertMonth(jTextCs3.getSelectedItem().toString()))+"/"+Integer.parseInt(jTextCs4.getSelectedItem().toString());
            String dataE=Integer.parseInt(jTextCs5.getSelectedItem().toString())+"/"+Integer.parseInt(convertMonth(jTextCs6.getSelectedItem().toString()))+"/"+Integer.parseInt(jTextCs7.getSelectedItem().toString());
            stage= new Stage(1,listPaux2,jTextCs0.getText(),dataS,dataE,jTextCs1.getText(),jTextCs8.getText());//Corregir,¡¡¡¡¡¿ que es es 1??           
            stage.setIsActive(false);
            stage.setIsFinished(false);
            ListSaux.pushBack(stage);
           }
            }
           
          
        }catch(Exception e){
              JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
    }//GEN-LAST:event_addMaterialButton9MouseClicked

    private void addMaterialButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton10MouseClicked
       int selected =ParameterL1.getSelectedIndex();
        if(selected!=-1){
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el parametro?","Eliminar parametro",dialog);
            if(result==0){
            listPaux2.removeIndex(selected);
             ParameterL1.removeAll();
                String [] namep= new  String[listPaux2.getSize()];
                for (int i = 0; i < listPaux2.getSize(); i++) {
                namep[i]=listPaux2.getItem(i).getName();
                }
            ParameterL1.setListData(namep);
         }
        }
    }//GEN-LAST:event_addMaterialButton10MouseClicked

    private void jTextCs0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCs0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCs0ActionPerformed

    private void cleanJPCreatS(){
        listPaux2 = new MyArrayList<>();
            jTextCs0.setText("Nombre de la etapa");
            jTextCs1.setText("XXXX");
            jTextCs8.setText("Descripción");
                
            jTextCs3.removeAllItems();
            jTextCs3.addItem("Mes");
           
            jTextCs3.addItem("Enero");
            jTextCs3.addItem("Febrero");
            jTextCs3.addItem("Marzo");
            jTextCs3.addItem("Abril");
            jTextCs3.addItem("Mayo");
            jTextCs3.addItem("Junio");
            jTextCs3.addItem("Julio");
            jTextCs3.addItem("Agosto");
            jTextCs3.addItem("Septiembre");
            jTextCs3.addItem("Octubre");
            jTextCs3.addItem("Noviembre");
            jTextCs3.addItem("Diciembre");
            
            jTextCs6.removeAllItems();
            jTextCs6.addItem("Mes");
           
            jTextCs6.addItem("Enero");
            jTextCs6.addItem("Febrero");
            jTextCs6.addItem("Marzo");
            jTextCs6.addItem("Abril");
            jTextCs6.addItem("Mayo");
            jTextCs6.addItem("Junio");
            jTextCs6.addItem("Julio");
            jTextCs6.addItem("Agosto");
            jTextCs6.addItem("Septiembre");
            jTextCs6.addItem("Octubre");
            jTextCs6.addItem("Noviembre");
            jTextCs6.addItem("Diciembre");
            
            jTextCs4.removeAllItems();  
            jTextCs7.removeAllItems(); 
            jTextCs4.addItem("Año");
            jTextCs7.addItem("Año");
            for(int i=0; i<10; i++){
            jTextCs4.addItem("202"+Integer.toString(i));
            jTextCs7.addItem("202"+Integer.toString(i));
            }   
            for(int i=0; i<10; i++){
            jTextCs4.addItem("203"+Integer.toString(i));
            jTextCs7.addItem("203"+Integer.toString(i));
            }
            
            jTextCs2.removeAllItems();
            jTextCs5.removeAllItems();
            jTextCs2.addItem("Dia");
            jTextCs5.addItem("Dia");
            for(int i=1; i<32; i++){
            jTextCs2.addItem(Integer.toString(i));
            jTextCs5.addItem(Integer.toString(i));
            }
            
            jTextCs9.setText("Nombre de parametro");
            jTextCs10.setText("Limite superior");
            jTextCs11.setText("Limite inferior");
            ParameterL1.removeAll();
            String [] namep= new  String[0];
            ParameterL1.setListData(namep);
    }
    private void addMaterialButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton11MouseClicked
    try{
           int dialog = JOptionPane.YES_NO_OPTION;
           int result = JOptionPane.showConfirmDialog(null, "¿Desea crear una nueva etapa?","Nuevo etapa",dialog);
           if(result==0){
            cleanJPCreatS();
           }
          
        }catch(Exception e){
              JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
    }//GEN-LAST:event_addMaterialButton11MouseClicked

    private void addStageButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStageButton1MouseClicked
        jpCreateP.setVisible(false);
        jpCreateS.setVisible(true); 
    }//GEN-LAST:event_addStageButton1MouseClicked

    private void addStageButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStageButton2MouseClicked
       int selected =stagesL.getSelectedIndex();
        if(selected!=-1){
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar la etapa?","Eliminar etapa",dialog);
            if(result==0){
            ListSaux.removeIndex(selected);
            jLabel5.setText("Resumen: "+String.valueOf(ListMaux.getSize())+" material/es, "+String.valueOf(ListSaux.getSize()) +" etapa/s.");
            stagesL.removeAll();
                String [] namep= new  String[ListSaux.getSize()];
                for (int i = 0; i < ListSaux.getSize(); i++) {
                namep[i]=ListSaux.getItem(i).getName();
                }
                stagesL.setListData(namep);
         }
        }
         
    }//GEN-LAST:event_addStageButton2MouseClicked
private void cleanJPCreateP(){
    productionIDLabel1.setText("XXXX");
            jTextCp1.setText("Nombre de la producción");
            jTextCp3.removeAllItems();
            jTextCp3.addItem("Mes");
            jTextCp3.addItem("Enero");
            jTextCp3.addItem("Febrero");
            jTextCp3.addItem("Marzo");
            jTextCp3.addItem("Abril");
            jTextCp3.addItem("Mayo");
            jTextCp3.addItem("Junio");
            jTextCp3.addItem("Julio");
            jTextCp3.addItem("Agosto");
            jTextCp3.addItem("Septiembre");
            jTextCp3.addItem("Octubre");
            jTextCp3.addItem("Noviembre");
            jTextCp3.addItem("Diciembre");
             
            jTextCp2.removeAllItems();  
           
            jTextCp2.addItem("Año");
           
            for(int i=0; i<10; i++){
            jTextCp2.addItem("202"+Integer.toString(i));
           
            }   
            for(int i=0; i<10; i++){
            jTextCp2.addItem("203"+Integer.toString(i));
           
            }
            
            jTextCp4.removeAllItems();
            jTextCp4.addItem("Dia");
            for(int i=1; i<32; i++){
            jTextCp4.addItem(Integer.toString(i));
            }
            jTextCp5.setText("Descripción");
            materialL.removeAll();
            stagesL.removeAll();
            String [] namep= new  String[0];
            materialL.setListData(namep);
            stagesL.setListData(namep);            
            ListMaux= new MyArrayList<>();
            ListSaux= new MyArrayList<>();
            jLabel5.setText("Resumen: "+String.valueOf(ListMaux.getSize())+" material/es, "+String.valueOf(ListSaux.getSize()) +" etapa/s.");
           
}
    private void addMaterialButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMaterialButton12MouseClicked
     try{
           int dialog = JOptionPane.YES_NO_OPTION;
           int result = JOptionPane.showConfirmDialog(null, "¿Desea crear una nueva producción?","Nueva producción",dialog);
           if(result==0){
               cleanJPCreateP();
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");
        }
    }//GEN-LAST:event_addMaterialButton12MouseClicked
    private static SinglyLinkedList<Integer> sLIDP= new SinglyLinkedList<Integer>();
    private void searchjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchjLabelMouseClicked
       
        try{
            if(jTextCr.getText()==""){
            }else{
            sLIDP = new SinglyLinkedList<>();
            for(int i=0; i<myArrayListProduction.getSize(); i++){
                if(myArrayListProduction.getItem(i).getName().equalsIgnoreCase(jTextCr.getText())){
                  sLIDP.pushBack(i);
                }                
            }
            if(sLIDP.getSize()==0){
                   JOptionPane.showMessageDialog(this,"No se ha encontrado una producción con el nombre: "+jTextCr.getText());    
                   nRdeP.setText("de "+sLIDP.getSize());
                   nRdeP0.setText("0");
                   resgisterF.setText("");
            }else{
                indexCr=1;
                nRdeP.setText("de "+sLIDP.getSize());
                nRdeP0.setText("1");
                printProduction(1);
                
            }
              }
          }catch(Exception e){
               JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
                    }
    }//GEN-LAST:event_searchjLabelMouseClicked
private static int indexCr=1;
    private void jlNextCrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlNextCrMouseClicked
       Boolean correct=true;
        try{
           if(sLIDP.getSize()>0){
                indexCr++;
                if(sLIDP.getSize()>=indexCr){
                    printProduction(indexCr);
                    nRdeP0.setText(String.valueOf(indexCr));
                }else{
                   indexCr=indexCr-1; 
                }
           }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_jlNextCrMouseClicked
    public void printProduction(int index){
       
        try{
            if(sLIDP.getSize()>0){
                if(sLIDP.getSize()>=index){
                   Production production;
                   production=myArrayListProduction.getItem(sLIDP.getItem(index-1));
                   String e;
                   if(production.isIsActive()){
                        if(production.isFinished()){
                            e="Finalizado";
                        }else{
                            e="En proceso";
                        }
                   }else{
                       e="Sin iniciar";
                   }
                   
                   
                   String Materialaux="";
                   String Parameteraux="";
                   for(int m=0; m<production.getRawMaterials().getSize(); m++){
        Materialaux=Materialaux+"    "+(m+1)+". "+production.getRawMaterials().getItem(m).getName()+"    Lote: "+production.getRawMaterials().getItem(m).getBatch()+"    Fecha de compra: "+production.getRawMaterials().getItem(m).getAdmissionDate()+
                            "    Fecha de vencimiento: "+production.getRawMaterials().getItem(m).getExpirationDate()+"\n"+
                    "       Descripción: "+production.getRawMaterials().getItem(m).getDescription()+"\n"+
                    "       Parametros del material "+"\n";
                        for(int p=0; p<production.getRawMaterials().getItem(m).getParametrosCalidad().getSize(); p++){
       Parameteraux=Parameteraux+"          "+(p+1)+". "+production.getRawMaterials().getItem(m).getParametrosCalidad().getItem(p).getName()+"    Valor: "+production.getRawMaterials().getItem(m).getParametrosCalidad().getItem(p).getValue()+
                                  "    Limite inferior: "+production.getRawMaterials().getItem(m).getParametrosCalidad().getItem(p).getLowerLimit()+
                                  "    Limite superior: "+production.getRawMaterials().getItem(m).getParametrosCalidad().getItem(p).getUpperLimit()+"\n";
                        }
                     Materialaux=Materialaux+Parameteraux;
                     Parameteraux="";
                   }
                   
                   String Stageaux="";
                   Parameteraux="";
                   String sE;
                   for(int s=0; s<production.getRawMaterials().getSize(); s++){
                   if(production.getStages().getItem(s).isIsActive()){
                        if(production.getStages().getItem(s).isFinished()){
                            sE="Finalizado";
                        }else{
                            sE="En proceso";
                        }
                    }else{
                             sE="Sin iniciar";
                    }
        Stageaux=Stageaux+"    "+(s+1)+". "+production.getStages().getItem(s).getName()+"    Fecha de inicio: "+production.getStages().getItem(s).getStartDate()+
                            "    Fecha de finalización: "+production.getStages().getItem(s).getEndDate()+"    Estado: "+sE+"\n"+
                    "       Descripción: "+production.getStages().getItem(s).getDescription()+"\n"+
                    "       Parametros de la etapa "+"\n";
                        for(int p=0; p<production.getStages().getItem(s).getParameterList().getSize(); p++){
       Parameteraux=Parameteraux+"          "+(p+1)+". "+production.getStages().getItem(s).getParameterList().getItem(p).getName()+"    Valor: "+production.getStages().getItem(s).getParameterList().getItem(p).getValue()+
                                  "    Limite inferior: "+production.getStages().getItem(s).getParameterList().getItem(p).getLowerLimit()+
                                  "    Limite superior: "+production.getStages().getItem(s).getParameterList().getItem(p).getUpperLimit()+"\n";
                        }
                     Stageaux=Stageaux+Parameteraux;
                     Parameteraux="";
                   }
                   resgisterF.setText(
                    "		                        "+production.getName()+"\n\n"+
                    "  Fecha de inicio: "+production.getStartDate()+"    Fecha de finalización: "+production.getEndDate()+"    Estado: "+e+"\n"+
                    "  Descripción: "+production.getDescription()+"\n\n"+
                    "    MATERIALES\n"+
                    Materialaux+"\n"+
                    "    ETAPAS\n"+
                    Stageaux
                   );
                   
                }
            }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
        
    }
    
    private void nRdeP0InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nRdeP0InputMethodTextChanged
       Boolean correct=true;
        try{
           try{
                Integer.parseInt(nRdeP0.getText());
           }catch(Exception e){
                JOptionPane.showMessageDialog(this,"No es posible encontrar un registro con el valor: "+nRdeP0.getText() );
                correct=false;
           }
            if(correct && sLIDP.getSize()>0){
                if(sLIDP.getSize()>=Integer.parseInt(nRdeP0.getText())){
                     printProduction(Integer.parseInt(nRdeP0.getText()));
                    }
                }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_nRdeP0InputMethodTextChanged

    private void jlBackCrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBackCrMouseClicked
        Boolean correct=true;
        try{
           if(sLIDP.getSize()>0 && indexCr>1){
                indexCr=indexCr-1;
                if(sLIDP.getSize()>=indexCr){
                    printProduction(indexCr);
                    nRdeP0.setText(String.valueOf(indexCr));
                }else{
                   indexCr=indexCr+1; 
                }
           }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_jlBackCrMouseClicked

    private void generateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateButtonMouseClicked
      Boolean correct=true;
        try{
            if(resgisterF.getText().equalsIgnoreCase(null) || sLIDP.getSize()<=0){
                correct=false;
            }
           if(correct){
             int dialog = JOptionPane.YES_NO_OPTION;
              int result = JOptionPane.showConfirmDialog(null, "¿Desea crear un registro?","Generar registro",dialog);
             if(result==0){
                if(!DataBase.printTXT(sLIDP.getItem(Integer.parseInt(nRdeP0.getText())-1),resgisterF.getText())){
                   JOptionPane.showMessageDialog(this,"Ha ocurrido un error al generar el archivo.");          
                }else{
                    JOptionPane.showMessageDialog(this,"¡Se ha creado el registro con exito!");     
                }
             }
           }
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
      }
    }//GEN-LAST:event_generateButtonMouseClicked

    private static SinglyLinkedList<Integer> sLIDP2= new SinglyLinkedList<Integer>();
    private int indexSpp=1;
   
    private void iconSeeP(int i){
         switch (i) {   
             case 1:
                  ImageP1.setIcon(new ImageIcon("src/icons/play.png"));
                   break;
             case 2:
                  ImageP2.setIcon(new ImageIcon("src/icons/play.png"));
                   break;
             case 3:
                  ImageP3.setIcon(new ImageIcon("src/icons/play.png"));
                   break;
             case 4:
                  ImageP4.setIcon(new ImageIcon("src/icons/play.png"));
                  break;
             case 5:
                  ImageP5.setIcon(new ImageIcon("src/icons/play.png"));
                   break;
             case 6:
                 ImageP1.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 7:
                 ImageP2.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 8:
                 ImageP3.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 9:
                 ImageP4.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 10:
                 ImageP5.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 11:
                  ImageP1.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 12:
                  ImageP2.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 13:
                  ImageP3.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 14:
                  ImageP4.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 15:
                  ImageP5.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;  
             case 16:
                  ImageP1.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 17:
                   ImageP2.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 18:
                   ImageP3.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 19:
                   ImageP4.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 20:
                   ImageP5.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             default:
                 
                 break;
         }
    }
    private void searchPjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPjLabelMouseClicked
        
        try{
            sLIDP2 = new SinglyLinkedList<>();
            if(jTextSp1.getText().equalsIgnoreCase("") && myArrayListProduction.getSize()>0){
                ProductionLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<myArrayListProduction.getSize(); i++){
                        sLIDP2.pushBack(i);
                }
                for(int i=0; i<5; i++){
                    if(i<myArrayListProduction.getSize()){
                        namep[i]=myArrayListProduction.getItem(i).getName();
                   if(!myArrayListProduction.getItem(i).isIsActive()){
                        iconSeeP(i+1);
                   }else if(myArrayListProduction.getItem(i).isIsFinished()){
                        iconSeeP((i+1)+5);
                   }else if(myArrayListProduction.getItem(i).isIsActive()){
                        iconSeeP((i+1)+10);
                   }
                    }else{
                        iconSeeP((i+1)+15);
                    }
                   
                }
                
                ProductionLSp.setListData(namep);
                 indexSpp=1;
                 String auxS;
                 int sizep=myArrayListProduction.getSize()%5;
                 int aux=myArrayListProduction.getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                 nSdeP.setText("de "+aux);
                 nSdeP0.setText("1");
                 namePjL.setText("");
                 jTextSp1.setText("Nombre de la producción");
            }else if(myArrayListProduction.getSize()>0){
                for(int i=0; i<myArrayListProduction.getSize(); i++){
                 if(myArrayListProduction.getItem(i).getName().equalsIgnoreCase(jTextSp1.getText())){
                        sLIDP2.pushBack(i);
                    }                
                }
                if(sLIDP2.getSize()==0){
                   JOptionPane.showMessageDialog(this,"No se ha encontrado una producción con el nombre: "+jTextSp1.getText()); 
                   for(int i=0; i<5; i++){
                    iconSeeP((i+1)+15);
                     }
                    ProductionLSp.removeAll();
                   String [] namep= new  String[0];
                     ProductionLSp.setListData(namep);
                    nSdeP0.setText("0");
                    nSdeP.setText("de 0");
                    namePjL.setText("");
                    jTextSp1.setText("Nombre de la producción");
             }else{
                indexSpp=1;
                int sizep=sLIDP2.getSize()%5;
                int aux=sLIDP2.getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                nSdeP.setText("de "+aux);
                nSdeP0.setText("1");
                ProductionLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<5 ; i++){
                    if(i<sLIDP2.getSize()){
                        namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(i)).getName();
                          if(!myArrayListProduction.getItem(sLIDP2.getItem(i)).isIsActive()){
                        iconSeeP(i+1);
                        }else if(myArrayListProduction.getItem(sLIDP2.getItem(i)).isIsFinished()){
                        iconSeeP((i+1)+5);
                        }else if(myArrayListProduction.getItem(sLIDP2.getItem(i)).isIsActive()){
                        iconSeeP((i+1)+10);
                          }
                    }else{
                        iconSeeP((i+1)+15);
                    }
                            
                   
                }
                namePjL.setText(jTextSp1.getText());
                ProductionLSp.setListData(namep);
                namePjL0.setText("Nombre de la producción: ");
                jTextSp1.setText("Nombre de la producción");
             }
            }else{
                JOptionPane.showMessageDialog(this,"¡No se encontraron datos sobre producciones!");
                for(int i=0; i<5; i++){
                    iconSeeP((i+1)+15);
                }
                 ProductionLSp.removeAll();
                String [] namep= new  String[0];
                ProductionLSp.setListData(namep);
                 nSdeP0.setText("0");
                 nSdeP.setText("de 0");
                 namePjL.setText("");
                 jTextSp1.setText("Nombre de la producción");
            }
          }catch(Exception e){
               JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
                    }
    }//GEN-LAST:event_searchPjLabelMouseClicked
    private void iconSeeS(int i){
         switch (i) {   
             case 1:
                  ImageS1.setIcon(new ImageIcon("src/icons/play.png"));
                   break;
             case 2:
                  ImageS2.setIcon(new ImageIcon("src/icons/play.png"));
                   break;
             case 3:
                  ImageS3.setIcon(new ImageIcon("src/icons/play.png"));
                   break;
             case 4:
                  ImageS4.setIcon(new ImageIcon("src/icons/play.png"));
                  break;
             case 5:
                  ImageS5.setIcon(new ImageIcon("src/icons/play.png"));
                   break;
             case 6:
                 ImageS1.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 7:
                 ImageS2.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 8:
                 ImageS3.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 9:
                 ImageS4.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 10:
                 ImageS5.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 11:
                  ImageS1.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 12:
                  ImageS2.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 13:
                  ImageS3.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 14:
                  ImageS4.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 15:
                  ImageS5.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;  
             case 16:
                  ImageS1.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 17:
                   ImageS2.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 18:
                   ImageS3.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 19:
                   ImageS4.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 20:
                   ImageS5.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             default:
                 
                 break;
         }
    }
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Boolean correct=true;
        try{
           if(sLIDP2.getSize()>0){
                indexSpp++;
                 
                if(sLIDP2.getSize()>=indexSpp && indexSpp<=Integer.parseInt(nSdeP.getText().substring(3))){
                    ProductionLSp.removeAll();
                    String [] namep= new  String[5];
                    for(int i=0; i<5; i++){
                        if(sLIDP2.getSize()>(i+(5*(indexSpp-1)))){
                            namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(i+(5*(indexSpp-1)))).getName();
                             if(!myArrayListProduction.getItem(sLIDP2.getItem(i+(5*(indexSpp-1)))).isIsActive()){
                            iconSeeP(i+1);
                          }else if(myArrayListProduction.getItem(sLIDP2.getItem(i+(5*(indexSpp-1)))).isIsFinished()){
                             iconSeeP((i+1)+5);
                            }else if(myArrayListProduction.getItem(sLIDP2.getItem(i+(5*(indexSpp-1)))).isIsActive()){
                                iconSeeP((i+1)+10);
                            }
                        }else{
                            iconSeeP((i+1)+15);
                        }
                       
                    }
                    
                    ProductionLSp.setListData(namep);
                    nSdeP0.setText(String.valueOf(indexSpp));
                }else{
                   indexSpp=indexSpp-1; 
                }
           }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Boolean correct=true;
        try{
           if(sLIDP2.getSize()>0){
                indexSpp=indexSpp-1;
                if(sLIDP2.getSize()>=indexSpp  && indexSpp>0){
                    ProductionLSp.removeAll();
                    String [] namep= new  String[5];
                    for(int i=0; i<5; i++){
                        if(sLIDP2.getSize()>(i+(5*(indexSpp-1)))){
                             namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(i+((indexSpp-1)*5))).getName();
                         if(!myArrayListProduction.getItem(sLIDP2.getItem(i+((indexSpp-1)*5))).isIsActive()){
                        iconSeeP(i+1);
                          }else if(myArrayListProduction.getItem(sLIDP2.getItem(i+((indexSpp-1)*5))).isIsFinished()){
                        iconSeeP((i+1)+5);
                         }else if(myArrayListProduction.getItem(sLIDP2.getItem(i+((indexSpp-1)*5))).isIsActive()){
                        iconSeeP((i+1)+10);
                        }
                        }else{
                             iconSeeP((i+1)+15);
                        }
                      
                    }
                    ProductionLSp.setListData(namep);
                    nSdeP0.setText(String.valueOf(indexSpp));
                }else{
                   indexSpp++; 
                }
           }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_jLabel8MouseClicked
    
    private static int selectproduction=-1;
    private static SinglyLinkedList<Integer> sLIDS= new SinglyLinkedList<Integer>();
    private static int indexSps=1;
    private void ProductionLSpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductionLSpMouseClicked
       selectproduction =ProductionLSp.getSelectedIndex();
        if(selectproduction!=-1 && sLIDP2.getSize()>0 && sLIDP2.getSize()>selectproduction+(5*(indexSpp-1))){
            try{
                 sLIDS = new SinglyLinkedList<>();
                 if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()>0){
                StageLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize(); i++){
                        sLIDS.pushBack(i);
                }
                
                for(int i=0; i<5; i++){
                    if(i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()){
                        namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(i).getName();
                   if(!myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(i).isIsActive()){
                        iconSeeS(i+1);
                   }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(i).isIsFinished()){
                        iconSeeS((i+1)+5);
                   }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(i).isIsActive()){
                        iconSeeS((i+1)+10);
                   }
                    }else{
                        iconSeeS((i+1)+15);
                    }
                   
                }
                StageLSp.setListData(namep);
                indexSps=1;
                String auxS;
                int sizep=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()%5;
                int aux=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                 nSdeP3.setText("de "+aux);
                 nSdeP2.setText("1");
                 }
                 
                 ///
                 sLIDM= new SinglyLinkedList<Integer>();
                 if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()>0){
                MaterialLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize(); i++){
                        sLIDM.pushBack(i);
                }
                for(int i=0; i<5; i++){
                    if(i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()){
                        namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i)).getName();
                        try{
                           String year=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i)).getExpirationDate();
                        String month="";
                        String day="";
                        int count=0;
                        for(int y=0; y<year.length(); y++){
                            if(year.charAt(y)=='/'){
                                
                                count++;
                                if(count==1){
                                    day=year.substring(0,y+1);
                                    month=year.substring(y+1);
                                }
                                if(count==2){
                                    year=year.substring(y+1);
                                break;
                                }
                            }
                        }
                  if(Integer.parseInt(year)<Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                        iconSeeM(i+1);
                   }else if(Integer.parseInt(year)==Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                       if(Integer.parseInt(month) < Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                              iconSeeM(i+1);
                        }else if(Integer.parseInt(month) == Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                            if(Integer.parseInt(day) < Integer.parseInt(timeFormatD.format(LocalDateTime.now())) ){
                            iconSeeM(i+1);
                            }else{
                                iconSeeM((i+1)+5); 
                            }
                        }else{
                             iconSeeM((i+1)+5);
                        }
                  }else{
                        iconSeeM((i+1)+5);
                   }  
                        }catch(Exception e){
                            iconSeeM((i+1)+10);
                        }
                       
                      
                    }else{
                         iconSeeM((i+1)+15);
                    }
                   
                }
                
                MaterialLSp.setListData(namep);
                 indexSpm=1;
                 
                 int sizep=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()%5;
                 int aux=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                 nSdeP5.setText("de "+aux);
                 nSdeP4.setText("1");
                 }
                 
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");  
            }
            
         
        }else{
            if(myArrayListProduction.getSize()<=0){
                 JOptionPane.showMessageDialog(this,"Para ver etapas debe crear producciónes."); 
            }else{
                 JOptionPane.showMessageDialog(this,"Por favor seleccione una producción. Para ello debe dar click en la imagen de la lupa del buscador de producciones para ver todas las producciónes"+"\n"+
                         "o en el caso que desee buscar una producción en especifico, puede escribir el nombre de la producción y dar click en la lupa respectivamente.");   
            }
        }
    }//GEN-LAST:event_ProductionLSpMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
       Boolean correct=true;
        try{
           if(sLIDS.getSize()>0){
                indexSps=indexSps-1;
                if(sLIDS.getSize()>=indexSps  && indexSps>0){
                    StageLSp.removeAll();
                    String [] namep= new  String[5];
                    for(int i=0; i<5; i++){
                        if(sLIDS.getSize()>(i+(5*(indexSps-1)))){
                             namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i+((indexSps-1)*5))).getName();
                         if(!myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i+((indexSps-1)*5))).isIsActive()){
                        iconSeeS(i+1);
                          }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i+((indexSps-1)*5))).isIsFinished()){
                        iconSeeS((i+1)+5);
                         }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i+((indexSps-1)*5))).isIsActive()){
                        iconSeeS((i+1)+10);
                        }
                        }else{
                             iconSeeS((i+1)+15);
                        }
                      
                    }
                    StageLSp.setListData(namep);
                    nSdeP2.setText(String.valueOf(indexSps));
                }else{
                   indexSps++; 
                }
           }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
         Boolean correct=true;
        try{
           if(sLIDS.getSize()>0){
                indexSps++;
                 
                if(sLIDS.getSize()>=indexSps && indexSps<=Integer.parseInt(nSdeP3.getText().substring(3))){
                    StageLSp.removeAll();
                    String [] namep= new  String[5];
                    for(int i=0; i<5; i++){
                        if(sLIDS.getSize()>(i+(5*(indexSps-1)))){
                            namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i+((indexSps-1)*5))).getName();
                             if(!myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i+((indexSps-1)*5))).isIsActive()){
                            iconSeeS(i+1);
                          }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i+((indexSps-1)*5))).isIsFinished()){
                             iconSeeS((i+1)+5);
                            }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i+((indexSps-1)*5))).isIsActive()){
                         iconSeeS((i+1)+10);
                            }
                        }else{
                            iconSeeS((i+1)+15);
                        }
                       
                    }
                    
                    StageLSp.setListData(namep);
                    nSdeP2.setText(String.valueOf(indexSps));
                }else{
                   indexSps=indexSps-1; 
                }
           }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void searchSjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchSjLabelMouseClicked
  
        selectproduction =ProductionLSp.getSelectedIndex();
        if(selectproduction!=-1 && sLIDP2.getSize()>0 && sLIDP2.getSize()>selectproduction+(5*(indexSpp-1))){
        
        try{
            if(selectproduction!=-1){
           
            sLIDS = new SinglyLinkedList<>();
            if(jTextSp2.getText().equalsIgnoreCase("") && myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()>0){
                StageLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize(); i++){
                        sLIDS.pushBack(i);
                }
                for(int i=0; i<5; i++){
                    if(i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()){
                        namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i)).getName();
                   if(!myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i)).isIsActive()){
                        iconSeeS(i+1);
                   }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i)).isIsFinished()){
                        iconSeeS((i+1)+5);
                   }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i)).isIsActive()){
                        iconSeeS((i+1)+10);
                   }
                    }else{
                        iconSeeS((i+1)+15);
                    }
                   
                }
                
                StageLSp.setListData(namep);
                 indexSps=1;
                 String auxS;
                 int sizep=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()%5;
                 int aux=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                 nSdeP3.setText("de "+aux);
                 nSdeP2.setText("1");
                 jTextSp2.setText("Nombre de la etapa");
                
            }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize()>0){
                for(int i=0; i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getSize(); i++){
                if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(i).getName().equalsIgnoreCase(jTextSp2.getText())){
                        sLIDS.pushBack(i);
                    }                
                }
                if(sLIDS.getSize()==0){
                   JOptionPane.showMessageDialog(this,"No se ha encontrado etapas con el nombre: "+jTextSp2.getText()+" en la producción: "+myArrayListProduction.getItem(selectproduction+(5*(indexSpp-1))).getName()); 
                   for(int i=0; i<5; i++){
                    iconSeeS((i+1)+15);
                     }
                    StageLSp.removeAll();
                   String [] namep= new  String[0];
                     StageLSp.setListData(namep);
                    nSdeP2.setText("0");
                    nSdeP3.setText("de 0");
                    jTextSp2.setText("Nombre de la etapa");
             }else{
                indexSps=1;
                int sizep=sLIDS.getSize()%5;
                int aux=sLIDS.getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                nSdeP3.setText("de "+aux);
                nSdeP2.setText("1");
                StageLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<5 ; i++){
                    if(i<sLIDS.getSize()){
                         namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i)).getName();
                         if(!myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i)).isIsActive()){
                        iconSeeS(i+1);
                         }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i)).isIsFinished()){
                        iconSeeS((i+1)+5);
                         }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getStages().getItem(sLIDS.getItem(i)).isIsActive()){
                        iconSeeS((i+1)+10);
                          }
                     }else{
                         iconSeeS((i+1)+15);
                    }

                   
                }
                
                StageLSp.setListData(namep);
                jTextSp2.setText("Nombre de la etapa");
             }
            }else{
                JOptionPane.showMessageDialog(this,"¡No se encontraron datos sobre las etapas!");
                for(int i=0; i<5; i++){
                    iconSeeS((i+1)+15);
                }
                 StageLSp.removeAll();
                String [] namep= new  String[0];
                StageLSp.setListData(namep);
                 nSdeP2.setText("0");
                 nSdeP3.setText("de 0");
                 jTextSp2.setText("Nombre de la etapa");
            }
            }else{
                 JOptionPane.showMessageDialog(this,"Por favor, seleccione una producción para mostrar/buscar sus etapas.");
            }
          }catch(Exception e){
               JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
                    }
        
        }else{
            if(myArrayListProduction.getSize()<=0){
                 JOptionPane.showMessageDialog(this,"Para ver etapas debe crear producciónes."); 
            }else{
                 JOptionPane.showMessageDialog(this,"Por favor seleccione una producción. Para ello debe dar click en la imagen de la lupa del buscador de producciones para ver todas las producciónes"+"\n"+
                         "o en el caso que desee buscar una producción en especifico, puede escribir el nombre de la producción y dar click en la lupa respectivamente.");   
            }
        }
    }//GEN-LAST:event_searchSjLabelMouseClicked

    private void iconSeeM(int i){
         switch (i) {   
             case 1:
                  ImageM1.setIcon(new ImageIcon("src/icons/incorrecto.png"));
                   break;
             case 2:
                  ImageM2.setIcon(new ImageIcon("src/icons/incorrecto.png"));
                   break;
             case 3:
                  ImageM3.setIcon(new ImageIcon("src/icons/incorrecto.png"));
                   break;
             case 4:
                  ImageM4.setIcon(new ImageIcon("src/icons/incorrecto.png"));
                  break;
             case 5:
                  ImageM5.setIcon(new ImageIcon("src/icons/incorrecto.png"));
                   break;
             case 6:
                 ImageM1.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 7:
                 ImageM2.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 8:
                 ImageM3.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 9:
                 ImageM4.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 10:
                 ImageM5.setIcon(new ImageIcon("src/icons/correcto2.png"));
                   break;
             case 11:
                  ImageM1.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 12:
                  ImageM2.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 13:
                  ImageM3.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 14:
                  ImageM4.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;
             case 15:
                  ImageM5.setIcon(new ImageIcon("src/icons/linea.png"));
                  break;  
             case 16:
                  ImageM1.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 17:
                   ImageM2.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 18:
                   ImageM3.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 19:
                   ImageM4.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             case 20:
                   ImageM5.setIcon(new ImageIcon("src/icons/nothing.png"));
                  break; 
             default:
                 
                 break;
         }
    }

    private static SinglyLinkedList<Integer> sLIDM= new SinglyLinkedList<Integer>();
    private static int indexSpm=1;
    private DateTimeFormatter timeFormatD = DateTimeFormatter.ofPattern("dd");
    private DateTimeFormatter timeFormatM = DateTimeFormatter.ofPattern("MM");
    private DateTimeFormatter timeFormatY = DateTimeFormatter.ofPattern("yyyy");
    private void searchMjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMjLabelMouseClicked
       
        selectproduction =ProductionLSp.getSelectedIndex();
        if(selectproduction!=-1 && sLIDP2.getSize()>0 && sLIDP2.getSize()>selectproduction+(5*(indexSpp-1))){
        
        try{
            if(selectproduction!=-1){
           
            sLIDM = new SinglyLinkedList<>();
            if(jTextSp3.getText().equalsIgnoreCase("") && myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()>0){
                MaterialLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize(); i++){
                        sLIDM.pushBack(i);
                }
                for(int i=0; i<5; i++){
                    if(i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()){
                        namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i)).getName();
                        try{
                            String year=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i)).getExpirationDate();
                        String month="";
                        String day="";
                        int count=0;
                        for(int y=0; y<year.length(); y++){
                            if(year.charAt(y)=='/'){
                                
                                count++;
                                if(count==1){
                                    day=year.substring(0,y+1);
                                    month=year.substring(y+1);
                                }
                                if(count==2){
                                    year=year.substring(y+1);
                                break;
                                }
                            }
                        }
                  if(Integer.parseInt(year)<Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                        iconSeeM(i+1);
                   }else if(Integer.parseInt(year)==Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                       if(Integer.parseInt(month) < Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                              iconSeeM(i+1);
                        }else if(Integer.parseInt(month) == Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                            if(Integer.parseInt(day) < Integer.parseInt(timeFormatD.format(LocalDateTime.now())) ){
                            iconSeeM(i+1);
                            }else{
                                iconSeeM((i+1)+5); 
                            }
                        }else{
                             iconSeeM((i+1)+5);
                        }
                  }else{
                        iconSeeM((i+1)+5);
                   }
                        }catch(Exception e){
                            iconSeeM((i+1)+10);
                        }
                        
                      
                    }else{
                         iconSeeM((i+1)+15);
                    }
                   
                }
                
                MaterialLSp.setListData(namep);
                 indexSpm=1;
                 
                 int sizep=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()%5;
                 int aux=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                 nSdeP5.setText("de "+aux);
                 nSdeP4.setText("1");
                jTextSp3.setText("Nombre del material");
            }else if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize()>0){
                for(int i=0; i<myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getSize(); i++){
                if(myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(i).getName().equalsIgnoreCase(jTextSp3.getText())){
                        sLIDM.pushBack(i);
                    }                
                }
                if(sLIDM.getSize()==0){
                   JOptionPane.showMessageDialog(this,"No se ha encontrado materiales con el nombre: "+jTextSp3.getText()+" en la produción: "+myArrayListProduction.getItem(selectproduction+(5*(indexSpp-1))).getName()); 
                   for(int i=0; i<5; i++){
                    iconSeeM((i+1)+15);
                     }
                    MaterialLSp.removeAll();
                   String [] namep= new  String[0];
                     MaterialLSp.setListData(namep);
                    nSdeP4.setText("0");
                    nSdeP5.setText("de 0");
                    jTextSp3.setText("Nombre del material");
             }else{
                indexSpm=1;
                int sizep=sLIDM.getSize()%5;
                int aux=sLIDM.getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                nSdeP5.setText("de "+aux);
                nSdeP4.setText("1");
                jTextSp3.setText("Nombre del material");
                MaterialLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<5 ; i++){
                    if(i<sLIDM.getSize()){
                         namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i)).getName();
                         try{
                             String year=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i)).getExpirationDate();
                        String month="";
                        String day="";
                        int count=0;
                        for(int y=0; y<year.length(); y++){
                            if(year.charAt(y)=='/'){
                                
                                count++;
                                if(count==1){
                                    day=year.substring(0,y+1);
                                    month=year.substring(y+1);
                                }
                                if(count==2){
                                    year=year.substring(y+1);
                                break;
                                }
                            }
                        }
                  if(Integer.parseInt(year)<Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                        iconSeeM(i+1);
                   }else if(Integer.parseInt(year)==Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                       if(Integer.parseInt(month) < Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                              iconSeeM(i+1);
                        }else if(Integer.parseInt(month) == Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                            if(Integer.parseInt(day) < Integer.parseInt(timeFormatD.format(LocalDateTime.now())) ){
                            iconSeeM(i+1);
                            }else{
                                iconSeeM((i+1)+5); 
                            }
                        }else{
                             iconSeeM((i+1)+5);
                        }
                  }else{
                        iconSeeM((i+1)+5);
                   }
                         }catch(Exception e){
                             iconSeeM((i+1)+10);
                         }
                        
                      
                    }else{
                         iconSeeM((i+1)+15);
                    }
                   
                }
                   
                
                MaterialLSp.setListData(namep);
                
             }
            }else{
                JOptionPane.showMessageDialog(this,"¡No se encontraron datos sobre los materiales!");
                for(int i=0; i<5; i++){
                    iconSeeM((i+1)+15);
                }
                 MaterialLSp.removeAll();
                String [] namep= new  String[0];
                MaterialLSp.setListData(namep);
                 nSdeP4.setText("0");
                 nSdeP5.setText("de 0");
                 jTextSp3.setText("Nombre del material");
            }
            }else{
                 JOptionPane.showMessageDialog(this,"Por favor, seleccione una producción para mostrar/buscar sus materiales.");
            }
          }catch(Exception e){
               JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
                    }
        
        }else{
            if(myArrayListProduction.getSize()<=0){
                 JOptionPane.showMessageDialog(this,"Para ver materiales debe crear producciónes."); 
            }else{
                 JOptionPane.showMessageDialog(this,"Por favor seleccione una producción. Para ello debe dar click en la imagen de la lupa del buscador de producciones para ver todas las producciónes"+"\n"+
                         "o en el caso que desee buscar una producción en especifico, puede escribir el nombre de la producción y dar click en la lupa respectivamente.");   
            }
        }
    }//GEN-LAST:event_searchMjLabelMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
         Boolean correct=true;
        try{
           if(sLIDM.getSize()>0){
                indexSpm++;
                 
                if(sLIDM.getSize()>=indexSpm && indexSpm<=Integer.parseInt(nSdeP5.getText().substring(3))){
                    MaterialLSp.removeAll();
                    String [] namep= new  String[5];
                    for(int i=0; i<5; i++){
                        if(sLIDM.getSize()>(i+(5*(indexSpm-1)))){
                            namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i+((indexSpm-1)*5))).getName();
                             try{
                            String year=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i+((indexSpm-1)*5))).getExpirationDate();
                        String month="";
                        String day="";
                        int count=0;
                        for(int y=0; y<year.length(); y++){
                            if(year.charAt(y)=='/'){
                                
                                count++;
                                if(count==1){
                                    day=year.substring(0,y+1);
                                    month=year.substring(y+1);
                                }
                                if(count==2){
                                    year=year.substring(y+1);
                                break;
                                }
                            }
                        }
                  if(Integer.parseInt(year)<Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                        iconSeeM(i+1);
                   }else if(Integer.parseInt(year)==Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                       if(Integer.parseInt(month) < Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                              iconSeeM(i+1);
                        }else if(Integer.parseInt(month) == Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                            if(Integer.parseInt(day) < Integer.parseInt(timeFormatD.format(LocalDateTime.now())) ){
                            iconSeeM(i+1);
                            }else{
                                iconSeeM((i+1)+5); 
                            }
                        }else{
                             iconSeeM((i+1)+5);
                        }
                        }else{
                        iconSeeM((i+1)+5);
                         }
                        }catch(Exception e){
                            iconSeeM((i+1)+10);
                        }
                        }else{
                            iconSeeM((i+1)+15);
                        }
                       
                    }
                    
                    MaterialLSp.setListData(namep);
                    nSdeP4.setText(String.valueOf(indexSpm));
                }else{
                   indexSpm=indexSpm-1; 
                }
           }
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
         Boolean correct=true;
        try{
           if(sLIDM.getSize()>0){
                indexSpm=indexSpm-1;
                if(sLIDM.getSize()>=indexSpm  && indexSpm>0){
                    MaterialLSp.removeAll();
                    String [] namep= new  String[5];
                    for(int i=0; i<5; i++){
                        if(sLIDM.getSize()>(i+(5*(indexSpm-1)))){
                             namep[i]=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i+((indexSpm-1)*5))).getName();
                              try{
                            String year=myArrayListProduction.getItem(sLIDP2.getItem(selectproduction+(5*(indexSpp-1)))).getRawMaterials().getItem(sLIDM.getItem(i+((indexSpm-1)*5))).getExpirationDate();
                        String month="";
                        String day="";
                        int count=0;
                        for(int y=0; y<year.length(); y++){
                            if(year.charAt(y)=='/'){
                                
                                count++;
                                if(count==1){
                                    day=year.substring(0,y+1);
                                    month=year.substring(y+1);
                                }
                                if(count==2){
                                    year=year.substring(y+1);
                                break;
                                }
                            }
                        }
                  if(Integer.parseInt(year)<Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                        iconSeeM(i+1);
                   }else if(Integer.parseInt(year)==Integer.parseInt(timeFormatY.format(LocalDateTime.now()))){
                       if(Integer.parseInt(month) < Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                              iconSeeM(i+1);
                        }else if(Integer.parseInt(month) == Integer.parseInt(timeFormatM.format(LocalDateTime.now())) ){
                            if(Integer.parseInt(day) < Integer.parseInt(timeFormatD.format(LocalDateTime.now())) ){
                            iconSeeM(i+1);
                            }else{
                                iconSeeM((i+1)+5); 
                            }
                        }else{
                             iconSeeM((i+1)+5);
                        }
                        }else{
                        iconSeeM((i+1)+5);
                         }
                        }catch(Exception e){
                            iconSeeM((i+1)+10);
                        }
                             
                             
                        }else{
                             iconSeeM((i+1)+15);
                        }
                      
                    }
                    MaterialLSp.setListData(namep);
                    nSdeP4.setText(String.valueOf(indexSpm));
                }else{
                   indexSpm++; 
                }
           }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(this,"Ha ocurrido un error, por favor contacte con el administrador.");         
       }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void doneButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneButton1MouseClicked
        jpCreateP.setVisible(false);         
        jpSearchP.setVisible(true);
         sLIDP2 = new SinglyLinkedList<>();
            if(myArrayListProduction.getSize()>0){
                ProductionLSp.removeAll();
                String [] namep= new  String[5];
                for(int i=0; i<myArrayListProduction.getSize(); i++){
                        sLIDP2.pushBack(i);
                }
                for(int i=0; i<5; i++){
                    if(i<myArrayListProduction.getSize()){
                        namep[i]=myArrayListProduction.getItem(i).getName();
                   if(!myArrayListProduction.getItem(i).isIsActive()){
                        iconSeeP(i+1);
                   }else if(myArrayListProduction.getItem(i).isIsFinished()){
                        iconSeeP((i+1)+5);
                   }else if(myArrayListProduction.getItem(i).isIsActive()){
                        iconSeeP((i+1)+10);
                   }
                    }else{
                        iconSeeP((i+1)+15);
                    }
                   
                }
                
                   ProductionLSp.setListData(namep);
                 indexSpp=1;
                 String auxS;
                 int sizep=myArrayListProduction.getSize()%5;
                 int aux=myArrayListProduction.getSize()/5;
                if(sizep!=0){
                    aux++;
                }
                 nSdeP.setText("de "+aux);
                 nSdeP0.setText("1");
                 namePjL.setText("");
                 namePjL0.setText("Todos las producciónes");
            }
    }//GEN-LAST:event_doneButton1MouseClicked

    private void goBackButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButton5MouseClicked
         jpSearchP.setVisible(false);
         jpCreateP.setVisible(true);
    }//GEN-LAST:event_goBackButton5MouseClicked

    private void jTextCs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCs5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCs5ActionPerformed

    public static void main(String args[]) {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageM1;
    private javax.swing.JLabel ImageM2;
    private javax.swing.JLabel ImageM3;
    private javax.swing.JLabel ImageM4;
    private javax.swing.JLabel ImageM5;
    private javax.swing.JLabel ImageP1;
    private javax.swing.JLabel ImageP2;
    private javax.swing.JLabel ImageP3;
    private javax.swing.JLabel ImageP4;
    private javax.swing.JLabel ImageP5;
    private javax.swing.JLabel ImageS1;
    private javax.swing.JLabel ImageS2;
    private javax.swing.JLabel ImageS3;
    private javax.swing.JLabel ImageS4;
    private javax.swing.JLabel ImageS5;
    private javax.swing.JPanel Main;
    private javax.swing.JList<String> MaterialLSp;
    private javax.swing.JPanel Menu;
    private javax.swing.JList<String> ParameterL;
    private javax.swing.JList<String> ParameterL1;
    private javax.swing.JList<String> ProductionLSp;
    private javax.swing.JList<String> StageLSp;
    private javax.swing.JButton addMaterialButton1;
    private javax.swing.JButton addMaterialButton10;
    private javax.swing.JButton addMaterialButton11;
    private javax.swing.JButton addMaterialButton12;
    private javax.swing.JButton addMaterialButton4;
    private javax.swing.JButton addMaterialButton5;
    private javax.swing.JButton addMaterialButton6;
    private javax.swing.JButton addMaterialButton7;
    private javax.swing.JButton addMaterialButton8;
    private javax.swing.JButton addMaterialButton9;
    private javax.swing.JButton addStageButton1;
    private javax.swing.JButton addStageButton2;
    private javax.swing.JButton addStageButton3;
    private javax.swing.JPanel addingPanel1;
    private javax.swing.JLabel controlPanelTitle;
    private javax.swing.JLabel controlPanelTitle1;
    private javax.swing.JLabel controlPanelTitle2;
    private javax.swing.JLabel controlPanelTitle3;
    private javax.swing.JLabel controlPanelTitle5;
    private javax.swing.JLabel controlPanelTitle6;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel createLabel1;
    private javax.swing.JLabel createLabel2;
    private javax.swing.JPanel createPanel;
    private javax.swing.JButton doneButton;
    private javax.swing.JButton doneButton1;
    private javax.swing.JPanel editProductionPanel;
    private javax.swing.JButton generateButton;
    private javax.swing.JButton goBackButton0;
    private javax.swing.JButton goBackButton3;
    private javax.swing.JButton goBackButton4;
    private javax.swing.JButton goBackButton5;
    private javax.swing.JButton goBackButton6;
    private javax.swing.JButton goBackButton7;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel imageLabel1;
    private javax.swing.JLabel infoText3;
    private javax.swing.JLabel infoText4;
    private javax.swing.JLabel infoTitle1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
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
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextCm0;
    private javax.swing.JTextField jTextCm1;
    private javax.swing.JTextField jTextCm10;
    private javax.swing.JTextField jTextCm11;
    private javax.swing.JComboBox<String> jTextCm2;
    private javax.swing.JComboBox<String> jTextCm3;
    private javax.swing.JComboBox<String> jTextCm4;
    private javax.swing.JComboBox<String> jTextCm5;
    private javax.swing.JComboBox<String> jTextCm6;
    private javax.swing.JComboBox<String> jTextCm7;
    private javax.swing.JTextArea jTextCm8;
    private javax.swing.JTextField jTextCm9;
    private javax.swing.JTextField jTextCp1;
    private javax.swing.JComboBox<String> jTextCp2;
    private javax.swing.JComboBox<String> jTextCp3;
    private javax.swing.JComboBox<String> jTextCp4;
    private javax.swing.JTextArea jTextCp5;
    private javax.swing.JTextField jTextCr;
    private javax.swing.JTextField jTextCs0;
    private javax.swing.JLabel jTextCs1;
    private javax.swing.JTextField jTextCs10;
    private javax.swing.JTextField jTextCs11;
    private javax.swing.JComboBox<String> jTextCs2;
    private javax.swing.JComboBox<String> jTextCs3;
    private javax.swing.JComboBox<String> jTextCs4;
    private javax.swing.JComboBox<String> jTextCs5;
    private javax.swing.JComboBox<String> jTextCs6;
    private javax.swing.JComboBox<String> jTextCs7;
    private javax.swing.JTextArea jTextCs8;
    private javax.swing.JTextField jTextCs9;
    private javax.swing.JTextField jTextL1;
    private javax.swing.JPasswordField jTextL2;
    private javax.swing.JTextField jTextR1;
    private javax.swing.JTextField jTextR2;
    private javax.swing.JPasswordField jTextR3;
    private javax.swing.JTextField jTextR4;
    private javax.swing.JPasswordField jTextR5;
    private javax.swing.JTextField jTextSp1;
    private javax.swing.JTextField jTextSp2;
    private javax.swing.JTextField jTextSp3;
    private javax.swing.JLabel jlBackCr;
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlClose1;
    private javax.swing.JLabel jlMinimize;
    private javax.swing.JLabel jlMinimize1;
    private javax.swing.JLabel jlNextCr;
    private javax.swing.JPanel jpCM;
    private javax.swing.JPanel jpCM2;
    private javax.swing.JPanel jpControl;
    private javax.swing.JPanel jpCreateM;
    private javax.swing.JPanel jpCreateP;
    private javax.swing.JPanel jpCreateS;
    private javax.swing.JPanel jpInfo;
    private javax.swing.JPanel jpNewUser;
    private javax.swing.JPanel jpRegister;
    private javax.swing.JPanel jpSearchP;
    private javax.swing.JPanel jpSignIn;
    private javax.swing.JPanel jpUser;
    private javax.swing.JButton manageButton;
    private javax.swing.JLabel manageLabel1;
    private javax.swing.JLabel manageLabel2;
    private javax.swing.JPanel managePanel;
    private javax.swing.JList<String> materialL;
    private javax.swing.JLabel nRdeP;
    private javax.swing.JTextField nRdeP0;
    private javax.swing.JLabel nSdeP;
    private javax.swing.JTextField nSdeP0;
    private javax.swing.JTextField nSdeP2;
    private javax.swing.JLabel nSdeP3;
    private javax.swing.JTextField nSdeP4;
    private javax.swing.JLabel nSdeP5;
    private javax.swing.JLabel namePjL;
    private javax.swing.JLabel namePjL0;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel productionIDLabel;
    private javax.swing.JLabel productionIDLabel1;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JButton registryButton;
    private javax.swing.JLabel registryLabel1;
    private javax.swing.JLabel registryLabel2;
    private javax.swing.JPanel registryPanel;
    private javax.swing.JTextArea resgisterF;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JLabel searchMjLabel;
    private javax.swing.JLabel searchPjLabel;
    private javax.swing.JLabel searchSjLabel;
    private javax.swing.JLabel searchjLabel;
    private javax.swing.JButton seeRegisterButton;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel signInTitle;
    private javax.swing.JButton signOutButton;
    private javax.swing.JList<String> stagesL;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLogoLabel;
    // End of variables declaration//GEN-END:variables
}
