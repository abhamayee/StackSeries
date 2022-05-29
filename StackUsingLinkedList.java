package stack;

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        static Node head;
        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }

        public int pop() {
            if (isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
