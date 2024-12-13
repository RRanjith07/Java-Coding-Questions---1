package leetcode;

public class Denominations {

    private static void findNotes(int amount){
        int [] denominations = {500,200,100,50,20,10,5,2,1};

        if(amount>=1) {
            for (int denom : denominations) {
                int count = amount / denom;
                if (count >=1) {
                    System.out.println(denom + " Rs " + count + " Notes");
                    amount = amount % denom;
                }
            }
        }
        else{
            System.out.println("Not possible to calculate for the given amount ");
        }
    }
    public static void main(String[] args) {
        findNotes(980);
    }
}
