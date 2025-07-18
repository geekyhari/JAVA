package Queue;

public class Basics {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int s){
            arr = new int[s];
            this.size = s;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue Full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
