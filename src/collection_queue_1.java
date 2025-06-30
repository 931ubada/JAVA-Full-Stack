import java.util.LinkedList;
import java.util.Queue;

public class collection_queue_1 {
    public static void main(String[] args) {
        Queue<String> name=new LinkedList<>();
        name.offer("Ajay");
        name.offer("abhi");
        name.offer("bihari");
        System.out.println(name);
        System.out.println(name.peek());
        System.out.println(name);
        name.poll();
        System.out.println(name);
        System.out.println(name.poll());
        System.out.println(name);

    }
}
