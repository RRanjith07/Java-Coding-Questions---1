package practice;

public class ThirdLargestElement {
    private static void countChar(String str, char ch) {
        char ch2 = Character.toLowerCase(ch);
        String str2 = str.toLowerCase();
        int count = 0;
        for (char ch1 : str2.toCharArray()) {
            if (ch1 == ch2) {
                count++;
            }
        }
        System.out.println(count);

    }

    private static void thirdLargestElement(int arr[]) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
//        HashSet<Integer> set = new HashSet<Integer>();
//        for (int number : arr) {
//            if (set.contains(number)) {
//                continue;
//            }
//            set.add(number);

        for (int number: arr){
            if (number>firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = number;
            }
            else if (number>secondLargest && number<firstLargest){
                thirdLargest = secondLargest;
                secondLargest = number;
            }
            else if (thirdLargest<number && number<secondLargest ){
                thirdLargest = number;
            }
        }
        System.out.println("First Largest: " + firstLargest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Third Largest: " + thirdLargest);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8, 8, 9, 9, 10, 100,10};
//        String s = "Ranjith";
        thirdLargestElement(arr);
//        countChar(s, 'R');
    }
}
