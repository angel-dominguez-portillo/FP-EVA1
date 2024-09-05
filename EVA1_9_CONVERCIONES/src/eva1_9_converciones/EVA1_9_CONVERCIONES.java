/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_converciones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_CONVERCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double far, cent, cent2, kelv; 
        Scanner captu = new Scanner(System.in);
        
        //capturamos la temperatura en farenheit
        System.out.print("Temperatura en grados farenheit");
        far = captu.nextDouble();
        
        //capturamos la temperatura centigrados
        System.out.print("Temperatura en grados celtigrados");
        cent = captu.nextDouble();
        
        //CONVERCIONES DE LAS TEMPERATURAS
        cent = (far - 32) / 1.8;//convercion a centigrados
        far = (cent * 1.8) * 32;//CONVERTIMOS A FARENHEINT
        
        //IMPRIMIMOS EL RESULTADO
        System.out.println("°f = " + far);
        System.out.println("°c = " + cent);
    
        //convertimos celntigrados a kelvin
        
        System.out.print("celtigrados a kevin");
        cent2 = captu.nextDouble();
        
        kelv = (cent2 - 273.15);
        
        System.out.println("°k = " + kelv);       
    }
    
}
