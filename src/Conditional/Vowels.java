package ControlStatements.Conditional;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        System.out.print("Enter your alphabet: ");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {

            case 'a' :
                System.out.println(ch + " is a vowel");
                break;

            case 'e' :
                System.out.println(ch + " is a vowel");
                break;

            case 'i' :
                System.out.println(ch + " is a vowel");
                break;

            case 'o' :
                System.out.println(ch + " is a vowel");
                break;

            case 'u' :
                System.out.println(ch + " is a vowel");
                break;

                default:
                    System.out.println(ch + " is a consonant");
        }

       method2 v = new method2();
        v.vowel();

    }
}

    class method2 {

    public void vowel()  {

        System.out.print("\n Enter you alphabet: ");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);



         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println(ch + " is  a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }

    }
 }