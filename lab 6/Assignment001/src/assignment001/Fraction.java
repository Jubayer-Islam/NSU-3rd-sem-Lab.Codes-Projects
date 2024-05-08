
package assignment001;


public class Fraction {

    int numerator;
    int denominator;
    

 public Fraction(int numr, int denr) {
	numerator = numr;
	denominator = denr;
	
    }
 public String toString() {
	return this.numerator + "/" + this.denominator;
    }
 
   
 
  public int getNumerator() {
	return numerator;
    }
 
    public void setNumerator(int numerator) {
	this.numerator = numerator;
    }
 
    public int getDenominator() {
	return denominator;
    }
 
    public void setDenominator(int denominator) {
	this.denominator = denominator;
    }
   
     
        
     
    
    public Fraction add(Fraction fractionTwo) {
	int numer = (numerator * fractionTwo.denominator) + 
                            (fractionTwo.numerator * denominator);
	int denr = denominator * fractionTwo.denominator;
	return new Fraction(numer, denr);
    }
 
    
    public Fraction subtract(Fraction fractionTwo) {
        int newNumerator = (this.numerator *fractionTwo. denominator) - 
                                 (fractionTwo.numerator * this.denominator);
	int newDenominator = this.denominator * fractionTwo.denominator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
 
  public Fraction multiply(Fraction fractionTwo) {
	int newNumerator = this.getNumerator() * fractionTwo.getNumerator();
	int newDenominator = this.getDenominator() * fractionTwo.getDenominator();
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
   public Fraction divide(Fraction fractionTwo) {
	int newNumerator = numerator *  fractionTwo.denominator;
	int newDenominator = denominator *fractionTwo.numerator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
 
 
  
    public Fraction reciprocal(Fraction f1)
    {
        int num1=f1.getNumerator();
        int den1=f1.getDenominator();
         int den2=num1;
         int num2=den1;
         Fraction result= new Fraction(num2,den2);
         return result;
        
    }
 
 
 
 
 
 
}