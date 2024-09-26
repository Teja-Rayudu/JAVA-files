public class Stack {
    int size=0;
    int capacity;
    int[] arr;
    Stack(int capacity){
        this.capacity=capacity;
        arr = new int[capacity];
    }
    public void push(int value){
        if(size>=capacity){
            System.out.println("Stack is full");
        }
        else{
            arr[size]=value;
            System.out.println(value + " added.");
            size++;
        }
    }
    boolean checkfull(){
        if(size==capacity){
           return true;
        }
        else return false;
    }
    void pop(){
        if(size==0){
            System.out.println("Stack is empty");
        }
        else{
            size--;
            System.out.println(arr[size]+" removed.");
            arr[size]=0;
        }
    }
    void display(){
        if(size==0){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack: " );
            for(int i=0; i<size; i++){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
    }
    void size(){
        System.out.println("Stack size is "+size);
    }
    void peek(){
        System.out.println("Peeking: "+arr[0]);
    }
    boolean isempty(){
        if(size==0){
            return true;
        }
        else return false;
    }
    void clear(){
        if(size==0){
            System.out.println("Stack is empty");
        }
        else {
            for (int i = 0; i < size; i++) {
                arr[i] = 0;
            }
            size=0;
        }
    }

    public static void main(String[] args) {
        Stack sc = new Stack(6);
        System.out.println("Name: JAGADAM RAHUL BABU");
        System.out.println("Reg. no.: 22BCE20501");
        sc.push(0);
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.pop();
        sc.pop();
        sc.size();
        sc.peek();
        System.out.println(sc.isempty());
        sc.display();
        sc.clear();
        sc.display();
    }
}
