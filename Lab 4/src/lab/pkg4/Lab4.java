
package lab.pkg4;
   
import java.util.Scanner;



public class Lab4 {

   
    public static void main(String[] args) {
       
        System.out.println("Problem 1:");
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[6];
        int i,count=0;
        double sum=0, avg=1;
        
        
        for(i=0;i<6;i++)
        {
             arr[i] =  scan.nextInt();
           sum+=arr[i];
        }
        
        System.out.println(avg=sum/6);
        for(i=0;i<6;i++)
        {
            if(arr[i]>avg)
            {
                count++;
            }
            
        }
        double percentage=  count *100/6;
        System.out.println(percentage);
        
        
        System.out.println("problem 2:");
        int limit=scan.nextInt();
        int fibo[]=new int[limit];
        
        fibo[0]=0;
        fibo [1]=1;
        for(i=2;i<limit;i++)
        {
           fibo[i]=fibo[i-1]+fibo[i-2]; 
        }
        for(i=0;i<limit;i++)
        {
            System.out.print(fibo[i]+" ");
        } System.out.println("");

        System.out.println("problem 3:");
        
        
        int array3D [][] ={{3,4,9},{2,9,11},{4,5,0}};
        
       for(i=0;i<3;i++)
       {
           double sumRow=0;
           for(int j=0;j<3;j++)
           {
               sumRow=sumRow +array3D[i][j];
           }
           System.out.println("sum of row "+i+ " = "+ sumRow);
       }
       for(int j=0;j<3;j++)
       {
           double sumColn=0;
           for(i=0;i<3;i++)
           {
               sumColn=sumColn +array3D[i][j];
           }
           System.out.println("sum of column "+j+ " = "+ sumColn);
       }
       double  sumDiag=0;
        for(i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               if(i==j)
               {
               sumDiag= sumDiag + array3D[i][j];
               } 
       }          
    }   System.out.println("sum of 1st diagonal = "+ sumDiag);
    
        System.out.println("problem 4:");
        
    int consecutive[]=new int[12];
   
    for(i=0;i<12;i++)
    {
        consecutive [i]=scan.nextInt();
        
    }
    for(i=2;i<12;i++)
    {
       if((consecutive [i]==consecutive[i-1]) && (consecutive[i]==consecutive[i-2]))
       {
            
           System.out.println("This number is in consecutive order of 3:"+consecutive[i]);
       }
        
    }
        
      
    }
}