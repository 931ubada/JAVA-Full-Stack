import java.util.Scanner;

public class multi_RRy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr no of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] matrix3 = new int[row][col];
        System.out.println("Enter elements of 1st matrix: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++)
                matrix1[i][j] = sc.nextInt();
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++)
                System.out.print(matrix1[i][j] + " ");
            System.out.println();
        }
        System.out.println("Transpose matrix: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++)
                System.out.print(matrix1[j][i] + " ");
            System.out.println();

        }
    }
}