package Day_5;

import java.util.*;

public class Swap_two_numbers {
    public static void swapValues(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped Value of a: " + a);
        System.out.println("Swapped Value of b: " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapValues(a, b);
        sc.close();
    }
}
