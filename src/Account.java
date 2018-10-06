

public class Account {

    private String number;
    private double balance;
    private String customerNumber;
    private String customerEmailAddress;
    private String custerPhoneNumber;


    public void deposit(double depositAmount){
        this.balance +=depositAmount;
        System.out.println("Deposit of "+ depositAmount + " made. New balance is "+ this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance -withdrawalAmount <0){
            System.out.println("Only "+ this.balance + " available.");
        }else {
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of "+ withdrawalAmount + " processed. Remaining balance = "+ this.balance);
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCusterPhoneNumber() {
        return custerPhoneNumber;
    }

    public void setCusterPhoneNumber(String custerPhoneNumber) {
        this.custerPhoneNumber = custerPhoneNumber;
    }


}
