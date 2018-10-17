package core;

public class TabliczkaMnożeniaExecutor {



    public static void main(String[] args) {
        TabliczkaMnożenia tb = new TabliczkaMnożenia();
        tb.mnóż(10, 10);
    }


}

class TabliczkaMnożenia {

    void mnóż(int a, int b) {

        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int y = 1; y <= b; y++) {
                System.out.print(i + " * " + y + " = " + i * y + " || ");
            }
        }
    }
}
