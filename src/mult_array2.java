public class mult_array2 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0;i<array.length; i++)
        {
                System.out.println(array[i][array.length-1 -i]);
            }
            System.out.println();
        }
    }

