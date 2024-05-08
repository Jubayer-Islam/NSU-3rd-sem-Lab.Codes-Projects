

package q_1;


public class Circle extends Shape{
   double radius;
    public Circle(String name,double radius) {
        
        super(name);
        this.radius=radius;
        
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
      @Override
    public double area()
    {
        return 3.14*this.radius;
   
    }
  
            
    @Override
    public double perimeter()
    {
        return (2*3.1416*this.radius);
    }

    @Override
    public String toString() {
        return super.name+
         "Circle{" + "radius=" + radius + '}';
    }
        
}
