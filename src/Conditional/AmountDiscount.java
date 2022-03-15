package ControlStatements.Conditional;

import java.util.Scanner;

public class AmountDiscount {
    public static void main(String[] args) {

        System.out.print("Enter the amount of your choice: ");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();

        if(amt < 5000){
            float discount = (amt * 10) / 100;
        }
        else if(amt >= 5000 && amt < 10000){
            float discount = (amt * 20)/100;
        }
        else if (amt >= 20000){
            float discount = (amt * 50)/100;
        }

    }
}
