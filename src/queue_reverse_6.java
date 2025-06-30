import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue_reverse_6 {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        queue.offer(3);
        queue.offer(4);
        queue.offer(2);
        queue.offer(1);
        queue.offer(5);
        System.out.println("Original Queue "+queue);
        int size=queue.size();
        for (int i=0;i<size;i++){
            stack.push(queue.poll());
        }

        for (int i=0;i<size;i++)
        {
            queue.offer(stack.pop());
        }
        System.out.println("Reversed queue "+queue);

        /* USING WHILE LOOP

        while(!queue.isEmpty())
        {
            stack.push(queue.poll());
         }
         while(!stack.isEmpty())
         {
            queue.offer(stack.pop());
          }
          System.out.println(queue);
         */
    }
}
