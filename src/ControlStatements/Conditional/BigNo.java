package ControlStatements.Conditional;

import java.util.Scanner;

public class BigNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && b > c){
            System.out.println("B is greater");
        }
        else if (b < c && c > a){
            System.out.println("C is greater");
        }
        else {
            System.out.println("A is greater");
        }
    }
}
