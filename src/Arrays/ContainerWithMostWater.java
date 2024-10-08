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

public class ContainerWithMostWater
{

    public static void main(String[] args)
    {

        int[] height = {1,8,6,2,5,4,8,3,7};

    }

    public void maxArea(int[] height)
    {

        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while (left < right)
        {

        }

    }

}
