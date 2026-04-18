class Solution {
    public int threeSumClosest(int[] nums, int target) {

      Arrays.sort(nums);
		// assumping our min value to be the sum of the first three elements
        int min = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length; i++) {
            int start = i+1;
            int end = nums.length-1;
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
				// if the diff between the target and sum is minimum than the assumed then update the value with new minimum value
                if(Math.abs(target - min) > Math.abs(target - sum)) {
                    min = sum;
                }
                
				// increment or decrement the pointers based on the sum that we found in the previous steps, return the result if the sum is neither greater than nor lesser than the target meaning that we found our closest value to the target
                if(sum > target) {
                    end--;
                } else if(sum < target){
                    start++;
                } else {
                    return target;
                }
            }
        }
        return min;   
    }
}