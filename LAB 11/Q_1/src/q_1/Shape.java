
package q_1;


public class Shape {
  String name;
    public Shape(String name)
    {
        this.name=name;
    }
    
    
    
    public double area()
    {
        return 0;
    }
    
    public double perimeter()
    {
        return 0;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    @Override
    public String toString() {
        return "Shape={" + "name=" + name + '}';
    }

   
    
        
}
