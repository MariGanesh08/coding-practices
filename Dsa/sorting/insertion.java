package sorting;

public class insertion {
    
    public static void sort(int arr[] , int n){
        for(int i = 1 ; i< n ; i++){
            int key = arr[i];
            int j = i-1;
            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,7,2,3,1};
        insertion.sort(arr, arr.length);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
