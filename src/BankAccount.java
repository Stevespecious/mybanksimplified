abstract class BankAccount {
    protected double balance;
    protected Customer owner;

    abstract void setOwner(Customer owner);
    abstract boolean withdraw(double amount);

    int getId() {
        return 0;
    }

    void deposit(double amount) {

    }
    double getBalance() {
        return 0;
    }

    Customer getOwner() {
        return null;
    }
}
