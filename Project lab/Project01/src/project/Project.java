
package project;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Project {

    
    public static void main(String[] args) {
        
        System.out.println("Questions will be asked randomly, please choose from multiple answers.");
        System.out.println("Note: there is negative marking!");
        System.out.println(">>>>>>>>>>   Begin    <<<<<<<<<<");
        
        int i,number=0;
        int ans;
        int score=0,FinalScore;
        Scanner scan= new Scanner(System.in);
        
        int question [] =new int[20];
            
        /*generating random number so that user will have different questions each time */ 
         //Random question_shuffle = new Random(); 
        /* By Using Random we can generate random numbers but then we can face repetition */
          /* So we use ArrayList here to generate unrepeated random numbers */  
               
          ArrayList<Integer> numbers = new ArrayList<Integer>();
        int  numberOfNumbersYouWant = 5; 
        Random random = new Random();
 
        do
        {
            int next = random.nextInt(10);
            
            if (!numbers.contains(next))
            {
                numbers.add(next);   
                
            }
            
        } while (numbers.size() < numberOfNumbersYouWant);
        question[0]=numbers.get(0);
        question[1]=numbers.get(1);
        question[2]=numbers.get(2);
        question[3]=numbers.get(3);
        question[4]=numbers.get(4);
        
        

        System.out.println("For each question,choose Your answer by selecting the integer number assigned to that specific choice:");

        for (int counter = 0; counter < 5; counter++) {
           
            number = question[counter];

            switch (number) {
                case 0: 
                {
                    System.out.println("Q. What is Java?");

                    System.out.println(" 1 = (A Food's name)  || (2 = A book's name) || (3 = A programming Language's name) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 3) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                case 1: 
                {
                    System.out.println("Q. What is not Java?");

                    System.out.println(" 1 = (A programming Language)  || 2 = (A coding tool) || 3 = (A YouTube Channel) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 3) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                case 2: 
                {
                    System.out.println("Q. What is a keyboard used for?");

                    System.out.println(" 1 = (to drive a car) || 2 = (to give user input in a Computer) || 3 = (to run board meeting's about key) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 2) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                case 3: 
                {
                    System.out.println("Q. what does CSE mean?");

                    System.out.println(" 1 = (Computer Science & Engineering) || 2 = (Cakes and Sweets Eating) || 3 = (It is meaningless) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 1) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                case 4: 
                {
                    System.out.println("Q. 2+2 equals what?");

                    System.out.println(" 1 = (equals 4) || 2 = (equals 0) || 3 = (equals 22) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 1) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                case 5: 
                {
                    System.out.println("Q. Is the division of any number by zero undefined?");

                    System.out.println(" 1 = (I have no clue) || 2 = (Yes) || 3 = (No) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 2) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                case 6: 
                
                {
                    System.out.println("Q. When was the first black hole picture taken ?");

                    System.out.println(" 1 = (1990) || 2 = (2019) || 3 = (1975) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 2) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                
                case 7: 
                {
                    System.out.println("Q.How many vowels are in English alphabets ?");

                    System.out.println(" 1 = (23) || 2 = (26) || 3 = (5) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 3) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                case 8: 
                {
                    System.out.println("Q. Is Infinty countable ?");

                    System.out.println(" 1 = (sometimes) || 2 = (No) || 3 = (Yes) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 2) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                
                case 9: 
                {
                    System.out.println("Q. Is 2 a prime number ?");

                    System.out.println(" 1 = (Yes) || 2 = (No) ");
                    System.out.println("Your Answer:");
                    ans = scan.nextInt();

                    if (ans == 1) {
                        score++;
                    } else {
                        score--;
                    }
                    break;
                }
                
                
               

            }

        }

        FinalScore = score;

        System.out.println("Final Score is= " + FinalScore);

        if(FinalScore<0)
        {
            System.out.println("You gave more wrong answer than you gave right answers!");
        }
        else
        {
            System.out.println("Right answer percentage:"+(FinalScore*100/5)+"%");
        }
    }

}
