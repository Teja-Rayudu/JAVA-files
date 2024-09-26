public class Stack2 {
    private Node top;

    public Stack2() {
        this.top = null;
    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to the stack.");
    }

    // Method to pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop elements.");
        } else {
            System.out.println(top.data + " popped from the stack.");
            top = top.next;
        }
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return top.data;
        }
    }


    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        System.out.println("Name:JAGADAM RAHUL BABU");
        System.out.println("Reg. no.: 22BCE20501");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element of the stack: " + stack.peek());

        stack.pop();
        System.out.println("Top element of the stack after pop operation: " + stack.peek());
    }
}