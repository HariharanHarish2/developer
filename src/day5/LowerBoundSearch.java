package day5;

public class LowerBoundSearch{
    static  int lowerBound(int[]  arr,  int target) {
	int low=0,high = arr.length ,
			result =arr.length;
	while (low <high) {
		int mid = low +(high -low)/2;
		if(arr[mid]>=target) {
			result = mid;
			high = mid;// shrink towards left
	
		}
		else {
			low = mid +1;
		}
	}
	return result;
}
    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 10, 10, 18, 20};
        int target1 = 4;
        int target2= 5;
        int target3 = 1;
 
	 System.out.println(" Lower bound Of " + target1 + "is at index: " + lowerBound(arr,target1));
 
	 System.out.println(" Lower bound Of " + target2 + "is at index: " + lowerBound(arr,target2));
	 
	 System.out.println(" Lower bound Of " + target3 + "is at index: " + lowerBound(arr,target3));
	 
	 
}}
