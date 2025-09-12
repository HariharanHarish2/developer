package day4;

public class ConvertCase {
    public static void main(String[] args) {
        String str = "COMPUTer";   // Input
        char[] chars = str.toCharArray();  // Convert string to character array

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Convert uppercase to lowercase by adding 32
                chars[i] = (char)(chars[i] + 32);
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                // Convert lowercase to uppercase by subtracting 32
                chars[i] = (char)(chars[i] - 32);
            }
        }

        String result = new String(chars);
        System.out.println("Input : " + str);
        System.out.println("Output: " + result);
    }
}
