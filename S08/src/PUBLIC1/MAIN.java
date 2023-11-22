/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUBLIC1;

/**
 *
 * @author USUARIO
 */
import PUBLIC1.PUBLIC; //importamos la clase del ejemplo4

public class MAIN {
    public static void main(String[] args) {
        // Acceso directo a atributo1 porque es público
        PUBLIC.numero = 42;
        System.out.println("Número: " + PUBLIC.numero);

        // Acceso al método1 porque es público
        PUBLIC.metodoPublico();
    }
}