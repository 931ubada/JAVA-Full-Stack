import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num=sc.nextInt();
        int first=0;
        int second=1;
        int i=1;
        System.out.print(first +" "+ second+ " ");
        int sum=first + second;
        while(i<=num)
        {
            System.out.print(sum +" ");
            first=second;
            second=sum;
            sum=first + second;
            i++;
        }
    }

}
