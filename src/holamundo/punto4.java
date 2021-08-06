

package holamundo;
import java.util.Scanner;
public class punto4 {
    public static void main(String [] punto4){
    
    //String nombre1= "" ,nombre2="" ,nombre3="";
    String nombre1, nombre2, nombre3;
    int edad1,edad2,edad3;
    //int nombre, edadmenor;
    Scanner entrada= new Scanner (System.in);
    
        System.out.println("nombre1" );  
        nombre1=entrada.next();
        System.out.println("nombre2");
        nombre2=entrada.next();
        System.out.println("nombre3");
        nombre3=entrada.next();
        System.out.println("edad1");
        edad1=entrada.nextInt();
        System.out.println("edad2");
        edad2=entrada.nextInt();
        System.out.println("edad3");
        edad3=entrada.nextInt();
        if(edad1<edad2) {
        if(edad1<edad3){
        System.out.println("la persona de menor edad es:"+ nombre1+ edad1);
       
     }  else {
            System.out.println("la persona de menor edad es:"+ nombre3 +edad3);
    }
       }else if (edad2<edad3) {
       System.out.println("la persona de menor edad es:"+ nombre2 +edad2);
       }else {
       System.out.println("la persona de menor edad es:"+ nombre3 +edad3);
       }
    }
}


   


    
    

