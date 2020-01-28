/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author Alejandro Minchón Márquez
 */
    
    public class Libro{
        String titulo, autor, editorial, fcompra;
        float precio;
        
        //constructores
        Libro(){}
        
        Libro(String titulo, String autor, String editorial, String fcompra, float precio){
            this.titulo= titulo;
            this.autor=autor;
            this.editorial=editorial;
            this.fcompra=fcompra;
            this.precio=precio;
            setPrecio(precio);
            
        }
        
        void setPrecio (float precio){
            if(precio >= 0)
                this.precio =precio;
            else
                System.out.println("Has introducido un precio no valido");
        } 
         public String MuestraDatos (){
            return "El libro "+ titulo+
                   " escrito por "+ autor+
                    " editado por "+ editorial+
                    " lo compré el día " + fcompra+
                    " y me costó "+ precio+"€";        
    }
    }