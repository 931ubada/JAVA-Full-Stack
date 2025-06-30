public class array1 {
    public static void main(String[] args) {
        int a[]={5,3,6,2,7,1,9};
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        int sum=0;
        for (int i=0;i<a.length;i++)
            sum=sum+a[i];
        System.out.println(sum);
    }
}
