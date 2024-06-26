
package q_1;


public class Rectangle extends Shape{
      
    double length;
    double width;

    public Rectangle(String name,double length,double width) {
        super(name);
        this.length=length;
        this.width=width;
        
        
    }
    
    
    @Override
    public double area()
    {
        return this.length*this.width;
    }
  
    @Override
    public double perimeter()
    {
        return (2*(this.length+this.width));
    }
    
    
    

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.name+
        "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
}
