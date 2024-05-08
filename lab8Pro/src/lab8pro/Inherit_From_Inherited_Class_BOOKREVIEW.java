
package lab8pro;


public class Inherit_From_Inherited_Class_BOOKREVIEW extends EBook {
    
    String Review;int Rating;
    
    public Inherit_From_Inherited_Class_BOOKREVIEW (String Title,String Author,int Price,String Url,int SizeMb, String Review, int Rating )
    {
     super(Title,Author, Price, Url, SizeMb);
    
                this.Review=Review;
                this.Rating=Rating;
    }         

    public String getReview() {
        return Review;
    }
    public int getRating() {
        return Rating;
    }

    /*public void setReview(String Review) {
        this.Review = Review;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }*/

    public String toString()
    {
        return super.toString()+
                "; Meiner Kommentar: " +getReview()+
                "; Ich geb es: " +getRating();
    }

  
    
    
    
    
    
}
