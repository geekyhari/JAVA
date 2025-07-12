package LinkedList;

import java.util.Scanner;

public class Practice_1 {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void add(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = temp;
    }

    public void search(int s){
        int in=-1;
        Node ptr = head;
        while(ptr != null){
            in++;
            if(ptr.data == s){
                System.out.println("Found at index "+in);
                return;
            }
            ptr = ptr.next;
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Practice_1 list = new Practice_1();
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the search element");
        list.search(sc.nextInt());
    }
}
