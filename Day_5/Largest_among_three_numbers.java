package Day_5;

import java.util.*;
// Greatest of the Three Numbers in Java

public class Largest_among_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println("Largest Number: " + x);
        } else if (y > x && y > z) {
            System.out.println("Largest Number: " + y);
        } else {
            System.out.println("Largest Number: " + z);
        }
        sc.close();
    }
}