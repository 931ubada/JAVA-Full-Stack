import javax.crypto.spec.PSource;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+" ");
        int max=a[0];
        for(int i=1;i<a.length;i++)
            if (a[i]>max)
                max=a[i];
        System.out.println("max element in array is: "+max);
    }
}

