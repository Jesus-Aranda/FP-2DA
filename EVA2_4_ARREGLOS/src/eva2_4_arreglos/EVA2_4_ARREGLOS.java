package eva2_4_arreglos;
import java.util.*;

public class EVA2_4_ARREGLOS {

    public static void main(String[] args) {
        //Necesitas capturar los datos de un grupo
        //Arreglo ------> estructura de datos
        //Son identificador
        //Secuencia (consecutivas) de valores del mismo tipo
        
        Scanner input = new Scanner(System.in);
        int[] arreglo;//Crear el arreglo (Basicamente decir su tamaño)
        arreglo = new int[5];
        //int[] arreglo = new int[10]; <---- SIMPLIFICADO
        //Posiciones de los elementos de un arreglo:
        //Primer elemento --> 0 (cero)
        //Ultimo elemento --> tamaño del arreglo - 1
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
       
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        
        
        
        
        
                
    }
}
