class PiggyBank {
    private final String id;
    private double savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= savings) {
            savings -= amount;
            return true;
        }
        return false;
    }

    public double getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }
}

public class ThePiggyBank {
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");

        pb.deposit(100);
        System.out.println("Savings after deposit(100): " + pb.getSavings()); // 100.0

        pb.withdraw(30);
        System.out.println("Savings after withdraw(30): " + pb.getSavings()); // 70.0

        boolean status = pb.withdraw(500);
        System.out.println("Withdraw(500) success: " + status); // false
        System.out.println("Savings after failed withdraw: " + pb.getSavings()); // 70.0
    }
}
