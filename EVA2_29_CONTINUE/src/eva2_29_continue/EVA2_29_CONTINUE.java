package eva2_29_continue;


public class EVA2_29_CONTINUE {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int resi = i % 2;
            if(resi != 0)
                continue;
            System.out.print(i + " - ");
        }
        System.out.println();
    }
}
