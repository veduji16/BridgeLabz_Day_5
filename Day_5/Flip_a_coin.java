package Day_5;

import java.util.*;
import java.util.Random;

// Flip Coin and print percentage of Heads and Tails

public class Flip_a_coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int totalFlips = sc.nextInt();
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < totalFlips; i++) {
            int result = random.nextInt(2);

            if (result == 0) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        double headsPercentage = (double) headsCount / totalFlips * 100;
        double tailsPercentage = (double) tailsCount / totalFlips * 100;

        System.out.println("Times heads was flipped: " + headsCount);
        System.out.println("Times tails was flipped: " + tailsCount);
        System.out.println("Percentage of heads: " + headsPercentage);
        System.out.println("Percentage of tails: " + tailsPercentage);

        sc.close();
    }
}