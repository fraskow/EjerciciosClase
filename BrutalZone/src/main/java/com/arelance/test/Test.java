/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        Comparator <String> comparator = (String o1, String o2) -> Integer.compare(o1.length(),o2.length());
        String[] nombres = new String[]{"pepe","eva","maria","juan"};
        Arrays.sort(nombres, comparator);
        System.out.println(Arrays.toString(nombres));
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
