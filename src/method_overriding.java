class parent1
{
    public void mobile()
    {
        System.out.println("Nokia");
    }
}

class child1 extends parent1
{
    // when there is no method in child class the output shows NOKIA whic is of parent class
    public void mobile()
    {
        System.out.println("Samsung");    // after declairing method the compiler ovrrrides
                                          // the parent class and displays the child class output
    }
}

public class method_overriding
{
    public static void main(String[] args) {
        child1 obj=new child1();
        obj.mobile();
    }
}
