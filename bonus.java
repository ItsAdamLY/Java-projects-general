import java.util.Scanner;

public class Main {

    public static int ARSIZE = 5;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bonus;
        int[] marks = new int[ARSIZE];
        do {
            System.out.print("Enter a bonus mark : ");
            bonus = input.nextInt();

            if (bonus < 0 || bonus > 100)
                System.out.println("Error! The marks must be in range (0-100)");
        } while (bonus < 0 || bonus > 100);

        Edit(bonus, marks);
    }

    static void Edit(int bonus, int[] marks) {
        int i;
        int[] newScore;

        System.out.print("Enter " + ARSIZE + " quiz scores : ");
        for (i=0; i<ARSIZE; i++)
        {
            do
            {
                marks[i] = input.nextInt();
                if (marks[i] < 0 || marks[i] > 100)
                    System.out.println("Error! The marks must be in range (0-100) Please re-enter : ");
            } while (marks[i] < 0 || marks[i] > 100);
        }

        newScore = GetScore(bonus, marks);
        Output(newScore);

    }

    static int[] GetScore(int bonus, int[] marks)
    {
        int i;
        int[] newScore = new int[ARSIZE];

        for (i=0; i<ARSIZE; i++)
        {
            newScore[i] = Math.min(marks[i] + bonus, 100);
        }
        return newScore;
    }

    static void Output(int[] newScore)
    {
        int i;
        System.out.print("The new score array is : ");

        for (i=0; i<ARSIZE; i++)
        {
            System.out.print(newScore[i] + " ");
        }
    }
}
