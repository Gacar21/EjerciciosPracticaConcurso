
package practica.java;

import java.util.Scanner;


public class OrdenarMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese valor1 y valor2");
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        if (v1>v2)
            System.out.println(v1 + " " + " " +  v2);
        else 
            System.out.println(v2 + " " + " " + v1);
               
        
        /* if(v1>v2 && v2>v3
            print v1 v2 v3 
        else 
        if (v1>v2 %% v3 > v2
            print v1 + v2 + v3
        
        
        
        */
    }
}
