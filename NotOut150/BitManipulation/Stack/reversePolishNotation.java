package NotOut150.Stack;
import java.util.*;
public class reversePolishNotation {

    public static void main(String[] args) {
        String tokens[] = {"1","2","+","3","*","4","-"};
        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens){
            if(!isoperator(s)){
                stack.push(Integer.parseInt(s));
            }
            else {
                int second_val = stack.pop();
                int first_val = stack.pop();
                int result = calc(first_val,second_val,s);
                stack.push(result);
            }
        }
        System.out.println(stack.pop());
    }

    static boolean isoperator(String s){
        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }

    static int calc(int a , int b , String op){
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            
            default:
                throw new  IllegalArgumentException("invalid input" + op);
        }
    }
}
