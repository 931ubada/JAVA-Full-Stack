import java.util.Scanner;

public class if_else_ladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a,b,c values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c)
            System.out.println(a);
        else if(b>=a && b>=c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
