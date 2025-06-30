import java.util.Scanner;

class calc{
    public int add(int a, int b)
    {
        return a+b;
    }
    public void subs(int a,int b)
    {
        System.out.println(a-b);
    }
    public void mult(int a,int b)
    {
        System.out.println(a*b);
    }
    public void div(float a,float b)
    {
        if (b==0) {
            System.out.println("value of b cannot be 0");
            return;
        }
        else
            System.out.println(a/b);

    }
    public void mod(int a,int b)
    {
        if (b==0) {
            System.out.println("value of b cannot be 0");
            return;
        }
        else
            System.out.println(a%b);
    }
}
public class method_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        calc obj=new calc();
        System.out.println(obj.add(a,b));
        obj.subs(a,b);
        obj.mult(a,b);
        obj.div(a,b);
        obj.mod(a,b);
    }
}
