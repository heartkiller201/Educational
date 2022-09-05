import java.util.ArrayList;

public class CollectionInt {

    public static void main(String[] args) {

        ArrayList<Integer> myCollection = new ArrayList<>();
        myCollection.add(85);
        myCollection.add(19);
        myCollection.add(0);
        myCollection.add(103);
        myCollection.add(13);
        Integer largest = Integer.MIN_VALUE;
        for (Integer i : myCollection) {
            if (i > largest) {
                largest = i;
            }


        }
        System.out.println(largest);



    }

}
