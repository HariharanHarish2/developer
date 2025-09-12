package day4;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbccdddee";   // Input string
        String result = "";

        // Add first character always
        result += str.charAt(0);

        // Loop from 1 to end
        for (int i = 1; i < str.length(); i++) {
            // Check if current char is same as previous one
            if (str.charAt(i) != str.charAt(i - 1)) {
                result += str.charAt(i);
            }
        }

        System.out.println("Input : " + str);
        System.out.println("Output: " + result);
    }
}
