// Container with Most Water – Hard Level Problem
// You are given an array heights, where each element heights[i] represents the height of a vertical bar at position i. Your task is to select any two bars to form a container, with the width of the container being the distance between the two bars.

// The goal is to find the maximum amount of water that this container can hold. Return the largest possible value of water that can be stored.
package NotOut150.TwoPointer;
public class waterContainer{
    public static void main(String[] args){

        int arr[] = {1,7,2,5,4,7,3,6};
        int left = 0;
        int right = arr.length -1;
        int result = 0;

        while(left < right){
            int area = Math.min(arr[left], arr[right]) * (right - left);
            result = Math.max(result, area);
            if(arr[left] <= arr[right]){
                left++;
            }else {
                right--;
            }
        }

        System.out.println(result);
    }
}