/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */


public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        /*

        int x = 0;
        s = s.trim();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' '){
                x = 0;

            }
            else {
                x++;
            }

        }

        return x;

        */

        //the code below also works and makes more sense than the code above due to starting from the last character of the given string
        int x = 0;
        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--){

            if (s.charAt(i) == ' ') {
                break;
            }

            x++;

        }

        return x;

    }

    public static void main(String[] args) {

        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));

    }

}
