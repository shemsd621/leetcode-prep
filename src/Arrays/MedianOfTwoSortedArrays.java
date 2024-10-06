package Arrays;

/**
 * TAGS
 * array | binary-search | divide-and-conquer
 *
 * COMPANIES
 * adobe | apple | dropbox | google | microsoft | yahoo | zenefits
 *
 * QUESTION
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * CONSTRAINTS:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */

public class MedianOfTwoSortedArrays
{

    public static void main(String[] args)
    {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

        double median = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        // formatting the string to get the desired output with 5 decimal places
        System.out.println("Median is: " + String.format("%.5f", median));

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {

        int m = nums1.length;
        int n = nums2.length;

        // new array combined
        int t = m + n;
        int[] combined = new int[t];

        // two pointer method
        int i = 0, j = 0, k = 0;

        // traversing the 2 arrays and adding numbers to the new array in ascending order
        while (i < m && j < n)
        {
            if (nums1[i] <= nums2[j])
            {
                combined[k++] = nums1[i++];
            } else
            {
                combined[k++] = nums2[j++];
            }
        }

        // adding the remaining numbers if any
        while (i < m)
        {
            combined[k++] = nums1[i++];
        }

        while (j < n)
        {
            combined[k++] = nums2[j++];
        }

        // find the median of the new array
        // check if the number of elements is odd or even and perform the necessary calculations
        if (t % 2 == 1)
        {
            return combined[t / 2];
        } else
        {
            return (combined[t / 2 - 1] + combined[t / 2]) / 2.0;
        }

    }

}
