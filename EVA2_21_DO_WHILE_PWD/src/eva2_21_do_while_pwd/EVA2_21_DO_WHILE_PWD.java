package eva2_21_do_while_pwd;
import java.util.*;

public class EVA2_21_DO_WHILE_PWD {
    final static String usuario = "root";
    final static String password = "admin";
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user,pass;
        
        do{
            System.out.println("---Acceso al sistema---");
            System.out.println("Introduce Usuario: ");
            user = input.nextLine();
            System.out.println("Introduce contraseña: ");
            pass = input.nextLine();
            
        }while(!(user.equals(usuario) && pass.equals(password)));
        
        System.out.println("Bienvenido al sistema");
        
        
        
    }
}
