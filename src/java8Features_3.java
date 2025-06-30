interface ab
{
    //void demo();
    void demo(int a);
}
public class java8Features_3 {
    public static void main(String[] args) {
       // a obj=()-> System.out.println("hello world");
        ab obj=b-> System.out.println("hello world"+b);
        obj.demo(1);
    }
}


