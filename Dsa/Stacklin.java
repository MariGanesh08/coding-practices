//import java.util.*;
public class Stacklin {
    Node top = null;
    public  void push(int data){
        Node newnode = new Node(data);
        newnode.next = top;;
        top = newnode;
        System.out.printf("%d is Pushed", data);
        System.out.println();
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("No element in stack");
        }
        System.out.println("popped element is :" + top.data);
        top = top.next;

    }
    public boolean isEmpty(){
        return top == null;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Stacklin  sl = new Stacklin();
        sl.push(10);
        sl.pop();
        sl.push(20);
        sl.display();
    }
}
