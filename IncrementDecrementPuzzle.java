
package ICTjavaProgram;

public class IncrementDecrementPuzzle {

    public static void main(String[] args) {

        int x = 5;

        int result1 = x++ + ++x;

        System.out.println("x++ + ++x = " + result1);
        System.out.println("Final x = " + x);

        x = 5;

        int result2 = x-- - --x;

        System.out.println("x-- - --x = " + result2);
        System.out.println("Final x = " + x);

        x = 5;

        int result3 = ++x * x++;

        System.out.println("++x * x++ = " + result3);
        System.out.println("Final x = " + x);
    }
}



