package Day_5;

import java.util.*;

public class Harmonic_Number {
    public static double harmonicNumber(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        double result = harmonicNumber(x);
        System.out.println(x + "th Harmonic Number: " + result);

        sc.close();
    }
}
