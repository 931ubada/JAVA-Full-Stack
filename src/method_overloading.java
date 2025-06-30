import java.util.Scanner;

class ca1
{
    public void bmw(String a,String b)
    {
        System.out.println(a+" "+b+" ");
    }
    public void bmw(String a,String b,String c)
    {
        System.out.println(a+" "+b+" "+c+" ");
    }
}

public class method_overloading
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car name");
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        ca1 obj=new ca1();
        obj.bmw(a,b);
        obj.bmw(a,b,c);
    }

}
