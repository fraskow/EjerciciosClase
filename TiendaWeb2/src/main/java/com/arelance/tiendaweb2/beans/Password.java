/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.beans;

/**
 *
 * @author Admin
 */
public class Password {
    
    private String pw;

    public Password(String pw) {
        this.pw = pw;
    }

    public Password() {
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

}
