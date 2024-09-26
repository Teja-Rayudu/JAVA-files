import java.util.Stack;
public class StackArr {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(6);
        for(Integer i : st){
            System.out.println(i);
        }
    }
}
