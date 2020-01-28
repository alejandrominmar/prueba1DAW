/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author Alejandro Minchón Márquez
 * @param <T>
 */
public class Util<T> {
     T t1;
    public void invertir(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            t1 = array[i];  
            array[i] = array[array.length - 1 - i]; 
            array[array.length - 1 - i] = t1; 
        }
    }
}
