package ICTjavaProgram;

public class BitwiseAndShiftOperator {

    public static void main(String[] args) {

        int a = 12;
        int b = 10;
        int result;

        result = a & b;
        System.out.println("a & b = " + result + " (" +
                Integer.toBinaryString(result) + ")");

        result = a | b;
        System.out.println("a | b = " + result + " (" +
                Integer.toBinaryString(result) + ")");

        result = a ^ b;
        System.out.println("a ^ b = " + result + " (" +
                Integer.toBinaryString(result) + ")");

        result = ~a;
        System.out.println("~a = " + result + " (" +
                Integer.toBinaryString(result) + ")");

        result = a << 2;
        System.out.println("a << 2 = " + result + " (" +
                Integer.toBinaryString(result) + ")");

        result = a >> 2;
        System.out.println("a >> 2 = " + result + " (" +
                Integer.toBinaryString(result) + ")");

        result = a >>> 2;
        System.out.println("a >>> 2 = " + result + " (" +
                Integer.toBinaryString(result) + ")");
    }
}


