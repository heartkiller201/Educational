public class FruitDepartment {
    public static void main (String arg[]){
        FoodProduct beans = new FoodProduct();
        FoodProduct ketchup = new FoodProduct();
        FoodProduct chocolate = new FoodProduct();

        beans.setType("Бобы в банке");
        beans.setWeight(300);
        beans.setCalories(550);
        beans.setParts(1);

        chocolate.setType("Шоколоад горький");
        chocolate.setWeight(100);
        chocolate.setCalories(200);
        chocolate.setParts(2);

        System.out.println(beans.getType());
System.out.println();
System.out.println("Цена за сто грамм: " + beans.StoGramm(10));
System.out.println("Цена одной порции: " + beans.onePortionPrice(10));
System.out.println("Каллорий в одной порции: " + beans.caloriesPerProduct());
        System.out.println();
        System.out.println(chocolate.getType());
        System.out.println();
        System.out.println("Цена за сто грамм: " + chocolate.StoGramm(10));
        System.out.println("Цена одной порции: " + chocolate.onePortionPrice(10));
        System.out.println("Каллорий в одной порции: " + chocolate.caloriesPerProduct());





    }



}
