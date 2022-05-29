package stack;

public class StackUsingArray {
    static class Stack {
        int MAX = 5;
        int top = -1;
        int[] arr = new int[MAX];

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(int data) {
            if(top == MAX-1) {
                System.out.println("Overflow");
                return;
            }
            arr[++top] = data;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            int data = arr[top];
            --top;
            return data;
        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            return arr[top];
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
