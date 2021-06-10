import java.util.Scanner;

public class Main {

    public static int ROW;
    public static int COL;

    public static int i, j;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Input();
    }

    static void Input()
    {
        do
        {
            System.out.print("Input Row : ");
            ROW = input.nextInt();

            if (ROW <1) System.out.println("Error! Invalid value.");
        } while (ROW < 1);

        do
        {
            System.out.print("Input Row : ");
            COL = input.nextInt();

            if (COL <1) System.out.println("Error! Invalid value.");
        } while (COL < 1);
        
       // for Array declaration in Java, it's not dataType var[][] as in C lang, but rather dataType[][] var;

        int[][] Mat_A = new int[ROW][COL]; // declaration of array is as follows
        int[][] Mat_B = new int[ROW][COL];
        int[][] Mat_C;
        for (i=0; i<ROW; i++)
        {
            for (j=0; j<COL; j++)
            {

                System.out.print("Enter Matrix A [" + i + "] [" + j + "] : ");
                Mat_A[i][j] = input.nextInt();
            }
        }

        for (i=0; i<ROW; i++)
        {
            for (j=0; j<COL; j++)
            {
                System.out.print("Enter Matrix B [" + i + "] [" + j + "] : ");
                Mat_B[i][j] = input.nextInt();
            }
        }

        Mat_C = Operation(Mat_A, Mat_B);
        Output(Mat_C);
    }

    static int[][] Operation(int[][] Mat_A, int[][] Mat_B)
    {
        int[][] Mat_C = new int[ROW][COL];
        char Operator;
        do {
            System.out.print("Input operator (+ - * /) : ");
            Operator = input.next().charAt(0);

            switch (Operator) { // switch format as in C is allowed, however this one is more superior
                case '+' -> {
                    for (i = 0; i < ROW; i++) {
                        for (j = 0; j < COL; j++) {
                            Mat_C[i][j] = Mat_A[i][j] + Mat_B[i][j];
                        }
                    }
                }
                case '-' -> {
                    for (i = 0; i < ROW; i++) {
                        for (j = 0; j < COL; j++) {
                            Mat_C[i][j] = Mat_A[i][j] - Mat_B[i][j];
                        }
                    }
                }
                case '*' -> {
                    for (i = 0; i < ROW; i++) {
                        for (j = 0; j < COL; j++) {
                            Mat_C[i][j] = Mat_A[i][j] * Mat_B[i][j];
                        }
                    }
                }
                case '/' -> {
                    for (i = 0; i < ROW; i++) {
                        for (j = 0; j < COL; j++) {
                            Mat_C[i][j] = Mat_A[i][j] / Mat_B[i][j];
                        }
                    }
                }
                default -> System.out.println("Error! Invalid operator.");
            }

        } while (Operator != '+' && Operator != '-' && Operator != '*' && Operator != '/');

        return Mat_C;
    }

    static void Output(int[][] Mat_C)
    {
        System.out.println();
        System.out.println("Matrix C is : ");
        for (i=0;i<ROW;i++)
        {
            for (j=0;j<COL;j++)
            {
                System.out.print(Mat_C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
