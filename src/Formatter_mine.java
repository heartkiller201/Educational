import static java.lang.System.out;
public class Formatter_mine {

    public static void main(String[] arg) {
        out.printf("%s%d%s", ">>", 7, "<<\n" );
        out.printf("%s%10d%s", ">>", 7, "<<\n" );
        out.printf("%s%-10d%s", ">>", 7, "<<\n" );
        out.printf("%s%010d%s", ">>", 7, "<<\n" );
        out.printf("%s%+d%s", ">>", 7, "<<\n" );
        out.printf("%s%d%s", ">>", -7, "<<\n" );
        out.printf("%s%(1d%s", ">>", -7, "<<\n" );
        out.printf("%s%15.7f%s", ">>", 7.0, "<<\n" );
        out.printf("%s%S%s", ">>", "Hello", "<<\n" );
        out.printf("%s%c%s", ">>", 'x', "<<\n" );
        out.printf("%s%C%s", ">>", 'x', "<<\n" );










    }



}
