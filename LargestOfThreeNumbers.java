
package ICTjavaProgram;

import java.util.Scanner;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;

        if (a >= b) {
            if (a >= c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        System.out.println("Largest (if-else) = " + largest);

        int max = (a >= b)
                ? ((a >= c) ? a : c)
                : ((b >= c) ? b : c);

        System.out.println("Largest (ternary) = " + max);

        sc.close();
    }
}


