import java.util.Scanner;

public class Main {

    public static int DAYS = 3;
    public static int days_above_average = 0;

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        days_above_average = Input();
        System.out.println("The total days with above average temperature is : " + days_above_average);
	// write your code here
    }

    static int Input()
    {
        double[] temperatures = new double[DAYS];
        double average = 0.0;
        int i;

        for (i=0;i<DAYS;i++)
        {
            System.out.print("Temperature for Day #" + (i+1) + " : ");
            temperatures[i] = input.nextFloat();

            average += temperatures[i]/DAYS;

            if (temperatures[i] >= 37.5)
            {
                ++days_above_average;
            }
        }
        System.out.println("The average temperature for " + DAYS + " days is : " + String.format("%.2f", average));

        return days_above_average;
    }
}
