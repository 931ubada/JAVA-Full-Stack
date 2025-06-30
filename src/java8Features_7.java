import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class java8Features_7 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(li);
        Stream<Integer> si=li.stream();
        /*Predicate<Integer> p=new Predicate<Integer>()
        {
            public boolean test(Integer i)
            {
                return i%2==0;
            }
        };*/
        System.out.println("Even no. are");
        /*li.stream().filter(new Predicate<Integer>()     // from line 19 to 25 is again anonymous class.
        {                                               // so we can reduce it using lamda function
            public boolean test(Integer i)
            {
                return i%2==0;
            }
        }).forEach(System.out::println);*/
        li.stream().filter((i) -> i%2==0)       // as li.stream().filter().foeEach() is a one complete
        .forEach(System.out::println);                 // line of code therefore no semicolon is required
                                                       //in 26 and 27 line
    }
}
