import java.util.*;
public class App {
    
    public static void suma(int n1,int n2){
        
        int total=n1+n2;
        System.out.println("La suma es: "+total);
        
    }
    public static void resta(int n1,int n2){
        
        int total=n1-n2;
        System.out.println("La suma es: "+total);
        
    }
    //COMENTARIO
    public static void main(String[] args) throws Exception {
        Scanner escaner = new Scanner(System.in);
        int opcion = escaner.nextInt();
        System.out.println("hey");
        switch (opcion){
            case 1:
                System.out.println("Ingrese los números que quiera sumar");
                int n1 = escaner.nextInt();
                int n2 = escaner.nextInt();
                suma(n1,n2);
                break;
        }
    }
}
