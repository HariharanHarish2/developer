package day4;

public class LinearSearch {
    public static int lin_search(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {2, 6, 8, 12, 15, 20};
        int key = 12;

        int pos = lin_search(numbers, key);

        if (pos == -1) {
        	   System.out.println("Element found at index: " + pos);
        } else {
            System.out.println("Element not found");

        }
    }
}
