
package q_1;


public class Q_1 {

    
    public static void main(String[] args) {
       Rectangle r= new Rectangle("Rectangle properties: ",10,10);
        
        System.out.println(r.toString());
        System.out.println("Area:"+r.area());
        System.out.println("Perimeter:"+r.perimeter());
        
        Circle c= new Circle("Circle properties: ",3);
        System.out.println(c.toString());
        System.out.println("Area:"+c.area());
        System.out.println("Perimeter:"+c.perimeter());
      
    }
    
}
