import java.util.LinkedHashSet;
import java.util.Set;

public class set_hashSet_2 {
    public static void main(String[] args) {

        Set<String> animal = new LinkedHashSet<>();
        animal.add("lion");
        animal.add("monkey");
        animal.add("parrot");
        animal.add("kangaroo");
        System.out.println(animal);

    }
}