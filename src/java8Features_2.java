import java.util.ArrayList;
import java.util.List;

public class java8Features_2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(0));
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        for (Integer i:list)
        {
            System.out.println(i);
        }
        list.forEach(i-> System.out.println(i));
    }
}
