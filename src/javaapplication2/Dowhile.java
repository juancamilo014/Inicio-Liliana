/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


import java.util.Scanner;

public class Dowhile {
    public static void main (String[] ejeDo)
    {
      Scanner entrada= new Scanner(System.in);//extencion objeto
      int opcion;
      System.out.println("digite 's' si desea continuar el programa");
      System.out.println("digite 'n' si no desea continuar");
   opcion=0;
       do{
           System.out.println("quieres para el desayuno arepa, quesito y buñuelo "+opcion);
            // opcion = entrada.next().charAt(0);
             opcion++;
       }while(opcion <=0);
       
      
       }
    
}
