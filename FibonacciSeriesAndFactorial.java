package ICTjavaProgram;
import java.util.Scanner;
public class FibonacciSeriesAndFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Fibonacci terms: ");
        int n = sc.nextInt();

        long first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }

        System.out.print("\nEnter a number for factorial: ");
        int num = sc.nextInt();

        if (num < 0 || num > 20) {
            System.out.println("Enter a number between 0 and 20");
        } else {
            long factorial = 1;
            int i = 1;

            do {
                factorial = factorial * i;
                i++;
            } while (i <= num);

            System.out.println("Factorial = " + factorial);
        }

        sc.close();
    }
}

