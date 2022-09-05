public class Square extends Shape{

    public Square (int size) {
        super(size);
    }

    @Override
    public void show() {
        System.out.println("--------------");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println("--------------");


    }
}
