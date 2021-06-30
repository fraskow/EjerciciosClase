/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplomapas;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/**
 *
 * @author Admin
 */
public class Main {

//    public static void main(String[] args) {
//        Map<String, Persona> peopleMap = new HashMap<>();
//        peopleMap.put("uno", new Persona("Fran", "Saavedra"));
//        peopleMap.put("dos", new Persona("Fran", "Dos"));
//        peopleMap.put("tres", new Persona("Tres", "Saavedra"));
//        peopleMap.put("cuatro", new Persona("Pedro", "Picapiedra"));
//        System.out.println("tamaño: " + peopleMap.size());
//        System.out.println("valor: " + peopleMap.get("uno"));
//        System.out.println(peopleMap.entrySet().iterator().next().getKey());
//
//        peopleMap.entrySet().forEach(entry -> {
//            Object key = entry.getKey();
//            Object val = entry.getValue();
//            System.out.println(key + " " + val);
//        });
//
//        Set<String> set = peopleMap.keySet();
//
//        Iterator<String> iter = set.iterator();
//        while(iter.hasNext()){
//            String cadena = iter.next()+"sioque";
//        }
//        for (String string : set) {
//            System.out.println(string);
//        }
//        
//        
//    }
//    public static void main(String[] args) {
//        Map<Persona,Set<Informe>> informesMap = new HashMap<>();
//        Persona p = new Persona ("Fran","Saavedra");
//        Set<Informe> informes = new HashSet<>();
//        
//        informes.add(new Informe("inform 1"));
//        informes.add(new Informe("inform 2"));
//        informes.add(new Informe("inform 3"));
//        informes.add(new Informe("inform 4"));
//        
//        for (Map.Entry<Persona, Set<Informe>> entry : informesMap.entrySet()) {
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//            System.out.println(key);
//            for (Iterator<Informe> iterator = informes.iterator(); iterator.hasNext();) {
//                Informe next = iterator.next();
//                System.out.println(next.getDescripcion());
//            }
//        }
//        
//        // estos flujos son el mismo pero el de abajo es mejor en calidad, el de arriba en semántica.
//        
//        informesMap.entrySet().stream().map(entry -> {
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//            System.out.println(key);
//            return entry;
//        }).forEachOrdered((Map.Entry<Persona, Set<Informe>> _item) -> {
//            informes.forEach((Informe next) -> {
//                System.out.println(next.getDescripcion());
//            });
//        });
//        
//    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Pepe", "Botella"));
        personas.add(new Persona("Juan", "Santaella"));
        personas.add(new Persona("Luis", "Tobosa"));
        personas.add(new Persona("Cari", "Galiano"));

        FileOutputStream fileOut = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fileOut);

        FileInputStream fileIn = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fileIn);

        oos.writeObject(new Persona("Juan", "Belmonte"));
        oos.writeObject(personas);
        oos.close();
        System.out.println(oos);

        Persona p1 = (Persona) ois.readObject();
        System.out.println(p1);
        ois.close();

        personas.forEach(p -> System.out.println(p));
        
        
//        try(FileInputStream fis = new FileInputStream("t.tmp"); ObjectInputStream ois = new ObjectInputStream(fis)){
//            esto gestiona el control de excepciones.
//        }
        
        

    }
}
