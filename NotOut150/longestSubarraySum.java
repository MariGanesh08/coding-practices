// Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
package NotOut150.Array_and_Hashing;

public class longestSubarraySum {
    /* brute force approach
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,9};
        int k = 10;
        int maxlen = 0;

        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = i ; j < arr.length ; j++){
                sum += arr[j];
                if(sum == k){
                    maxlen = Math.max(maxlen, j-1+1);
                }
            }
        }
    } */
}