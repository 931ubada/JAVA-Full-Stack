import java.util.Scanner;

public class multi_array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr no of rows and columns: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix1=new int[row][col];
        int[][] matrix2=new int[row][col];
        int[][] matrix3=new int[row][col];
        System.out.println("Enter elements of 1st matrix: ");
        for (int i=0;i<matrix1.length;i++)
        {
            for (int j=0;j<matrix1.length;j++)
                matrix1[i][j]=sc.nextInt();
        }
        System.out.println("Enter elements of 2nd matrix: ");
        for (int i=0;i<matrix2.length;i++)
        {
            for (int j=0;j<matrix2.length;j++)
                matrix2[i][j]=sc.nextInt();
        }
        for (int i=0;i<matrix1.length;i++)
        {
            for (int j=0;j<matrix1.length;j++)
                matrix3[i][j]=matrix1[i][j] + matrix2[i][j];
        }
        System.out.println("Addition is : ");
        for (int i=0;i<matrix2.length;i++)
        {
            for (int j=0;j<matrix2.length;j++) {

                System.out.print(+matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
