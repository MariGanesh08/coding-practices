package sorting;

public class bubble {

    public static void sort(int arr[], int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,7,2,3,1};
        bubble.sort(arr, arr.length);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
