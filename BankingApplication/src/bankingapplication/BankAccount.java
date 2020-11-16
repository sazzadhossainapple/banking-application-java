package bankingapplication;

import java.util.Scanner;

public class BankAccount extends calculation {

    public BankAccount(String CustomerName, String CustomerID) {
        super(CustomerName, CustomerID);
    }

   

    void showmenu() {
        char option = '\0';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + CustomerName);
        System.out.println("your ID is" + CustomerID);
        System.out.println("\n");
        System.out.println("A. Check Balance ");
        System.out.println("B. Deposite ");
        System.out.println("C. WithDraw  ");
        System.out.println("D.Previous Transaction ");
        System.out.println("E. Exit");

        do {
            System.out.println("....................");
            System.out.println("Enter an Option");

            System.out.println("....................");

            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':
                    System.out.println("...............");
                    System.out.println("Balance=" + balance);
                    System.out.println("...............");
                    System.out.println("\n");
                    break;

                case 'B':

                    System.out.println("...............");
                    System.out.println("Enter a amount to deposit:");
                    System.out.println("...............");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':

                    System.out.println("..............");
                    System.out.println("Enter a amount to WithDraw : ");
                    System.out.println("\n");
                    System.out.println("..............");
                    int amount2 = scanner.nextInt();
                    WithDraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("..............");
                    getPreviousTransaction();
                    System.out.println("\n");
                    break;
                    
                case 'E':
                    System.out.println("................");

                default:
                    System.out.println("Invaid optin!. Pleace Enter again.");
                    break;
            }

        } while (option != 'E');
        System.out.println(" Thankyou for using services ");

    }

}
