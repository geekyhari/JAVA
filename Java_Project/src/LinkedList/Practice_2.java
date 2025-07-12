package LinkedList;

public class Practice_2 {
    private int size;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    Node head;
    Practice_2(){
        this.size = 0;
    }

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
    public void delete(){
        Node ptr = head;
        if(ptr == null){
            System.out.println("empty");
            return;
        }
        if(ptr.next == null && ptr.data > 25){
            ptr = null;
        }

        while(ptr.next != null){
            if(ptr.data > 25){
//                if(size)
            }
        }
    }

}
