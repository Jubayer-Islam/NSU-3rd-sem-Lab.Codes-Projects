
package lab2task1;
import java.util.Scanner;
public class Lab2Task1 {

   
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner (System.in);
        
        int i=1,j=1;
        System.out.println("pattern\n");
        for(i=5;i>=1;i--)
             {
               
              for(j=1;j<=i;j++)
                {
                    System.out.print(j);
                    
                }
               System.out.println();
               
             }
    }
}
    
    
