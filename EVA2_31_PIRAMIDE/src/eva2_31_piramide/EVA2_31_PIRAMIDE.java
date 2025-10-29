package eva2_31_piramide;
import java.util.*;

public class EVA2_31_PIRAMIDE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        System.out.println("Escribe la cantidad de * a escribir para la piramide:");
        valor = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= valor; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");    
            }            
            System.out.println();
        }
        
        for (int i = valor; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}
