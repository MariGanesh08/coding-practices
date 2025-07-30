package NotOut150.TwoPointer;

public class validPalindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        int start = 0;
        int end = s.length()-1;

        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                System.out.println("false");
                return;
            }
            start++;
            end--;
        }
        System.out.println("true");

    }
}
