package me.ItsAdamLY;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char status;
        int service_year = 5;
        double salary = 200.00;
	    
	Scanner input = new Scanner(System.in);
	    
	System.out.print("Input status :");
	status = input.next().charAt(0);    

        if (status == 'F' || status == 'f'){
            if (service_year < 5){
                System.out.println("Your new salary is " + salary*1.04); // for Java they don't have data conversion thingy, just do " " + dataType(expression)
            }
            else {
                System.out.println("Your new salary is " + salary*1.05);
            }
        }
        else if (status == 'P' || status == 'p'){
            if (service_year < 5){
                System.out.println("Your new salary is " + salary*1.025);
            }
            else {
                System.out.println("Your new salary is " + salary*1.03);
            }
        }
        else{
            System.out.println("Error! Wrong status.");
        }
    }
 }
