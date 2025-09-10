package day3;

public class OverloadingDemo {
void display() {
	System.out.println("Hello");
	
}
void display(String name) {
	System.out.println("Hello "+name);
}
void display (int a,int b) {
	System.out.println("Product="+a*b);}
		
	public static void main(String[] args) {
		OverloadingDemo obj = new OverloadingDemo();
				obj.display();
	            obj.display("joy");
	            obj.display(2,2);
}
}
