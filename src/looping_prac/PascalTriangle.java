package looping_prac;
public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 4; // number of rows in Pascal's triangle

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            int number = 1; // first number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // formula for next number
            }
            System.out.println();
        }
    }
}
