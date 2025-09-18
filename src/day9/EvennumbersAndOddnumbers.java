package day9;

import java.util.ArrayList; // Import ArrayList
import java.util.Collections;  // Import Collections

public class EvennumbersAndOddnumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        // input values
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        
        // reverse the ArrayList
        Collections.reverse(arr);
        System.out.println("Reverse: " + arr);
        
        ArrayList<Integer> result = evenOdd(arr);
        System.out.println("Final (odds + evens): " + result);
    }   
    
    public static ArrayList<Integer> evenOdd(ArrayList<Integer> arr){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd  = new ArrayList<>();
        
        //  even and odd numbers
        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        
        // Add even numbers after odd numbers
        odd.addAll(even);
        return odd;
    }
}
