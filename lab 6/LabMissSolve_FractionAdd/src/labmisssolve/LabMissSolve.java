
package labmisssolve;

public class LabMissSolve {
 
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,2); //1,4,3,5
         //System.out.println(f1.getNumerator());
        
        Fraction f2 = new Fraction(4,2);
       
        Fraction result = new Fraction();
       
         result = f1.add(f2);
         //result.reduce();
          System.out.println(result.getNumerator()+"/"+result.getDenominator());
        
    }
    
}
