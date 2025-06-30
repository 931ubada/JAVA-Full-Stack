import java.util.HashSet;
import java.util.Set;

public class set_HashSet_1 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("z");
        set.add("y");
        set.add("d");
        set.add("k");
        set.add("e");
        System.out.println(set);
        set.remove("c");
        System.out.println(set);
    }
}
