package eva2_3_switch;
import java.util.*;

public class EVA2_3_SWITCH {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el dia");
        String valor = input.nextLine().toLowerCase().trim();
        
        switch(valor){
            case "lunes":
                System.out.println(2);
                break;
            case "martes":
                System.out.println(3);
                break;
            case "miercoles":
                System.out.println(4);
                break;
            case "jueves":
                System.out.println(5);
                break;
            case "viernes":
                System.out.println(6);
                break;
            case "sabado":
                System.out.println(7);
                break;
            case "domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("No existe ese dia de la semana");
   
        }
        /*double valorDouble = 5.5;
        switch(valorDouble){
            case 1.1:
                System.out.println("Valor 1.1");
                break;
            case 5.5:
                System.out.println("Valor 5.5");
                break;
        }
        */
    }
}
