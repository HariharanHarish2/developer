package day10;
import java.util.Scanner;
import java.util.Stack;

public class ClassProblems {
    public static boolean ispalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        String rev = "";
        char[] ch = input.toCharArray();
        for (char c : ch) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }
        return input.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stack:");
        String input = sc.next();
        if (ispalindrome(input)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
