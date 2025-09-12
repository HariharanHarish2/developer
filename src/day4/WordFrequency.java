package day4;

import java.util.Arrays;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "java coding java";
        String[] words = str.split(" ");
        int n = words.length;
        System.out.println("Total words: " + n);

        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        int count = 0;

        for (int i = 0; i < n; i++) {
            count = 0;

            if (!visited[i]) {
                visited[i] = true;
                count = count + 1;

                // start j from i+1
                for (int j = i + 1; j < n; j++) {
                    if (words[i].equals(words[j])) {
                        visited[j] = true;
                        count = count + 1;
                    }
                }

                // print once per word
                System.out.println("Count of " + words[i] + " = " + count);
            }
        }
    }
}
