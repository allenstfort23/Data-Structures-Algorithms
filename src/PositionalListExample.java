import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PositionalListExample {
    public static void main(String[] args) {

        List dogNames = new ArrayList();

        // The add method to add elements to our list. This method adds an element at the end of the list.
        dogNames.add("Fido");
        dogNames.add("Java");
        dogNames.add("Cuddles");
        dogNames.add("Abby");
        dogNames.add("Muzz");
        dogNames.add("Brandy");

        System.out.println(dogNames);

        // Can also pass an index number to the add method.
        dogNames.add(1, "George");

        // Can retrieve a single element from a list by referencing the index number with the get method.
        String theDog = (String) dogNames.get(2);
        System.out.println("The dog at position number 2 (3rd dog) is " + theDog + ".");
        Collections.sort(dogNames);
        System.out.println(dogNames);

    }
}
