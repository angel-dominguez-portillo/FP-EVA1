/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONDICIONAL
        //LOGUICA BOOLEANA------>OPERACIONES DE VERDADERO O FALSO
        //SOLICITAR LA EDAD EN AÑOS
        int edad;
        Scanner captu = new Scanner(System.in);
         
        //CAPTURAMOS 
        System.out.print("INTRODUCE TU EDAD: ");
        edad = captu.nextInt();
        
        //determinamos si es adulto o no
        if(edad >= 18){//BLOQUE PARA EL VERDADERO
            System.out.print("es adulto");
        }else{//BLOQUE QUE PARA FALSO
                    System.out.print("es menor de edad");
    }
            }
}
