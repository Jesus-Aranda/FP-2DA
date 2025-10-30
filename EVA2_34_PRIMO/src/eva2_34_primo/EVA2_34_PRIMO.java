package eva2_34_primo;
import java.util.*;

public class EVA2_34_PRIMO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor,residuo;
        System.out.println("Introduce un numero: ");
        valor = Integer.parseInt(input.nextLine());
        
        for (int i = 2; i <= valor; i++) {
            residuo = valor % i;
            if(residuo == 0 && i == valor)
                System.out.println("El numero es primo\nSolo se puede dividir entre: " + i + " y 1");
            else if(residuo == 0){
                System.out.println("El numero no es primo\nSe puede dividir entre: " + i);
                break;
            }
        }
    }
}
