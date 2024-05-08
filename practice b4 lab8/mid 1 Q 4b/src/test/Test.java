package test;

import java.util.Scanner;
import java.util.ArrayList;
public class Test {

    
    public static void main(String[] args) {
            
       
        
        Scanner scan= new Scanner(System.in);
   
            
    ArrayList <Character> array =new ArrayList<Character>();
   // ArrayList   <String>array1  = new  ArrayList <String>();
            array.add('A');
             array.add('B');
              array.add('C');
               array.add('D');
               System.out.println(array);
               System.out.println("OR, we can use");
        System.out.print("[");
       for(int i=0;i<array.size();i++)
        {
            System.out.printf("%c,",array.get(i));
        }
         System.out.printf("]");
         
}
}    