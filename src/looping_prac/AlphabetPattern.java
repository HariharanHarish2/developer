
package looping_prac;
public class AlphabetPattern {
    public static void main(String[] args) {
        char ch = 'A'; // starting alphabet

        // loop until Z
        for (int i = 1; ch <= 'Z'; i++) {
            for (int j = 1; j <= i && ch <= 'Z'; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
