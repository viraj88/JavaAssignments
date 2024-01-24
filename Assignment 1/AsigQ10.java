import java.util.Scanner;
public class AsigQ10{
    public static void main(String args[]){
        //Scanner definition
        Scanner s = new Scanner(System.in);      

         //Taking integer as an input read by next.Int function
        System.out.print("Enter the First Number:                                      ");
        int a = s.nextInt();                                                        
        System.out.print("Enter the Second Number:                                     ");
        int b = s.nextInt();                                                         

        //Comparison of two number
        if(a > b)
        {
            System.out.print("First number is greater than Second number            ");
        }
        else if(a == b)
        {
            System.out.print("First number is equal to Second number            ");
        }
        else if(a < b)
        {
            System.out.print("First number is lesser than Second number            ");
        }
    }
    
}
