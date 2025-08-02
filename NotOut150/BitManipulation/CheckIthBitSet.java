package NotOut150.BitManipulation;

public class CheckIthBitSet {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;

        int ans = ((1 << i) & n);
        System.out.println((ans == 1) ? "SET" : "NOT SET");
    }
}
