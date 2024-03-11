package Day_5;

import java.util.*;

// Sum of three intergers to zero

public class Sum_of_three_integers_to_zero {
    public static void findTriplets(int[] arr, int n) {
        boolean found = false;
        int count = 0;
        System.out.println("Distinct Triplets: ");
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                        count++;
                    }
                }
            }
        }
        if (found == false) {
            System.out.println("Not exist");
        }
        System.out.println("Number of distinct triplets: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        findTriplets(arr, length);
        sc.close();
    }
}