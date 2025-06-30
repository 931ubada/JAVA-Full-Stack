import java.util.Stack;

public class Stack_5 {
    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
       st.add(1);
       st.push(4);
       System.out.println(st);
       System.out.println(st.peek());
       st.pop();
       System.out.println(st);
        st.remove(0);
        System.out.println(st);
    }
}
