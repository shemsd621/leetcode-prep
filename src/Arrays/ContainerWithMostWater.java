package Arrays;

/**
 * TAGS
 * array | two-pointers
 *
 * COMPANIES
 * bloomberg
 *
 * QUESTION
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * CONSTRAINTS:
 *
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */

// time complexity - O(n)
public class ContainerWithMostWater
{

    public static void main(String[] args)
    {

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("The maximum amount of water the container can store is: " + maxArea(height));

    }

    /*
    Method to calculate the maximum amount of water a container can store
     */
    public static int maxArea(int[] height)
    {

        int n = height.length;  // length of the array height
        int left = 0;           // left pointer
        int right = n - 1;      // right pointer
        int maxArea = 0;        // maximum area

        // loops until the pointers meet
        while (left < right)
        {
            // calculates the current area
            // gets the minimum of the left and right values of the array (height) and multiplies with their difference (width)
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // updates MaxArea if currentArea is larger than maxArea
            maxArea = Math.max(maxArea, currentArea);

            // updates the position of the pointers
            if (height[left] < height[right])
            {
                // moves the left pointer to the right
                left++;
            } else
            {
                // moves the right pointer to the left
                right--;
            }
        }
        return maxArea;

    }

}
