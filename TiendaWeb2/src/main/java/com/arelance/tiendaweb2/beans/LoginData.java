/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.beans;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class LoginData {
    
    private String nick;
    private String pw;

    public LoginData(String nick, String pw) {
        this.nick = nick;
        this.pw = pw;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nick);
        hash = 79 * hash + Objects.hashCode(this.pw);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LoginData other = (LoginData) obj;
        if (!Objects.equals(this.nick, other.nick)) {
            return false;
        }
        return Objects.equals(this.pw, other.pw);
    }

}
