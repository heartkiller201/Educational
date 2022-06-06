import java.io.File;
import java.io.IOException;

public class GetInfoAboutDirectory {
    public static void main (String arg[]) throws IOException {
        File readDirectory = new File("mylocations.rtf");
        System.out.println(readDirectory.getCanonicalPath());
    }

}
