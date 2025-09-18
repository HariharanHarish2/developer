package day10;
import java.util.ArrayList;
import java.util.HashSet;

//return /print size of unique elements in a given array/arrayList
//Input:Array/ArrayList = [1,4,5,3,2,1,2,0,4]
//output:unique size:6 ->[1,4,5,3,2,0]
public class UniqueElement {
	public static void main(String[] args) {
		ArrayList <Integer> arr = new ArrayList<>();
		
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(0);
		arr.add(4);
		arr.add(2);
		
		System.out.println("show Values"+ arr);
		
		HashSet <Integer> unique = new HashSet<>(arr);
		System.out.println(unique.size());
		
	}

}
