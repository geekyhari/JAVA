package LinkedList;
class SLL{
    Node head;
    Node tail;
    int count = 0;
    void addend(int val){
        Node temp = new Node(val);
        count++;
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    void addbeg(int val){
        Node temp = new Node(val);
        count++;
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }
    void addpos(int val, int pos){
        if(pos > count + 1 || pos < 1){
            System.out.println("Invalid Position");
            return;
        }
        if(pos == 1) {
            addbeg(val);
            return;
        }
        Node temp = new Node(val);
        count++;
        pos--;
        Node cur = head;

        while(pos != 1){
            cur = cur.next;
            pos--;
        }
        temp.next = cur.next;
        cur.next = temp;
    }
    void print(){
        Node ptr = head;
        while (ptr != null){
            System.out.println(ptr.val);
            ptr = ptr.next;
        }
    }
}
public class Singly {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.addend(10);
        list.addend(20);
        list.addbeg(5);
        list.addend(50);
        list.addpos(300,1);
        list.print();

    }
}
