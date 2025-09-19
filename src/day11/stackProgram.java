package day11;
import java.util.Scanner;
import java.util.Stack;

public class stackProgram {

    public static Boolean isValidParenthesis(String input) {
        char[] ch = input.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char c : ch) {
            if (c == '(') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stack :");
        String inp = sc.next();
        if (isValidParenthesis(inp)) {
            System.out.println("Valid parenthesis");
        } else {
            System.out.println("Invalid parenthesis");
        }
        
    }
}
