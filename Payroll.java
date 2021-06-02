import java.util.Scanner;

public class Main {

    public static final double TAX = 0.15;
    public static final double HOUR_RATE = 6.80;

    public static void main(String[] args) {

        System.out.println("-- Welcome to PAYROLL REPORT --");
        System.out.println("");

        Capture();

	// write your code here
    }

    static void Capture()
    {
        int option;
        double hours,iTax,gross,nett;
        Scanner input = new Scanner(System.in);

        do
        {
            do
            {
                System.out.print("Hours worked : ");
                hours = input.nextDouble();

                if (hours < 0) System.out.println("Invalid value!");
            } while (hours < 0);

            gross = GrossPay(hours);
            iTax = IncomeTax(gross);
            nett = NettPay(gross,iTax);
            Display(hours,gross,iTax,nett);

            System.out.println("Continue? (Press 0 to exit) :");
            option = input.nextInt();
            if (option == 0) break;
        } while (option != 0);
    }

    static double GrossPay(double hours)
    {
        double OT, gross;
        if (hours > 40)
        {
            OT = (hours - 40)*1.5*HOUR_RATE;
            gross = (40*HOUR_RATE) + OT;
        } else gross = hours*HOUR_RATE;

        return gross;
    }

    static double IncomeTax(double gross)
    {
        double iTax;
        iTax = gross * TAX;
        return iTax;
    }

    static double NettPay(double gross, double iTax)
    {
        double nett;
        nett = gross - iTax;
        return nett;
    }

    static void Display(double hours, double gross, double iTax, double nett)
    {
        System.out.println("");
        System.out.println("Employee income report :");
        System.out.println("");
        System.out.println("Total hours : " + String.format("%.2f", hours));
        System.out.println("Gross pay : RM " + String.format("%.2f", gross));
        System.out.println("Income tax : RM " + String.format("%.2f", iTax));
        System.out.println("Nett pay : RM " + String.format("%.2f", nett));
    }
}
