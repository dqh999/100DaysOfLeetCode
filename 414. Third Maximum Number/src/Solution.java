class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        if (n < 3 ) {
            if (n < 2){
                return nums[0];
            }
            return Math.max(nums[0], nums[1]);
        };
        Integer f = null;
        Integer s = null;
        Integer t = null;
        for (Integer num : nums) {
            if (num.equals(f) || num.equals(s) || num.equals(t))
                continue;
            if (f == null || num > f) {
                t = s;
                s = f;
                f = num;
            } else if (s == null || num > s) {
                t = s;
                s = num;
            } else if (t == null || num > t) {
                t = num;
            }
        }
        return t == null ? f : t;
    }
}