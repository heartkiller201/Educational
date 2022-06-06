import java.util.Scanner;
import static java.lang.System.out;

public class while_2 {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Введите число: ");
        int inputNumber = keyboard.nextInt();
        int largest = 0;
        while (inputNumber > 0) {
            if (inputNumber > largest) {largest = inputNumber;}
            out.println("Введите другое число: ");
            inputNumber = keyboard.nextInt();
        }
        out.println(largest);
       keyboard.close();
    }
}
