import java.sql.SQLOutput;
import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the variable ");
        int a=sc.nextInt();
        System.out.println("Enter variable b ");
        int b=sc.nextInt();
        System.out.println("add="+(a+b));
        System.out.println("sub="+(a-b));
        System.out.println("mult="+(a*b));
        System.out.println("div="+(a/b));
        System.out.println("mod="+(a%b));


    }
}
