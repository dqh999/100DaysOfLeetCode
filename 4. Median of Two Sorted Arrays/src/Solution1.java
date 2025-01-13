public class Solution1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int j = 0;
        int[] temp = new int[nums1.length + nums2.length];
        int iTemp = 0;
        for (int i = 0; i < nums1.length; i++) {
            while (j < nums2.length && nums1[i] > nums2[j]) {
                temp[iTemp] = nums2[j];
                iTemp++;
                j++;
            }
            temp[iTemp] = nums1[i];
            iTemp++;
        }
        while (j < nums2.length) {
            temp[iTemp] = nums2[j];
            iTemp++;
            j++;
        }
        int indexMedian = iTemp/2;
        if (iTemp % 2 != 0) {
            return temp[indexMedian];
        }
        return (temp[indexMedian] + temp[indexMedian - 1])/2.0;
    }
}