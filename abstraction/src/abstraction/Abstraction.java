
package abstraction;


public class Abstraction {

    
    public static void main(String[] args) {
       
   teilzeitArbeiter arbeiter1= new teilzeitArbeiter("elon",1000,15);
        System.out.println(arbeiter1.calculateSalary()+" USD (day^(-1))");
}
}