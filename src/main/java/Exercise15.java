/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args){

        String username, password, storedPassword = "abc$123";
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the username?");
        username = scnr.next();
        System.out.println("What is the password?");
        password = scnr.next();

        if(password.equals(storedPassword)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
        System.exit(0);
    }//end of main

}//end of program




