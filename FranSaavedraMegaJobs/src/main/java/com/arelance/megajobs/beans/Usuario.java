/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.megajobs.beans;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public final class Usuario {
    private final String nick;
    private final String pw;

    public Usuario(String nick, String pw) {
        this.nick = nick;
        this.pw = pw;
    }

    public String getNick() {
        return nick;
    }

    public String getPw() {
        return pw;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nick);
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.nick, other.nick);
    }
    
}
