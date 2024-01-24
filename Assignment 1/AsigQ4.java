import java.util.Scanner;
public class AsigQ4 {
    public static void main(String args[]){
        //Scanner definition 
        Scanner s = new Scanner(System.in);      

        //Taking integer as an input read by next.Int function
        System.out.print("Enter the length of the Rectangle: ");
        int l = s.nextInt();                                           
        System.out.print("Enter the bredth of the Rectangle: ");
        int b = s.nextInt();    
        
        //Declaring area and perimeter of the rectangle and assigned it with 0
        int area = 0, perimeter = 0;
        
        //Calculating area and perimeter of the rectangle with the given input
        area = l*b;
        perimeter = 2*(l+b);

        //Displaying the area and perimeter of the calculated values
        System.out.println("Area of the rectangle for the given input is:                "+area);  //Printing the area of rectangle calculated by given input
        System.out.println("Perimeter of the rectangle for the given input is:           "+perimeter);  //Printing the perimeter of rectangle calculated by given input
    }
}
