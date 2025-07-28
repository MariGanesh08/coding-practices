package NotOut150.Array_and_Hashing;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        
        int i = 0;
        for(int j = 1 ; j< arr.length ; j++){
            if(arr[j] != arr[i]){
                arr[++i] = arr[j];
            }
        }
        int len = i+1;
        for(int k = 0; k < len ; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
