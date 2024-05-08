
package oddeven; 
import java.util.Scanner;
public class Oddeven {

    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int input = scan.nextInt();
        switch(input%2)
        {
            case 0:
                System.out.println("even");
            break;
            default:
                System.out.println("odd");
        }
    }
    
}
