// Code Submitted by:
// Md. Razib, ID: 1821931042
// Jubayer Islam, ID: 1821027042
// Warsi Omrao Khan Shuvo, ID:1821312042
package quizgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f = new File("Quiz.txt");
        Scanner scan = new Scanner(f);
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<>();
        int[] ques = new int[20];

        QuizContents[] store = new QuizContents[200];
        String[] userinput = new String[10];
        int score = 0;
        Random r = new Random();

        /*generating random number so that user will have different questions each time */
        //Random question_shuffle = new Random(); 
        /* By Using Random we can generate random numbers but then we can face repetition */
        /* So we use ArrayList here to generate unrepeated random numbers */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int quesCount = 5;
        Random random = new Random();

        do {
            int next = r.nextInt(10);
            if (!numbers.contains(next)) {
                numbers.add(next);
            }

        } while (numbers.size() < quesCount);
        ques[0] = numbers.get(0);
        ques[1] = numbers.get(1);
        ques[2] = numbers.get(2);
        ques[3] = numbers.get(3);
        ques[4] = numbers.get(4);

        while (scan.hasNextLine()) {
            try {
                System.out.println("WELCOME TO THE QUIZ GAME\n");
                System.out.println("Press Q anytime to Quit\n");

                for (int i = 0; i < 10; i++) {

                    String que = scan.nextLine();
                    String op1 = scan.nextLine();
                    String op2 = scan.nextLine();
                    String op3 = scan.nextLine();
                    String op4 = scan.nextLine();
                    String CA = scan.nextLine();
                    String ca = scan.nextLine();

                    QuizContents quiz = new QuizContents(que, op1, op2, op3, op4, CA, ca);
                    store[i] = quiz;
                }

                for (int i = 0; i < 5; i++) {
                    System.out.println("QUESTION  :\n" + store[ques[i]].getQuestion() + "\n"
                            + "\n" + store[ques[i]].getOpt1()
                            + "\n" + store[ques[i]].getOpt2()
                            + "\n" + store[ques[i]].getOpt3()
                            + "\n" + store[ques[i]].getOpt4() + "\n"
                    );

                    System.out.println("Your Input/Answer: ");
                    userinput[i] = s.nextLine();

                    if ((userinput[i].equals(store[ques[i]].getCa())) || (userinput[i].equals(store[ques[i]].getCA()))) {
                        System.out.println("\nCorrect Answer.\n");
                        System.out.println("-----------------------------------\n");
                        score += 10;
                    } else if ((userinput[i].equals("Q")) || (userinput[i].equals("q"))) {
                        System.out.println("\nYour score is: " + score);
                        System.out.println("Thanks for participating.\n");
                        System.exit(0);
                    } else if (!(userinput[i].equals(store[ques[i]].getCa())) || !(userinput[i].equals(store[ques[i]].getCA()))) {
                        System.out.println("\nWrong Answer!\n");
                        System.out.println("-----------------------------------\n");
                        score -= 10;
                    }
                }

                System.out.println("Your score is: " + score + " out of 50");
                System.out.println("\nThanks for participating.\n");

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
