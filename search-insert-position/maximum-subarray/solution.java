public class Solution {
    public int maxSubArray(int[] nums) {
        int[] values = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                values[i] = nums[i];
            } else {
                if (values[i-1] < 0) {
                    if (nums[i] > values[i-1]) {
                        values[i] = nums[i];
                    } else {
                        values[i] = values[i-1];
                    }
                } else {
                    values[i] = values[i-1] + nums[i];
                }
            }
        }
        int maxValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }

    public int maxSubArrayBetter(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++ ) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public int kadane(int[] nums) {
        int max = nums[0];
        int maxEndHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndHere = Math.max(nums[i], maxEndHere+nums[i]);
            max = Math.max(max, maxEndHere);
        }
        return max;
    }
}
