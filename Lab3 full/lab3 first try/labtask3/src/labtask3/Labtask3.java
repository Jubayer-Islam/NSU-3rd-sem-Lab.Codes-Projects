
package labtask3;
import java.util.Scanner;

public class Labtask3 {

  
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        int year= scan.nextInt();
        
      if(year>=1990 && year<=2020)
            {
                if(year%400==0 || year%4==0 && year%100!=0)
                    
                        System.out.println("the statement that says the "+year+" is leap year ,is true ");
                    
                else 
                    
                      System.out.println("the statement that says the "+year+" is leap year ,is false ");  
                    
                }
                    }
    
}
