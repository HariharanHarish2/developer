package day9;

import java.util.ArrayList;

public class EvennumbersAndOddnumbers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        // input values
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        // Add even numbers 
        for (int n : num) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }

        // Add odd numbers 
        for (int n : num) {
            if (n % 2 != 0) {
                result.add(n);
            }
        }

        System.out.println("even numbers: " + num);
        System.out.println("odd numbers : " + result);
    }
}
