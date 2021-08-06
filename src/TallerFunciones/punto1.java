
 
package TallerFunpunto1;

import java.util.Scanner;
public class punto1 {
    public static void main(String[] punto1) {
        Scanner entrada= new Scanner(System.in);
        
        int numero1,numero2,numero3;
        
        System.out.println("ingresa el primer numero");
        numero1=entrada.nextInt();
        System.out.println("ingresa el segundo numero");
        numero2=entrada.nextInt();
        System.out.println("ingresa el tercer numero");
        numero3=entrada.nextInt();
       
        
        Promedio(numero1,numero2,numero3);
      
        
    }
    
    private static void Promedio(int a, int b, int c){
     double Total;
     Total= (a+b+c)/3;
        System.out.println("El promedio de los numero es"+ Total);
    }

        
    }
    
    
   

