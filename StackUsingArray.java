public class StackUsingArray {
private int maxSize;
private int top;
private int[] stackArray;
   public StackUsingArray(int size) {
         maxSize = size;
        stackArray = new int[maxSize];
          top = -1;

}
           public boolean isEmpty() {
            return (top == -1);
           }
          public boolean isFull() {
            return (top == maxSize - 1);
          }
                public void push(int value) {
                   if (isFull()) {
                      System.out.println("Stack is full. Cannot push " + value); 
                    }
                  else {
                      stackArray[++top] = value;
                      System.out.println(value + " pushed onto the stack.");
                    }
                }
                public int pop() {
                     if (isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                                  return -1;
                    } 
                    else {
                           int poppedValue = stackArray[top--];
                         System.out.println(poppedValue + " popped from the stack.");
                          return poppedValue;
                      }
                }
                public int peek() {
                   if (isEmpty()) {
                   System.out.println("Stack is empty.");
                         return -1;
                    } 
                   else {
                         return stackArray[top];
                    }
                }
                   public void display() {
                if (isEmpty()) {
                    System.out.println("Stack is empty.");
                } 
               else {
                  System.out.print("Stack (top to bottom): ");
                  for (int i = top; i >= 0; i--) {
                    System.out.print(stackArray[i] + " ");
                  }
                       System.out.println();
                 }

}      public static void main(String[] args) {
         StackUsingArray stack = new StackUsingArray(5);
          stack.push(1);
          stack.push(9);
          stack.push(8);
            stack.display();
            System.out.println("Top element: " + stack.peek());
             stack.pop();
             stack.display();
             System.out.println("Is the stack empty? " + stack.isEmpty());
             System.out.println("Is the stack full? " + stack.isFull());

}

}
