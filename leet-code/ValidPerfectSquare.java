/*
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 */

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {

        int i = 0;

        while (i * i <= num) {

            i++;

            if (i * i == num) {
                return true;
            }

        }

        return false;

    }

    public static void main(String[] args) {

        int num1 = 16;
        System.out.println(isPerfectSquare(num1));

        int num2 = 14;
        System.out.println(isPerfectSquare(num2));

        int num3 = 1;
        System.out.println(isPerfectSquare(num3));

    }

}
