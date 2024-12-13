package practice;

public class Fibonoccii {
    // 0 1 1 2 3 5 8 13 21
    public static void main(String[] args) {
       int t1 = 0, t2 =1;

       for (int i=0;i<=10;i++){
           System.out.println(t1+" ");
           int sum = t1+ t2;
           t1 = t2;
           t2 = sum;
       }
    }
}
