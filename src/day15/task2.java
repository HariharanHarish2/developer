package day15;

import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) list.add(sc.nextInt());
            System.out.println("sum: " + list.stream().sorted().limit(k).mapToInt(Integer::intValue).sum());
        }
    }
}
