
package vector;

import java.util.Scanner;


public class Vector {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int []vector= new int [50];
        int i, n, suma=0, cont=0, mayor=0;
        System.out.println("Digite el tamaño del vector");
        n = leer.nextInt();
        for ( i = 0; i < n; i++) {
            System.out.println("Digite posición "+i+" del Vector ");
            vector[i]=leer.nextInt();
            if (vector[i]%2==0) {
                cont++;
            }
            if (vector[i]>=10 && vector[i]<=30) {
                mayor++;
            }
            suma = suma + vector[i];
        }
        System.out.println("el promedio total es: "+ suma/n);
        System.out.println("los pares de vectores son "+cont);
        System.out.println("el numero de mayores a 10 es: "+mayor);
    }
    
}
