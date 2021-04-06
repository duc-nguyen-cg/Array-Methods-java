import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args){
        int[][] array;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        array = new int[rows][cols];

        //Enter elements
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                System.out.println("Enter the value for element["+(row+1)+"]["+(col+1)+"]: ");
                array[row][col] = sc.nextInt();
            }
        }

        //Print the array
        System.out.println("The 2-dimensional array is: ");
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                System.out.print(array[row][col]+"\t");
            }
            System.out.println();
        }

        //Compute the sum of two diagonals
        int sum1 = 0, sum2 = 0;
        if (rows == cols){
            for (int i = 0; i < rows; i++){
                sum1 += array[i][i];
            }
            for (int i = 0; i < rows; i++){
                sum2 += array[i][rows-1-i];
            }
            System.out.println("Sum of the left diagonal is "+sum1);
            System.out.println("Sum of the right diagonal is "+sum2);
        } else {
            System.out.println("The input array has no diagonals");
        }

    }
}
