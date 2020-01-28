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
public class ejercicioprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro mislibros[]= new Libro[6];
        
        mislibros[0]= new Libro("a","a","a","hoy",7);
        mislibros[1]= new Libro("b","b","b","hoy",7);
        mislibros[2]= new Libro("c","c","c","hoy",7);
        mislibros[3]= new Libro("d","d","d","hoy",7);
        mislibros[4]= new Libro("e","e","e","hoy",7);
        mislibros[5]= new Libro("f","f","f","hoy",7);
        
        for(int i = 0; i <mislibros.length; i++) {
            System.out.println(mislibros[i].MuestraDatos());
        }
        
//        Integer[] numeros={0,1,2,3,4,5,6,7,8,9};
//        Util<Integer> u= new Util<Integer>();
//        u.invertir(numeros);
//        for (int i=0;i<numeros.length;i++){ 
//            System.out.println(numeros[i]);
//        }
        
        
        Util<Libro> a= new Util<Libro>();
        a.invertir(mislibros);
//        for (int i=0;i<mislibros.length;i++){ 
//            System.out.println(mislibros[i]);
//        }
        for(int i = 0; i <mislibros.length; i++) {
            System.out.println(mislibros[i].MuestraDatos());
        }
        
    }
    
}
