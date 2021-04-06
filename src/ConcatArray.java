public class ConcatArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        int[] arr3 = new int[arr1.length+ arr2.length];

        //concat arr1 and arr2 into arr3
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++){
            arr3[i] = arr2[i-arr1.length];
        }

        //print the result
        for (int j = 0; j < arr3.length; j++){
            System.out.print(arr3[j]+"\t");
        }
    }
}
