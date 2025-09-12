package day4;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	public static int bin_search(int num[], int key1) {
		int n=num.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (num[mid] == key1) {
                return mid; 
            } else if (num[mid] < key1) {
                left = mid + 1;
            } else if(num[mid]>key1) {
                right = mid - 1; 
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {20,3,2,10,5,6};
        Arrays.sort(numbers);
        System.out.print(Arrays.toString(numbers));
        		 Scanner sc = new Scanner(System.in);
        		 System.out.print("Enter key to search");
        		 int key =sc.nextInt();
        		 int pos=bin_search(numbers,key);
        		 System.out.println("Position="+pos);

      
    }}