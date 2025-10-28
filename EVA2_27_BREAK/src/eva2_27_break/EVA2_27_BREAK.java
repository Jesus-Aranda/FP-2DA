package eva2_27_break;
import java.util.*;

public class EVA2_27_BREAK {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_machine,num_user;
        System.out.println("Pienso en un numero entre el 0 y 4 (-1 para finalizar)");
        do{
            num_machine = (int)(Math.random()*5);
            System.out.println("¿Cual numero es? : ");
            num_user = Integer.parseInt(input.nextLine());
            if(num_user == num_machine) 
                System.out.println("Adivinaste");
            else if(num_user == -1){
                System.out.println("Gracias por jugar");
                break;
            }else
                System.out.println("No adivinaste");
            
        }while(true);
   
    }
}
