public class ApartmentWithFees extends Apartment{
    private double feesPerQuarter;

    public void setFeesPerQuarter (double feesPerQuarterIn){
        feesPerQuarter = feesPerQuarterIn;
    }
    public double getFeesPerQuarter (){
        return feesPerQuarter;
    }
    public double paymentWithFeesPerMonth(){
        return getRentPerMonth() + feesPerQuarter / 3;
    }

}
