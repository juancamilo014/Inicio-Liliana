
package ejemplociclo1;
import java.util.Scanner;
public class ejemplociclo1 {
    public static void main(String[] ciclo1) {
        
     Scanner entrada=new Scanner(System.in);
     double n=0,media=0,conta=0,i=0;
        System.out.println("por favor ingrese un nuemero");
        n=entrada.nextDouble();
        while (n>=0){
         
         media=media+n;
         conta=conta+1;
            System.out.println("por favor ingrese un numero");
         n=entrada.nextDouble();
        }
        i=media/conta;
        System.out.println("la media es: "+i);
    }
        
    }
        
    

