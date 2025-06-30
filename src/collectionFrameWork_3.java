import java.util.ArrayList;
import java.util.List;

public class collectionFrameWork_3 {
    public static void main(String[] args) {
                List<String> num=new ArrayList<>();
                num.add("apple");
                num.add("banana");
                num.add("orange");
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


