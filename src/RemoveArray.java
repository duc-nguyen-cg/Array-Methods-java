import java.util.Scanner;

public class RemoveArray {
    static int[] removeElement(int[] arr, int index) {
        int[] newArray = new int[arr.length-1];
        for (int i = 0; i < index; i++){
            newArray[i] = arr[i];
        }
        for (int i = index+1; i < arr.length; i++){
            newArray[i-1] = arr[i];
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

        //search
        System.out.println("\nEnter the value you want to search: ");
        int searched = scanner.nextInt();
        System.out.print("The value of "+searched+" is at position(s): ");
        boolean check = false;
        int index_del = -1;
        for (int j = 0; j < array.length; j++){
            if (array[j] == searched){
                System.out.print((j+1)+"\t");
                index_del = j;
                check = true;
                break;
            }
        }

        //print result
        if (check){
            System.out.println("\nNew array: ");
            int[] newArray = removeElement(array, index_del);
            displayArray(newArray);
        } else {
            System.out.print("Not found");
        }


    }
}
