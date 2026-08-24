

public class TrafficSignalAnalyzer {

    public static void findLongestStreak(String signalLog) {

        if (signalLog == null || signalLog.isEmpty()) {
            return;
        }

        char maxColor = signalLog.charAt(0);
        int maxStreak = 1;

        char currentColor = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == currentColor) {
                currentStreak++;
            } else {
                currentColor = signalLog.charAt(i);
                currentStreak = 1;
            }

            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
                maxColor = currentColor;
            }
        }

        System.out.println("Longest streak: " + maxColor);
        System.out.println("Length: " + maxStreak);
    }

    public static void main(String[] args) {

        String signalLog = "RRGGGYRR";

        findLongestStreak(signalLog);
    }
}
