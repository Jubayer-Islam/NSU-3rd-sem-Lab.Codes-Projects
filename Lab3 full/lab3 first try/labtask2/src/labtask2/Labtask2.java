
package labtask2;

import java.util.Scanner;


public class Labtask2 {


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int endpoint=150;
        while(endpoint>=100)
         {
           if(endpoint %8==0)
           { 
               System.out.println(endpoint);
               
           }
        endpoint--;  
           } 
    
}
}
