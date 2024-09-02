/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_pelicula;


import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Delclaramos las variables
        String Nombre;
        String Genero;
        int Duracion;//---> 1 hora= 3600 segundos
        String Reparto;
        String Clasificacion; 
        
        //capturar
        Scanner captu;
        
        captu = new Scanner(System.in);
        
        //Indicamos al usuario
        System.out.print("Introdusca el Nombre");
        Nombre = captu.nextLine();
        
         System.out.print("Introdusca el Genero");
         Genero = captu.nextLine();
         
         System.out.print("Intodusca la Duracion");
         Duracion = captu.nextInt();
         
         System.out.print("Introdusca el reparto");
         Reparto = captu.nextLine();
         
         System.out.print("Introdusca la Clasificacion");
         Clasificacion = captu.nextLine();
         
         //Imprimimos
                 }
}
