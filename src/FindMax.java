import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        //enter the size of array
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        //enter elements of array
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        //print the array
        System.out.print("The list is: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        //find max
        int maxValue = array[0];
        for (int j = 0; j < array.length; j++){
            if (maxValue < array[j]){
                maxValue = array[j];
            }
        }
        System.out.print("The largest value in the list is "+maxValue+", at position(s) ");

        //find positions of max
        for (int j = 0; j < array.length; j++){
            if (array[j] == maxValue){
                System.out.print("\t"+(j+1)+"\t");
            }
        }

    }
}
