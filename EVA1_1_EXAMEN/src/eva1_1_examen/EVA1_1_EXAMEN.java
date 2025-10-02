package eva1_1_examen;
import java.util.*;

public class EVA1_1_EXAMEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time_na,time_ci,time_ca,resu;
        
        System.out.println("Escribe el primer tiempo en minutos (Natacion)");
        time_na = Integer.parseInt(input.nextLine().trim());
        
        System.out.println("Escribe el primer tiempo en minutos (Ciclismo)");
        time_ci = Integer.parseInt(input.nextLine().trim());
        
        System.out.println("Escribe el primer tiempo en minutos (Carrera)");
        time_ca = Integer.parseInt(input.nextLine().trim());
        
        resu = time_na + time_ca + time_ci;
        if(time_na >= 0 && time_ci >= 0 && time_ca >= 0){
            if(resu < 120 && time_na < 60 && time_ci < 60 && time_ca < 60 ){
                System.out.println("Calificacion:\nExcelente");
            }else if(resu < 150 || time_na < 70 && time_ci < 70 && time_ca < 70 ){
                System.out.println("Calificacion:\nBuena");
            }else{
                System.out.println("Calificacion:\nRegular");
            }
          
        }else{
            System.out.println("No se aceptan valores negativos");
        }
    }
}
