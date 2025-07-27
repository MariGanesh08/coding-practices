package NotOut150;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
	     int nums[] = {3,4,5,6};
	     int target = 7;
	     HashMap<Integer, Integer>  hash = new HashMap<>();
	     
	     for(int i = 0 ; i < nums.length ; i++){
	         int complement = target - nums[i] ;
	         if(hash.containsKey(complement)){
	             System.out.println("["+ hash.get(complement) +","+ i + "]");
	             return;
	         }
	         hash.put(nums[i], i);
	     }
	     System.out.println("not found");
	}
}
