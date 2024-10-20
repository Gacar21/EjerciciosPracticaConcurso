
package practica.java;

import java.util.Scanner;


public class CantidaddeVocales {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println(" ingrese una palabra ");
     String palabra = scanner.nextLine();
     char vocales;
     int count = 0;
     int i;
    
     
     for(i=0;i<palabra.length();i++){
        vocales = Character.toLowerCase(palabra.charAt(i));
        if(vocales == 'a' || vocales ==  'e' ||vocales ==  'i' ||vocales ==  'o' ||vocales ==  'u'){
            count++;
        }
        
     }
        System.out.println("Cantidad de vocales: " + count); 
     
    }
 
    
    
}
