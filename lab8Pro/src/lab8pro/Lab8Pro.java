
package lab8pro;


public class Lab8Pro {

    
    public static void main(String[] args) {
        
        System.out.println("user input 1: String Title,String Author,int Price>");
        Book_BaseForm bbf= new Book_BaseForm("Netzwerk A1","Stephanie Dengler",1450);
        System.out.println(bbf.toString());
        System.out.println("");
       
        System.out.println("user input 2: String Title,String Author,int Price,String Url,int SizeMb>>");
      EBook ebook1=new EBook("Netzwerk A2","Stephanie Dengler",400,"www.Klett.de",100);
        System.out.println(ebook1.toString());
        System.out.println("");
        
        System.out.println("user input 3: String Title,int Price,double shipping_Weight, int >>>");
        paperBook pb1=new paperBook("Netzwerk B1",1500,250.69,1000); //excluding Author's Name
        System.out.println(pb1.toString());
        System.out.println("               < Fertig für heute>     ");
        
        System.out.println("            Ich komme heute noch einmal     ");
             Inherit_From_Inherited_Class_BOOKREVIEW Meiner_Kommentar =new Inherit_From_Inherited_Class_BOOKREVIEW("Netzwerk A2","Stephanie Dengler",400,"www.Klett.de",100,"Es ist wirklich Hilfreich",7);
             System.out.println(Meiner_Kommentar.toString());
             
                
    }
    
}
