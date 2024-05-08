
package labquiz2;


public class LabQuiz2 {

   
    public static void main(String[] args) {
      Info pro1= new Info();
       Info pro69= new Info();
       Info pro4= new Info();
      
       pro4.setName("gg");
       pro4.setPrice(200);
       pro69.setName("bbc");
       pro69.setItem_code("suckit");
       pro69.setManufac("powerful");
      
      pro1.setName("G-fuel");
      pro1.setManufac("SweedishBlueEyedDragon");
      pro1.setEx_d("6.9.19");
      pro1.setManufac_d("1.4.14");
      pro1.setItem_code("poodiepie");
      pro1.setPrice(30);
      
        
        System.out.println("Product 1 down below:");
        System.out.println(pro1.getName());
        System.out.println(pro1.getManufac());
        System.out.println(pro1.getManufac_d());
        System.out.println(pro1.getEx_d());
        System.out.println(pro1.getItem_code());
        System.out.println(pro1.getPrice());
        System.out.println("");
                   System.out.printf("extras:\n");
             System.out.println(pro4.getName());
             System.out.println(pro69.getManufac());
             System.out.println(pro69.getName());
             System.out.println(pro69.getItem_code());
             System.out.println(pro4.getPrice());
             
             System.out.println("cost of either gg or G-fuel:");
                     double total1=pro4.cost("G-fuel", 1);
                     System.out.println(total1);
                      System.out.println(pro1.cost("gg", 2));
           //facing problem with calculating any given products cost. 
    }   
}
