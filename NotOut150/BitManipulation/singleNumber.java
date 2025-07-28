// a given array of integers, every element appears twice except for one number.

// Your task is to identify the integer that appears only once, using an efficient algorithm that operates in linear time and constant space.
package NotOut150.BitManipulation;
import java.util.*;

public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0 ; i < n ; i++){
            int value = sc.nextInt();
            arr[i] = value;
        }
        sc.close();

        int result = 0;
        for(int a : arr){
            result = result ^ a;
        }
        System.out.println("The single number is " + result);
    }
}
