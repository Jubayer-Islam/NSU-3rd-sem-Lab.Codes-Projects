
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
public class FIle {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        File file= new File("input.txt");
        int id;
        int mark=0;
        Quiz [] quizzes= new Quiz[20];
        int quizCount=0;
        int topID=0;
        int topMark=0;
        
        Scanner scan = new Scanner(file);
       
        while(scan.hasNext())
        {
            id= scan.nextInt();
           mark=scan.nextInt();
           
            Quiz quiz = new Quiz(id,mark);
            quizzes[quizCount]= quiz;
            quizCount++;
            
        }
        
        for(int i=0;i<quizCount;i++)
        {
            System.out.println("ID: "+quizzes[i].getId()+
                    "; Marks: "+quizzes[i].getMark() );
        }
        for(int i=0;i<quizCount;i++)
        {
            
            if(quizzes[i].getMark()> topMark)
            { topMark=quizzes[i].getMark();
             topID=quizzes[i].getId();
            }
        }
        
        System.out.println("Topper's ID: "+topID);
        System.out.println("topmark is: "+topMark);
        
        
        
        
       
    }
    
}
