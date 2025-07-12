package LinkedList;
public class Basics {
    Node head;
    private int size;

    Basics(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add-1st
    public void addFirst(String data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    //add-last
    public void addLast(String data){
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

    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    public void print(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node ptr = head;
        System.out.println();
        while(ptr != null){
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Basics list = new Basics();
        list.addFirst("hi");
        list.addFirst("helo");
        list.addLast("Shrihari");
        list.print();

        list.deleteFirst();
        list.deleteLast();
        list.print();
        System.out.println(list.getSize());
    }
}
