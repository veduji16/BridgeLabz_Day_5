package Day_5;

// import java.util.*;

// public class WindChill {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int t = sc.nextInt();
//          int v = sc.nextInt();

//         double w = 35.74 + 0.6215 * t + (04275 * t - 35.75) * Math.pow(v, 0.16);

//         System.out.println("Temperature = " + t);
//         System.out.println("Wind Speed = " + v);
//         System.out.println("Wind Chill = " + w);
//         sc.close();
//     }
// }

// Using command-line arguments

public class WindChill {
    public static void main(String[] args) {

        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        double w = 35.74 + 0.6215 * t + (04275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Temperature = " + t);
        System.out.println("Wind Speed = " + v);
        System.out.println("Wind Chill = " + w);
    }
}
