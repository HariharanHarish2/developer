package day4;
public class FibonacciSeries {
public static void main(String[] args) {
	int f1=0;
	int f2=1,f3;
	int n=5;
	System.out.println( f1);
	System.out.println( f2);
	for (int i=1;i<=n-2;i++)
	{
		f3=f1+f2;
		//f3 = 2," " + f3 → " " + "2" → " 2"
	      
	       System.out.println( f3);
	       
		f1=f2;
		f2=f3;
	}
}
}
