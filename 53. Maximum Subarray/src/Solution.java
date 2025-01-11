class Solution {
    public int maxSubArray(int[] nums) {
        return divideAndConquer(
                nums,
                0, nums.length - 1
        );
    }

    private int divideAndConquer(
            int[] nums,
            int left, int right
    ) {
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;

        int leftMax = divideAndConquer(nums, left, mid);

        int rightMax = divideAndConquer(nums, mid + 1, right);

        int crossMax = findCrossMax(nums, left, mid, right);
        int tempMax = Math.max(leftMax, rightMax);
        return Math.max(tempMax, crossMax);
    }

    public int findCrossMax(
            int[] nums,
            int left, int mid, int right
    ) {
        int leftSum = Integer.MIN_VALUE;
        int tempSum = 0;
        for (int i = mid; i >= left; i--) {
            tempSum += nums[i];
            leftSum = Math.max(leftSum, tempSum);
        }

        int rightSum = Integer.MIN_VALUE;
        tempSum = 0;
        for (int i = mid + 1; i <= right; i++) {
            tempSum += nums[i];
            rightSum = Math.max(rightSum, tempSum);
        }

        return leftSum + rightSum;
    }
}
