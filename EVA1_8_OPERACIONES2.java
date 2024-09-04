/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_operaciones2;

/**
 *
 * @author invitado
 */
public class EVA1_8_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Angel";
        String apellido = "Dominguez";
        String nombreCom;
        //CADENA DE TEXTO, LA OPERACION SE LLAMA
        //CONECTACIÓN -> UNIR CADENAS DE TEXTO
        //EL OPERADOR DE CONCATENACIÓN ES EL +
        //CUANDO UN SIMBOLO TIENE VARIAS FUNCIONES
        //SE LE LLAMA SOBRCARGA (DE OPERADORES)
        nombreCom = nombre + " " + apellido;
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("El nombre completo es: " +nombreCom);
    }
    
}
