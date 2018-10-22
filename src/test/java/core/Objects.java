package core;

import java.util.Scanner;

public class Objects {

    private String a, b, c, d, e, f;

    public static void main(String[] args) {
        Objects objects = new Objects();
        objects.takeInputFromUserAndTellAJoke();
    }

    private void takeInputFromUserAndTellAJoke() {

        final String userInput;
        final Scanner scan = new Scanner(System.in);
        userInput = scan.nextLine().toUpperCase();
        for (int i = 0; i < userInput.length(); i++) {

            switch (userInput.charAt(i)) {
                case ' ':
                    System.out.print(" ");
                    break;
                case 'A':
                    System.out.print("Mistrzem świata i okolic ");
                    break;
                case 'B':
                    System.out.print("zupełnie nie potrzebnie ");
                    break;

            }

        }
    }
}
