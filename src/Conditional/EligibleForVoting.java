package ControlStatements.Conditional;

import java.util.Scanner;

public class EligibleForVoting {
    public static void main(String[] args) {

        System.out.print("Please enter age for verification: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18 && age < 110) {
            System.out.println("Voter is eligible for voting");
        }

        else
            System.out.println("Voter is not eligible for voting");
    }
}
