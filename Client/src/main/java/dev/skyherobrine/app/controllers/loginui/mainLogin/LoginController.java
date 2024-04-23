package dev.skyherobrine.app.controllers.loginui.mainLogin;


import dev.skyherobrine.app.AppUtils;
import dev.skyherobrine.app.daos.IDAO;
import dev.skyherobrine.app.daos.NhanVienDAO;
import dev.skyherobrine.app.entities.person.NhanVien;
import dev.skyherobrine.app.views.dashboard.org.main.Main;
import dev.skyherobrine.app.views.loginui.mainLogin.FormQuenMatKhau;
import dev.skyherobrine.app.views.loginui.mainLogin.LoginUI;
import org.apache.commons.collections4.map.HashedMap;

import java.util.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.Naming;
import java.util.List;

public class LoginController implements ActionListener, KeyListener {
    private static LoginUI loginUI;

    private static AppUtils appUtils = new AppUtils();

    public LoginController(LoginUI loginUI) {
        appUtils = AppUtils.getInstance();
        this.loginUI = loginUI;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        try {
            if (o.equals(loginUI.getLoginButton())) {
                checkLogin();
            } else if(o.equals(loginUI.getBtnQuenMatKhau())) {
                new FormQuenMatKhau().setVisible(true);
            }
        } catch (Exception a) {
            throw new RuntimeException(a);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                checkLogin();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void checkLogin() throws Exception {
        Map<String, Object> par = new HashedMap<>();
        par.put("tenTaiKhoan", loginUI.getUsernameField());
            NhanVien nv = appUtils.getNhanVienDAO().timKiem(par).get(0);
        if(nv==null){
            JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu");
        }else{
            if(nv.getMatKhau().equals(loginUI.getPasswordField())) {
                Main main = new Main();
                main.setVisible(true);
                loginUI.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu");
            }
        }

    }
    public static String luuTkNhanVien(){
        return loginUI.getUsernameField().toString();
    }
}

