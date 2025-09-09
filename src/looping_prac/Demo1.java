package looping_prac;

public class Demo1 {
  int a,b,c;
  Demo1(int a,int b)
  {
	  this.a=a;
	  this.b=b;}
  void add() {
	  String s="Local variable";
	  c=a+b;
	  System.out.println("Sum="+c);}
	  public static void main(String[] args) {
		  Demo1 obj1 = new Demo1(4,5);
		  obj1.add();
		  Demo1 obj2=new Demo1(5,6);
		  obj2.add();
	  
  }
}
