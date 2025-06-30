import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueReverse_string_7 {
    public static void main(String[] args) {
        Queue<Character> queue=new LinkedList<>();
        Stack<Character> stack=new Stack<>();
        queue.offer('u');
        queue.offer('b');
        queue.offer('a');
        queue.offer('d');
        queue.offer('a');
        System.out.println("Original Queue "+queue);
        /*int size=queue.size();
        for (int i=0;i<size;i++){
            stack.push(queue.poll());
        }

        for (int i=0;i<size;i++)
        {
            queue.offer(stack.pop());
        }
        System.out.println("Reversed queue "+queue);*/

        // USING WHILE LOOP

        while(!queue.isEmpty())
        {
            stack.push(queue.poll());
         }
         while(!stack.isEmpty())
         {
            queue.offer(stack.pop());
          }
          System.out.println(queue);

    }
}
