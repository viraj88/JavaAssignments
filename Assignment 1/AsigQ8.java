import java.util.Scanner;
public class AsigQ8{
    public static void main(String args[]){
        //Scanner definition 
        Scanner s = new Scanner(System.in);  
        
        //Taking Binary as an input read by next.Int function
        System.out.print("Enter the binary Number:");
        int a = s.nextInt(2);                 

        //Using the toOctalString() to convert Integer to String of Octal Number
        String i = Integer.toOctalString(a);        

        //Printing the octal number for the entered binary number
        System.out.println("The binary value after converting it into octal number:"+i);   
    }
}
