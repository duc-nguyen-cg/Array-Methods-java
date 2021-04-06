import java.util.Scanner;

public class FindMin2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;

        //enter the size
        do {
            System.out.println("Enter the length of the array: ");
            size = sc.nextInt();
            if (size > 10){
                System.out.println("The length of this array should not exceed 10");
            }
        } while (size > 10);

        //enter elements
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Enter the value for element "+(i+1)+": ");
            array[i] = sc.nextInt();
        }

        //print the array
        System.out.println("The input array is: ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();

        //find min
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < size; i++){
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }

        //print result
        System.out.println("The smallest value is "+min+", at position "+(minIndex+1));
    }
}
