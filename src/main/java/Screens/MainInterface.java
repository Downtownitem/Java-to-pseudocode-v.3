package Screens;

import Core.Conversor.Conversor;
import Custom.ScrollBarCustom;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public class MainInterface extends javax.swing.JFrame implements ClipboardOwner {

    Conversor conversor;

    public MainInterface() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        superiorBar.setBackground(new Color(0, 0, 0, 0));

        // Custom scroll pane
        ScrollBarCustom scc = new ScrollBarCustom();
        scc.setForeground(new Color(54, 48, 119));
        codeScrollPane.setHorizontalScrollBar(scc);
        codeScrollPane.setVerticalScrollBar(scc);

        // Text Area Initial String
        codeTextAreaInitialString = codeTextArea.getText();
        pseudocodeTextAreaInitialString = pseudocodeTextArea.getText();

        conversor = new Conversor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new Custom.PanelRound();
        superiorBar = new Custom.PanelRound();
        exitButton = new Custom.UltraButton();
        minimizeButton = new Custom.UltraButton();
        image = new Custom.BlurBackground();
        jPanel1 = new javax.swing.JPanel();
        logoLabel1 = new Custom.LogoLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codeLabel = new javax.swing.JLabel();
        codeShadow = new Custom.ShadowPanelComponent.PanelShadow();
        codeScrollPane = new javax.swing.JScrollPane();
        codeTextArea = new javax.swing.JTextArea();
        clearCodeButton = new Custom.UltraButton();
        pasteCodeButton = new Custom.UltraButton();
        scannerVariableLabel = new javax.swing.JLabel();
        scannerVariableShadow = new Custom.ShadowPanelComponent.PanelShadow();
        variableTextField = new Custom.AnimatedTextField();
        pseudocodeLabel = new javax.swing.JLabel();
        convertButton = new Custom.UltraButton();
        clearPseudocodeButton = new Custom.UltraButton();
        copyPseudoodeButton = new Custom.UltraButton();
        pseudocodeShadow = new Custom.ShadowPanelComponent.PanelShadow();
        pseudocodeScrollPane = new javax.swing.JScrollPane();
        pseudocodeTextArea = new javax.swing.JTextArea();
        codeLabel1 = new javax.swing.JLabel();
        logoLabel2 = new Custom.LogoLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setRadius(15);
        background.setRoundBottomLeft(30);
        background.setRoundBottomRight(30);
        background.setRoundTopLeft(30);
        background.setRoundTopRight(30);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        superiorBar.setBackground(new java.awt.Color(51, 51, 51));
        superiorBar.setEnableCustomRectangle(true);
        superiorBar.setRoundTopLeft(15);
        superiorBar.setRoundTopRight(15);
        superiorBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorBarMouseDragged(evt);
            }
        });
        superiorBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorBarMousePressed(evt);
            }
        });
        superiorBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setText("X");
        exitButton.setChangeCoefficient(17);
        exitButton.setColor1Background(new Color(0, 0, 0, 0));
        exitButton.setColor1Foreground(new java.awt.Color(255, 255, 255));
        exitButton.setColor2Over(new java.awt.Color(255, 0, 0));
        exitButton.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        exitButton.setColor3Click(new java.awt.Color(204, 0, 0));
        exitButton.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        exitButton.setEnableColorGradient(true);
        exitButton.setEnableCustomBorders(true);
        exitButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        exitButton.setRoundBottomLeft(0);
        exitButton.setRoundBottomRight(0);
        exitButton.setRoundTopLeft(0);
        exitButton.setRoundTopRight(15);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        superiorBar.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 60, 30));

        minimizeButton.setText("-");
        minimizeButton.setChangeCoefficient(17);
        minimizeButton.setColor1Background(new Color(0, 0, 0, 0));
        minimizeButton.setColor1Foreground(new java.awt.Color(255, 255, 255));
        minimizeButton.setColor2Over(new java.awt.Color(153, 153, 153));
        minimizeButton.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setColor3Click(new java.awt.Color(102, 102, 102));
        minimizeButton.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setEnableColorGradient(true);
        minimizeButton.setEnableCustomBorders(true);
        minimizeButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        minimizeButton.setRadius(0);
        minimizeButton.setRoundBottomLeft(15);
        minimizeButton.setRoundBottomRight(0);
        minimizeButton.setRoundTopLeft(0);
        minimizeButton.setRoundTopRight(0);
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });
        superiorBar.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 60, 30));

        background.add(superiorBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        image.setBackground(new java.awt.Color(51, 51, 51));
        image.setForeground(new java.awt.Color(51, 51, 51));
        image.setBlur(jPanel1);
        image.setEnableCustomRectangle(true);
        image.setImage(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundImage.png"))); // NOI18N
        image.setRadius(0);
        image.setRoundBottomRight(15);
        image.setRoundTopRight(15);
        image.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Images/uninorte.png"))); // NOI18N
        jPanel1.add(logoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 160, 160));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("norte");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Universidad del");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 50));

        image.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 270, 360));

        background.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 370, 720));

        codeLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        codeLabel.setForeground(new java.awt.Color(54, 48, 119));
        codeLabel.setText("Code");
        background.add(codeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, 40));

        codeShadow.setBackground(new java.awt.Color(255, 255, 255));
        codeShadow.setForm(Custom.ShadowPanelComponent.ShadowPanelForm.RECTANGLE);
        codeShadow.setPanelHeight(220);
        codeShadow.setPanelWidth(840);
        codeShadow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codeScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        codeScrollPane.setBorder(null);

        codeTextArea.setBackground(new java.awt.Color(255, 255, 255));
        codeTextArea.setColumns(20);
        codeTextArea.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        codeTextArea.setForeground(new java.awt.Color(204, 204, 204));
        codeTextArea.setRows(5);
        codeTextArea.setText("Enter your java code");
        codeTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codeTextAreaFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                codeTextAreaFocusLost(evt);
            }
        });
        codeScrollPane.setViewportView(codeTextArea);

        codeShadow.add(codeScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 190));

        background.add(codeShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 850, 210));

        clearCodeButton.setText("Clear");
        clearCodeButton.setChangeCoefficient(3);
        clearCodeButton.setColor1Background(new java.awt.Color(197, 14, 189));
        clearCodeButton.setColor1Foreground(new java.awt.Color(255, 255, 255));
        clearCodeButton.setColor2Over(new java.awt.Color(170, 11, 164));
        clearCodeButton.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        clearCodeButton.setColor3Click(new java.awt.Color(145, 10, 139));
        clearCodeButton.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        clearCodeButton.setEnableColorGradient(true);
        clearCodeButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        clearCodeButton.setRadius(30);
        clearCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCodeButtonActionPerformed(evt);
            }
        });
        background.add(clearCodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 130, 40));

        pasteCodeButton.setText("Paste");
        pasteCodeButton.setChangeCoefficient(3);
        pasteCodeButton.setColor1Background(new java.awt.Color(197, 14, 189));
        pasteCodeButton.setColor1Foreground(new java.awt.Color(255, 255, 255));
        pasteCodeButton.setColor2Over(new java.awt.Color(170, 11, 164));
        pasteCodeButton.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        pasteCodeButton.setColor3Click(new java.awt.Color(145, 10, 139));
        pasteCodeButton.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        pasteCodeButton.setEnableColorGradient(true);
        pasteCodeButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        pasteCodeButton.setRadius(30);
        pasteCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteCodeButtonActionPerformed(evt);
            }
        });
        background.add(pasteCodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 130, 40));

        scannerVariableLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        scannerVariableLabel.setForeground(new java.awt.Color(54, 48, 119));
        scannerVariableLabel.setText("Scanner Variable");
        background.add(scannerVariableLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 210, 40));

        scannerVariableShadow.setBackground(new java.awt.Color(255, 255, 255));
        scannerVariableShadow.setForm(Custom.ShadowPanelComponent.ShadowPanelForm.RECTANGLE);
        scannerVariableShadow.setPanelHeight(60);
        scannerVariableShadow.setPanelWidth(580);
        scannerVariableShadow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        variableTextField.setForeground(new java.awt.Color(51, 51, 51));
        variableTextField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        variableTextField.setHint("Enter the scanner variable if used");
        variableTextField.setHintColor(new java.awt.Color(204, 204, 204));
        variableTextField.setSelectionColor(new java.awt.Color(204, 204, 204));
        scannerVariableShadow.add(variableTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 40));

        background.add(scannerVariableShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 610, 60));

        pseudocodeLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        pseudocodeLabel.setForeground(new java.awt.Color(54, 48, 119));
        pseudocodeLabel.setText("Pseudocode");
        background.add(pseudocodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 160, 40));

        convertButton.setText("Convert code to pseudocode");
        convertButton.setChangeCoefficient(3);
        convertButton.setColor1Background(new java.awt.Color(197, 14, 189));
        convertButton.setColor1Foreground(new java.awt.Color(255, 255, 255));
        convertButton.setColor2Over(new java.awt.Color(170, 11, 164));
        convertButton.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        convertButton.setColor3Click(new java.awt.Color(145, 10, 139));
        convertButton.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        convertButton.setEnableColorGradient(true);
        convertButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        convertButton.setRadius(30);
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });
        background.add(convertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 330, 40));

        clearPseudocodeButton.setText("Clear");
        clearPseudocodeButton.setChangeCoefficient(3);
        clearPseudocodeButton.setColor1Background(new java.awt.Color(197, 14, 189));
        clearPseudocodeButton.setColor1Foreground(new java.awt.Color(255, 255, 255));
        clearPseudocodeButton.setColor2Over(new java.awt.Color(170, 11, 164));
        clearPseudocodeButton.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        clearPseudocodeButton.setColor3Click(new java.awt.Color(145, 10, 139));
        clearPseudocodeButton.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        clearPseudocodeButton.setEnableColorGradient(true);
        clearPseudocodeButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        clearPseudocodeButton.setRadius(30);
        clearPseudocodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPseudocodeButtonActionPerformed(evt);
            }
        });
        background.add(clearPseudocodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 130, 40));

        copyPseudoodeButton.setText("Copy");
        copyPseudoodeButton.setChangeCoefficient(3);
        copyPseudoodeButton.setColor1Background(new java.awt.Color(197, 14, 189));
        copyPseudoodeButton.setColor1Foreground(new java.awt.Color(255, 255, 255));
        copyPseudoodeButton.setColor2Over(new java.awt.Color(170, 11, 164));
        copyPseudoodeButton.setColor2OverForeground(new java.awt.Color(255, 255, 255));
        copyPseudoodeButton.setColor3Click(new java.awt.Color(145, 10, 139));
        copyPseudoodeButton.setColor3ClickForeground(new java.awt.Color(255, 255, 255));
        copyPseudoodeButton.setEnableColorGradient(true);
        copyPseudoodeButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        copyPseudoodeButton.setRadius(30);
        copyPseudoodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyPseudoodeButtonActionPerformed(evt);
            }
        });
        background.add(copyPseudoodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 130, 40));

        pseudocodeShadow.setBackground(new java.awt.Color(255, 255, 255));
        pseudocodeShadow.setForm(Custom.ShadowPanelComponent.ShadowPanelForm.RECTANGLE);
        pseudocodeShadow.setPanelHeight(220);
        pseudocodeShadow.setPanelWidth(840);
        pseudocodeShadow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pseudocodeScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        pseudocodeScrollPane.setBorder(null);

        pseudocodeTextArea.setBackground(new java.awt.Color(255, 255, 255));
        pseudocodeTextArea.setColumns(20);
        pseudocodeTextArea.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        pseudocodeTextArea.setForeground(new java.awt.Color(204, 204, 204));
        pseudocodeTextArea.setRows(5);
        pseudocodeTextArea.setText("Press convert button to continue");
        pseudocodeTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pseudocodeTextAreaFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                pseudocodeTextAreaFocusLost(evt);
            }
        });
        pseudocodeScrollPane.setViewportView(pseudocodeTextArea);

        pseudocodeShadow.add(pseudocodeScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 190));

        background.add(pseudocodeShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 850, 210));

        codeLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        codeLabel1.setForeground(new java.awt.Color(54, 48, 119));
        codeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codeLabel1.setText("Code to pseudocode conversor");
        background.add(codeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 490, 40));

        logoLabel2.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/booksIcon.png"))); // NOI18N
        background.add(logoLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 60, 60));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Superior Bar events
    int mouseX, mouseY;

    private void superiorBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_superiorBarMousePressed

    private void superiorBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_superiorBarMouseDragged

    // Exit button events
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    // Minimize button events
    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed

    // Code textarea event
    String codeTextAreaInitialString;

    private void codeTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codeTextAreaFocusGained
        if (codeTextArea.getText().equals(codeTextAreaInitialString)) {
            codeTextArea.setText("");
            codeTextArea.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_codeTextAreaFocusGained

    private void codeTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codeTextAreaFocusLost
        if (codeTextArea.getText().equals("")) {
            codeTextArea.setText(codeTextAreaInitialString);
            codeTextArea.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_codeTextAreaFocusLost

    // PseudoCode textarea event
    String pseudocodeTextAreaInitialString;

    private void pseudocodeTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pseudocodeTextAreaFocusLost
        if (pseudocodeTextArea.getText().equals("")) {
            pseudocodeTextArea.setText(pseudocodeTextAreaInitialString);
            pseudocodeTextArea.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pseudocodeTextAreaFocusLost

    private void pseudocodeTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pseudocodeTextAreaFocusGained
        if (pseudocodeTextArea.getText().equals(pseudocodeTextAreaInitialString)) {
            pseudocodeTextArea.setText("");
            pseudocodeTextArea.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_pseudocodeTextAreaFocusGained

    // Clear code fields button event
    private void clearCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCodeButtonActionPerformed
        codeTextArea.setText(codeTextAreaInitialString);
        codeTextArea.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_clearCodeButtonActionPerformed

    // Paste code button event
    private void pasteCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteCodeButtonActionPerformed
        codeTextArea.setForeground(new Color(51, 51, 51));
        String textOfClipboard = pasteFromClipboard();
        codeTextArea.setText(textOfClipboard);
    }//GEN-LAST:event_pasteCodeButtonActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        String code = codeTextArea.getText();
        String scannerVar = variableTextField.getText();

        conversor.setCode(code);
        conversor.setScannerVar(scannerVar);
        conversor.convert();

        String pseudocode = conversor.getPseudo();
        pseudocodeTextArea.setText(pseudocode);
    }//GEN-LAST:event_convertButtonActionPerformed

    private void clearPseudocodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPseudocodeButtonActionPerformed
        pseudocodeTextArea.setText(pseudocodeTextAreaInitialString);
        pseudocodeTextArea.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_clearPseudocodeButtonActionPerformed

    private void copyPseudoodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyPseudoodeButtonActionPerformed
        copyToClipboard(pseudocodeTextArea.getText());
    }//GEN-LAST:event_copyPseudoodeButtonActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Custom.PanelRound background;
    private Custom.UltraButton clearCodeButton;
    private Custom.UltraButton clearPseudocodeButton;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JLabel codeLabel1;
    private javax.swing.JScrollPane codeScrollPane;
    private Custom.ShadowPanelComponent.PanelShadow codeShadow;
    private javax.swing.JTextArea codeTextArea;
    private Custom.UltraButton convertButton;
    private Custom.UltraButton copyPseudoodeButton;
    private Custom.UltraButton exitButton;
    private Custom.BlurBackground image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private Custom.LogoLabel logoLabel1;
    private Custom.LogoLabel logoLabel2;
    private Custom.UltraButton minimizeButton;
    private Custom.UltraButton pasteCodeButton;
    private javax.swing.JLabel pseudocodeLabel;
    private javax.swing.JScrollPane pseudocodeScrollPane;
    private Custom.ShadowPanelComponent.PanelShadow pseudocodeShadow;
    private javax.swing.JTextArea pseudocodeTextArea;
    private javax.swing.JLabel scannerVariableLabel;
    private Custom.ShadowPanelComponent.PanelShadow scannerVariableShadow;
    private Custom.PanelRound superiorBar;
    private Custom.AnimatedTextField variableTextField;
    // End of variables declaration//GEN-END:variables

    public void copyToClipboard(String text) {
        StringSelection txt = new StringSelection(text);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(txt, this);
    }

    public String pasteFromClipboard() {
        try {
            return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
