import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class java8Features_8 {
    public static void main(String[] args) {
        List<Integer> ll= Arrays.asList(1,2,3,4,5,6);
        System.out.println(ll);
        /*Function<Integer,Integer> f=new Function<Integer,Integer>()
        {
            public Integer apply(Integer i)
            {
                return i*2;
            }
        };*/
        ll.stream().filter(i-> i%2==0).map(i -> i*2).forEach(System.out::println);
    }
}
