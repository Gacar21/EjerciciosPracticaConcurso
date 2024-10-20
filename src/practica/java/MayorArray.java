
package practica.java;


public class MayorArray {
    public static void main(String[] args) {
        
        int Numeros[] = { 2, 5, 6, 3, 43, 41};
        int mayor = 0, menor = 41;
        
        for (int i = 0; i < Numeros.length; i++) {
            if(Numeros[i] > mayor){
                mayor = Numeros[i];
                
            }
            
            if(Numeros[i]<menor){
                menor = Numeros[i];
                
         
            }
       }
        System.out.println(mayor);
        System.out.println(menor); 
    }
 }

