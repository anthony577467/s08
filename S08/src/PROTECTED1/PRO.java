/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROTECTED1;

/**
 *
 * @author USUARIO
 */


// Importas la clase PROTECTED del paquete PROTECTED1
import PROTECTED1.PROTECTED;


public class PRO extends PROTECTED {
    public static void main(String[] args) {
        // Accedes a patas a través de la clase base PROTECTED
        PROTECTED.patas = 4;
        System.out.println("Número de patas: " + PROTECTED.patas);

        // Accedes a colmillos a través del método getColmillos
        PROTECTED.colnillos = 2;  // Esto es posible porque colmillos es privado y se accede a través del método
        System.out.println("Número de colmillos: " + PROTECTED.getColmillos());

        // Creas una instancia de PROTECTED para acceder a cola
        PROTECTED protectedInstance = new PROTECTED();
        protectedInstance.cola = 1;
        System.out.println("Longitud de cola: " + protectedInstance.cola);
    }
}

