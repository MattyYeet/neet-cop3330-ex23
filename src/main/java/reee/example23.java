/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Matthew Neet
 */
package reee;

import java.util.Scanner;

public class example23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String answer = input.nextLine();
        switch(answer){
            case "y":
                System.out.print("Are the battery terminals corroded? ");
                answer = input.nextLine();
                switch(answer){
                    case "y":
                        System.out.println("Clean the terminals and try starting again.");
                        System.exit(0);
                    case "n":
                        System.out.println("Replace the cables and try again.");
                        System.exit(0);
                    default:
                        System.out.println("My bad, I broke.");
                        System.exit(0);
                }
            case "n":
                System.out.print("Does the car make a slicking noise? ");
                answer = input.nextLine();
                switch(answer){
                    case "y":
                        System.out.println("Replace the battery.");
                        System.exit(0);
                    case "n":
                        System.out.print("Does the car crank up but fail to start? ");
                        answer = input.nextLine();
                        switch(answer){
                            case "y":
                                System.out.println("Check the spark plug connection.");
                                System.exit(0);
                            case "n":
                                System.out.print("Does the engine start and then die? ");
                                answer = input.nextLine();
                                switch(answer){
                                    case "y":
                                        System.out.print("Does your car have fuel injection? ");
                                        answer = input.nextLine();
                                        switch(answer){
                                            case "y":
                                                System.out.println("Get it in for service.");
                                                System.exit(0);
                                            case "n":
                                                System.out.println("Check to ensure the choke is opening and closing.");
                                                System.exit(0);
                                            default:
                                                System.out.println("My bad, I broke.");
                                                System.exit(0);
                                        }
                                    case "n":
                                        System.out.println("This should not be possible.");
                                        System.exit(0);
                                    default:
                                        System.out.println("My bad, I broke.");
                                        System.exit(0);
                                }
                            default:
                                System.out.println("My bad, I broke.");
                                System.exit(0);
                        }
                    default:
                        System.out.println("My bad, I broke.");
                        System.exit(0);
                }
        }

    }
}
