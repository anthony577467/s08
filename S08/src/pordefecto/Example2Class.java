/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pordefecto;

/**
 *
 * @author USUARIO
 */
public class Example2Class {
    private static int privateAttribute; // Este atributo es privado
    static int contador = 0; // Contador con acceso por defecto

    public static void setPrivateAttribute(int valor) {
        contador++; // Contador que lleva el registro de ediciones del privateAttribute
        privateAttribute = valor; // Establecemos el valor del privateAttribute
    }

    public static int getPrivateAttribute() {
        return privateAttribute; // Retornamos el valor actual del privateAttribute
    }
}
