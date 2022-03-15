package ControlStatements.Conditional;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args) {

        System.out.print("Please enter your no.:");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();

        if(mul % 5 == 0)
            System.out.println("Number is multiple of 5");
        else
            System.out.println("Number is not multiple of 5");
    }
}
