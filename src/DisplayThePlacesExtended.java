import static java.lang.System.out;

public class DisplayThePlacesExtended {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setAddress("проспект Независимости, 44");
        house1.setNumberOfBedrooms(4);
        house1.setArea(132);
        house1.setPaymentIpotekaPerMonth(290);
        house1.setTaxPerYear(120);
        double cost1 = house1.wholePaymentPerMonth();

        out.println("Общая стоимость за метр квадратный " + house1.getAddress() + ": " + cost1 / house1.getArea());
        out.println("Стоимость за комнату: " + (cost1 / house1.getNumberOfBedrooms()));

    }

}
