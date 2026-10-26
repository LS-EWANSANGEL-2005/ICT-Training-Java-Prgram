package ICTjavaProgram;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
      
        System.out.println("Method 1: Temporary Variable");
        System.out.println("Before: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After: a = " + a + ", b = " + b);

        a = 10;
        b = 20;

        System.out.println("\nMethod 2: Arithmetic");
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After: a = " + a + ", b = " + b);

        a = 10;
        b = 20;

        System.out.println("\nMethod 3: XOR");
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After: a = " + a + ", b = " + b);
    }
}


