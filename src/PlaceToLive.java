import static java.lang.System.out;

public class PlaceToLive {
    private String address;
    private int numberOfBedrooms;
    private double area;


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
    }






}
