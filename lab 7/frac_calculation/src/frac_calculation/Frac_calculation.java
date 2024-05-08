package frac_calculation;

public class Frac_calculation {

    public static void main(String[] args) {
        fraction f1 = new fraction (1,2);
        fraction f2 = new fraction (2,2);
        
        fraction add = new fraction();
        fraction dif = new fraction();
        fraction prod = new fraction();
        fraction div = new fraction();
        fraction gcd = new fraction();
        //fraction string = new fraction();
        
        
        add = f1.add(f2);
        dif = f1.dif(f2);
        prod = f1.prod(f2);
        div = f1.div(f2);
        gcd = f1.gcd(f2);
        
        
        
        System.out.println(add.getNumerator() + "/" + add.getDenominator());
        System.out.println(dif.getNumerator() + "/" + dif.getDenominator());
        System.out.println(prod.getNumerator() + "/" + prod.getDenominator());
        System.out.println(div.getNumerator() + "/" + div.getDenominator());
        System.out.println(gcd.getNumerator() + "/" + gcd.getDenominator());
        
        
        System.out.println(add.toString(f2));
        
    }
    
}
