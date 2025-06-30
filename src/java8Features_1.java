interface ABC
{
    static void demo()   // default can aslo be used
    {
        System.out.println("demo");
    }
}
class demo1 implements ABC
{

}
public class java8Features_1
{
    public static void main(String[] args) {
        //ABC obj=new demo1();   // when static is used object creation not required
        ABC.demo();
    }
}
