package eva2_20_do_while;
import java.util.*;

public class EVA2_20_DO_WHILE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("<-----Menu Principal----->");
            System.out.println("Escribe la opcion: ");
            System.out.println("1. Pedidos \n2. Proveedores\n3. Facturacion\n4. Salir");
            opcion = Integer.parseInt(input.nextLine().trim());
            
            switch(opcion){
                case 1:
                    System.out.println("Pedidos del sistema!!");
                    break;
                case 2:
                    System.out.println("Proveedores del sistema");
                    break;
                case 3:
                    System.out.println("Facturacion del sistema");
                    break;
            }
        }while(opcion != 4);
        System.out.println("Finalizando programa");
    }
}
