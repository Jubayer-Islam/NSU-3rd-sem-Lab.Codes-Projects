
package lab13.pkg2;
import java.util.Scanner; 

public class Lab132 {

    public static void main(String[] args) {
        Scanner s = new Scanner ( System.in); 
        int i= 0 ; 
        int sum=0;
        System.out.println("Enter Positive Number: ");
        while (i<4){
            
            try{
               
            int num = s.nextInt(); 
            i++;
            if (num<0)
                throw new IllegalArgumentException(); 
             
           sum+=num; 
           
            }
            
            catch(IllegalArgumentException e){
                i--;
                    System.out.println("I told Positive Number");
                    }
            }
         System.out.println("Sum is= "+ sum);
           
        }
    }
    

