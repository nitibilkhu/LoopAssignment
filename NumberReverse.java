package LoopAssignment;

public class NumberReverse {
    public static void main(String[] args) {
        int num = 1234567;
        while(num > 0){
            int r = num % 10;
            num = num /10;
            System.out.print(r);
        }
    }
}
