import java.util.Set;
import java.util.TreeSet;

public class set_treeSet_3 {
    public static void main(String[] args) {
        Set<Integer> num=new TreeSet<>();
        num.add(9);
        num.add(3);
        num.add(1);
        num.add(9);
        num.add(1);
        System.out.println(num);
    }
}
