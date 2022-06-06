import static java.lang.System.out;

public class PlaceToLive {
    private String address; //адрес
    private int numberOfBedrooms; //количество комнат
    private double area; //общая площадь помещения


    public void setAddress(String addressIn) {
        address = addressIn;
    }
    public String getAddress() {
        return address;
    }
    public void setNumberOfBedrooms(int numberOfBedroomsIn) {
        numberOfBedrooms = numberOfBedroomsIn;
    }
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }
    public void setArea(double areaIn) {
        area = areaIn;
    }
    public double getArea() {
        return area;
    }
    public double priceForMeter(double priceForRoom){
        return priceForRoom/area;
    } //цена за метр квадратный






}
