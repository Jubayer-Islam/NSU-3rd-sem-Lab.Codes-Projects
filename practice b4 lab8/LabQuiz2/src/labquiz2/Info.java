
package labquiz2;


public class Info {

     private  String name;
     private  String manufac;
      private String ex_d; 
     private  String manufac_d;
      private String item_code; 
      private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setManufac(String manufac) {
        this.manufac = manufac;
    }

    public void setEx_d(String ex_d) {
        this.ex_d = ex_d;
    }

    public void setManufac_d(String manufac_d) {
        this.manufac_d = manufac_d;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }
    
    

    public String getName() {
        return this.name; //writing this.name better than name I guess but same result
    }

    public String getManufac() {
        return manufac;
    }

    public String getEx_d() {
        return ex_d;
    }

    public String getManufac_d() {
        return manufac_d;
    }

    public String getItem_code() {
        return item_code;
    }

    public int getPrice() {
        return price;
    }
public double cost(String name, int quantity)
        
{
    if (name=="G-fuel")
    {
       double total=30*quantity; 
       return total;
    }
    else
    {
       double total=200*quantity; 
       return total;
    }
    
    
}
     
    
}
