
package q1;

import java.util.Scanner;

public class Q1 {

    
    public static void main(String[] args) {
        
     Scanner scan= new Scanner(System.in);   
      // Account ac= new Account(1001,"Sanjana jaman",15000,12);
       
      
      
        System.out.println("    <<Savings Account >> ");
      
        SavingAccount ac1= new SavingAccount(1001,"Sanjana jaman",15000,12,1000);
        System.out.println(ac1.toString());
        
        System.out.println("Deposit here: ");
        
           double deposit_input=scan.nextDouble();
           double bal= ac1.getBalance()+deposit_input;
           
           ac1.setBalance(bal);
           System.out.println(ac1.toString());
      
           
           System.out.println("          <<Debit Acoount >>");
         DebitAccount ac2= new DebitAccount(2001,"Robert",2000,12,500);
         System.out.println(ac2.toString());
         
         double monthly_interest=((ac2.getInterestRate())/(100*12)); //yearly i.r 12 %
        System.out.println("Monthly Interest="+monthly_interest);
         //
         
        
    }

    
    
}
