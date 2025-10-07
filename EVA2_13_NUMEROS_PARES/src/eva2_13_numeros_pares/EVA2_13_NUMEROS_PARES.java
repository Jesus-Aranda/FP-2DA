package eva2_13_numeros_pares;
import java.util.*;

public class EVA2_13_NUMEROS_PARES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //3 - 50 pares
        int num1,num2;
        System.out.println("Escribe el primer termino:");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Escribe el segundo terminos");
        num2 = Integer.parseInt(input.nextLine());
        
        if(num1 < num2){
            for (int i = num1; i <= num2; i++) 
                if(i % 2 == 0){
                    System.out.print(i + " ");}
                System.out.println();
            
            for(int i = num2; i >= num1; i--)
                if(i % 2 == 0){
                    System.out.print(i + " ");}
                System.out.println();
                
        }else if(num1 > num2){
            for(int i = num1; i >= num2; i--)
                if(i % 2 == 0){
                    System.out.print(i + " ");}
                System.out.println();
                
            for (int i = num2; i <= num1; i++) 
                if(i % 2 == 0){
                    System.out.print(i + " ");}
                System.out.println();
                
            
                
        }else{System.out.println("Son iguales no existe la cadena numerica");}
    }
}
