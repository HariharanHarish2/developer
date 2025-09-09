package looping_prac;

import java.util.Scanner;

public class pattern3 {
 public static void main(String[] args) {
	 int n,j,i;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter n:");
	 n=sc.nextInt();
	 for(i=1;i<=n;i++) {
		 for(j=1;j<=i;j++) {
			 System.out.println("*");
			
		 }
		 System.out.println();
	 }
	 	
 }
 }