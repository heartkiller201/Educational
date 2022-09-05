import java.util.Scanner;

public class FirstExc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] words = new String[5];

        int i = 0;
        try {
            do {
                words[i] = keyboard.next();
            } while (!words[i++].equals("Выход"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Можно ввести не более 5 значений");
        }
            for (int j = 0; j < 5; j++) {
                try {
                    System.out.println(words[j].length());
                } catch (NullPointerException ee) {}
            }


        keyboard.close();
    }


}
