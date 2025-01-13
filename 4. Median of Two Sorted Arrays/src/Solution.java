public class Solution {

    // test case 1
    // 6 7 10 15
    // 8 9 10
    // test case 2
    // 8 10 11 12
    // 13 14 19
    // test case 3
    // 9 10 13
    // 6 7 8
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return findMedia(
                nums1,
                0, nums1.length -1,
                nums2,
                0, nums2.length -1
        );
    }
    private double findMedia(
            int[] nums1,
            int firstIndex1, int lastIndex1,
            int[] nums2,
            int firstIndex2, int lastIndex2
    ) {
        if (nums1[lastIndex1] < nums2[firstIndex2]) {
            return (nums1[lastIndex1] + nums2[firstIndex2]) / 2.0;
        }
        if (nums1[firstIndex1] > nums2[lastIndex2]) {
            return (nums1[firstIndex1] + nums2[lastIndex2]) / 2.0;
        }
        findMedia(
                nums1,
                lastIndex1/2, lastIndex1,
                nums2, firstIndex2, lastIndex2
        );
        findMedia(
                nums1,
                firstIndex1, lastIndex1/2,
                nums2, firstIndex2, lastIndex2
        );
        findMedia(
                nums1,
                firstIndex1, lastIndex1,
                nums2, firstIndex2, lastIndex2/2
        );
        findMedia(
                nums1,
                firstIndex1, lastIndex1,
                nums2, lastIndex2/2, lastIndex2
        );
        return 0;
    }
}
