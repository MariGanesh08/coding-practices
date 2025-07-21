import java.util.*;

public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    Stack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
        } else {
            stackArray[++top] = data;
            System.out.println(data + " pushed.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println(stackArray[top--] + " popped.");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stackArray[top]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int n = sc.nextInt();
        Stack stack = new Stack(n);

        while (true) {
            System.out.println("\nWhat do you want?");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top Element");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 0:
                    System.out.println("Exiting..");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
