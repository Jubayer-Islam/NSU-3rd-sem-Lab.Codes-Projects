
package lab8;


public class PaperBook extends Book{
    
    private double weight;
    private int stock;
    
    public PaperBook(String title,String author, int price,double weight,int stock)
    {
        super(title,author,price);
        
        this.weight=weight;
        this.stock=stock;
    }

    public double getWeight() {
        return weight;
    }

    public int getStock() {
        return stock;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
     public String toString()
     {
        return super.toString()+
                "; weight is:" +this.weight+
                "; remaining stock items: "+this.stock;
                
                
                }  
}
