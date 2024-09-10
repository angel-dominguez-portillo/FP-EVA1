/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Capturar si la persona es fisica con (F) y moral con (M): ");
        tipo = captu.nextLine().charAt(0);
        System.out.println("El caracter es " + tipo);
    }  
}
