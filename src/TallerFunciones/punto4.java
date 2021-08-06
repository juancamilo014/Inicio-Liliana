//Diseñar una función que encuentre el mayor de dos números enteros.

package TallerFunciones;

import java.util.Scanner;

public class punto4 {
    
    public static void main(String[] punto4) {
        Scanner entrada=new Scanner (System.in);
        int numero1,numero2;
        
        System.out.println("digite el numero 1");
        numero1=entrada.nextInt();
        System.out.println("digite el numero 2");
        numero2=entrada.nextInt();
        System.out.println("el numero mayor es:" + mayor(numero1,numero2));
    }
    private static int mayor (int a, int b){
        int numeroMayor=0;
         
        if (a>b){
            numeroMayor=a;
        }
        else if (a==b){
                System.out.println("los numeros son iguales");
                
        } else
            numeroMayor=b;
       
        
        return numeroMayor;
                
            }
        }
        
        
    
    

