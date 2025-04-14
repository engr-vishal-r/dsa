package leetCode;
import java.util.Scanner;

public class MultiplyWithoutMultiplyOperator {
    public static void main(String[] args) {
       
        int num1 = 4, num2= -3;

        int result = multiplyWithoutMultiplyOperator(num1, num2);

        System.out.println("The product is: " + result);
    }

    public static int multiplyWithoutMultiplyOperator(int a, int b) {
        int result = 0;

        // If 'b' is negative, make it positive and negate the result later
        boolean isNegative = false;
        if (b < 0) {
            isNegative = true;
            b = -b;
        }

        for (int i = 0; i < b; i++) {
            result += a;
        }

        // Negate the result if 'b' was originally negative
        if (isNegative) {
            result = -result;
        }

        return result;
    }
}
