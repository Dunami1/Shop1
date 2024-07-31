package app;

public class Main {

    static String product1;
    static String product2;
    static double totalsales1;
    static double totalsales2;
    static double dailys1;
    static double dailys2;
    static int days1;
    static int days2;



    public static void main(String[] args) {

        product1 = "smartpone";
        product2 = "laptop";
        totalsales1 = 12153.41;
        totalsales2 = 10486.85;
        days1 = 5;
        days2 = 7;
        dailys1 = totalsales1 / days1;
        dailys2 = totalsales2 / days2;

        System.out.printf("Product No 1: %s%n", product1);
        System.out.printf("Total sales for %d days is EUR %.2f%n", days1, totalsales1);
        System.out.printf("Sales by day is EUR %.2f%n", dailys1);

        System.out.printf("%nProduct No 2: %s%n", product2);
        System.out.printf("Total sales for %d days is EUR %.2f%n", days2, totalsales2);
        System.out.printf("Sales by day is EUR %.2f%n", dailys2);
    }
}

