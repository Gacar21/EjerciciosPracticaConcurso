
package practica.java;
    
import java.util.Scanner;


public class PositivoNegativo {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un valor");
        int N = scanner.nextInt();
        
        if(N>0)
            System.out.println("es positivo");
        else 
            System.out.println("no es positivo");
    
    }
}
