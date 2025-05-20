package org.example;

public class ArrayExercise2
{
    public static void main(String[] args)
    {
        int[][] matA =
                {{4,6},
                {1,4}};

        int[][] matB =
                {{2,6},
                {3,7}};

        int[][] matC = new int[2][2];

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.println("The sum of Matrix A and Matrix B is: ");

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// 2x3 Matrix calculator

// Let there be three matrices, matA, matB and matC, each of which are 2x3.
// Write a program to determine the value of matD such that:
// matD = matA + matB - matC

// print out the value of matD