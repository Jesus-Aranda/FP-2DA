package eva2_15_captura_datos;
import java.util.*;

public class EVA2_15_CAPTURA_DATOS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamaño;
        double sumCalif = 0;
        System.out.println("Escribe la cantidad de calificaciones a capturar:");
        tamaño = Integer.parseInt(input.nextLine().trim());
        int[] calif = new int[tamaño];
        for (int i = 0; i < calif.length; i++) {
            System.out.println((i+1) +".- Calificacion:");
            calif[i] = Integer.parseInt(input.nextLine().trim());
        }
        System.out.println("Calificaciones capturadas:");
        for (int i = 0; i < calif.length; i++) {System.out.println((i+1) + " calificacion ---> "+calif[i]);}
        
        //Promedio del grupo
        for (int i = 0; i < calif.length; i++) {sumCalif = sumCalif + calif[i];}
        
        System.out.println("Valor total de calificaciones: " + sumCalif);
        sumCalif = sumCalif / calif.length;
        System.out.println("Promedio Grupal: " + sumCalif);
        }
}
