
package lab8pro;

public class paperBook extends Book_BaseForm {
    private double shipping_Weight;
    private int inStock;

    public paperBook (String Title,int Price,double shipping_Weight, int inStock) {
      super(Title,"Nicht Wichtig",Price); //when I don't want to use all the variables
       //writting super(Title,null,Price); seems better but I wanted to add a message on top of that
       /** And remember to write super just after the constructor is written and the inherited values 
       from when writing super(); must be used in the exact order as it was in parent class */
        this.shipping_Weight = shipping_Weight;
      
        this.inStock = inStock;
         
    }

    public double getShipping_Weight() {
        return shipping_Weight;
    }

    public void setShipping_Weight(double shipping_Weight) {
        this.shipping_Weight = shipping_Weight;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
     
    public String toString()
    {
        return super.toString()+
                "; Weight when Shipped: "+this.shipping_Weight+
               "; Total in Stock: "+getInStock();
                      
    }

  
    
}
