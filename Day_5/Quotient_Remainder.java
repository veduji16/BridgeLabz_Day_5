package Day_5;

import java.util.*;

public class Quotient_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divident = sc.nextInt();
        int divisor = sc.nextInt();

        int quotient = divident / divisor;
        int remainder = divident % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        sc.close();
    }
}
