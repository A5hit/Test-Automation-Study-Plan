package Collections;


import java.util.*;

public class SetDeduplication {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(2);
        num.add(3);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(5);

        System.out.println("List : "+num);
        Set<Integer> set = new TreeSet<>();
        set.addAll(num);
        System.out.println("Set : "+set);
    }


}
