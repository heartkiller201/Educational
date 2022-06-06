import com.allmycode.dummiesframe.DummiesFrame;

public class FruitDepartmentWindow {
    public static void main (String arg[]) {
        DummiesFrame frame = new DummiesFrame("Расчет данных продуктов");
        frame.addRow("Название продукта");
        frame.addRow("Вес, граммы");
        frame.addRow("Цена за килограмм");
        frame.addRow("Количество порций");
        frame.addRow("Количесво каллорий в порции");
        frame.setButtonText("Подсчитать");
        frame.go();
    }
    public static String calculate(String name, int weight, double price, int portions, int calories){
        FoodProduct product = new FoodProduct();
        product.setType(name);
        product.setWeight(weight);
        product.setCalories(calories);
        product.setParts(portions);
        return product.getType() + ": Цена за 100 грамм: " + product.StoGramm(price) + "$ Цена одной порции: " +
                product.onePortionPrice(price) + "$ Общее количество калорий в каждой порции: " + product.caloriesPerProduct();



    }




}
