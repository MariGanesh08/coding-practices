package searching;

public class linear {
    public static void search(int arr[], int n , int target){
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == target){
                System.out.println("element found");
                return;
            }
            
        }
        System.out.println("element not");
    }
    public static void main(String[] args) {
        int arr[] = {9,7,2,3,1};
        int key  = 2;
        linear.search(arr, arr.length,key);


    }
}
