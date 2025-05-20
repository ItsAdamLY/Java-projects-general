package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessAssignmentDoWhile
{
    public static void main(String[] args)
    {
        Random systemNo = new Random();
        int randomNo = systemNo.nextInt(1, 21);

        Scanner user = new Scanner(System.in);
        int attempts = 5;
        int userInput;

        do
        {
            System.out.println("Enter a number between 1-20. You have " + attempts + " chances to guess the right number!");
            System.out.println(randomNo);
            userInput = user.nextInt();

            if (userInput < 1 || userInput > 20)
            {
                System.out.println("The number is out of range.");
                continue;
            }

            if (userInput == randomNo)
            {
                System.out.println("Congratulations! You guessed the lucky number: " + randomNo);
                break;
            }

            else if (userInput == 18)
            {
                System.out.println("You have activated a death trap.");
                return;
            }

            else
            {
                attempts--;
                if (attempts > 0)
                {
                    System.out.println("Incorrect! Try again");
                }
                else
                {
                    System.out.println("Game Over! The correct number was: " + randomNo);
                }
            }
        } while (attempts > 0);

        System.out.println("You spent " + attempts + " attempts to guess the number.");
    }
}