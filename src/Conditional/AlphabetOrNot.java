package ControlStatements.Conditional;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {

        System.out.print("Please enter your character: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println("Entered character is an alphabet");
        else
            System.out.println("Is not an alphabet");
    }
}
