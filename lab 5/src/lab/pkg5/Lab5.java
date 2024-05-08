
package lab.pkg5;

public class Lab5 {

    
    public static void main(String[] args) {
        System.out.println("problem 1:");
        String s="lalaland";
        int i=0,vowels=0;
        for(i=0;i<s.length();i++)
        { 
           if(s.charAt(i) == 'a')
           {
               vowels++;
           }
           else if(s.charAt(i)=='e')
               {
               vowels++;
           }
           else if(s.charAt(i)=='i')
               {
               vowels++;
           }
               else if(s.charAt(i)=='o')
                   {
               vowels++;
           }
                   else if(s.charAt(i)=='u')
                       {
               vowels++;
           }
          
        }
        System.out.println("vowels present in a string: "+vowels); 
        System.out.println("problem 2:");
        
        String Pal="mad...Dam";
        String rev="";
       int  last=Pal.length()-1;
        
        for(i=last;i>=0;i--)
        {
            rev=rev+Pal.charAt(i);
        }
        if(Pal.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not Pal ");
        }
        
        
    }
}
