/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;

public class Sw {
    public static void main(String[]EjemploSw)
    {
        Scanner captura = new Scanner(System.in);
        int pregunta;//entrar al sw segun la opcion
        double total = 0,numero,numero1 = 0;
        System.out.println("para suma digite 1 ");
        System.out.println("para resta digite 2 ");
        System.out.println("para multiplicar 3 ");
        pregunta=captura.nextInt();
        System.out.println("digite el numero 1 ");
        numero= captura.nextInt();
        System.out.println("digite el numero 2");
        switch(pregunta)
        {
            case 1:
                total=numero+numero1;
                break;
            case 2:
                total=numero-numero1;
                break;
            case 3:
                total=numero*numero1;
                break;
            default:
                System.out.println("esa opcion no existe");
             
      }
        System.out.println("total es:  "+total);
        
    }          
          
    
}
