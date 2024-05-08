
package assignment001;

public class Assignment001 {

   
    public static void main(String[] args) {
       
	
        System.out.println("enter two fraction numbers");
        Fraction f1 = new Fraction(1, 4); //(25,35)
        Fraction f2 = new Fraction(3, 5); // (2,7)
	System.out.println(f1.toString());
        System.out.println(f2.toString());
        
        Fraction f3 = f1.add(f2);
	System.out.println("Result of addition of " + f1 + " and " + f2 + " is : " + f3);
	f3 = f1.subtract(f2);
	System.out.println("Result of subtraction of " + f1 + " and " + f2 + " is : " + f3);
        f3 = f1.multiply(f2);
        System.out.println("Result of multiplication of " + f1 + " and " + f2 + " is : " + f3);
	f3 = f1.divide(f2);
	System.out.println("Result of division of " + f1 + " and " + f2 + " is : " + f3);
        f3 = f1.reciprocal(f1);
	System.out.println("reciprocal of number 1 : " + f3);
       f3 = f1.reciprocal(f2);
	System.out.println("reciprocal of number 2 : " + f3);
    }
    
}
