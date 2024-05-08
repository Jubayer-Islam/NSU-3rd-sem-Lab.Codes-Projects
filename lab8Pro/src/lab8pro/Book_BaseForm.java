
package lab8pro;

/**
 *
 * @author Gabriel
 */
public class Book_BaseForm {
    
    private String Title;
    private String Author;
    int Price;
            
    public Book_BaseForm(String Title,String Author,int Price)
            
    {
        this.Title=Title;
        this.Author= Author;
        this.Price= Price;
       
    }

    public String getTitle()
    {
        return this.Title;
    }
    public void setTitle(String Title)
    {
        this.Title=Title;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getPrice() {
        return Price;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    
    public String toString(){
    return  " Book Title is: "+getTitle()+ // getMethod or this. both works
            "; Author name is: "+getAuthor()+
            "; Book Price will be: "+this.Price;
            }
    
    
}
