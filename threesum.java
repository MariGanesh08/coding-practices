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
