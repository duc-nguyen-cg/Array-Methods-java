import java.util.Scanner;

public class FindMax2 {
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

        //Find the maximum
        int max = array[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                if (array[row][col] > max){
                    max = array[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        //print result
        System.out.println("The largest value is "+max+", at row "+(maxRow+1)+" and column "+(maxCol+1));
    }
}
