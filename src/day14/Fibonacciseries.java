package day14;
import java.util.Scanner;
public class Fibonacciseries {
    public static void iterationMethodFib(int n) {
        int first = 0;
        int second = 1;
        int third = -1;
        System.out.println(first + " " + second + " "); // 0 1
        for (int i = 2; i < n; i++) {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        iterationMethodFib(n);
    }
}
