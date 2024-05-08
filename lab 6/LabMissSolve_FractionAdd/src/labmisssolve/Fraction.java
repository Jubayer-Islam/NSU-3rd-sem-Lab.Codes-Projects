
package labmisssolve;


public class Fraction {
    
    private int denominator=1;
    private int numerator=0;
    
    public Fraction() //constructor
    {
      denominator = 1;
      numerator = 0;
    }
    
    /*public Fraction(int den)
    {
        this.denominator = den;
    }*/
    public Fraction(int num, int den)
    {
        this.denominator = den;
        this.numerator = num;
    }
    
    public int getNumerator()
    {
        return this.numerator;
    }
    
    public int getDenominator()
    {
        return this.denominator;
    }
    
    public Fraction add( Fraction f2)
    {   
        int num1 = this.getNumerator();
        int den1 = this.denominator;
        
        int num2 = f2.numerator;
        int den2 = f2.getDenominator(); //both works in both cases
        
        int den3 = den1*den2;
        int num3 = num2*den1 + num1*den2;
        
        
        Fraction resultinsideclass = new Fraction(num3,den3);
        return resultinsideclass;
    }
    
    public int gcd(int a, int b)
    {
        int min;
        int gcd=1;
        if(a>b)
            min =a;
        else
            min =b;
        
        for(int i =1; i<=min;i++)
        {
            if(a%i==0 && b%i ==0)
            {
                gcd =i;
            }
        }
       
        return gcd;
    }
    
    
    public void reduce()
    {
       
      
        this.numerator = this.numerator/gcd(this.numerator,this.denominator);
        this.denominator = this.denominator/gcd(this.numerator,this.denominator);
    
    }
    
    
    
}
