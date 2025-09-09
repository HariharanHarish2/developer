package condition;
import java.util.Scanner;

public class PositiveNegative {
public static void main (String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number");
	n=sc.nextInt();
	if(n>0) {
		System.out.println(n+"is positive");
	}
	else {
		System.out.println(n+"is  negative");
	}
}
}
