package eva2_32_factorial;
import java.util.*;

public class EVA2_32_FACTORIAL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor,resu = 1;
        System.out.println("Escribe el numero que a sacar su factorial: ");
        valor = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= valor; i++) {
            resu = resu * i;
        }
        System.out.println("El resultado es: " + resu);
        
    }
}
