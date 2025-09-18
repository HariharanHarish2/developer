package day10;
import java.util.TreeSet;
import java.util.ArrayList;

public class Treeelement {
public static void main(String[] args) {
	TreeSet<Integer> set = new TreeSet <Integer>();//Asending order print means use HashSet remove and TreeSet
//add elements	
	set.add(10);
	set.add(9);
	set.add(8);
	set.add(7);
	set.add(5);
	set.add(1);
	set.add(2);
	System.out.println(set);
ArrayList<Integer> list = new ArrayList<>(set);
	
	System.out.println(list.get(2));
	for(int i : list){
	System.out.println(i+" " );

}}
}