/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMETICAS
        int x = 10;//declaracion y asignacion
        int y = 5;
        //DECLARACION DE MULTIPLES VARIABLES DEL MISMO TIPO
        int suma, resta, divi, multi, pot, raiz;
        //suma y resta
        suma = x + y;//OPERASION DE SUMA
        System.out.print("Suma de x + y");
        System.out.print(suma);
        
        //resta
        resta = x - y;//OPERASION DE RESTA
        System.out.print("Resta de x - y");
        System.out.print(resta);
        
        //MULTIPLICACION
        multi = x * y;//OPERASION DE MULTIPLICACION
        System.out.print("Multiplicacion de x * y");
        System.out.print(multi);
        
        //DIVICION 
        //SI DIVIDIMOS ENTEROS, JAVA COMO RESULTADO DA DECIMALES Y NO SE PUEDE
        divi = x / y;//OPERASION DE DIVISION
        System.out.print("divicion de x(10) / y(5)");
        System.out.print(divi);
        
        //OTRA OPERACION
        x = 7;
        y = 3;
        divi = x / y;
        System.out.print("divicion de x(7) / y(3)");
        System.out.print(divi);
        
        double val1 = 11;
        double val2 = 3;
        double diviD;
        diviD = val1 / val2;
        System.out.print("divicion entre decimales");
         System.out.print(diviD);
    }
    
}
