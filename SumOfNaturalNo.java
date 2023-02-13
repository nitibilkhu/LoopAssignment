package LoopAssignment;
import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {
        // SUM OF NATURAL NUMBERS USING FOR LOOP
        int sum = 0;
//        for (int i = 1; i <= 10; i++){
//            sum = sum + i;
//        }
//        System.out.println("Sum of natural numbers are " + sum);

        // SUM OF NATURAL NUMBERS USING WHILE LOOP
//        int i = 1;
//        while(i <= 10){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("Sum of natural numbers are " + sum);

        // SUM OF NATURAL NUMBERS USING DO WHILE LOOP
        int i = 1;
        do {
            sum = sum + i;
            i++;
        } while(i <= 10);
        System.out.println("Sum of natural numbers are " + sum);

    }


}
