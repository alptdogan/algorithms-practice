/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */

public class Sqrtx {

    public static int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int i = 1;
        int result = 1;

        while (result <= x) {

            i++;
            result = i * i;

            if (i > x / i) {
                return i - 1;
            }

        }

        return i - 1;
    }

    public static void main(String[] args) {

        int x1 = 4;
        System.out.println(mySqrt(x1));

        int x2 = 8;
        System.out.println(mySqrt(x2));

        int x3 = 2147395600; // this one fails if you don't consider that the "i" can't be bigger than "x/i".
        System.out.println(mySqrt(x3));

    }

}
