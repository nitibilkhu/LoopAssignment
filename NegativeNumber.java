package LoopAssignment;
import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the number");
        for(int i = 0; i <= 100; i++){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num < 0){
                System.out.println("You entered negative number");
            }
            sum = sum + num;
        }
        System.out.println("Sum of all positive integer is " + sum);


       }
}
