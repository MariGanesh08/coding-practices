package sorting;

public class selection {

    public static void sort(int[] arr , int n){
        for(int i = 0 ; i < n ; i++){
            int min_idx = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,7,2,3,1};
        selection.sort(arr, arr.length);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
