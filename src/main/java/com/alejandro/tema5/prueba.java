/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.tema5;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alejandro Minchón Márquez
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime ahora = LocalDateTime.now(); 
        
        System.out.println(ahora);
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        
        String fechaConFormato = ahora.format(formato);
        
        System.out.println(fechaConFormato);
    }
    
}
