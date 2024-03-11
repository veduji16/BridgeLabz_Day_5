package Day_5;

import java.util.*;
import static java.lang.Math.*;

// WAP to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula. (Note: Take a,b and c as input values)
// delta = b*b -4*a*c
// Root 1 of x = (-b + sqrt(delta)/(2*a))
// Root 2 of x = (-b - sqrt(delta)/(2*a))

public class Quadratic {
    public static void findRoots(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }

        int d = b * b - 4 * a * c;
        double sqrt_val = sqrt(abs(d));

        if (d > 0) {
            System.out.println("Roots are real and different \n");

            System.out.println((double) (-b + sqrt_val) / (2 * a) + "\n" + (double) (-b - sqrt_val) / (2 * a));
        }

        else if (d == 0) {
            System.out.println("Roots are real and same \n");
            System.out.println(-(double) b / (2 * a) + "\n" + -(double) b / (2 * a));
        }

        else // d < 0
        {
            System.out.println("Roots are complex \n");
            System.out.println(-(double) b / (2 * a) + " + i" + sqrt_val / (2 * a) + "\n" + -(double) b / (2 * a)
                    + " - i" + sqrt_val / (2 * a));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findRoots(a, b, c);
        sc.close();
    }
}
