package day3;

public class MaximumSales {
    public static void main(String[] args) {
        int[] sales = {120, 340, 560, 230, 999};
        int max_sale = Integer.MIN_VALUE;
        int min_sale = Integer.MAX_VALUE;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max_sale) {
                max_sale = sales[i];
            }
            if (sales[i] < min_sale) {  // find minimum
                min_sale = sales[i];
            }
        }

        System.out.println("max sale = " + max_sale);
        System.out.println("min sale = " + min_sale);
    }
}
