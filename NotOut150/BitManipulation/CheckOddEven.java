package NotOut150.BitManipulation;

public class CheckOddEven {
    public static void main(String[] args) {
        int n = 5;
        int ans = n & 1;
        System.out.println((ans == 1) ? "ODD" : "EVEN");
    }
}
