public class FoodProduct {
   private String type;
   private int weight;
   private int parts;
   private int calories;

   public void setType(String t) {
       if (!t.equals("")) {
           type = t;
       }
   }
   public String getType() {
       return type;
   }
    public void setWeight(int w) {
        if (w > 0) {
            weight = w;
        }
    }
    public int getWeight() {
        return weight;
    }
    public void setParts(int p) {
        if (p > 0) {
            parts = p;
        }
    }
    public int getParts() {
        return parts;
    }
    public void setCalories(int c) {
        if (c > 0) {
            calories = c;
        }
    }
    public int getCalories() {
        return calories;
    }




      public void display() {
      System.out.print("Продукт " + type);
      System.out.print(" имеет вес " + weight + " грамм ");
      System.out.print("состоит из " + parts + " частей ");
      System.out.print("и имеет " + calories + " каллороий.");


    };
    public double StoGramm(double priceKg){
        return weight*priceKg/1000;
    }
    public double onePortionPrice(double priceKg){
        return weight/parts*priceKg/1000;
    }
    public double caloriesPerProduct(){
        return calories/parts;
    }



}
