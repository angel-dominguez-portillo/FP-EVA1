/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_califa;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_12_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARAMOS LA CALIFICACION
      int califa;
      Scanner captu = new Scanner(System.in);
    //prguntamos la calificacion
      System.out.println("¿Cual es la calificacion? ");
      califa = captu.nextInt();
      //DAMOS LA RESPUESTA
      if(califa >= 70){
          System.out.print("SI ACREDITA ");
      }else{
                    System.out.print("NA ");

      }
              
    }
    
}
