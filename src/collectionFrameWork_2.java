import java.util.ArrayList;
import java.util.List;

public class collectionFrameWork_2 {
    public static void main(String[] args) {
        List<String> num=new ArrayList<>();
        num.add("10");
        num.add("20");
        num.add("30");
        System.out.println(num);
        num.add(1,"40");
        System.out.println(num);
        System.out.println(num.get(1));
        System.out.println(num.remove(2));
        System.out.println(num);
        System.out.println(num.set(2,"50"));
        System.out.println(num);
        System.out.println(num.size());
    }
}
