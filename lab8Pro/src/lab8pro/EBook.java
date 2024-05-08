
package lab8pro;


public class EBook extends Book_BaseForm{
    
    
    private String Url;private int SizeMb;
    
    public EBook(String Title,String Author,int Price,String Url,int SizeMb)
    
    {
        super(Title, Author, Price);
        
        this.Url=Url;
        this.SizeMb=SizeMb;
        
    }

    public String getUrl() {
        return Url;
    }

    public int getSizeMb() {
        return SizeMb;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public void setSizeMb(int SizeMb) {
        this.SizeMb = SizeMb;
    }

    public String toString()
    {
        return super.toString()+
                "; Url is: "+this.Url+
                "; Size In Mb: "+getSizeMb();
    }

    
    
    
    
    
    
}
