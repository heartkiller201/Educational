import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class while_ {
    public static void main(String args[]) {
            Scanner keyboard = new Scanner(System.in);

            int numGuesses = 0;
            int randomNumber = new Random().nextInt(100) + 1;

            out.println("       ************         ");
            out.println("Welcome to the Guessing Game");
            out.println("       ************         ");
            out.println();

            out.print("Enter an int from 1 to 100: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            out.println();
            out.println("Try again...");
            out.print("Enter an int from 1 to 100: ");
            if (inputNumber < randomNumber )
                out.print("Ввведите большее число");
            else {out.print("Ввведите меньшее число");}
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }

        out.print("You win after ");
        out.println(numGuesses + " guesses.");

        keyboard.close();
    }


















}
