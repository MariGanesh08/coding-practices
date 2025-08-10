/*
Given an integer array nums, find all unique triplets [nums[i], nums[j], nums[k]] 
such that i, j, and k are different and nums[i] + nums[j] + nums[k] == 0.

Example:
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]
Explanation: 
- Triplet [-1, -1, 2] sums to 0
- Triplet [-1, 0, 1] sums to 0
No other unique triplets exist.
*/
import java.util.Collections;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //sort the array
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1 ;
            int right = nums.length -1;
             while( left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if( sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    while(left < right && nums[left] == nums[left+1]) 
                        left++;
                    while(left < right && nums[right] == nums[right -1]) 
                        right--;
                    left++;
                    right--;
                }
                else if(sum <  0){
                    left++; // sum = -2 need higher number so move left
                }
                else {
                    right--; // sum = 2 need lower number so move right 
                }
             }
        }
        return result;
    }
    
}
