import com.allmycode.dummiesframe.DummiesFrame;
import static java.lang.System.out;

public class DisplayThePlacesWindow {
    public static void main(String[] args){
        DummiesFrame frame0 = new DummiesFrame("Стоимость жилья");
        frame0.addRow("Адрес");
        frame0.addRow("Количество комнат");
        frame0.addRow("Общая площадь");
        frame0.addRow("Общая стоимость");
        frame0.setButtonText("Подсчитать");
        frame0.go();
    }

        public static String calculate(String address, int countOfRooms, double area, double cost) {
            PlaceToLive place = new PlaceToLive();
            place.setAddress(address);
            place.setNumberOfBedrooms(countOfRooms);
            place.setArea(area);
            return "Адрес: " + place.getAddress() + " Стоимость квадратного метра:" + cost / place.getArea() +
                    " Стоимость спальни:" + cost / place.getNumberOfBedrooms();

        }











    }







