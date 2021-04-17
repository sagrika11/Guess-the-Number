package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int attempt1 = 0;
        int attempt2 = 0;
        int userGuessInput = 0;
        int SecretNumber = 0;
        System.out.println("______________________________");
        System.out.println("Enter Your Name");
        String name= scan.nextLine();
        System.out.println("______________________________");

        SecretNumber = rand.nextInt(101);


do{
        System.out.println("Enter the number you have guessed");
        userGuessInput = scan.nextInt();

            if (userGuessInput > SecretNumber) {
                attempt1++;
                System.out.println("The guessed number is bigger\n");

            } else if (userGuessInput < SecretNumber) {
                attempt2++;
                System.out.println("The guessed number is smaller\n");


            } else if (userGuessInput == SecretNumber) {
                System.out.println("Hurray!! the guessed number is " + SecretNumber);
                if((attempt1 + attempt2)>10)
                System.out.println("Total attempt is " + (attempt1 + attempt2)+ " but you need Improvement");
                else
                    System.out.println("Total attempt is " + (attempt1 + attempt2)+ " and Well ! done, you are good player " +name);
            }



        }
while (userGuessInput!=SecretNumber);

        }
    }

