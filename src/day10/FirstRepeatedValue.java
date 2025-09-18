package day10;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstRepeatedValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(2);

        // Find first repeated element
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {   // if already exists  repeated
                System.out.println("First repeated element: " + num);
                return;
            }
        }

        System.out.println("No repeated element found.");
    }
}
