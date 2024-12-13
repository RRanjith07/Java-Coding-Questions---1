package practice;

public class FirstCharFromString {
    public static void extractChar(String str) {
        String result = "";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            result = result + words[i].charAt(0) + " ";
        }
        result = result + words[words.length - 1];
        System.out.println(result);
    }

    public static void arrayIteration(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void stringIteration(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        //extractChar("Sachin Arjun Ramesh Tendulkar");
        //arrayIteration(arr);
        int arr[] = {1, 4, 5, 6, 7};
        String str = "Ranjith";
        stringIteration(str);
    }
}
