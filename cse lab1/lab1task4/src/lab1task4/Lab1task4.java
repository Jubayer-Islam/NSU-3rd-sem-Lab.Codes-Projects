package lab1task4;

import java.util.Scanner;

public class Lab1task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input;
        System.out.println("Input a number: ");
        input = scan.nextInt();

        System.out.println("Divisors and Non-divisors of " + input + " are: ");
        for (int i = 1; i <= input; i++) {
            switch (input % i) {
                case 0:
                    System.out.println(i+" is a divisor of "+input);
                    break;
                default : System.out.println(i+" is not divisor of "+input);
            }

        }
    }
}
