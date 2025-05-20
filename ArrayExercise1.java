package org.example;

import java.util.Scanner;

public class ArrayExercise1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];
        int i;

        System.out.println("Enter marks for 5 quizzes:");

        // Input
        for (i = 0; i < 5; i++)
        {
            marks[i] = scanner.nextInt();
        }

        // Addition
        for (i = 0; i < 5; i++)
        {
            marks[i] += 10;

            if (marks[i] >= 100)
            {
                marks[i] = 100;
            }
        }

        System.out.print("The new marks are: ");

        for (i = 0; i < 5; i++ )
            System.out.print(marks[i] + " ");
    }
}

/*Consider you have an array that can store 5 quiz scores (0-100).
Write a program such that:

- We ask for user input for the 5 quiz scores.
- Because there is an error in the questions, the quiz scores will
be added by 10. However, if the new score after being added is >= 100, the mark will stay at 100.


1D Array Exercise:

Sequential Search.

Suppose we ask the user to input several integers to be put in one array (assuming each
of the integers are different from each other).

Next, we ask the user to input the integer to be searched inside the array.

The program will loop for each index of the array sequentially, and if the matching value is found,
print out the index of the array and exit the program, however if there are no matching value,
print out that the matching value cannot be found.*/