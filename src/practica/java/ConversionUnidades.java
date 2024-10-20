
package practica.java;

import java.util.Scanner;


public class ConversionUnidades {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese la velocidad en KM/H");
         double VeloK = scanner.nextDouble();
         System.out.println("Velocidad Ingresada es " + VeloK + "km/h");
         
         double VeloM = (VeloK*1000)/3600;
         System.out.println(" velocidad en Metros/segundos es " + VeloM + "m/s");
    
     }
}
