package eva2_10_for;
import java.util.*;

public class EVA2_10_FOR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Imprimir del 1 - 20
        for (int i = 1; i <= 20; i++){System.out.print(i + " - ");}
        System.out.println();
        //Alreves del 20 - 1
        for (int i = 20; i >= 1; i--){System.out.print(i + " - ");}            
        System.out.println();
        //Imprimir los pares de 0 - 100
        // 0 - 2 - 4 - 6 - 8 ... 98 - 100
        // +=, -=, *=, /=
        for (int i = 0; i <= 100; i +=2) {System.out.print(i + " - ");}
        System.out.println();
        //Alreves del 100 - 0 de 2 en 2
        for (int i = 100; i >= 0; i-=2) {System.out.print(i + " - ");}
        System.out.println();
        //Solicitar dos numeros al usuario, imprimir la lista entre esos numeros
        // -3 y 3 ---> -3 -2 -1 0 1 2 3
        //Imprimir alreves tambien
        int num1,num2;
        System.out.println("Escribe un el primer numero:");
        num1 = Integer.parseInt(input.nextLine().trim());
        System.out.println("Escribe el segundo numero:");
        num2 = Integer.parseInt(input.nextLine().trim());
        if(num2 > num1){
            for (int i = num1; i <= num2; i++){System.out.print(i + " ");}
            System.out.println();
            for (int i = num2; i >= num1; i--){System.out.print(i + " ");}
            System.out.println();
        }else if(num1 > num2){
            for(int i = num1; i >= num2; i--){System.out.print(i + " ");}
            System.out.println();
            for(int i = num2; i <= num1; i++){System.out.print(i + " ");}
            System.out.println();
        }else{System.out.println("Los numeros son iguales, no existe un cadena numerica");}
    }
}
