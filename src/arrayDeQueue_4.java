import java.util.ArrayDeque;

public class arrayDeQueue_4 {
    public static void main(String[] args) {
        ArrayDeque<String> dq=new ArrayDeque<>();
        dq.add("a");
        dq.offer("b");
        dq.add("c");
        dq.offer("d");
        System.out.println(dq);
        dq.addFirst("z");
        System.out.println(dq);
        dq.addLast("e");
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.peek());
        dq.push("G");
        System.out.println(dq);
        System.out.println(dq.pop());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.clear();
        System.out.println(dq);
        dq.offerFirst("i");
        System.out.println(dq);
        dq.offerLast("j");
        System.out.println(dq);
        System.out.println(dq.clone());
        System.out.println(dq.contains("J"));
        System.out.println(dq.getFirst());
        System.out.println(dq.size());

    }
}
