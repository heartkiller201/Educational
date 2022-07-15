import java.awt.*;

public class MensClothingItemExtended extends MensClothingItem{
    public static String house = "Дом моды Минск";
    private Color color;
    private int cost;


    public MensClothingItemExtended(String name,TypeOfClothes kind, Color color, int cost) {
        super(name, kind);
        this.color = color;
        this.cost = cost;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public Color getColor(){
        return color;
    }
    public int getCost(){
        return cost;
    }



}
