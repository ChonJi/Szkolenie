package core;

import java.util.Scanner;

public class Objects {

    public static void main(String[] args) {
        Objects objects = new Objects();
        objects.takeInputFromUserAndTellAJoke();
    }

    /**
     * Changes single char typed by user to a different String and prints the sentence
     */
    private void takeInputFromUserAndTellAJoke() {

        final String userInput;
        final Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię i nazwisko a poznasz swoją wróżbę:");
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
