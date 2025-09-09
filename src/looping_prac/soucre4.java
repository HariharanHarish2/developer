package looping_prac;

import java.util.Scanner;

public class soucre4{

 public static void main(String[] args) {
	 int n,j,i;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter n:");
	 n=sc.nextInt();
	 for(i=n;i>=1;i--) {
		 for(j=1;j>=n;j++) {
			 System.out.print(j);
			
		 }
		 System.out.println();
	 }
	 	
 }}

