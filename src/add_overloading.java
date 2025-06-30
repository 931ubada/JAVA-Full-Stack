import java.util.Scanner;
class add {
    public void add1(float a,float b){
        System.out.println(a+b);
    }
    public void add1(float a,float b,float c) {
        System.out.println(a+b+c);
    }
}
public class add_overloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        add obj=new add();
        obj.add1(a,b);
        obj.add1(a,b,c);
    }
}
