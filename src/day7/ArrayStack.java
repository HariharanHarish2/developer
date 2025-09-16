package day7;

public class ArrayStack {
    private int maxSize;//2 usage
    private int top;//1 usage
    private int[] stackArr;// 2usage

    public ArrayStack(int size) {
        maxSize = size;
        top = -1;
        stackArr = new int[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full .. ");
        } else {
            stackArr[++top] = value;
            System.out.println("Pushed " + value + " into Stack.");
        }
    }
    
    
    
   public int pop() {// change  public int peek()
      if (isEmpty()) {
           System.out.println("Stack is Empty....");
           return -1;
        } else {
           int value = stackArr[top--];// change[top]
           return value;
       }
   }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
    }
}
