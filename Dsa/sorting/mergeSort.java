package sorting;

import java.util.ArrayList;

public class mergeSort {
    private static void merge(int arr[], int low , int mid , int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else {
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        while(right <= high){
            list.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = list.get(i-low);
        }
    }

    public static void mergesort(int[] arr, int low , int high){
        if(low >= high) return ;
        int mid = (low + high )/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low , mid, high);

    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};
        mergeSort.mergesort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
