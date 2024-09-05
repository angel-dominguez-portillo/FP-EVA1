/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velIn, velFin, tiempo, distancia, acel;
        Scanner captu = new Scanner(System.in);
        
        //EMPESAMOS A CAPTURAR
               //CAPTURAMOS LAS VELOCIDAD INICIAL
               System.out.print("VELOCIDAD INICIAL EN Cm");
               velIn = captu.nextDouble();
               //CAPTURAMOS EL TIEMPO
               System.out.print("TIEPO EN SEGUNDOS");
               tiempo = captu.nextDouble();
               //CAPTURAMOS LA ACELERACION
               System.out.print("ACELERACION EN Cm");
               acel = captu.nextDouble();
               
               //FORMULAS
               distancia = velIn * tiempo + ((acel * tiempo) * (acel * tiempo) / 2);
               System.out.println("LA DISTANCIA ES " + distancia + " Cm");  
        //
               //CAPTURAMOS VELOCIDAD FINAL
               System.out.print("VELOCIDAD FINAL EN Cm");
               velFin = captu.nextDouble();
    }
    
}
