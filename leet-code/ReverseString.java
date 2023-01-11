/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {

    public static char[] reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while (i < j) {

            char c = s[i];

            s[i] = s[j];
            s[j] = c;

            i++;
            j--;

        }

        return s;
    }

    public static void main(String[] args) {

        char[] s1 = {'h','e','l','l', 'o'};
        System.out.println(reverseString(s1));

        char[] s2 = {'h','a','n','n', 'a', 'H'};
        System.out.println(reverseString(s2));


    }

}
