class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (nums[m] == target) {
                l = m;
                break;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}