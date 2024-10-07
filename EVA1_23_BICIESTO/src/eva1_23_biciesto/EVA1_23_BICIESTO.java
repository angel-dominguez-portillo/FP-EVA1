/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_23_biciesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_23_BICIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year;
        Scanner captu = new Scanner(System.in);
        year = captu.nextInt();
        captu.nextLine();
        
        
       int modulo4 = year % 4;
       if(modulo4 == 0){
           //No debe ser divicible entre 100
           int modulo100 = year % 100;
           if (modulo100 != 0){
               //Tiene que ser divicible entre 400
               int modulo400 = year % 400;
               if(modulo400 == 0){
                   System.out.println("Es año bisiesto");
               }else{
                   System.out.println("No es año bisiesto");
               }
           }else{
                System.out.println("No es año bisiesto");  
           }
       }else{
            System.out.println("No es año bisiesto");
       }
    }    
}
