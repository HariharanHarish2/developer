package day7;
import java.util.ArrayList;

public class OddEvenCount {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(25);
        numbers.add(20);
        numbers.add(30);
        numbers.add(45);
        
        System.out.println("Numbers: " + numbers);
        
        int oddCount = 0;
        int evenCount = 0;
        
          for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
          
        
        System.out.println("Odd Count: " + oddCount);
        System.out.println("Even Count: " + evenCount);
    }
}
