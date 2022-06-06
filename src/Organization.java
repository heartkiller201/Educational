public class Organization {
    String name;
    double profit;
    boolean commercial;

    public void setName(String n){
        if (!n.equals("")){
            name = n;
        }
    }
    public String getName(){
        return name;
    }
    public void setProfit(double p){
        if (p > 0){
            profit = p;
        }
    }
    public double getProfit(){
        return profit;
    }
    public void setCommercial(boolean c){
            commercial = c;
    }
    public boolean getCommercial(){
        return commercial;
    }

    public double vat(){
        if (commercial == true) {
            return 10 * profit / 100;
        } else {
            return 2 * profit / 100;
        }
    }




    public double tax(double percentageTax) {
            return percentageTax * profit / 100;
    }

    }




