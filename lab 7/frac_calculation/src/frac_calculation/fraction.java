package frac_calculation;

public class fraction {
    private int denominator, numerator;
    
    fraction(){
        numerator = 0;
        denominator = 1;
    }
    
    fraction(int den){
        this.denominator = den;
    }
    
    fraction(int num, int den){
        this.numerator = num;
        this.denominator = den;
    }
    
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    
    
    public fraction add(fraction f1){
        //int n1 =numerator;
        //int d1 = denominator;
        
        int n1 = this.getNumerator();
        int d1 = this.getDenominator();
        
        int n2 = f1.getNumerator();
        int d2 = f1.getDenominator();
        
        int n3 = n1*d2 + n2*d1;
        int d3 = d1*d2;
        
        fraction add = new fraction(n3, d3);
        
        return add;
        
    }

    
    
    public fraction dif(fraction f1){
        int n1 = this.numerator;
        int d1 = this.denominator;
        
        int n2 = f1.getNumerator();
        int d2 = f1.getDenominator();
        
        int n3 = n1*d2 - n2*d1;
        int d3 = d1*d2;
        
        fraction dif = new fraction(n3, d3);
        return dif;
        
    }
    
    public fraction prod(fraction f1){
        int n1 = this.numerator;
        int d1 = this.denominator;
        
        int n2 = f1.getNumerator();
        int d2 = f1.getDenominator();
        
        int n3 = n1 * n2 ;
        int d3 = d1 * d2;
        
        fraction prod = new fraction(n3, d3);
        
        return prod;
    }
    
    public fraction div(fraction f1){
        int n1 = this.numerator;
        int d1 = this.denominator;
        
        int n2 = f1.getNumerator();
        int d2 = f1.getDenominator();
        
        int n3 = n1 * d2;
        int d3 = d1 * n2;
        
        fraction div = new fraction(n3, d3);
        
        return div;
    }
    
    
    public fraction gcd(fraction f1){
        
        int i, gcd = 0, lcm;
        
        int n1 = this.numerator;
        int d1 = this.denominator;
        
        int n2 = f1.getNumerator();
        int d2 = f1.getDenominator();
        
        for(i = 1;i<=n1 && i<= n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }            
        }
        
        lcm = (d1 > d2) ? d1:d2;
        
        for(i = 0;i<lcm;i++){
            if((lcm % d1 == 0) && (lcm % d2 == 0)){
                
                break;
            }
            lcm++;
        }
        
        fraction gcd_f = new fraction(gcd, lcm);
        
        return gcd_f;
    }
    
    public String toString(fraction f1){
        
        return f1.getNumerator() + "/" + f1.getDenominator();
    }
    
}