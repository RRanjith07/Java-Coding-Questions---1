package practice;

class DuplicateArrayElements{
    private static int[] arr;

    private static void duplicateArrayElements(int[] arr) {
        boolean duplicateFound = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    duplicateFound = true;
                }
            }
        }
        if(!duplicateFound){
            System.out.println("There is no duplicate found in the given array");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,9,9};
        duplicateArrayElements(arr);
    }
}