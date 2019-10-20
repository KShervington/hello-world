package SavingsAccount;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance = 0;
    public static double monthInterest;


    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double calculateMonthlyInterest(){
        monthInterest = this.savingsBalance * (annualInterestRate / 12.0);

        this.savingsBalance += monthInterest;

        return monthInterest;
    }

    public static double modifyInterestRate(){
        annualInterestRate = monthInterest * 12;

        return annualInterestRate;
    }

}
