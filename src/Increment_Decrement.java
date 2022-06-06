import static java.lang.System.out;

public class Increment_Decrement {
    public static void main(String args[]) {
        int i = 10;

        i += 2; //12
        i -= 5; // 7
        i *= 6; // 42
        out.println(i); //42
        out.println(i += 3); //45
        out.println(i /= 2); //22

        int q = 10;
        out.println(q++); //10
        out.println(--q); //10
        --q; //9
        q--; //8
        out.println(q); //8
        out.println(++q); //9
        out.println(q--);  //9
        out.println(q); //8

        q++; //9
        q = q++ + ++q; // 10 + 10 = 20
        out.println(q);  //20
        q = q++ + q++; // 21 + 20
        out.println(q); // 41
    }

}
