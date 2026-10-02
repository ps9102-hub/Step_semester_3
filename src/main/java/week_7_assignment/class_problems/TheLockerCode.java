class Locker {
    private final int lockerNumber;
    private String combination;

    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combination = initialCode;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (this.combination.equals(currentCode)) {
            this.combination = newCode;
            return true;
        }
        return false;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }
}

public class TheLockerCode {
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");

        boolean success1 = l.changeCode("1234", "5678");
        System.out.println("Change with correct code success: " + success1); // true

        boolean success2 = l.changeCode("0000", "9999");
        System.out.println("Change with wrong code success: " + success2); // false
    }
}
