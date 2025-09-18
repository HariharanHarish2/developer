package day10;
import java.util.HashSet;
import java.util.ArrayList;

public class FirstRepeatedValue {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(2);

        HashSet<Integer> i = new HashSet<>();
        for (int num : arr) {
            if (!i.add(num)) {   // check using HashSet
                System.out.println("First repeated element: " + num);
                return;
            }
        }

      
    }
}
