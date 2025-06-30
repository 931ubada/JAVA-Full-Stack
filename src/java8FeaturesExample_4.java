import java.util.Scanner;

/*interface asd
{
    void addi(int a,int b);
    void sub(int a,int b);
    void mult(int a,int b);
}*/

interface addition
{
    void ad(int a,int b);
}
interface substraction
{
    void sub(int a,int b);
}
interface mutiplication
{
    void mult(int a,int b);
}

/*class demo6 implements asd
{
    public void addi(int a,int b)
    {
        System.out.println(a+b);
    }
    public void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    public void mult(int a,int b)
    {
        System.out.println(a*b);
    }
}*/
public class java8FeaturesExample_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int c=sc.nextInt();
        int d=sc.nextInt();
        addition obj=(a,b) -> System.out.println(a+b);
        substraction obj1=(a,b) -> System.out.println(a-b);
        mutiplication obj3=(a,b) -> System.out.println(a*b);
        /*{

            public void addi(int a, int b) {
                System.out.println(a + b);
            }

            public void sub(int a, int b) {
                System.out.println(a - b);
            }

            public void mult(int a, int b) {
                System.out.println(a * b);
            }
        };
        obj.addi(a,b);
        obj.sub(a,b);
        obj.mult(a,b);*/
        obj.ad(c,d);
        obj1.sub(c,d);
        obj3.mult(c,d);

    }
}
