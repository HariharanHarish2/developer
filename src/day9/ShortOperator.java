
//
//public class ShortOperator {
//public static int addArrayList(ArrayList<Integer> arr) {
//	int total = 0;
//	 for(int i :arr) {
//		 total +=i;
//	 }
//	 return total;
//	 
//}
//public static void main(String[] args) {
////	System.out.println("Add");
//	//system.out.println(add(10,20));//Argument;
//	ArrayList<Integer>arr = new ArrayList<>();
//	
//	arr.add(5);
//	arr.add(10);
//	arr.add(15);
//	arr.add(20);
//	
//	System.out.println(ArrayList());
//}
//}
package day9;

import java.util.ArrayList;  // Import added

public class ShortOperator {
    
    // Method to add elements of ArrayList
    public static int addArrayList(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }
    public static int searchTarget(ArrayList<Integer> arr,int target) {
//   	return arr.indexOf(target);
    	
for(int i=0;i < arr.size(); i++) {
	if(target == arr.get(i)) {
		return i;
	}
}
return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);

        //  Call the method with array
        System.out.println("Numbers: " + arr);
        System.out.println("Sum = " + addArrayList(arr));
    }
    
  
    	
    }


