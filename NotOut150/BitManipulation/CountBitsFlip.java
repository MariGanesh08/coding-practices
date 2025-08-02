package NotOut150.BitManipulation;

public class CountBitsFlip {
    public static void main(String[] args) {
        int n = 10;
        int target = 5;
        int ans = n ^ target;
        System.out.println(Integer.bitCount(ans));
    }
}
