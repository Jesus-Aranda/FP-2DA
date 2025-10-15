package eva2_19_tic_tac_toe;
import java.util.*;

public class EVA2_19_TIC_TAC_TOE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fila, col, player;
        int tictac[][] = new int[3][3];
        for (int i = 0; i < 10; i++) {
            System.out.println("Itroduce tu jugada: (Fila)");
            fila = Integer.parseInt(input.nextLine().trim());
            System.out.println("Itroduce tu jugada: (Columna)");
            col = Integer.parseInt(input.nextLine().trim());
            System.out.println("Jugador 1 o 2");
            player = Integer.parseInt(input.nextLine().trim());
            tictac[fila][col] = player;
            
            
        }
        for (int i = 0; i < tictac.length; i++) {
            for (int j = 0; j < tictac[i].length ; j++) {
                System.out.print(tictac[i][j]);
            }
            System.out.println();
        }
        
    }
}
