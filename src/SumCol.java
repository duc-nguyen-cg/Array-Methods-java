import java.util.Scanner;

public class SumCol {
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

        //Enter the column that needed to be computed
        int indexCol;
        do {
            System.out.println("Enter the column you want to compute: ");
            indexCol = sc.nextInt()-1;
            if (indexCol >= cols || indexCol < 0){
                System.out.println("Out of range");
            }
        } while (indexCol >= cols || indexCol < 0);

        //compute sum of the chosen column
        int sum = 0;
        for (int row = 0; row < rows; row++){
            sum += array[row][indexCol];
        }

        //print the result
        System.out.println("Sum of column "+(indexCol+1)+" is "+sum);
    }
}
