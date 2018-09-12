package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;

        Scanner in = new Scanner(System.in);

        String[] strings = {"\nHamburger Buns", "Ground Beef", "Cheese", "Tomatoes", "Lettuce"};
        int[] inventory = {50, 20, 10, 15, 12};
        do {
            System.out.println("What would you like to look at? ");
            System.out.println("1. Hamburger Buns");
            System.out.println("2. Ground Beef");
            System.out.println("3. Cheese");
            System.out.println("4. Tomatoes");
            System.out.println("5. Lettuce");
            choice = in.nextInt();
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
                System.out.println("Invalid choice, please enter again\n");
        } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
        switch (choice) {

                case 1:
                System.out.println(strings[0] + ": " + inventory[0] + "\n");
                do {
                    System.out.println("Make your selection: ");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Exit");
                    choice = in.nextInt();
                    if (choice != 1 && choice != 2 && choice != 3)
                        System.out.println("Invalid choice, please try again\n");
                } while (choice != 1 && choice != 2 && choice != 3);
                switch (choice) {

                    case 1:
                        int add = adding("Enter the amount you wish to add: ");
                        int addresult = (inventory[0] + add);
                        System.out.println("There were " + inventory[0] + " hamburger buns, you added " + add + ", there are now " + addresult + ".");
                    break;

                    case 2:
                        int subtract = subtracting("Enter the amount you wish to subtract: ");
                        int subtractresult = (inventory[0] - subtract);
                        if (subtractresult < 0)
                            System.out.println("Error, amount cannot be less than 0!\n");
                        subtractresult = 0;
                        System.out.println("There were " + inventory[0] + " hamburger buns, you subtracted " + subtract + ", there are now " + subtractresult + ".");
                    break;

                    case 3:
                        System.out.println("Goodbye!");
                }
                break;

                case 2:
                System.out.println(strings[1] + ": " + inventory[1] + " lbs\n");
                do {
                    System.out.println("Make your selection: ");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Exit");
                    choice = in.nextInt();
                    if (choice != 1 && choice != 2 && choice != 3)
                        System.out.println("Invalid choice, please try again\n");
                } while (choice != 1 && choice != 2 && choice != 3);
                switch (choice) {

                    case 1:
                        int add = adding("Enter the amount you wish to add: ");
                        int addresult = (inventory[1] + add);
                        System.out.println("There were " + inventory[1] + " lbs of ground beef, you added " + add + ", there are now " + addresult + " lbs.");
                    break;

                    case 2:
                        int subtract = subtracting("Enter the amount you wish to subtract: ");
                        int subtractresult = (inventory[1] - subtract);
                        if (subtractresult < 0)
                            System.out.println("Error, amount cannot be less than 0!\n");
                        subtractresult = 0;
                        System.out.println("There were " + inventory[1] + " lbs of ground beef, you subtracted " + subtract + ", there are now " + subtractresult + " lbs.");
                    break;

                    case 3:
                        System.out.println("Goodbye!");
                }
                break;

                case 3:
                System.out.println(strings[2] + ": " + inventory[2] + " blocks\n");
                do {
                    System.out.println("Make your selection: ");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Exit");
                    choice = in.nextInt();
                    if (choice != 1 && choice != 2 && choice != 3)
                        System.out.println("Invalid choice, please try again\n");
                } while (choice != 1 && choice != 2 && choice != 3);
                switch (choice) {

                    case 1:
                        int add = adding("Enter the amount you wish to add: ");
                        int addresult = (inventory[2] + add);
                        System.out.println("There were " + inventory[2] + " blocks of cheese, you added " + add + ", there are now " + addresult + " blocks.");
                    break;

                    case 2:
                        int subtract = subtracting("Enter the amount you wish to subtract: ");
                        int subtractresult = (inventory[2] - subtract);
                        if (subtractresult < 0)
                            System.out.println("Error, amount cannot be less than 0!\n");
                        subtractresult = 0;
                        System.out.println("There were " + inventory[2] + " blocks of cheese, you subtracted " + subtract + ", there are now " + subtractresult + " blocks.");
                    break;

                    case 3:
                        System.out.println("Goodbye!");
                }
                break;

                case 4:
                System.out.println(strings[3] + ": " + inventory[3] + "\n");
                do {
                    System.out.println("Make your selection: ");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Exit");
                    choice = in.nextInt();
                    if (choice != 1 && choice != 2 && choice != 3)
                        System.out.println("Invalid choice, please try again\n");
                } while (choice != 1 && choice != 2 && choice != 3);
                switch (choice) {

                    case 1:
                        int add = adding("Enter the amount you wish to add: ");
                        int addresult = (inventory[3] + add);
                        System.out.println("There were " + inventory[3] + " tomatoes, you added " + add + ", there are now " + addresult + ".");
                    break;

                    case 2:
                        int subtract = subtracting("Enter the amount you wish to subtract: ");
                        int subtractresult = (inventory[3] - subtract);
                        if (subtractresult < 0)
                            System.out.println("Error, amount cannot be less than 0!\n");
                        subtractresult = 0;
                        System.out.println("There were " + inventory[3] + " tomatoes, you subtracted " + subtract + ", there are now " + subtractresult + ".");
                    break;

                    case 3:
                        System.out.println("Goodbye!");
                }
                break;

                case 5:
                System.out.println(strings[4] + ": " + inventory[4] + " heads\n");
                do {
                    System.out.println("Make your selection: ");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Exit");
                    choice = in.nextInt();
                    if (choice != 1 && choice != 2 && choice != 3)
                        System.out.println("Invalid choice, please try again\n");
                } while (choice != 1 && choice != 2 && choice != 3);
                switch (choice) {

                    case 1:
                        int add = adding("Enter the amount you wish to add: ");
                        int addresult = (inventory[4] + add);
                        System.out.println("There were " + inventory[4] + " heads of lettuce, you added " + add + ", there are now " + addresult + " heads.");
                    break;

                    case 2:
                        int subtract = subtracting("Enter the amount you wish to subtract: ");
                        int subtractresult = (inventory[4] - subtract);
                        if (subtractresult < 0)
                            System.out.println("Error, amount cannot be less than 0!\n");
                        subtractresult = 0;
                        System.out.println("There were " + inventory[4] + " heads of lettuce, you subtracted " + subtract + ", there are now " + subtractresult + " heads.");
                    break;

                    case 3:
                        System.out.println("Goodbye!");
                }
                break;
        }
    }

    private static int adding(String addition) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(addition);
        result = sc.nextInt();
        return result;
    }

    private static int subtracting(String subtraction) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(subtraction);
        result = sc.nextInt();
        return result;
    }
}