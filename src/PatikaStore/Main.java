package PatikaStore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isOpen = true;
        System.out.println("Welcome to PatikaStore Product Management Panel.");

        while(isOpen){
            System.out.println("1 - Notebook Transactions\n" +
                    "2 - Mobile Phone Transactions\n" +
                    "3 - List Brand\n" +
                    "0 - Sign out");
            System.out.print("Your choice: ");
            int choice = scan.nextInt();
            switch(choice){
                case 0:
                    isOpen = false;
                    break;
                case 1:
                    Notebooks notebooks = new Notebooks();
                    notebooks.run();
                    break;
                case 2:
                    Phones phones = new Phones();
                    phones.run();
                    break;
                case 3:
                    PatikaStore.run();
                    break;
                default:
                    System.out.println("Please enter a valid number.");
            }

        }

    }
}
