package NotOut150.BitManipulation;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int n = 8;
        int ans = Integer.bitCount(n);
        System.out.println((n != 0 && ans == 1) ? "Power of 2": "Not a power");
    }
}
