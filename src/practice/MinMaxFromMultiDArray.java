package practice;

public class MinMaxFromMultiDArray {
    private static void printMinMax(int arr[][]){
        int minNumber = arr[0][0];
        int maxNumber = arr[0][0];

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(minNumber>arr[i][j]){
                    minNumber = arr[i][j];
                }
                if (maxNumber<arr[i][j]){
                    maxNumber = arr[i][j];
                }
            }
        }
        System.out.println("Minimum Number is: "+minNumber);
        System.out.println("Maximum Number is: "+maxNumber);
    }
    public static void main(String[] args) {
        int arr[][] = {{20,4,5}, {3,4,7}, {1,2,9}};
        printMinMax(arr);
    }
}
