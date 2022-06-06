import static java.lang.System.getProperties;
import static java.lang.System.out;
import java.util.Scanner;


public class switch_ {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Какой месяц интересует?");
        String month = keyboard.next();
        int days = 0;

        switch (month) {
            case "Январь":
            case "Апрель":
            case "Июнь":
            case "Сентябрь":
            case "Ноябрь":
                days = 30;
                break;

            case "Февраль":
                days = 28;
                break;
            case "Март":
            case "Май":
            case "Июль":
            case "Август":
            case "Октябрь":
            case "Декабрь":
                days = 31;
                break;
            default:
                out.println("Вы не ввели название месяца или есть ошибка" );
                break;

        }
        out.println("Високосный год?");
        String vyear = keyboard.next();
        if (month.equals("Февраль") && vyear.equals("Да")); {
            days = 29;
        }
        out.println("Количество дней в месяце " + days);
        keyboard.close();







    }


}
