import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class collection_queue_2 {
    public static void main(String[] args) {
        Queue<Integer> nu=new LinkedList<>();
        nu.offer(1);
        nu.offer(2);
        nu.offer(3);
        nu.offer(4);
        nu.offer(5);
        System.out.println(nu);
        nu.peek();
        System.out.println(nu.poll());
        System.out.println(nu);
        System.out.println(nu.size());
        nu.poll();
        System.out.println(nu);
        System.out.println(nu.contains(4));
        System.out.println(nu);
        nu.clear();
        System.out.println(nu);
    }
}
