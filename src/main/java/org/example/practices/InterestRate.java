package org.example.practices;

import java.text.NumberFormat;
import java.util.Scanner;

public class InterestRate {

    private static void CalculateLoan(double totalLoanAmt, int totalYears, float interestRate) {

        final int MONTHS_IN_YEAR = 12;
        int no_of_months = totalYears * MONTHS_IN_YEAR;
        float monthly_interest_rate = interestRate / MONTHS_IN_YEAR;

        double monthlyPayment = totalLoanAmt * (
                        (monthly_interest_rate * (Math.pow( 1 + monthly_interest_rate,no_of_months))) /
                        ((Math.pow(1 + monthly_interest_rate,no_of_months))-1)
        );
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double totalLoanAmt = 100000;
//        int totalYears = 15;
//        float interestRate = .04F;

        System.out.println("\n\n--------------------------Fill out this form-------------------------------");
        System.out.println("\nEnter the Total amount you brought in loan: ");
        double totalLoanAmt = sc.nextDouble();
        System.out.println("\nEnter the No of Years you've to pay the amt: ");
        int totalYears = sc.nextInt();
        System.out.println("\nEnter the Annual Interest rate: ");
        float interestRate = sc.nextFloat();

        CalculateLoan(totalLoanAmt, totalYears, interestRate);

    }


}