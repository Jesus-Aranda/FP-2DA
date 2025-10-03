package eva2_6_inicializar;
import java.util.*;


public class EVA2_6_INICIALIZAR {

    public static void main(String[] args) {
        String diaSemana[] = {"Domingo","Lunes","Martes",
            "Miercoles","Jueves","Viernes",
            "Sabado",};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el numero del dia de la semana (1-7)");
        int day = Integer.parseInt(input.nextLine().trim());
        if(day <= 7 && day >= 1){
            day = day - 1;
            System.out.println(diaSemana[day]);
        }else{
            System.out.println("No existe un dia en ese numero");
    }
    }
}
