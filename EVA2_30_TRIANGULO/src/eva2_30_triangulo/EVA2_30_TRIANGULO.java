package eva2_30_triangulo;
import java.util.*;

public class EVA2_30_TRIANGULO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        System.out.println("Escribe la cantidad de * a escribir: ");
        valor = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= valor; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
