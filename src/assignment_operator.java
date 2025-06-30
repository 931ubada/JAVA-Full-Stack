import java.util.Scanner;

public class assignment_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int a=sc.nextInt();
       /* int b=sc.nextInt();*/
        System.out.println(a+=2);
        System.out.println(a-=2);
        System.out.println(a<<=2);
        System.out.println(a>>=2);
        System.out.println(a/=2);
        System.out.println(a*=2);

    }
}
