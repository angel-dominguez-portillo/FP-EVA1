/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAMOS LA VARIABLES
        String MARCA;
        String MODELO;
        int YEAR;
        double PRECIO;
        
        //COMO SE CAPTURA
        //SCANNER
        //HERRAMIENTA
        Scanner captu;//DECLARAMOS LA HERRAMIENTA, PREVIAMENTE
                      //HAY QUE IMPORTAR (HACER UN IMPORT)
        captu = new Scanner(System.in);//CREAMOS LA HERRAMIENTA
        
        //HAY QUE INDICAR  AL USUARIO QUE CAPTURAR
        System.out.print("Introduce la marca del AUTOMOVIL:");
        MARCA = captu.nextLine();
        System.out.print("Introduce la marca del MODELO:");
        MODELO = captu.nextLine();
        System.out.print("Introduce la marca del PRECIO:");
        PRECIO = captu.nextDouble(); 
        //IMPRIMIMOS LO QUE ESCRIBES
        System.out.print("Introduce la marca del AUTOMOVIL:");
        System.out.print("Introduce la marca del AUTOMOVIL:");
        System.out.print("Introduce la marca del MODELO:");
        System.out.print("Introduce la marca del PRECIO:");
    }
    
}
