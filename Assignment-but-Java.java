import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int total_subjects, subject_no, marks, Ac = 0, Amc = 0, Bpc = 0, Bc = 0, Bmc = 0, Cpc = 0, Cc = 0, Fc = 0;
        double pointer, A, Am, Bp, B, Bm, Cp, C, F;
        char to_continue;

        A = 4.00;
        Am = 3.67;
        Bp = 3.33;
        B = 3.00;
        Bm = 2.67;
        Cp = 2.33;
        C = 2.00;
        F = 1.00;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("How many subjects : ");

            while ((total_subjects = input.nextInt()) < 1) {
                System.out.println("Error!");
                System.out.print("Please re-enter how many subjects : ");
            }

            for (subject_no = 1; subject_no <= total_subjects; subject_no++) {
                System.out.print("Input subject " + subject_no + " score : ");
                marks = input.nextInt(); //input where without repeating declaration

                if (marks >= 85 && marks <= 100) {
                    System.out.println("Grade is A : Exceptional");
                    ++Ac;
                } else if (marks >= 75 && marks <= 84) {
                    System.out.println("Grade is A- : Excellent");
                    ++Amc;
                } else if (marks >= 70 && marks <= 74) {
                    System.out.println("Grade is B+ : Very Good");
                    ++Bpc;
                } else if (marks >= 65 && marks <= 69) {
                    System.out.println("Grade is B : Good");
                    ++Bc;
                } else if (marks >= 60 && marks <= 65) {
                    System.out.println("Grade is B- : Fairly Good");
                    ++Bmc;
                } else if (marks >= 55 && marks <= 59) {
                    System.out.println("Grade is C+ : Satisfactory");
                    ++Cpc;
                } else if (marks >= 50 && marks <= 54) {
                    System.out.println("Grade is C : Quite Satisfactory");
                    ++Cc;
                } else {
                    System.out.println("Grade is F : Poor");
                    ++Fc;
                }
            }

            pointer = A * Ac + Am * Amc + Bp * Bpc + B * Bc + Bm * Bmc + Cp * Cpc + C * Cc + F * Fc;

            System.out.println("The sum of grade points is " + String.format("%.2f", pointer));
            // String.format("format",var name) <- for decimal precision

            System.out.println("Your GPA is " + String.format("%.2f", pointer / total_subjects));

            System.out.print("Do you want to continue? YES - Y or NO - N: ");
            to_continue = input.next().charAt(0); // input character

            while (to_continue != 'Y' && to_continue != 'y' && to_continue != 'N' && to_continue != 'n') {
                System.out.println("Invalid character!");
                System.out.print("Do you want to continue? YES - Y or NO - N: ");

                to_continue = input.next().charAt(0); // re-input

                if (to_continue == 'Y' || to_continue == 'y') break;
                else if (to_continue == 'N' || to_continue == 'n') return;
            }

        } while(to_continue == 'Y' || to_continue == 'y');
    }
}
