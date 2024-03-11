package Day_5;

import java.util.*;

public class Prime_Factors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 2; i < x; i++) {
            while (x % i == 0) {
                System.out.println(i + " ");
                x = x / i;
            }
        }
        if (x > 2) {
            System.out.println(x);
        }
        sc.close();
    }
}