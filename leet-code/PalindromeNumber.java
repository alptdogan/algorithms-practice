/* Given an integer x, return true if x is a
        palindrome, and false otherwise.

        Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.

        Example 2:
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

        Example 3:
        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */


public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x % 10 == 0 && x != 0) {
            return false;
        }

        if (x == 0){
            return true;
        }

        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        if (x == reverse || x == reverse / 10) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {

        int x = 121;
        System.out.println("x: " + isPalindrome(x));

        int y = -121;
        System.out.println("y: " + isPalindrome(y));

        int z = 10;
        System.out.println("z: " + isPalindrome(z));

        int a = 0;
        System.out.println("a: " + isPalindrome(a));

    }

}
