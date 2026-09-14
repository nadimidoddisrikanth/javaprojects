import java.util.Scanner;

public class ATM {
    static Scanner sc = new Scanner(System.in);
    static int pin=1234;
    static double Balance=10000.0;
    // atm menu
    static void menu()
    {
        System.out.println("\n ======ATM menu ======");
        System.out.println("1.change pin");
        System.out.println("2.Balance enquiry");
        System.out.println("3.Deposit");
        System.out.println("4.withdraw");
        System.out.println("5.mini Statements");
        System.out.println("6.Exit");

        System.out.println("7.Enter your choice");

    }
    // check pin and login
    static boolean login()
    {
        System.out.println("please enter the pin");
        int enteredpin = sc.nextInt();
        if (enteredpin==pin)
        {
            System.out.println("login successful");
            return true;
        }
        else{
            System.out.println("login failed");
            return false;
        }
    }
    // check balance
    static void Balance_enquiry()
    {
        System.out.printf("Available Balance:Rs.%.2f",Balance);
    }
    static void change_pin()
    {
        System.out.println("please enter the Current Pin:");
        int oldpin=sc.nextInt();
        if(oldpin==pin)
        {
            System.out.println("Enter the new Pin:");
            pin= sc.nextInt();
            System.out.println("Change Pin Successfully");

        }
        else{
            System.out.println("Incorrect pin");

        }
    }
// money Deposit
    static void Deposit()
    {
        System.out.println("please enter the Deposit Amount:");
        double amount=sc.nextDouble();
        if(amount<=0)
        {
            System.out.println("Incorrect Amount");
        }
        else
        {
            Balance+=amount;
            System.out.println("Deposit Successfully");
            System.out.println("Balance is "+Balance);
        }
    }
// money withdraw
    static void Withdraw()
    {
        System.out.println("please enter the withdraw  Amount:");
        double amount=sc.nextDouble();
        if(amount>Balance)
        {
            System.out.println("Incorrect Amount");
        }
        else
        {
            Balance-=amount;
            System.out.println("Withdraw Successfully");
            System.out.println("\n Balance is "+Balance);
        }
    }

    // mini statement
    static void Mini_Statements()
    {
        System.out.println("\n =======MINI STATEMENT=====");
        System.out.printf("your current Balance:Rs.%.2f",Balance);
        System.out.println("\n===========================");
    }
    static void Exit()
    {
        System.out.println("\n=======EXIT======");
    }
    static void main(String[] args)
    {
        System.out.println("\n === welcome to ATM===");
        if(!login())
        {
            System.out.println("you should login first");
            return;
        }
        int choice;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    change_pin();
                    break;
                case 2:
                    Balance_enquiry();
                    break;
                case 3:
                    Deposit();
                    break;
                case 4:
                    Withdraw();
                    break;
                case 5:
                    Mini_Statements();
                    break;
                case 6:
                    Exit();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;


            }
        }

            while (choice != 6);

            sc.close();
        }

}