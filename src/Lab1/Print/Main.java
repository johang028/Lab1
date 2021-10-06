package Lab1.Print;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        boolean isFullTime = true;
        double hours;
        double payRate;
        double grossPay;
        double netPay;
        final double TAX = 0.10;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter your age");
        age = input.nextInt();
        System.out.println("Are you full time? Type 'true' if yes. Type 'false' if no.");
        isFullTime = input.nextBoolean();
        System.out.println("Enter number of weekly work hours");
        hours=input.nextDouble();
        System.out.println("Enter the number of your weekly pay rate");
        payRate=input.nextDouble();
        grossPay=hours*payRate;
        System.out.println("Your weekly gross pay of your job is: " + (int)(grossPay*100)/100.0);
        netPay=grossPay-(grossPay*TAX);
        System.out.print("Your weekly net pay of your job is: " + (int)(netPay*100)/100.0);
    }
}
