/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.tiendaweb2.beans;

import java.util.Map;

/**
 *
 * @author Admin
 */
public class LoginData {

    public Map<Nick,Password> logData;

    public LoginData() {
    }
    

    public LoginData(Map<Nick, Password> logData) {
        this.logData = logData;
    }

    public Map<Nick, Password> getLogData() {
        return logData;
    }

    public void setLogData(Map<Nick, Password> logData) {
        this.logData = logData;
    }
    
}
