import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>=b)
            if(a>=c)
                System.out.println("a is largest");
            else
                System.out.println("c is largest");
        else if(b>=c)
            System.out.println("b is largest");
        else
            System.out.println("c is largest");
    }
}
