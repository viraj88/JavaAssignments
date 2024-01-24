import java.util.Scanner;
public class AsigQ7{
    static public void main(String args[]){
        //Scanner definition 
        Scanner s = new Scanner(System.in);  

        //Taking Binary as an input read by next.Int function
        System.out.print("Enter the first binary value: ");
        int a = s.nextInt(2);                 
        System.out.print("Enter the second binary value: ");
        int b = s.nextInt(2);                 

        //Addition of decimal values
        int c = a+b;      
        //Division of decimal values                          
        int d = a/b;                                
        
        //Conversion of decimal to binary values
        String i = Integer.toBinaryString(c);         
        String j = Integer.toBinaryString(d);          

        //Displaying the binary values after addition
        System.out.println("The binary value after addition of input variables: "+i);
        //Displaying the binary values after division
        System.out.println("The binary value after division of input variables: "+j);
        
    }
}
