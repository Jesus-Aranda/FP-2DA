package eva2_2_switch;
import java.util.*;

public class EVA2_2_SWITCH {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce dia de la semana en numero (1-7)");
        short dia = Short.parseShort(input.nextLine().trim());
        
        switch(dia){
            case 1:
                System.out.println("Es Domingo");
                break;
            case 2:
                System.out.println("Es Lunes");
                break;
            case 3:
                System.out.println("Es Martes");
                break;
            case 4:
                System.out.println("Es Miercoles");
                break;
            case 5:
                System.out.println("Es Jueves");
                break;
            case 6:
                System.out.println("Es Viernes");
                break;
            case 7:
                System.out.println("Es Sabado");
                break;
            default:
                System.out.println("No existe ese dia de la semana");
        }
    }
}
