/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dev.skyherobrine.app.views.loginui.mainLogin;

import dev.skyherobrine.app.controllers.loginui.mainLogin.LoginController;

import javax.swing.*;

/**
 *
 * @author Virtue Nguyen
 */
public class LoginUI extends JFrame {

    /**
     * Creates new form LoginUI
     */
    public LoginUI() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        buttonLogin1.addActionListener(new LoginController(this));
        setFocusable(true);
        requestFocus();
        addKeyListener(new LoginController(this));
        passwordUser1.addKeyListener(new LoginController(this));
        txtUser.setText("tamtu123");
        passwordUser1.setText("tamtu123");

//        btnQuenMatKhau.setFont(btnQuenMatKhau.getFont().deriveFont(Font.PLAIN));
//        Shape nutTronThoat = new Ellipse2D.Float(0,0,btnThoatLogin.getWidth(),btnThoatLogin.getHeight());
//        LineBorder borderNutTron = new LineBorder(Color.WHITE);
//        btnThoatLogin.setBorder(borderNutTron);
//        btnThoatLogin.setContentAreaFilled(false);
//        btnThoatLogin.setForeground(Color.WHITE);
//        btnThoatLogin.setBackground(Color.RED);
    }
    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel1 = new dev.skyherobrine.app.views.loginui.swingLogin.GradientPanel();
        lbImgLogo = new JLabel();
        lbImgItroduction = new JLabel();
        lbTenDangNhap = new JLabel();
        jLabel1 = new JLabel();
        txtUser = new dev.skyherobrine.app.views.loginui.swingLogin.TextFieldUser();
        passwordUser1 = new dev.skyherobrine.app.views.loginui.swingLogin.PasswordUser();
        buttonLogin1 = new dev.skyherobrine.app.views.loginui.swingLogin.ButtonLogin();
        btnQuenMatKhau = new JButton();
        btnThoatLogin = new JButton();
        btnMiniZine = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lbImgLogo.setHorizontalAlignment(SwingConstants.CENTER);
        lbImgLogo.setIcon(new ImageIcon(getClass().getResource("/img/logoGr08/logoGR08-2.png"))); // NOI18N

        lbImgItroduction.setHorizontalAlignment(SwingConstants.CENTER);
        lbImgItroduction.setIcon(new ImageIcon(getClass().getResource("/img/introductionLogin/anh01.jpg"))); // NOI18N

        lbTenDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        lbTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        lbTenDangNhap.setText("Tên tài khoản :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mật khẩu:");

        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/img/imgIconUserNPassword/user.png"))); // NOI18N

        passwordUser1.setText("");
        passwordUser1.setPrefixIcon(new ImageIcon(getClass().getResource("/img/imgIconUserNPassword/key.png"))); // NOI18N

        buttonLogin1.setBackground(new java.awt.Color(255, 51, 51));
        buttonLogin1.setText("Đăng nhập");

        btnQuenMatKhau.setForeground(new java.awt.Color(102, 255, 255));
        btnQuenMatKhau.setText("Quên mật khẩu ?");
        btnQuenMatKhau.setBorderPainted(false);
        btnQuenMatKhau.setContentAreaFilled(false);
        btnQuenMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuenMatKhau.setFocusPainted(false);
        btnQuenMatKhau.setHorizontalAlignment(SwingConstants.LEFT);
        btnQuenMatKhau.addActionListener(new LoginController(this));

        btnThoatLogin.setBackground(new java.awt.Color(255, 51, 51));
        btnThoatLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnThoatLogin.setText("X");
        btnThoatLogin.setBorderPainted(false);
        btnThoatLogin.setFocusPainted(false);
        btnThoatLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatLoginActionPerformed(evt);
            }
        });

        btnMiniZine.setBackground(new java.awt.Color(102, 102, 102));
        btnMiniZine.setForeground(new java.awt.Color(255, 255, 255));
        btnMiniZine.setText("-");
        btnMiniZine.setBorderPainted(false);
        btnMiniZine.setFocusPainted(false);
        btnMiniZine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiniZineActionPerformed(evt);
            }
        });

        GroupLayout gradientPanel1Layout = new GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbImgItroduction)
                .addGroup(gradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(lbImgLogo)
                        .addGap(110, 110, 110))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(gradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(gradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbTenDangNhap, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordUser1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLogin1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnQuenMatKhau))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMiniZine)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoatLogin)
                .addContainerGap())
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoatLogin)
                    .addComponent(btnMiniZine))
                .addGap(2, 2, 2)
                .addGroup(gradientPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addComponent(lbImgLogo)
                        .addGap(18, 18, 18)
                        .addComponent(lbTenDangNhap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordUser1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(buttonLogin1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuenMatKhau))
                    .addComponent(lbImgItroduction))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatLoginActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatLoginActionPerformed

    private void btnMiniZineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiniZineActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMiniZineActionPerformed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnMiniZine;
    private JButton btnQuenMatKhau;
    private JButton btnThoatLogin;
    private dev.skyherobrine.app.views.loginui.swingLogin.ButtonLogin buttonLogin1;
    private dev.skyherobrine.app.views.loginui.swingLogin.GradientPanel gradientPanel1;
    private JLabel jLabel1;
    private JLabel lbImgItroduction;
    private JLabel lbImgLogo;
    private JLabel lbTenDangNhap;
    private dev.skyherobrine.app.views.loginui.swingLogin.PasswordUser passwordUser1;
    private dev.skyherobrine.app.views.loginui.swingLogin.TextFieldUser txtUser;

    public Object getUsernameField() {
        return txtUser.getText();
    }

    public Object getLoginButton() {
        return buttonLogin1;
    }

    public Object getPasswordField() {
        return passwordUser1.getText();
    }


    public JButton getBtnQuenMatKhau() {
        return btnQuenMatKhau;
    }

    // End of variables declaration//GEN-END:variables
}
