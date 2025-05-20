package org.example;

import java.util.Scanner;

public class MultiplicationTableAdam
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        do {
            System.out.println("Enter the number of rows (1-25): ");
            row = scanner.nextInt();

            if (row < 1 || row > 25)
                System.out.println("Number out of range.");
        } while (row < 1 || row > 25);

        do {
            System.out.println("Enter the number of columns (1-25): ");
            col = scanner.nextInt();

            if (col < 1 || col > 25)
                System.out.println("Number out of range.");
        } while (col < 1 || col > 25);

        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= col; j++)
            {
                System.out.print(i*j + "    ");
            }
            System.out.println();
        }
    }
}
