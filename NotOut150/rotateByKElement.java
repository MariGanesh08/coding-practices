package NotOut150.Array_and_Hashing;
import java.util.*;
/* bruteforce approach
public class rotateByKElement {
    static void rotate(int arr[], int k){
        int len = arr.length;
        k = k % len;

        int newarr[] =  new int[len];

        for(int i = 0 ; i < k ; i++){
            newarr[i] =  arr[len-k+i]; 
        }
        for(int i = k ; i < len ; i++){
            newarr[i] = arr[i-k];
        }

        for(int i = 0 ; i < len ; i++){
            System.out.print(newarr[i] + " ");
        }
    }
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;

            rotate(arr, k);

            System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
 */


public class rotateByKElement {
    static void rotate(int arr[] , int k){
        int n = arr.length;
        k = k % n ;
        // reverse the whole array
        reverse(arr, 0 ,n-1); //[7, 6, 5, 4, 3, 2, 1]
        // reverse the k element
        reverse(arr, 0 , k-1); //[5, 6, 7, 4, 3, 2, 1]
        // reverse the rest element
        reverse(arr, k , n-1); // [5, 6, 7, 1, 2, 3, 4]
    }

    static void reverse(int arr[] , int start , int end){
       
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}