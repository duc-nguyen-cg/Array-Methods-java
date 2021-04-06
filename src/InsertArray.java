import java.util.Scanner;

public class InsertArray {
    static int[] insertElement(int[] arr, int index, int value) {
        int[] newArray = new int[arr.length+1];
        for (int i = 0; i < index; i++){
            newArray[i] = arr[i];
        }
        newArray[index] = value;
        for (int i = index+1; i < newArray.length; i++){
            newArray[i] = arr[i-1];
        }
        return newArray;
    }

    static void displayArray(int[] arr){
        for (int element: arr){
            System.out.print(element+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int size = 7;
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7};

        //print the array
        displayArray(array);

        System.out.println("Enter the value you want to insert in: ");
        int value = scanner.nextInt();
        int index_add;
        do {
            System.out.println("Enter the position you want to insert in: ");
            index_add = scanner.nextInt();
            if (index_add < 0 || index_add > array.length){
                System.out.println("Out of range");
            }
        } while (index_add < 0 || index_add > array.length);


        //print result
        System.out.println("\nNew array: ");
        int[] newArray = insertElement(array, index_add, value);
        displayArray(newArray);
    }
}
