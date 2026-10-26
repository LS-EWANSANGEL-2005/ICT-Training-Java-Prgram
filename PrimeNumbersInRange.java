package ICTjavaProgram;
import java.util.Scanner;
public class PrimeNumbersInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start and end: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = Math.max(2, start); num <= end; num++) {

            boolean isPrime = true;

            for (int i = 2; i <= num / i; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}

