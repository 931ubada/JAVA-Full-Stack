class A
{
    void show()
    {
        System.out.println("A");
    }
}
class B extends A
{
    void show1()
    {
        System.out.println("B");
    }
    void display()
    {
        System.out.println("B display");
    }
}
class C extends B
{
    void show()
    {
        System.out.println("C");
    }
    void display()
    {
        System.out.println("C display");
    }
    void greet()
    {
        System.out.println("C greet");
    }
}
public class multilevel_inheritance
{
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        C obj2=new C();
        obj2.greet();;
        obj2.show();
        obj2.display();
        obj.show();
        obj1.show1();
        obj1.show();     // accessing parent class A through child class B using obj1 created for B
        obj1.display();
    }
}
