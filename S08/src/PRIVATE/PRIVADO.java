/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRIVATE;

/**
 *
 * @author USUARIO
 */
public class PRIVADO {
    private String nombre;  // Este atributo es privado
    private int edad = 0;   // Contador de registro

    // Si un atributo es privado, podemos crear métodos get y set...
    // ... para este y permitir el acceso a él desde otras instancias

    public void setNombre(String nuevoNombre) {
        edad++;          // Contador que lleva el registro de ediciones del nombre
        nombre = nuevoNombre;  // Establecemos el nuevo valor del nombre
    }

    public String getNombre() {
        return nombre;   // Retornamos el valor actual del nombre
    }

    // Get para el contador
    public int getEdad() {
        return edad;
    }
    // Nota que no ponemos un set para el contador, pues no nos interesa que el contador pueda ser cambiado.
}


