package ICTjavaProgram;
import java.util.Scanner;
public class NumberPatternsAndArmstrongCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("Star Pattern:");

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                continue;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("Inverted Number Pyramid:");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Please enter a 3-digit number");
        } else {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }

        sc.close();
    }
}


