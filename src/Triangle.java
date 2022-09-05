public class Triangle extends Shape{

    public Triangle(int size) {
        super(size);
    }

    @Override
    public void show() {
        String slash = Character.toString(0x5C);
        System.out.println("/" + slash);
        System.out.println("/ " + slash);
        System.out.println("----");


    }


}
