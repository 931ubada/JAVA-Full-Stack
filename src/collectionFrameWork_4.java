import java.util.LinkedList;
import java.util.List;

public class collectionFrameWork_4 {
    public static void main(String[] args) {
        List<String> name=new LinkedList<>();
        name.add("a");
        name.add("b");
        System.out.println(name);
        name.addFirst("z");
        System.out.println(name);
        name.addLast("y");
        System.out.println(name);
        name.remove("a");
        System.out.println(name);
        name.remove(1);
        System.out.println(name);
        name.removeLast();
        System.out.println(name);
        name.removeFirst();
        System.out.println(name);
        name.add("d");
        name.add("e");
        name.add("f");
        System.out.println(name);
        System.out.println(name.reversed());
        System.out.println(name.size());
        name.clear();
        System.out.println(name);
    }
}
