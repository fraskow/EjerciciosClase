/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.calcuwebmap.test;

/**
 *
 * @author frans
 */
public class OpSuma implements Operacion{

    public OpSuma() {
    }
    
    @Override
    public double calcular(double x, double y) {
        return x+y;
    }
    
}
