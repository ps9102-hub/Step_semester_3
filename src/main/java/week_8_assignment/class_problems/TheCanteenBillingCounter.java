import java.util.*;

abstract class Customer {
    protected double amount;

    public Customer(double amount) {
        this.amount = amount;
    }

    public abstract double calculateFinalAmount();
}

class Student extends Customer {
    public Student(double amount) {
        super(amount);
    }

    @Override
    public double calculateFinalAmount() {
        return amount * 0.90;
    }
}

class Staff extends Customer {
    public Staff(double amount) {
        super(amount);
    }

    @Override
    public double calculateFinalAmount() {
        return amount * 0.95;
    }
}

class Guest extends Customer {
    public Guest(double amount) {
        super(amount);
    }

    @Override
    public double calculateFinalAmount() {
        return amount + 10.0;
    }
}

public class TheCanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Customer customer;

            switch (type) {
                case "STUDENT":
                    customer = new Student(amount);
                    break;
                case "STAFF":
                    customer = new Staff(amount);
                    break;
                case "GUEST":
                    customer = new Guest(amount);
                    break;
                default:
                    continue;
            }

            double finalAmt = customer.calculateFinalAmount();
            total += finalAmt;
            System.out.printf("%s: %.2f\n", type, finalAmt);
        }

        System.out.printf("Total: %.2f\n", total);
        sc.close();
    }
}