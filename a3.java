/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08.a1;

/**
 *
 * @author USUARIO
 */
public class a3 {

   
 
    public static void main(String[] args) {
        // Crear una instancia de MiClasePrivada
        a3 instanciaPrivada = new MiClasePrivada(42);

        // Acceder al atributo privado y público
        int valorPrivado;
        valorPrivado = instanciaPrivada.obtenerAtributoPrivado();
        String valorPublico = instanciaPrivada.atributoPublico;

        // Imprimir los valores
        System.out.println("Atributo privado: " + valorPrivado);
        System.out.println("Atributo público: " + valorPublico);
    }
    private String atributoPublico;

    private int obtenerAtributoPrivado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class MiClasePrivada extends a3 {

        public MiClasePrivada(int i) {
        }
    }
    
}
