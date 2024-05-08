package lab1task3;

import java.util.Scanner;

public class Lab1task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input, i;

        
        System.out.println("Input a number: ");
        input=scan.nextInt();
        System.out.println("Table of "+input+":\n");
        
        for (i=1; i<=10; i++)
            System.out.println(+input+" * "+i+" ="+input*i);
         

/** 
 //Table of 1 to 5
        for (i = 1; i <= 5; i++) {
            System.out.println("Table of " + i + "\n");
            for (int j = 1; j <= 10; j++) {
                System.out.println(+i + " * " + j + " = " + i * j);
            }
            System.out.println("\n");

        }
*/
        
    }

}
