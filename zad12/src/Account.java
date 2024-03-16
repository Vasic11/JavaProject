public class Account {
    private String name;
    private String accountNumber;
    private double balane;

    public Account(String name, String accountNumber, double balane) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balane = balane;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalane() {
        return balane;
    }

    public void setBalane(double balane) {
        this.balane = balane;
    }
    public void withDraw(double amount){
        balane -= amount;
    }
    public void deposit(double amount){
        balane += amount;
    }
    public String getAccountInfo(){
        return "Name: "+ name + " Account Number: "+ accountNumber + " Balance: "+ balane;
    }
}
