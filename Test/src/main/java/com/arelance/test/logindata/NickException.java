/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.test.logindata;

/**
 *
 * @author frans
 */
public class NickException extends Exception {

    /**
     * Creates a new instance of <code>NickException</code> without detail
     * message.
     */
    public NickException() {
    }

    /**
     * Constructs an instance of <code>NickException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NickException(String msg) {
        super(msg);
    }
}
