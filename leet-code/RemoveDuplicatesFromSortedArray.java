
/* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element
   appears only once. The relative order of the elements should be kept the same.

   Since it is impossible to change the length of the array in some languages,
   you must instead have the result be placed in the first part of the array nums.
   More formally, if there are k elements after removing the duplicates,
   then the first k elements of nums should hold the final result.
   It does not matter what you leave beyond the first k elements.

   Return k after placing the final result in the first k slots of nums. */

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int x = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]){
                continue;
            }

            nums[x] = nums[i];
            x++;

        }

        return x;

    }

    public static void main(String[] args) {

        int [] x = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("x: " + removeDuplicates(x));

    }

}
