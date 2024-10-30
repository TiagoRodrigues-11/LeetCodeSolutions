class Solution {
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length;

        while (left <= right && left < nums.length && right >= 0) {
            int mid = left + (right-left)/2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            } 
        }

        return -1;
    }
}