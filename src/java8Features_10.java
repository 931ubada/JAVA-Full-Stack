import java.util.Arrays;
import java.util.List;

public class java8Features_10 {
    public static void main(String[] args) {
        List<Integer> ll= Arrays.asList(8,32,12,24,8,54,12,30);
        System.out.println(ll);
        ll.stream().sorted().skip(4).distinct().forEach(System.out::println);
        long l=ll.stream().count();
        System.out.println(l);
    }
}
