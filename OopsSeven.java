//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

class BankAccount{
    int amount ;

    public void DepositFunc( int balance){
         balance = balance + amount ;
    }

    public void WithdrawFunc(int balance){
        if (amount > balance){
            balance = balance - amount ;
        }
        else{
            System.out.println("Insufficient Balance ");
        }

    }
}

class SavingsAccount extends BankAccount{
    public void WithdrawFunc(){
        
    }
}


public class OopsSeven {
    public static void main(String[] args) {
        
    }
}
