import java.util.Scanner;

class MenuItem 
{
    private String name;

    public MenuItem(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
}

class MenuSection 
{
    public MenuItem[] items;

    public MenuSection(MenuItem[] items) 
    {
        this.items = items;
    }

    public void displayMenu() 
    {
        for (int i = 0; i < items.length; i++) 
            System.out.println((i + 1) + ". " + items[i].getName());
    }

    public MenuItem getItem(int index) 
    {
        if (index >= 0 && index < items.length) 
            return items[index];
        return null;
    }
}

class Order 
{
    public static void placeOrder(MenuItem menuItem) 
    {
        if (menuItem != null) 
            System.out.println("You ordered: " + menuItem.getName());
        else 
            System.out.println("Invalid choice, Please enter a valid option.");
    }
}

public class HotelMenu 
{
    public static void main(String[] args) 
    {
        // Sample menu items
        MenuItem[] vegItems = {new MenuItem("Masala_Dosa"), new MenuItem("Idli"), new MenuItem("Misal_Pav")};
        MenuItem[] nonVegItems = {new MenuItem("Chicken_Tikka"), new MenuItem("Chicken_Biriyani"), new MenuItem("Egg_Masala")};
        MenuItem[] beveragesItems = {new MenuItem("Mocktail"), new MenuItem("Lime_Soda"), new MenuItem("Icecream")};

        // Create menu sections
        MenuSection vegSection = new MenuSection(vegItems);
        MenuSection nonVegSection = new MenuSection(nonVegItems);
        MenuSection beveragesSection = new MenuSection(beveragesItems);

        // Display menu
        System.out.println("Hotel Menu");
        System.out.println("VEG Section:");
        vegSection.displayMenu();
        System.out.println("\nNON-VEG Section:");
        nonVegSection.displayMenu();
        System.out.println("\nBeverages Section:");
        beveragesSection.displayMenu();

        // Take user orders
        takeOrders(vegSection, nonVegSection, beveragesSection);

        System.out.println("DONE!");
    }

    static void takeOrders(MenuSection vegSection, MenuSection nonVegSection, MenuSection beveragesSection) 
    {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        while(true) 
        {
            System.out.println("\nEnter your order (enter '0' to exit): ");
            userChoice = scanner.nextLine();
            int choice = Integer.parseInt(userChoice);

            if (choice >= 1 && choice <= vegSection.items.length) 
                Order.placeOrder(vegSection.getItem(choice - 1));
            else if (choice >= 4 && choice <= nonVegSection.items.length + 3) 
                Order.placeOrder(nonVegSection.getItem(choice - 4));
            else if (choice >= 7 && choice <= beveragesSection.items.length + 6) 
                Order.placeOrder(beveragesSection.getItem(choice - 7));
            else if (choice == 0) 
            {
                System.out.println("Exiting without placing an order.");
                break;
            }
            else 
                System.out.println("Invalid choice. Please enter a valid option.");

        }
        scanner.close();
    }
}