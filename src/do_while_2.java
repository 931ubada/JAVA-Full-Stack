import java.util.Scanner;

public class do_while_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int num= sc.nextInt();
        int i=1;
        int sum=0;
        do
        {
            sum=sum+i;
            i++;
        }while(i<=num);
        System.out.println(sum);
    }
}
