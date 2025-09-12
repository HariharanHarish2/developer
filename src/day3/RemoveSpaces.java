package day3;

public class RemoveSpaces {
public static void main(String[] args) {
	String str="Hello World";
	char[] chr_arr=str.toCharArray();
	String res="";
	for (char c:chr_arr) {
		if(c!=' ')
		{
			res=res+c;
		}
	}
	System.out.println("Original String="+str);
	System.out.println("Without space="+res);
}
}
