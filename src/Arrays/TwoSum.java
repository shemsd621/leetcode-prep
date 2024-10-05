package Arrays;

import java.util.HashMap;

/**
 * TAGS
 * array | hash-table
 *
 * COMPANIES
 * adobe | airbnb | amazon | apple | bloomberg | dropbox | facebook | linkedin | microsoft | uber | yahoo | yelp
 *
 * QUESTION
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * CONSTRAINTS:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 **/

public class TwoSum
{

    public static void main(String[] args)
    {

        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);

        // checks if the result array has any elements
        if (result.length > 0)
        {
            System.out.println("Indices that add up to target " + target + " are: " + result[0] + ", " + result[1]);
        } else
        {
            System.out.println("No two sum solution found");
        }

    }

    public int[] twoSum(int[] nums, int target)
    {

        int n = nums.length;

        // When array is empty or length of array is less than 2, it won't proceed
        if (nums == null || n < 2)
        {
            return new int[] {};
        }

        // HashMap results in O(n) complexity
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            int key = target - nums[i];

            // checks if the hashmap already contains the key
            if (hashMap.containsKey(key))
            {
                return new int[] {key, i};
            }
            // else adds the current number nums[i] and its index i to the hashmap
            // stores the numbers that's been processed
            hashMap.put(nums[i], i);

        }
        return new int[] {};

    }

}
