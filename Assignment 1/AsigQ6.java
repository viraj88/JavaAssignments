import java.util.Scanner;
public class AsigQ6{
    public static void main(String args[]){
        //Scanner definition
        Scanner s = new Scanner(System.in);
        
        //Taking integer as an input read by next.Int function
        System.out.print("Enter the first number: ");         
        int a = s.nextInt();                                          
        System.out.print("Enter the second number: ");
        int b = s.nextInt();                                          

        //Printing the variables values before swapping
        System.out.println("The First variable before the swap:        "+a);  
        System.out.println("The Second variable before the swap:       "+b);  

        //Swaapping of variables without a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        //Printing the variables values after swapping
        System.out.println(" ");
        System.out.println("The First variable after the swap:         "+a);  
        System.out.println("The Second variable after the swap:        "+b);  
    }
    
}
