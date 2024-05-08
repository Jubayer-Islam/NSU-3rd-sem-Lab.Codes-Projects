
package lab8;


public class EBook extends Book{
  
    private String URL;
    private  double SizeMb;
    
    public EBook(String title,String author, int price, String URL, double SizeMb)
    {
        super(title,author,price);
        
        this.URL=URL;
        this.SizeMb=SizeMb;
      
    }

    public String getURL() {
        return URL;
    }

    public double getSizeMb() {
        return SizeMb;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setSizeMb(double SizeMb) {
        this.SizeMb= SizeMb;
    }
   
    
    public String toString()
    {
        return " Title is: " +super.getTitle()+
                "; Author is: "+super.getAuthor()+
                "; price is: "+super.getPrice()+
                "; URL: "+this.URL+
                "; Size is: "+this.SizeMb;
                
    }
            
}
