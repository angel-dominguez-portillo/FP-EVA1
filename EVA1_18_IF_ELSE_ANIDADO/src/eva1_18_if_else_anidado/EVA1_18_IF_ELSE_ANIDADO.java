/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_18_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Numero del dia del 1 al 7: ");
        dia = captu.nextInt();
        
        //AQUI USAMOS EL IF ELSE, POR SI NO ES CIERTO SE RECORRA HASTA QUE 
        //LA DECLARACION SEA VERDAD
        if(dia == 1){
            System.out.println("Lunes");
        }else if(dia == 2){
            System.out.println("Martes");
        }else if(dia == 3){
            System.out.println("Miercoles");
        }else if(dia == 4){
            System.out.println("Jueves");
        }else if(dia == 5){
            System.out.println("Viernes");
        }else if(dia == 6){
            System.out.println("Sabado");
        }else if(dia == 7){
            System.out.println("Domingo");
        }else {//seleccion opcional
           System.out.println("No es un dia valido (debe ser del 1 al 7)");
        }
    }
}