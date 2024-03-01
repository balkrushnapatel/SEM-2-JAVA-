class Bank_Account {

    int accountno;
    String username;
    String email;
    String accountType;
    int accountBalance;

    void getAccountDetails(int accountno, String username, String email, String accountType, int accountBalance) {
        this.accountno = accountno;
        this.username = username;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number is " + accountno);
        System.out.println("Account Holder's name is " + username);
        System.out.println("Account Holder's email is " + email);
        System.out.println("Account Type is " + accountType);
        System.out.println("Account Balances is " + accountBalance);
    }

}

public class Lab5_4 {
    public static void main(String[] args) {
        int accountno = 123456789;
        String username = "Balkrushna";
        String email = "abc@email.com";
        String accountType = "Savings";
        int accountBalance = 50000;

        Bank_Account b1 = new Bank_Account();

        b1.displayAccountDetails();

    }

}
