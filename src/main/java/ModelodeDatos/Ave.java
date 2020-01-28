/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelodeDatos;
import java.time.LocalDateTime;
/**
 *
 * @author Alejandro Minchón Márquez
 */
public class Ave {
    private int identificador;
    private String origen;
    private String destino;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private Coche misCoches[];
    
    Ave(){}
    public Ave(int identificador,String origen,String destino){        
    }
//    toString(){
//    
//    }

    public void setMisCoches(Coche[] misCoches) {
        this.misCoches = misCoches;
    }
    public int longitudarray(){
        return misCoches.length;
    }
    public void setfechaSalida(LocalDateTime fechaSalida){
        this.fechaSalida=fechaSalida;
    }
    
    public void setfechaLlegada(LocalDateTime fechaLlegada){
        this.fechaLlegada=fechaLlegada;
    }
    
    public void numerodeasientos(int nasientos){
        for (int i = 0; i<=misCoches.length; i++) {
            misCoches[i].asientos= new Cliente[nasientos];
        }
    }
}
