interface A2
{
    public void display();
}
class B2 implements A2
{
    public void display()
    {
        System.out.println("fetch the details");
    }
}
public class interface__1 {
    public static void main(String[] args) {
        B2 obj=new B2();
        obj.display();

    }
}
