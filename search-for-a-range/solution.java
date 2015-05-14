public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = searchLeft(nums, 0, nums.length-1, target);
        int right = searchRight(nums, 0, nums.length-1, target);
        int[] result = new int[2];
        result[0] = left;
        result[1] = right;
        return result;
    }
    
    private int searchLeft(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end)/2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start >= 0 && start < nums.length && nums[start] == target) {
            return start;
        } else {
            return -1;
        }
    }
    
    private int searchRight(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }
        if (end >= 0 && end < nums.length && nums[end] == target) {
            return end;
        } else {
            return -1;
        }
    }
}
