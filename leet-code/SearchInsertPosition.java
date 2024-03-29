
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
 */


public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int x = 0;
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] < target) {
                x++;
            }

        }

        return x;

    }

    public static void main(String[] args) {

        int[] nums1 = {1,3,5,6};
        System.out.println(searchInsert(nums1, 5));

        int[] nums2 = {1,3,5,6};
        System.out.println(searchInsert(nums2, 2));

        int[] nums3 = {1,3,5,6};
        System.out.println(searchInsert(nums3, 7));

    }

}
