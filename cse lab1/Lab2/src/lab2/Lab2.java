
package lab2;
import java.util.Scanner;

public class Lab2 {
public static void main(String[]args)
{
    int flag=0;
    
  Scanner scan= new Scanner(System.in);
  int a = scan.nextInt();
  
   if(a==2)
      {
          System.out.println(a+" is prime");
      }
  for(int i=2;i<a;i++){
     
      if(a%i==0)
      {
          System.out.println( a+" is not prime ");
         
          break;
      }
      else 
      {
          System.out.println(a+" is prime");
          break;
      }
  }
}
} 