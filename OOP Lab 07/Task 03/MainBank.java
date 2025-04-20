// Task 02a: Base class BankAccount
public class BankAccount {
    public double getInterestRate() {
        return 0.05; 
    }
}
// Task 02b: SavingsAccount subclass
public class SavingsAccount extends BankAccount {
    @Override
    public double getInterestRate() {
        return 0.10;
    }
}
// Task 02c: Main class to test overriding
public class MainBank {
    public static void main(String[] args) {
        BankAccount genericAccount = new BankAccount();
        BankAccount savingsAccount = new SavingsAccount(); 

        System.out.println("Generic Account Interest Rate: " 
            + genericAccount.getInterestRate());           
        System.out.println("Savings Account Interest Rate: " 
            + savingsAccount.getInterestRate());            
    }
}