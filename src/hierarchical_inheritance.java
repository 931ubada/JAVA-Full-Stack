class A1
{
    void demo()
    {
        System.out.println("Parent class");
    }
}
class B1 extends A1
{
    void demo()
    {
        System.out.println("child class");
    }
    void demo1()
    {
        System.out.println("child extra class");
    }
}
class C1 extends A1
{
    void demo()
    {
        System.out.println("child class");
    }
    void demo2()
    {
        System.out.println("child extra class");
    }
}

public class hierarchical_inheritance
{
    public static void main(String[] args) {
        B1 obj=new B1();
        C1 obj1=new C1();
        obj.demo();
        obj.demo1();
        obj1.demo();
        obj1.demo2();
    }
}
