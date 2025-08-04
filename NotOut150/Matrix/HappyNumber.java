public class HappyNumber {
    public static void main(String[] args) {
        int num = 19; // You can change this to test other numbers
        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is not a Happy Number");
        }
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);         // move one step
            fast = sumOfSquares(sumOfSquares(fast)); // move two steps
        } while (slow != fast);

        return slow == 1;
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
