package LoopAssignment;
import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        // SUM OF ODD AND EVEN NUMBERS USING FOR LOOP
        int num, sum_of_even = 0, sum_of_odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
//        for(int i = 1; i <= num; i++) {
//            if(i % 2 == 0)
//            {
//                System.out.println("Even numbers are " + i);
//                sum_of_even = sum_of_even + i;
//            }
//
//        }
//        System.out.println("Sum of even numbers are " + sum_of_even);
//
//        for(int j = 1; j <= num; j++) {
//            if(j % 2 != 0)
//            {
//                System.out.println("Odd numbers are " + j);
//                sum_of_odd = sum_of_odd + j;
//            }
//
//        }
//        System.out.println("Sum of odd numbers are " + sum_of_odd);


        // SUM OF ODD AND EVEN NUMBERS USING WHILE LOOP

//       int i = 1;
//       while(i <= num) {
//           if(i % 2 == 0){
//               System.out.println("Even numbers are " + i);
//               sum_of_even = sum_of_even + i;
//           }
//
//           i++;
//       }
//        System.out.println("Sum of even numbers are " + sum_of_even);
//
//       int j = 1;
//       while(j <= num) {
//           if(j % 2 != 0) {
//               System.out.println("Odd numbers are " + j);
//               sum_of_odd = sum_of_odd + j;
//           }
//           j++;
//       }
//        System.out.println("Sum of odd numbers are " + sum_of_odd);



        // SUM OF ODD AND EVEN NUMBERS USING DO_WHILE LOOP
        int i = 1;
        do {
            if(i % 2 == 0){
                System.out.println("Even numbers are " + i);
                sum_of_even = sum_of_even + i;
            }
            i++;
        }while(i <= num);
        System.out.println("Sum of even numbers are " + sum_of_even);

        int j  = 1;
        do {
            if(j % 2 != 0) {
                System.out.println("Odd numbers are " + j);
                sum_of_odd = sum_of_odd + j;
            }j++;
        }while (j <= num);
        System.out.println("Sum of odd numbers are " + sum_of_odd);
    }
}
