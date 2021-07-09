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
public class Nick {
    
    private String nick;

    public Nick(String nick) {
        this.nick = nick;
    }

    public Nick() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nick);
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
        final Nick other = (Nick) obj;
        return Objects.equals(this.nick, other.nick);
    }
    
    
    
}
