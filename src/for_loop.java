import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
         factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
