
package practica.java;

import java.util.Scanner;


public class Entre09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = scanner.nextInt();
        
       if(numero >= 0 && numero <= 9)
            System.out.println("el numero esta entre el 0 y el 9");
       else 
            System.out.println("el numero no esta entre el 0 y el 9");
        
    }

}
            

