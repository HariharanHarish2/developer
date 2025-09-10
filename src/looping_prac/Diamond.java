package looping_prac;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i, j, k; 

       
        for (i = 1; i <= n; i++) {
           
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
        for (i = n - 1; i >= 1; i--) {
            // spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
           
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
