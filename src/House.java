//дочерний класс который описывает постройки типа Частный Дом

public class House extends PlaceToLive {

    private double paymentIpotekaPerMonth;  //оплата за ипотеку в месяц
    private double taxPerYear; //налог в год


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
    } //Оплата в месяц за все платежи (ипотека + налог)







}
