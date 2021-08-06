/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

public class EjemplosSw {
    public static void main (String[]EjemplosSw)
    {
        Scanner captura = new Scanner(System.in);
        String pregunta;//entrar al sw segun la opcion 
      double total=0;
        System.out.println(" a");
        System.out.println("para resta digite b");
        System.out.println("para multiplicar digite c");
        pregunta=captura.next();
     
        switch(pregunta)
        {
            case"a" :
                total=(3+4);
                break;
            case "b":
                total=(3-4);
                break;
            case "C":
                total=(3*4);
                break;
             default:
                 System.out.println(" error");
                
        }    
        
        System.out.println("el resultado es"+total);
        
    }
   
 
    

    
}
            

