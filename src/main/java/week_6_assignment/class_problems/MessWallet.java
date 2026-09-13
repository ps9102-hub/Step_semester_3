public class MessWallet {
    private double balance;
    
    public MessWallet(double balance){
        if(balance<0){
            this.balance=0;
            System.out.println("Warning: Negative value rejected");
        }
        else{
            this.balance=balance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid top-up amount.");
        } else {
            balance += amount;
            System.out.println("Top-up successful.");
        }
    }
    public void deduct(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deduction amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Deduction not allowed.");
        } else {
            balance -= amount;
            System.out.println("Deduction successful.");
        }
    }

    double getBalance(){
        return balance;
    }

    public static void main(String[] args) {

        MessWallet wallet = new MessWallet(500);

        System.out.println("Balance: " + wallet.getBalance());

        wallet.topUp(200);
        System.out.println("Balance: " + wallet.getBalance());

        wallet.deduct(300);
        System.out.println("Balance: " + wallet.getBalance());

        wallet.deduct(1000);
        System.out.println("Balance: " + wallet.getBalance());
    }
}
