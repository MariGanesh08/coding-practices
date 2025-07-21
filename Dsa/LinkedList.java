package Dsa;
import java.util.*;

import LinkedList;
import Node;

public class LinkedList {
    Node head = null;
    int currentSize = 0;
    public void insertAtEnd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            System.out.println("Added Element is :"+ data);
            currentSize++;
            return;
        }else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
            currentSize++;
            System.out.println("Added Element is :" + data);
        }
        
    }
    public void insertAtFirst(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        currentSize++;
        System.out.println("Added Element is :" + val);
    }
    public void insertAtPos(int pos , int value){
        if(pos < 0 || pos > currentSize){
            System.out.println("Invalid Position");
            return;
        }
        Node newnode = new Node(value);
        if (pos == 0){
            newnode.next = head;
            head = newnode;
        }else {
            Node temp = head;
            for(int i = 0 ; i < pos-1 ; i++){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;   
        }
        currentSize++;
        System.out.println("Added Element is :"+ value);    
    }
  
    public  void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // 4 6 2 6 1 3
    //   t
    public void delete(int val){

        if (head == null){
            System.out.println("The list is Empty");
            return;
        }
        if(head.data == val){
            head = head.next;
            currentSize--;
            System.out.println(val + "is Deleted from the list");
            return;
        }
        Node temp = head;
       
        while(temp.next != null && temp.next.data != val){
            temp = temp.next;
        }
        
        if(temp.next == null){
            System.out.println("The Element "+ val + "is not found");
            return;
        }else {
            temp.next = temp.next.next;
            currentSize--;
            System.out.println(val + "is Deleted from the list");
        }
    }
    public int Size(){
        return currentSize;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        boolean state = true;
        while(state){
            System.out.println("What do you want :\n"+
                                "1. Insert at end\n" +
                                "2. Insert at first\n" +
                                "3. Insert at desired position\n" +
                                "4. display the list\n" + 
                                "5. Delete By Value\n" +
                                "6. current size\n" +
                                "7.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert:");
                    int value = sc.nextInt();
                    ll.insertAtEnd(value);
                    break;
                case 2:
                    //insert at first
                    System.out.print("Enter the value to insert:");
                    int first_val = sc.nextInt();
                    ll.insertAtFirst(first_val);
                    break;
                case 3:
                    System.out.print("Where to insert:");
                    int pos = sc.nextInt();
                    System.out.print("Enter the value :");
                    int val = sc.nextInt();
                    ll.insertAtPos(pos,val);
                    break;
                case 4:
                    ll.display();
                    break;
                case 5:
                    //delete by value
                    System.out.println("Enter the value to delete");
                    int del_value = sc.nextInt();
                    ll.delete(del_value);
                    break;
                case 6:
                    int s = ll.Size();
                    System.out.println("Current Size is :"+ s );
                    break;
                case 7:
                    state = false;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            
        }
        sc.close();
    
    }


}
