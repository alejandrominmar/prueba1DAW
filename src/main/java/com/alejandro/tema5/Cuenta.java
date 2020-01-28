
package com.alejandro.tema5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Alejandro Minchón Márquez
 */

    public class Cuenta{
       
        private int id;
        private double saldo;
        private double tasaInteresAnual;
        private final LocalDateTime fechaCreacion; 

        Cuenta(){
            fechaCreacion=LocalDateTime.now();
        }
        Cuenta(int id, double saldo){
            this();
            this.id=id;
            this.saldo=saldo;        
        }

        public int getId(){
            return id;
        }    
        public double getSaldo(){
            return saldo;
        }
        public double gettasaInteresAnual(){
            return tasaInteresAnual;
        }
        public void setId(int id){        
            this.id=id;       
        } 
        public void setSaldo(double saldo){
            this.saldo=saldo;
        } 
        public void setTasaInteresAnual(double tasaInteresAnual){
            this.tasaInteresAnual=tasaInteresAnual;
        } 
        public double getTasaInteresMensual(double tasaInteresAnual){
            return (tasaInteresAnual/12)/100;
        }
        public double getInteresMensual(double saldo,double tasaInteresAnual){
            return ((tasaInteresAnual/12)/100)*saldo;     
        }
        public void retirar(double cantidad){             
            saldo= saldo-cantidad;        
        }
        public void depositar(double contidad){
            saldo= saldo+contidad;   
        }

        public void imprimirFechaCreacion(){
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");        
            String fechaConFormato = fechaCreacion.format(formato);

            System.out.println(fechaConFormato);
    }
    
}

