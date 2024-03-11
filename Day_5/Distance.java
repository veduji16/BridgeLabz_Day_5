package Day_5;

import java.util.*;

// Using Scanner

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidean distance from (" + x + "," + y + ") to the origin (0,0) is: " + distance);
        sc.close();
    }
}

// Using command line arguments

// public class Distance {
//     public static void main(String[] args) {

//         if (args.length != 2) {
//             System.out.println("Usage: java Distance <x> <y>");
//             return;
//         }

//         int x = Integer.parseInt(args[0]);
//         int y = Integer.parseInt(args[1]);

//         double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
//         System.out.println("Euclidean distance from (" + x + "," + y + ") to the origin (0,0) is: " + distance);
//     }
// }