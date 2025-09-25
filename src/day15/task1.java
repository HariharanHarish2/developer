package day15;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and k
        int n = sc.nextInt();
        int k = sc.nextInt();

        // Input ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Sort the list
        Collections.sort(list);

        // Sum first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += list.get(i);
        }

        // Output
        System.out.println("sum: " + sum);

        sc.close();
    }
}
