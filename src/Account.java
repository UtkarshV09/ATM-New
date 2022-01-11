import java.util.Scanner;
import java.text.DecimalFormat;
public class Account {

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    /*Set & Get the customer number , Set & Get the PinNumber , Get the checking balance , Get the saving balance ..*/

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }
    /*Calculate  Checking Account Withdrawal*/

    public double calCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    /*Calculate Saving Account Withdraw*/
    public double calSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    /*Calculate Checking Account Deposit*/
    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    /*Calculate Saving Account Deposit*/
    public  double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }
    /* Customer Checking Account Withdraw INPUT */

    public  void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Withdraw form Checking Account : ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0){
            calCheckingWithdraw(amount);
            System.out.println("Mew Checking Account Balance : " + moneyFormat.format(checkingBalance)+ "\n");
        }else {
            System.out.println("Balance cannot be negative" + "\n");
        }
    }
    /* Customer Saving Account Withdraw INPUT */

    public  void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to Withdraw from Saving Account : ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0){
            calSavingWithdraw(amount);
            System.out.println("New Saving Balance : " + moneyFormat.format(savingBalance) + "\n");
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
    /* Customer Checking Account Deposit */

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit to Checking Account : ");
        double amount = input.nextDouble();

        if ((checkingBalance + amount)>= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance : " + moneyFormat.format(checkingBalance) + "\n");
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
    /* Customer Saving Account Deposit INPUT */

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit in Saving Account");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance : " + moneyFormat.format(savingBalance) + "\n");
        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }


    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
}
