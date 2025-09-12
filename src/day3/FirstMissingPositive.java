package day3;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        int n = arr.length;
        int i, temp;

 
        for (i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

       
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                System.out.println("First missing positive = " + (i + 1));
                return;
            }
        }

       
        System.out.println("First missing positive = " + (n + 1));
    }
}
