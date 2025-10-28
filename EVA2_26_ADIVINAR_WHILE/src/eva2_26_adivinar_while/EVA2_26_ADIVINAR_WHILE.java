package eva2_26_adivinar_while;
import java.util.*;

public class EVA2_26_ADIVINAR_WHILE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_machine,num_user = 0;
        System.out.println("Pienso en un numero entre el 0 y 4 (-1 para finalizar)");
        
        while(num_user != -1){
            num_machine = (int)(Math.random()*5);
            System.out.println("¿Cual numero es? : ");
            num_user = Integer.parseInt(input.nextLine());
            if(num_user == num_machine){System.out.println("Adivinaste");}
        }
        
    }
}
