/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

import Coche.coche.Coche;
import Coche.propietario.Propietario;
import Coche.propietario.PropietarioConDirec;
import Coche.propietario.direccion.Direccion;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        //clonando propietario
//        Propietario p1 = new Propietario(new StringBuilder("Fran"), new StringBuilder("Saavedra"), 28);
//        Propietario p2 = p1.clone();

        //creando direccion
        Direccion d10 = new Direccion(new StringBuilder("Calle laplata"), "1", "4");

        //clonando propietario con direccion
        PropietarioConDirec p10 = new PropietarioConDirec(new StringBuilder("Pepe"), new StringBuilder("Mora"), 50, d10);
        PropietarioConDirec p20 = p10.clone();

        System.out.println(p20.toString());
        System.out.println(p10.toString());
        System.out.println(p10.equals(p20));
        
        p20.getDireccion().getCalle().append(" salada");
        p20.getNombre().append(" el Grande");
        p20.getApellido().append(" Granate");
        
        
        System.out.println(p10.getApellido().equals(p20.getApellido()));
        System.out.println(p20.toString());
        System.out.println(p10.equals(p20));
        

        //añadiendo a clon diferencias en nombre y apellido
//        p2.getNombre().append("cisco");
//        p2.getApellido().append(" Galiano");

        //nombre y nombre clon
//        System.out.println(p1.getNombre());
//        System.out.println(p2.getNombre());
//
//        //clonando coche
//        Coche car1 = new Coche(p1, "12345");
//        Coche car2 = car1.clone();

        //añadiendo al clon del propietario del coche nombre y apellido distintos
//        car2.getPropietario().getNombre().append("Raro");
//        car2.getPropietario().getApellido().append("Rarisimo");
//
//        //muestra los nombre y apellido del clon propietario del coche
//        System.out.println(car2.getPropietario().getNombre());
//        System.out.println(car2.getPropietario().getApellido());
//
//        //muestra los dos coches y sus dueños
//        System.out.println(car1);
//        System.out.println(car2);
//
//        //dice si son iguales los coches
//        System.out.println(car1.equals(car2));
    }
}
