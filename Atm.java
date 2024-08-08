import java.util.Scanner;

class atm {
    float Balance = 1000; // Initialized with a default balance
    int Pin = 9087;

    public void CheckPin() {
        System.out.println("Enter Your Pin:");
        Scanner Input = new Scanner(System.in);
        int EnterPin = Input.nextInt();
        if (EnterPin == Pin) {
            Menu();
        } else {
            System.out.println("Enter Valid Pin ");
        }
    }

    public void Menu() {
        System.out.println("Enter Your Choice");
        System.out.println("1: Check Account Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");

        Scanner Input = new Scanner(System.in);
        int Options = Input.nextInt();

        switch (Options) {
            case 1:
                CheckBalance();
                break;
            case 2:
                Deposit();
                break;
            case 3:
                Withdraw();
                break;
            case 4:
                return;
            default:
                System.out.println("Enter a Valid Choice");
        }
    }

    public void CheckBalance() {
        System.out.println("Balance: " + Balance);
        Menu();
    }

    public void Withdraw() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw:");
        int WithdrawAmount = Input.nextInt();
        if (WithdrawAmount > Balance) {
            System.out.println("Insufficient Balance in your account");
        } else {
            Balance = Balance - WithdrawAmount;
            System.out.println("Successfully withdrawn");
        }
        Menu();
    }

    public void Deposit() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Money to Deposit:");
        int DepositAmount = Input.nextInt();
        Balance = Balance + DepositAmount;
        System.out.println("Money Deposited");
        Menu();
    }
}

public class Atm {
    // Main Method
    public static void main(String[] args) {
        atm obj = new atm();
        obj.CheckPin();
    }
}
