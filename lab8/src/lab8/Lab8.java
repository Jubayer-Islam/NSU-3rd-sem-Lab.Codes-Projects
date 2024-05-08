
package lab8;


public class Lab8 {

    
    public static void main(String[] args) {
        
        
        EBook ebook1= new EBook("Netzwerk","Stephanie Dengler",250,"www.Klett.de",23.5);
                
        System.out.println(ebook1.toString());
          PaperBook pbook1= new PaperBook("NetzwerkOnline","Stephanie Dengler",25,220,2000);
          
          System.out.println(pbook1.toString());
    }
    
}
