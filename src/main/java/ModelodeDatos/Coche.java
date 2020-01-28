/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelodeDatos;

/**
 *
 * @author Alejandro Minchón Márquez
 */
public class Coche {    
    private int identificador;
    private char tipo;
    protected Cliente asientos[];
    
    
    Coche(){}
    public Coche(int identificador, char tipo, Cliente[] asientos) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.asientos = asientos;
    }

    public void setAsientos(Cliente[] asientos) {
        this.asientos = asientos;
    }
    
}
