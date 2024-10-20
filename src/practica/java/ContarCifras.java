

package practica.java;

import java.util.Scanner;


public class ContarCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un valor");
        int N = scanner.nextInt();
        
       if(N<10)
            System.out.println("tiene 1 cifra");
       else{
           if(N<100)
               System.out.println("tiene 2 cifras");
       else{
           if(N<1000)
               System.out.println("tiene 3 cifras");
      else{
           if(N<10000)
               System.out.println("tiene 4 cifras");
           }
         } 
       }
    }
}
