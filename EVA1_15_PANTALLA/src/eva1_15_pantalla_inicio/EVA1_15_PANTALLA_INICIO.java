/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_15_PANTALLA_INICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Constantes
        final String USUARIO = "Admin";
        final String CONTRASEÑA = "Admin";
        //final double PI = 3.1416;, ejemplo para que no modifiquen el pi
        
        String Usuario, Contraseña, usua, cont;
        Scanner captu = new Scanner(System.in);
        System.out.println("Usuario");
        usua = captu.nextLine();
        System.out.println("Contraseña");
        cont = captu.nextLine();
        // COMO VALIDAMOS EL ACCESO?
        if(usua.equals(USUARIO) && cont.equals(CONTRASEÑA))
            System.out.println("BIENBENIDO");
        else
            System.out.println("DENEGADOA");
        

                
    }
    
}
