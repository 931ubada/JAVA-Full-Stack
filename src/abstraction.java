abstract class hello
{
    abstract void greet();
}
class hai extends hello{
    @Override
    void greet()

    {
        System.out.println("welcome");
    }
}
public class abstraction
{
    public static void main(String[] args) {
        hai obj=new hai();
        obj.greet();
    }
}
