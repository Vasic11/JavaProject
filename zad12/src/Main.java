import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Bank bank = new Bank();

    Account account1 = new Account("Mita","Mitic",5000);
    Account account2 = new Account("Pera","Peric", 45000);
    Account account3 = new Account("Zika","Zikic",20000);

    bank.addAcount(account1);
    bank.addAcount(account2);
    bank.addAcount(account3);
        ArrayList<Account>accounts=bank.getAccounts();
        for (Account account:accounts){
            System.out.println(account.getAccountInfo());
        }
        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1,1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("No transaction in account2:");
        System.out.println(account2.getAccountInfo());
        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3,5000);
        System.out.println(account3.getAccountInfo());
    }
}