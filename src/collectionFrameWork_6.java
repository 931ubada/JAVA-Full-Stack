import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class collectionFrameWork_6 {
    public static void main(String[] args) {
                Vector<String> name=new Vector<>();
                name.add("V");
                name.add("J");
                System.out.println(name);
                name.addFirst("1");
                System.out.println(name);
                name.addLast("5");
                System.out.println(name);
                name.remove("a");
                System.out.println(name);
                name.remove(1);
                System.out.println(name);
                name.removeLast();
                System.out.println(name);
                name.removeFirst();
                System.out.println(name);
                name.add("J");
                name.add("2");
                name.add("1");
                System.out.println(name);
                System.out.println(name.reversed());
                System.out.println(name.size());
                name.clear();
                System.out.println(name);
            }
        }
