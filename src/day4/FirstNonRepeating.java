package day4;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "programming"; 
        int n = str.length();
        int[] freq = new int[256];  
        for (int i = 0; i < n; i++) {
            freq[str.charAt(i)]++;
        }
        char result = '\0'; 
        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i)] == 1) {
                result = str.charAt(i);
                break;
            }
        }
        if (result != '\0') {
            System.out.println("Input  : " + str);
            System.out.println("Output : First non-repeating character = " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
