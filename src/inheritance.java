class parent
{
    public void A()
    {
        System.out.println("parent");
    }
}
class child extends parent
{

    public void B()
    {
        System.out.println("extra");
    }
}

public class inheritance
{
    public static void main(String[] args) {
        child obj=new child();
        parent obj1=new parent();
        obj1.A();      // obj1--gives only output from parent class
        obj.B();       // obj-- gives output from child class
        obj.A();

    }
}
