package LoopAssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // FACTORIAL OF THE NUMBER WITH FOR LOOP
        int num, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        for(int i = num; i >= 1; i--) {
          fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);

        // FACTORIAL OF THE NUMBER WITH WHILE LOOP
//        int i = num;
//        while(i >= 1) {
//            fact = fact * i;
//            i--;
//        }
//        System.out.println("Factorial of " + num + " is " + fact);

        // FACTORIAL OF THE NUMBER WITH DO WHILE LOOP

//        int i = num;
//        do {
//            fact = fact * i;
//            i--;
//        }
//        while(i >= 1);
//        System.out.println("Factorial of " + num + " is " + fact);

    }
}
