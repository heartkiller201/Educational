import static java.lang.System.out;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class DisplayThePlacesFromFile {
    public static void main (String args[]) throws IOException {
       Scanner myHouses = new Scanner(new File("/Users/monheart/IdeaProjects/Educational/mylocations.txt"));
       for (int i = 1; i <= 2; i++){
            GetInfoFromFile(myHouses);
        }
       myHouses.close();
    }
       static void GetInfoFromFile(Scanner aScanner) {
           PlaceToLive house = new PlaceToLive();
           house.setAddress(aScanner.nextLine());
           house.setNumberOfBedrooms(aScanner.nextInt());
           house.setArea(aScanner.nextDouble());
           aScanner.nextLine();


        }



}
