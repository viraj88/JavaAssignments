import java.util.Scanner;                
public class AsigQ2{
    public static void main(String args[]){

        //Scanner definition 
        Scanner s = new Scanner(System.in);    

        //Taking integer as an input read by next.Int function 
        System.out.print("Enter integer 1: ");   
        int a = s.nextInt();                           
        System.out.print("Enter integer 2: ");   
        int b = s.nextInt();                          
        
        //Printing the output for Addition of two variables
        System.out.println("Addition of two number:        "+ (a+b));          

        //Printing the output for Subraction of two variables
        System.out.println("Subraction of two number:      "+ (a-b));         

        //Printing the output for Division of two variables
        System.out.println("Division of two number:        "+ (a/b));      
        
        //Printing the output for Multiplication of two variables
        System.out.println("Multiplication of two number:  "+ (a*b));          
        
    }
}
