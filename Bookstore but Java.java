import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] bookID = {200, 300, 500, 540, 700};
        String[] bookTitle = {"Using Information Technology 12th Edition", "Beyond HTML", "Build your own PC",
                "Instant Java Servlets", "Digital Image : A Practical Guide"};

        double[] bookPrice = {100.30, 50.40, 47.00, 83.30, 22.90};
        char choice;

        System.out.println("\t" + "WELCOME TO EXCELPRO BOOKSTORE");

        do {
            System.out.println();
            choice = DisplayMenu();
            System.out.println();

            switch (choice) {
                case 'V', 'v' -> ViewBooks(bookID, bookTitle, bookPrice);
                case 'S', 's' -> SearchBookPrice(bookID, bookTitle, bookPrice);
                case 'U', 'u' -> UpdateBookPrice(bookID, bookTitle, bookPrice);
            }
        } while (choice != 'E' && choice != 'e');

        System.out.println("Thank you for using our system. Have a nice day!");

    }

    static char DisplayMenu() {
        char choice;
        Stars();
        System.out.println();
        System.out.println("V: View Books   S: Search Book Price   U: Update Book Price   E: Exit");
        Stars();

        System.out.println();

        do {
            System.out.print("Enter your choice (Enter letters only): ");

            choice = input.next().charAt(0);

            if (choice != 'V' && choice != 'v' && choice != 'S' && choice != 's' && choice != 'U' && choice != 'u' &&
                    choice != 'E' && choice != 'e')
                System.out.println("Invalid choice.");

        } while (choice != 'V' && choice != 'v' && choice != 'S' && choice != 's' && choice != 'U' && choice != 'u' &&
                choice != 'E' && choice != 'e');

        return choice;
    }

    static void Stars() {
        for (int i = 0; i < 100; i++)
            System.out.print("*");
    }

    static void ViewBooks(int[] bookID, String[] bookTitle, double[] bookPrice) {
        for (int i = 0; i < 5; i++)
            System.out.println(bookID[i] + "\t" + bookTitle[i] + "\t$" + String.format("%.2f",bookPrice[i]));
    }


    static void SearchBookPrice(int[] bookID, String[] bookTitle, double[] bookPrice) {
        int i = 0, option, match = -1;

        Stars();
        System.out.println("\nSearch by book ID");
        Stars();
        System.out.println();

        System.out.print("\nEnter book ID: ");
        option = input.nextInt();

        while (i < 5 && match == -1) {
            if (bookID[i] == option)
                match = i;
            else i++;
        }

        if (match == -1)
            System.out.println("Please refer to the customer service for assistance");

        else {
            System.out.println("The book ID is " + option);
            System.out.println("The price for " + bookTitle[match] + " is $" + String.format("%.2f", bookPrice[match]));
        }


    }

    static void UpdateBookPrice(int[] bookID, String[] bookTitle, double[] bookPrice) {
        int i = 0, option, match = -1;
        double newPrice;

        System.out.print("Enter book ID: ");
        option = input.nextInt();

        while (i < 5 && match == -1) {
            if (bookID[i] == option)
                match = i;
            else i++;
        }

        if (match == -1)
            System.out.println("The book is not found. Please make sure the book ID is correct");

        else
        {
            System.out.println("Current price is " + String.format("%.2f", bookPrice[match]));
            System.out.print("Enter new price for (" + bookTitle[match] + "): $");

            newPrice = input.nextFloat();

            bookPrice[match] = newPrice;
        }
    }
}

