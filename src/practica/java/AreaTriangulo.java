
package practica.java;

import java.util.Scanner;


public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" digite los lados a b y c del triangulo");
        double a = scanner.nextDouble();
        double b =scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double p = (a + b + c)/2; 
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        System.out.println(" El area del triangulo es " + area);
       
    }
}
