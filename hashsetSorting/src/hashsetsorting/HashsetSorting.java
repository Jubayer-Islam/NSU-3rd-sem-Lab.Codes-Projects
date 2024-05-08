
package hashsetsorting;
import java.util.*;
/**
 *
 * @author jubof
 */
public class HashsetSorting {

   
    public static void main(String[] args) {
         // Creating a HashSet 
        HashSet<String> set = new HashSet<String>(); 
  
        // Adding elements into HashSet using add() 
        set.add("geeks"); 
        set.add("practice"); 
        set.add("contribute"); 
        set.add("ide"); 
        set.add("whats mah name");
  
        System.out.println("Original HashSet: " + set); 
  
        // Sorting HashSet using TreeSet 
        TreeSet<String> treeSet = new TreeSet<String>(set); //using TreeSet object to sort
  
        // Print the sorted elements of the HashSet 
        System.out.println("HashSet elements "
                           + "in sorted order "
                           + "using TreeSet: "
                           + treeSet); 
    } 
    
}
