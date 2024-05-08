
package constractor;


public class NewClass {
    

    public NewClass(int x,int y){            // as we make a method with the same name of this class, 
                                            //we have successfully created a constructor
             System.out.println(x+y);
    }
    
    public NewClass()             /*here we made another class with the exact same name of the class
                                    this is Constructor overloading*/
    {
        System.out.println("you have no user-input");
    }

}

