package day5;

public class TernarySearchShort {
    public static int ternarySearch(int arr[], int left, int right, int key) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == key) return mid1;
            if (arr[mid2] == key) return mid2;

            if (key < arr[mid1]) {
                return ternarySearch(arr, left, mid1 - 1, key);
            } else if (key > arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, right, key);
            } else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int result = ternarySearch(arr, 0, arr.length - 1, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
