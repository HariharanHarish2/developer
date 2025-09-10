package day3;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99};
       int secondLargest = Integer.MIN_VALUE;
       int first_largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > first_largest) {
                secondLargest = first_largest; // old largest becomes second largest
                first_largest = numbers[i];      // update largest
            } else if (numbers[i] > secondLargest && numbers[i] != first_largest) {
                secondLargest = numbers[i]; // update second largest
            }
        }

        System.out.println("first_largest  = " + first_largest);
        System.out.println("Second largest  = " + secondLargest);
    }
}
