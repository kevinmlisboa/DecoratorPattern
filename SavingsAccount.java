public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private Double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 1.0;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate() / 100);
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Name: " + accountName + "\n" +
               "Balance: " + balance;
    }
}
