import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=2;
        array[1]=7;
        array[2]=2;
        array[3]=5;
        array[4]=3;
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        Scanner sc=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enetr the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array numbers:");
        for (int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("Array elements are: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

    }
}
