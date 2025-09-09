package looping_prac;
import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i, j;  // declare loop variables once

        for (i = n; i >= 1; i--) {  // rows
            // print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
