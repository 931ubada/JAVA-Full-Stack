import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class java8Features_6
{
    public static void main(String[] args)
    {
        List<Integer> ll = Arrays.asList(1, 2, 3, 4, 5);
       /* Consumer<Integer> obj = new Consumer<Integer>()     // Anonymous class
        {
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };*/
       // Consumer<Integer> obj=i -> System.out.println(i);  //Lambda function
        // ll.forEach(obj);
        ll.forEach(System.out :: println);   // using method reference
    }
}
