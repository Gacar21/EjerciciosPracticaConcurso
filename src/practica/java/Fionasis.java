
package practica.java;




public class Fionasis {
    public static void main(String[] args) {
      int N = 0;
      int N2 =1;
      int Cont = 0;
      
      for(int i = 2; i < 15; i++){
          Cont = N + N2;
          
          N = N2;
          N2 = Cont;
          
          System.out.println(Cont);
      }
        
      
        
    }
}
