/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_operacion.or;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_OPERACIONOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int meses, km;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuanto kilometraje tiene el Vehiculo?");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuanto meses tiene el Vehiculo");
        
        //Con una o dos comparaciones que se cumpla; el if es verdadero
        meses = captu.nextInt();
        captu.nextLine();
        if((km >= 5000) || (meses >= 6 )){
            System.out.println("Cambio de Aceite");
        }else{
            System.out.println("Vehiculo en buenas condiciones");
        }
    }
}