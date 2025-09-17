package day9;

import java.util.ArrayList;

// input:
// ArrayList = [1,2,3,4,5,10]
// output:
// total : 25
public class AddFunction {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // ArrayList create

        // input list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);

        // starting value start with 0
        int total = 0;

        // for-each loop
        for (int num : numbers) {
            total += num;
        }

        System.out.println("Total List : " + total);
    }
}
