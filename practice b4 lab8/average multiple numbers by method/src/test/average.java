
package test;


public class average {

   public static double avg(int...numbers)
    {
        
        double total=0;
        for(double x:numbers){
            total=total+x;
        }
        return total/numbers.length;    
    }
      
}
