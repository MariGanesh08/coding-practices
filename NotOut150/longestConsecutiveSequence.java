// Longest Consecutive Sequence – Medium Level
// Given an array of integers nums, return the length of the longest consecutive sequence of elements.

// A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.

// You must write an algorithm that runs in O(n) time
package NotOut150;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static void  main(String[] args) {
    
        int nums [] = { 2,20,4,10,3,4,5} ;
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        int longest = 0;

        for (int i = 0 ; i < nums.length ; i++){
            if(!set.contains(nums[i] -1)){
                int length = 1;
                while(set.contains(nums[i] + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        System.out.println(longest);
    }
}
