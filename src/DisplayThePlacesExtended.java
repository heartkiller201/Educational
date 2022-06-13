//отображение данных о домах

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

        Apartment flat1 = new Apartment();
        flat1.setAddress("улица Сурганова, дом 6");
        flat1.setNumberOfBedrooms(2);
        flat1.setArea(78);
        flat1.setRentPerMonth(400);
        out.println("Общая стоимость за метр квадратный " + flat1.getAddress() + ": " + flat1.getRentPerMonth() / flat1.getArea());
        out.println("Стоимость за комнату: " + flat1.getRentPerMonth() / flat1.getNumberOfBedrooms());

        ApartmentWithFees houseFees1 = new ApartmentWithFees();
        houseFees1.setAddress("ул, Наконечникова, дом 88");
        houseFees1.setArea(44);
        houseFees1.setNumberOfBedrooms(1);
        houseFees1.setRentPerMonth(580);
        houseFees1.setFeesPerQuarter(112);
        out.println("Общая стоимость за метр квадратный с учетом сборов для " + houseFees1.getAddress() + ": " +
                houseFees1.paymentWithFeesPerMonth() / houseFees1.getArea());
        out.println("Стоимость за комнату c учетом сборов: " + houseFees1.paymentWithFeesPerMonth() / houseFees1.getNumberOfBedrooms());




    }

}
