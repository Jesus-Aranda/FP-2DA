package eva2_28_buscar;
import java.util.*;

public class EVA2_28_BUSCAR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valores[] = new int[10];
        int answear_user;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print("(" + valores[i] + ")");
        }
        System.out.println();
        System.out.println("Escribe el valor a buscar");
        answear_user = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < valores.length; i++) {
            if(answear_user == valores[i]){
                System.out.println("Valor encontrado");
                System.out.println("Posicion " + i);
                break;
            }
        }
    }
}
