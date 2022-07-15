import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class ClothesFrameExtended extends JFrame {

    public ClothesFrameExtended() throws IOException {
        add(new JLabel(MensClothingItemExtended.house));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        MensClothingItemExtended item;
        int totalCost = 0;
        item = new MensClothingItemExtended("Дизайн Еремеевой", TypeOfClothes.БРЮКИ, Color.RED, 455);
        addItemInfo(item);
        totalCost += item.getCost();
        item = new MensClothingItemExtended("Дизайн Алексеева", TypeOfClothes.ПАЛЬТО, Color.BLUE, 45);
        addItemInfo(item);
        totalCost += item.getCost();
        item = new MensClothingItemExtended("Дизайн Симонова", TypeOfClothes.ГАЛСТУК, Color.GREEN, 655);
        addItemInfo(item);
        totalCost += item.getCost();
        item = new MensClothingItemExtended("Дизайн Третьяк", TypeOfClothes.ОБУВЬ, Color.GRAY, 633);
        addItemInfo(item);
        totalCost += item.getCost();
        item = new MensClothingItemExtended("Дизайн Ваномаса", TypeOfClothes.КУРТКА, Color.WHITE, 63);
        addItemInfo(item);
        totalCost += item.getCost();
        item = new MensClothingItemExtended("Дизайн Андера", TypeOfClothes.РУБАШКА, Color.BLACK, 103);
        addItemInfo(item);
        totalCost += item.getCost();
        add(new JLabel(String.valueOf(totalCost)));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));

        setTitle("Коллекции 2022");
        setLayout(new GridLayout(8, 4, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    void addItemInfo(MensClothingItemExtended item) {
        add(new JLabel(" " + item.getName()));
        add(new JLabel(String.valueOf(item.getKind())));
        add(new JLabel(String.valueOf(item.getColor())));
        add(new JLabel(String.valueOf(item.getCost())));
    }


}
