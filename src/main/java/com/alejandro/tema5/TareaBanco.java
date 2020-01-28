/*
*Diseñe una clase llamada Cuenta que contenga:
*    • Un campo privado de datos int llamado id para la cuenta (valor predeterminado 0).
*    • Un campo privado double de datos denominado saldo para la cuenta (valor predeterminado
*    0).
*    • Un campo de datos double privado denominado tasaInteresAnual que almacena la tasa de
*    interés actual (valor predeterminado 0). Suponga que todas las cuentas tienen la misma tasa
*    de interés.
*    • Un campo privado de datos de fecha llamado fechaCreacion que almacena la fecha de
*    creación de la cuenta.
*    • Un constructor non-arg que crea una cuenta predeterminada.
*    • Un constructor que crea una cuenta con la id especificada y un saldo inicial.
*    • Los métodos de acceso y mutador para id, saldo y tasaInteresAnual.
*    • El método de acceso para fechaCreacion.
*    • Un método llamado getTasaInteresMensual que devuelve la tasa de interés mensual.
*    • Un método llamado getInteresMensual que devuelve el interés mensual.
*    • Un método llamado retirar que retira una cantidad especificada de la cuenta.
*    • Un método llamado depositar que deposita una cantidad específica en la cuenta.
*Dibuja el diagrama UML para la clase y luego implementa la clase.
*(Pista: el método getInteresMensual() devolverá el interés mensual, no la tasa de interés.
*El interés mensual es: saldo * tasaInteresMensual.
*tasaInteresMensual es : tasaInteresAnual/12.
*Tenga en cuenta que tasaInteresAnual es un porcentaje, por ejemplo, como 4.5%. Necesitas
*dividirlo por 100.)
*Diseña un programa de prueba o test que cree un objeto Cuenta con una id de cuenta de 1122, un
*saldo de 20000€ y una tasa de interés anual del 4.5%. Usa el método retirar para retirar 2500€, usa
*el método de depositar para depositar 3000€, e imprime el saldo, el interés mensual y la fecha en
*que se creó esta cuenta
*/
package com.alejandro.tema5;
/**
 *
 * @author Alejandro Minchón Márquez
 */
public class TareaBanco {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        Cuenta cuenta1= new Cuenta();
        
        
               
        cuenta1.setId(1122);
        cuenta1.setSaldo(20000);
        cuenta1.setTasaInteresAnual(4.5);
        
        
        cuenta1.retirar(2500);
        
                
        System.out.println(cuenta1.getSaldo());
        
        System.out.println(cuenta1.getInteresMensual(cuenta1.gettasaInteresAnual(), cuenta1.getSaldo()));
        
        cuenta1.imprimirFechaCreacion();
        
    }    
}


