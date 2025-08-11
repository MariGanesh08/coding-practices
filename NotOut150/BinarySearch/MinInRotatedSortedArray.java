/*
 Problem Statement
You are given a rotated sorted array nums of unique integers. A rotated sorted array is formed by taking a sorted ascending array and rotating it at some pivot index, such that the resulting array remains partially sorted.

For example:

Original sorted array: [0, 1, 2, 4, 5, 6, 7]

After rotation at pivot index 3: [4, 5, 6, 7, 0, 1, 2]

Your task is to find and return the minimum element in the rotated sorted array in O(log n) time complexity.
 */

package NotOut150.BinarySearch;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] ={4, 5, 6, 7, 0, 1, 2};
        int value = findMin(nums);
        System.out.println("Minimum element :"+value);
    }
    static int findMin(int nums[]){
        int low = 0 ;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + ( high - low ) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else {
                high = mid  ;
            }
        }
        return nums[low];
    }
}
