import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        System.out.println("Enetr array elements");
        int a[]=new int[n];
        for (int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<a.length;i++)
            System.out.println(a[i] + " ");

        int even=0,odd=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                even++;
            else
                odd++;

        }
        System.out.println(even+" "+odd);


    }
}
