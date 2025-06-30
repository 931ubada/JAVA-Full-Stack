import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class java8Features_9 {
    public static void main(String[] args) {
        List<Integer> lli= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        /*BinaryOperator<Integer> p=new BinaryOperator<Integer>()
        {
            public Integer apply(Integer i,Integer j)
            {
                return i+j;
            }
        };*/
        /*Integer sum=lli.stream().filter(i -> i%2==0).map(i -> i*2)
                .reduce(0,(i,j) -> i+j);*/   // using lambda in .reduce()
        Integer sum=lli.stream().filter(i -> i%2==0).map(i -> i*2)
                        .reduce(0,Integer:: sum);   // using method referance in .reduce()
        System.out.println(sum);

    }
}
