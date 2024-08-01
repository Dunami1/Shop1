package app;

public class Main {

    static String[] products;
    static double[] price;
    static int[] days;

    public static void main(String[] args) {

        products = new String[]{"smartphone", "laptop"};
        price = new double[]{12153.41, 10486.85};
        days = new int[]{5, 7};

        for (int i = 0; i < products.length && i < price.length; i++) {
            double salesByDay = price[i] / days[i];
            System.out.printf("Product No %d: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                    i + 1, products[i], days[i], price[i], salesByDay);
        }
    }
}