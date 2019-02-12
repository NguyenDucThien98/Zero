/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprocess;

import view.Login;

/**
 *
 * @author gg
 */
public class checklogin {

    private Login l = null;
    private boolean check1 = false;
    private boolean check2 = false;

    public String checkUserName(String s, javax.swing.JFrame frame) {
        l = (Login) frame;
        if (s.matches("[a-zA-z0-9]+$")) {
            s = s.toLowerCase().trim();
            check1 = true;
            l.setIconNameStatus(true);
        } else {
            l.setStatus("Username wrong input!");
            check1 = false;
            l.setIconNameStatus(false);
        }
        return s;
    }

    public boolean isCheck1() {
        return check1;
    }

    public boolean isCheck2() {
        return check2;
    }

    public String checkPass(String s, javax.swing.JFrame frame) {
        l = (Login) frame;
        if (s.matches("[a-zA-z0-9]{6,30}")) {
            s = s.trim();
            check2 = true;
            l.setIconPassStatus(true);
        } else if (s.length() < 6 || s.length() > 30) {
            l.setStatus("Mật khẩu phải từ 6-30 kí tự");
            check2 = false;
            l.setIconPassStatus(false);
        } else {
            l.setStatus("Password wrong input!");
            check2 = false;
            l.setIconPassStatus(false);
        }
        return s;
    }
  
}
