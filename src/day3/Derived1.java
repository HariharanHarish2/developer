package day3;
class Base1 {
    protected int a; 

    Base1(int a) {
        this.a = a;
        System.out.println("Inside Base constructor");
    }

    public void display() {
        System.out.println("Base class display Method");
    }
}

// Derived class
public class Derived1 extends Base1 {
    int b, tot;

    Derived1(int a, int b) {
        super(a); // call base constructor
        System.out.println("Inside Derived constructor");
        this.b = b;
    }

    public void sum() {
        tot = a + b;
        System.out.println("Total=" + tot);
    }

    @Override
    public void display() {
        System.out.println("Derived class display Method");
    }

    public static void main(String[] args) {
        Derived1 obj1 = new Derived1(3, 4);
        obj1.sum();
        obj1.display();
    }
}
