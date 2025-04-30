import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseExercise {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ashit","Sam","Anshu","Paul","Michel");

        // Filter names starting with 'A'
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredNames);

        // Convert to uppercase and sort
        List<String> nameToUppercase = names.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(nameToUppercase);

        // Count names longer than 3 characters
        Long countNames = names.stream().filter(name->name.length()>3).count();
        System.out.println(countNames);
    }


}
