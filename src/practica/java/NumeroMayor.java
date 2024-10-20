
package practica.java;

import java.util.Scanner;


public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 3 valores distintos");
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int v3 = scanner.nextInt();
        
        if(v1 > v2)
            if(v1>v3)
                System.out.println("el numero mayor es "+ v1);
            else 
                System.out.println("el numero mayor es "+ v3);
        else if(v2>v3)
            System.out.println("ek mayor es "+ v2);
        else 
            System.out.println("el mayor es " + v3);
    }
}
