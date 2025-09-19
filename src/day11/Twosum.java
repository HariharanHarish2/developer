package day11;

import java.util.Arrays;
//import java.util.HashMap
import java.util.Scanner;

public class Twosum {
//    // Method to check if two numbers add up to target
//    public static boolean twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        // Iterate through array
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//
//            // Check if complement exists in map
//            if (map.containsKey(complement)) {
//                return true; 
//            }
//
//            // Store current number
//            map.put(nums[i], i);
//        }
//
//        return false; 
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input size
//        System.out.print("Enter size of array: ");
//        int size = sc.nextInt();
//
//        // Input array elements
//        int[] arr = new int[size];
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Input target value
//        System.out.print("Enter target: ");
//        int target = sc.nextInt();
//
//        // Call function and display result
//        boolean result = twoSum(arr, target);
//        System.out.println("Two sum: " + result);
//
//        sc.close();
//    }
//}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size :");
	int size = sc.nextInt();
	System.out.println("Enter array elements");
	int arr[] = new int[size];
	for(int i=0;i<size;i++) {
		int inp=sc.nextInt();
		arr[i] = inp;
	}
	System.out.println("Enter target value");
	int target = sc.nextInt();
	System.out.println("Array Size :" + size);
	System.out.println("Array elements:" + Arrays.toString(arr));
	System.out.println("Target Size :" + target);
}}
