import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static String[] drink_names ={"Apple Juice", "Full Milk", "Vanilla", "Peach", "Mountain Dew", "Pepsi"};
    public static String[] package_types ={"1 dozen", "2 dozen", "10 dozen"};

    public static double[][] drink_price = {{16.00, 30.00, 145.00},
                                     {15.50, 28.00, 138.00},
                                     {17.00, 33.00, 160.00},
                                     {17.90, 34.50, 168.00},
                                     {18.00, 35.00, 170.00},
                                     {20.00, 39.00, 190.00}};

    public static int choice_drink, choice_package, quantity;
    public static double sales, total_sales, sales_discount;


    public static void main(String[] args) {
        char response;

        System.out.println("***WELCOME TO MAJU DRINKS WORLD***");

        do
        {
            ChooseDrink();
            GetPackage();
            quantity = GetQuantity();
            sales = ProcessOrder(quantity, choice_drink, choice_package);

            total_sales += sales;

            System.out.println();
            System.out.println("Confirmation of order: ");
            System.out.println(quantity + " pack(s) of " + package_types[choice_package-1] + " of " +
                    drink_names[choice_drink-1]);
            System.out.println("Amount to pay: RM " + String.format("%.2f", sales));

            System.out.println();
            do
            {
                System.out.println();
                System.out.print("Do you want to buy another drink? ");
                response = input.next().charAt(0);

                if (response != 'Y' && response != 'y' && response != 'n' && response != 'N')
                    System.out.println("Sorry, wrong choice! Try again");

            } while (response != 'Y' && response != 'y' && response != 'n' && response != 'N');

        } while (response == 'Y' || response == 'y');

        System.out.println("Total Sales:        RM " + String.format("%.2f", total_sales));

        if (total_sales > 100.00)
            sales_discount = total_sales*10.0/100.00;

        System.out.println("Discount @10%:      RM " + String.format("%.2f", sales_discount));
        System.out.println();
        System.out.println("AMOUNT TO PAY:      RM " +  String.format("%.2f", total_sales-sales_discount));

    }

    static void ChooseDrink()
    {
        int count;
        do
        {
            System.out.println("You may choose from the following flavours:");
            System.out.println("        FLAVOUR");

            for (count = 0; count < 6; count++)
            {
                System.out.println(count+1 + ". " + drink_names[count]);
            }

            System.out.print("Enter your choice: ");
            choice_drink = input.nextInt();

            if (choice_drink < 1 || choice_drink > 6)
                System.out.println("Sorry, wrong choice! Try again");
            else
                System.out.println("You have chosen " + drink_names[count-1] + " drink");
        } while (choice_drink < 1 || choice_drink > 6);
    }

    static void GetPackage()
    {
        int count;
        System.out.println("Available packages: ");

        for (count = 0 ; count < 3; count++)
        {
            System.out.println(count+1 + ") " + package_types[count]);
        }

        do
        {
            System.out.print("Enter which package (1 or 2 or 3): ");
            choice_package = input.nextInt();

            if (choice_package < 0 || choice_package > 3)
                System.out.println("Sorry, wrong choice! Try again");
        } while (choice_package < 0 || choice_package > 3);
    }

    static int GetQuantity()
    {
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        if (quantity < 0)
            quantity = Math.abs(quantity);

        return quantity;
    }

    static double ProcessOrder(int quantity, int choice_drink, int choice_package)
    {
        sales = quantity * drink_price[choice_drink-1][choice_package-1];
        return sales;
    }
}
