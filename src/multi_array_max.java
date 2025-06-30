import java.util.Scanner;

public class multi_array_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("Enetr elemnts of matrix: ");
        for (int i=0;i< matrix.length;i++)
        {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int max=0;
        for (int i=0;i< matrix.length;i++)
            for (int j=0;j< matrix.length;j++)
            {
                if (matrix[i][j]>max)
                    max=matrix[i][j];
            }
        System.out.println("Max element is : "+max);




    }
}
