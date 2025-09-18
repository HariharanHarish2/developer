package day10;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class RepeatedCharacter {
	
public static int numCharRepeated(String input) {
	
	char[] ch = input.toCharArray();
	Set<Character> set = new HashSet<>();
	int count = 0;
	for(char c:ch) {
		if(!set.add(c)) {
			count++;
		}
	}
	return count;
	
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	 String input = sc.next();
	 System.out.println(" count: " + numCharRepeated(input));
}
}