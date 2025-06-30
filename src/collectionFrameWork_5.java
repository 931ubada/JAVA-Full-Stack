import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collectionFrameWork_5 {
    public static void main(String[] args) {
        List<Integer> nu=new LinkedList<>();
        nu.add(3);
        nu.add(1);
        nu.add(1);
        nu.add(3);
        nu.add(6);
        nu.add(1);
        System.out.println(nu);
        nu.addFirst(9);
        System.out.println(nu);
        nu.addLast(9);
        System.out.println(nu);
        nu.add(3,9);
        System.out.println(nu);
        nu.add(7,9);
        System.out.println(nu);
    }
    }