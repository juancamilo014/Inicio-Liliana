/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author SENA
 */
import java.util.Scanner;
public class  EjemMCD {
    public static void main(String[] MCDejemplo){
        int numero1, numero2, numero3, numero4;
        Scanner entrada= new Scanner (System.in);
         System.out.println("digite numero1");
        numero1=entrada.nextInt();
         System.out.println("digite numero2");
        numero2=entrada.nextInt();
         System.out.println("digite numero3");
        numero3=entrada.nextInt();
         System.out.println("digite numero4");
        numero4=entrada.nextInt();
        int ResulMCD=MCDFuncion (numero1, numero2, numero3, numero4);
        System.out.println("MCD es;"+ResulMCD);
   
       }
    private static int MCDFuncion(int numero1f,int numero2f,int numero3f,int numero4f)
    {
       int MCD=1, cont=2;
       while(cont <= numero1f && cont <=numero2f && cont <= numero3f && cont <= numero4f)
       {
        while((numero1f % cont)==0 && (numero2f % cont)==0 && (numero3f % cont)==0 && (numero4f % cont)==0)
        {
          
           MCD=MCD*cont;
           numero1f=numero1f/cont;
           numero2f=numero1f/cont;
           numero3f=numero1f/cont;
           numero2f=numero1f/cont;
           
         }        
           cont=cont+1;      
       }
       
       
           
               return MCD;
            }

}