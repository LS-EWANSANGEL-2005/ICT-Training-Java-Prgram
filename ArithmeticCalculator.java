
    
package ICTjavaProgram;

import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Diff = " + (a - b));
        System.out.println("Prod = " + (a * b));

        if (b != 0) {
            System.out.println("Quot = " + (a / b));
            System.out.println("Rem = " + (a % b));
        } else {
            System.out.println("Quot = Undefined (division by zero)");
            System.out.println("Rem = Undefined (division by zero)");
        }

        sc.close();
    }
}




