package looping_prac;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6; 
        int i, j, space, number; 

        for (i = 0; i < n; i++) {
            // Print leading spaces
            for (space = 0; space < n - i; space++) {
                System.out.print(" ");
            }

            number = 1; 
            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); 
            }
            System.out.println();
        }
    }
}
