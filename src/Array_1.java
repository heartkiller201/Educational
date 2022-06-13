import com.allmycode.dummiesframe.DummiesFrame;
import static java.lang.System.out;

public class Array_1 {
    public static void main(String[] args) {

        DummiesFrame frame = new DummiesFrame("Количество жителей в комнате");
        frame.addRow("Введите номер комнаты");
        frame.setButtonText("Найти");
        frame.go();
    }


        public static String calculate(int room) {
            int guests[] = {3, 5, 1, 1, 2, 3, 4, 5};
            return "Количество жителей в " + room + " комнате: " + guests[room];


        }










}
