/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ModelodeDatos.*;
import java.util.Scanner;

/**
 *
 * @author Alejandro Minchón Márquez
 */
public class AveTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte menu=4;
        
        Ave ave1= new Ave(1,"Sevilla","Madrid");
        
        ave1.setMisCoches(new Coche[6]);
        
        //ave1.numerodeasientos(20);
        
        for (int coches= 0; coches>=ave1.longitudarray(); coches++) {
            int asientos=20;
            ave1.misCoches[coches].setAsientos(asientos);
        }
        
        System.out.println("------------------------------------");
        System.out.println("1.Ver la ocupación del tren");
        System.out.println("2.Asignar un pasajero");
        System.out.println("3.Eliminar un pasajero de un asiento");
        System.out.println("4.Salir");
        System.out.println("------------------------------------");
        try{
            menu = teclado.nextByte();
        }
        catch(Exception ex){
            System.err.println("Error");
        }
            
        
        switch(menu){
            case 1:
                
            break;
            case 2:
                
            break;
            case 3:
                
            break;
            case 4:
                
            break;
        }
    }
    
}
