package eva2_33_cuenta;
import java.util.*;


public class EVA2_33_CUENTA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, cuenta = 1000000;
        System.out.println("--Cuenta Bancaria--");
        System.out.println("Saldo disponible: 1000000");
        do{
            System.out.println("Introduce la cantidad a retirar: ");
            valor = Integer.parseInt(input.nextLine());
            cuenta = cuenta - valor;
            System.out.println("Nueva saldo: " + cuenta);
        }while((cuenta > 0));
    }
}
