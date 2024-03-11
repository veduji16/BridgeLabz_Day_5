package Day_5;

import java.util.*;

// Power of 2

// public class Power_of_2 {
//     public static boolean isPowerOFTwo(int n) {
//         if (n <= 0) {
//             return false;
//         }

//         while (n != 1) {
//             if (n % 2 != 0) {
//                 return false;
//             }
//             n = n / 2;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         System.out.println(x + " is power of 2: " + isPowerOFTwo(x));
//     }
// }

// Power of 2 and how many powers

public class Power_of_2 {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0 && (n & (n - 1)) == 0);
    }

    public static int countPowersOfTwo(int n) {
        int count = 0;
        while (n > 1) {
            n = n / 2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(x + " is power of 2: " + isPowerOfTwo(x));
        System.out.println("Number of power of 2 for " + x + ": " + countPowersOfTwo(x));

        sc.close();
    }
}