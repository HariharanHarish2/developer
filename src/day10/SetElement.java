package day10;
import java.util.HashSet;



public class SetElement {
public static void main(String[] args) {
	HashSet<Integer> set = new HashSet <Integer>();//asending order print means use HashSet remove and TreeSet
//add elements	
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(1);
	set.add(2);
	System.out.println(set);
	//remove elements
	set.remove(3);
	System.out.println(set);
	//elements size
	System.out.println(set.size());
	//elements empty or not
	System.out.println(set.isEmpty());
	//contains the elements
	System.out.println(set.contains(2));
	//clear the elements
	set.clear();
	System.out.println(set);
	
	
	
 
}
}

