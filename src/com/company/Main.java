package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //What it does:
        /*
        CAPS or opposite
         */
        System.out.println("Welcome to text converter! Input any string: ");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        System.out.println("CAPS or lowercase? Input caps or lower: ");
        String input1 = input.next();
        while (!input1.equals("caps") || !input.equals("lower")){
            if(input1.equals("caps")){
                System.out.println(text.toUpperCase());
                return;
            }
            else if(input1.equals("lower")){
                System.out.println(text.toLowerCase());
                return;
            }
            else{
                System.out.println("Invalid input. Try again: ");
                input1 = input.next();
            }
        }

    }
}
