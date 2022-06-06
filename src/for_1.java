import java.util.Scanner;

import static java.lang.System.out;

public class for_1 {
   public static void main (String args[]) {
     /*    for (int i = 0, j = 10; i < j; i++, j--) {
            out.println(i + " " + j);
        }

    int total = 0;
    for (int i = 0; i < 10; i++) {
        total += i;
    }
    out.println(total);

       Scanner keyboard = new Scanner(System.in);
       out.println("Введите число");
       int n = keyboard.nextInt();
       int k = 1;
       for (int i = 1; i <= n; i++) {
           k *= i;
       }
       out.println(n + " факториал будет равен " + k);
       keyboard.close();

       for (int i = 0; i<=2; i++) {
           for (int row = 0; row < 5; row++) {
               for (int column = 0; column <= row; column++) {
                   out.print("*");
               }
               out.println();

           }
           out.println();
       }    */

       Scanner keyboard = new Scanner(System.in);
       while (true) {
           out.print("Введите цифру");
           int i = keyboard.nextInt();
           if (i > 10) {
               continue;
           }
           if (i == 0) {
               break;
           }
           out.println(i);
       }
       out.println("Готово");
       keyboard.close();







       }

















}
