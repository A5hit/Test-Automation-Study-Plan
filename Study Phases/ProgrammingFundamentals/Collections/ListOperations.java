package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ashit", "michel", "akku", "theo", "Stan", "Emliy"));

        // Remove the names starting with vowel
        names.removeIf(sample -> "AEIOUaeiou".indexOf(sample.charAt(0)) != -1);

        //Convert All names into Uppercase
        names.replaceAll(String::toUpperCase);

        System.out.println("Final list : " + names);
    }


}
