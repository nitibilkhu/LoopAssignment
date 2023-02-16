package LoopAssignment;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();

        // REVERSE A NUMBER USING WHILE LOOP
        while(num > 0) {
            int i = num % 10;
            num = num / 10;
            System.out.print(i);
        }

        // REVERSE A NUMBER USING DO WHILE LOOP
//        do {
//            int i = num % 10;
//            num = num / 10;
//            System.out.print(i);
//        } while(num > 0);

        // REVERSE A NUMBER USING FOR LOOP
//        for(int i = num; i > 0 ; i--){
//            i = num % 10;
//            num = num /10;
//            System.out.print(i);
//      }

    }
}
