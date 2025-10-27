package eva2_24_ciclo_infinito;
import java.util.*;

public class EVA2_24_CICLO_INFINITO {
    final static String usuario = "root";
    final static String password = "admin";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user,pass;
        
        while(true){
            System.out.println("---Acceso al sistema---");
            System.out.println("Introduce Usuario: ");
            user = input.nextLine();
            System.out.println("Introduce contraseña: ");
            pass = input.nextLine();
            
            if(user.equals(usuario) && pass.equals(password)) 
                break;//Termina el ciclo
        }
        
        System.out.println("Bienvenido al sistema");
    }
}
