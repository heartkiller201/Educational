import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class ClothesFrame extends JFrame {

    public ClothesFrame() throws IOException {
        MensClothingItem item;
        item = new MensClothingItem("Дизайн Еремеевой", TypeOfClothes.БРЮКИ);
        addItemInfo(item);
        item = new MensClothingItem("Дизайн Алексеева", TypeOfClothes.ПАЛЬТО);
        addItemInfo(item);
        item = new MensClothingItem("Дизайн Симонова", TypeOfClothes.ГАЛСТУК);
        addItemInfo(item);
        item = new MensClothingItem("Дизайн Третьяк", TypeOfClothes.ОБУВЬ);
        addItemInfo(item);
        item = new MensClothingItem("Дизайн Ваномаса", TypeOfClothes.КУРТКА);
        addItemInfo(item);
        item = new MensClothingItem("Дизайн Андера", TypeOfClothes.РУБАШКА);
        addItemInfo(item);
        setTitle("Коллекции 2022");
        setLayout(new GridLayout(6, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }




        void addItemInfo(MensClothingItem item) {
            add(new JLabel(" " + item.getName()));
            add(new JLabel(String.valueOf(item.getKind())));

        }



        ;







}
