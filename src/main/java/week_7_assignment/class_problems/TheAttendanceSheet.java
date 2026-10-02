class AttendanceSheet {
    private final String[] presentStudents;
    private int count;

    public AttendanceSheet(int capacity) {
        this.presentStudents = new String[capacity];
        this.count = 0;
    }

    public void markPresent(String studentName) {
        if (isPresent(studentName)) {
            return;
        }
        if (count < presentStudents.length) {
            presentStudents[count++] = studentName;
        }
    }

    public boolean isPresent(String studentName) {
        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equalsIgnoreCase(studentName)) {
                return true;
            }
        }
        return false;
    }

    public int getPresentCount() {
        return count;
    }
}

public class TheAttendanceSheet {
    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana"); // Duplicate, ignored

        System.out.println("Present count: " + sheet.getPresentCount()); // 2
        System.out.println("Is Ben present? " + sheet.isPresent("Ben")); // true
        System.out.println("Is Chen present? " + sheet.isPresent("Chen")); // false
    }
}