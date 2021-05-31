
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Selecciona una opcción del 1 al 3, 4 para salir");
        boolean condicion = false;
        while (!condicion){
            int x=teclado.nextInt();
            switch(x){  
                case 1: 
                    System.out.println("Opcion "+x); 
                    break;
                case 2: 
                    System.out.println("Opcion "+x); 
                    break;
                case 3: 
                    System.out.println("Opcion "+x);
                    break;
                case 4: 
                    System.out.println("Has salido del menú");
                    condicion=true;
                default :
                    System.out.println("Solo opciones entre 1 y 4");
            }
        }
    }
}
