public class House extends PlaceToLive {

    private double paymentIpotekaPerMonth;
    private double taxPerYear;


    public void setPaymentIpotekaPerMonth(double paymentIpotekaPerMonthIn){
        paymentIpotekaPerMonthIn = paymentIpotekaPerMonth;
    }
    public double getPaymentIpotekaPerMonth(){
        return paymentIpotekaPerMonth;
    }

    public void setTaxPerYear(double taxPerYearIn){
        taxPerYearIn = taxPerYear;
    }
    public double getTaxPerYear(){
        return taxPerYear;
    }
    public double wholePaymentPerMonth(){
        return paymentIpotekaPerMonth + taxPerYear / 12;
    }







}
