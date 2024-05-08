
package lab3;


public class Lab3 {

    
     
    public static void main(String[] args) {
        System.out.println("### Question number 1:"); 
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%d ",j);
                
            }
            System.out.println("");
        }
        
                 System.out.println("");
        
        System.out.println("### Question 2");
        
        for(int i=150;i>=100;i--)
        {
            if(i%8==0)
            {
                System.out.printf("%d ",i);
            }
        }  
                 System.out.printf("\n\n");
        
        System.out.println("### Question no 3");
        
            for(int i=1990;i<=2020;i++)
            {
                if( (i%400==0) || (i%4==0 && i%100!=0) )
                    
                {
                    System.out.printf("%d ",i);
                }
            }            System.out.printf("\n\n");
            
            System.out.println("### Question no 4");
            boolean flag=true;
            for(int i=1;i<=9;i++)
            {
                if(i%2==0)
                {
                    
                     System.out.println(""); 
                     System.out.println("");
                     if(flag==true)
                     {
                      flag=false;   
                     }
                     else {
                         flag=true;
                     } 
                }
                
                else{
                for(int j=1;j<=i;j++)
                {
                if(flag==true){
                    System.out.printf("*"); 
                }
 
                else{
                    System.out.printf("+");}
                }
                    }
            }           System.out.printf("\n\n");
            
        
    }
    
   
}
