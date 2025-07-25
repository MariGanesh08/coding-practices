package searching;
import java.util.*;

public class binary {
    public static int search(int arr[], int n, int target){
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;  
            } else {
                low = mid + 1;   
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
        int arr[] = {9, 7, 2, 3, 1};
        Arrays.sort(arr);  

        int key = 3;
        int result = binary.search(arr, arr.length, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
