package eva2_12_tabla_mult;
import java.util.*;

public class EVA2_12_TABLA_MULT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el numero que quieres saber su tabla de multiplicar:");
        long answear = Integer.parseInt(input.nextLine().trim());
        for (int i = 1; i <= 10; i++){System.out.println(answear + " * " + i + " = " + i*answear);}
    }
}
