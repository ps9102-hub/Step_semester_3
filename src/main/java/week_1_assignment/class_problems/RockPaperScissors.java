import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        switch (playerMove.toLowerCase()) {
            case "rock":
                return computerMove.equalsIgnoreCase("scissors") ? "Player Wins" : "Computer Wins";
            case "paper":
                return computerMove.equalsIgnoreCase("rock") ? "Player Wins" : "Computer Wins";
            case "scissors":
                return computerMove.equalsIgnoreCase("paper") ? "Player Wins" : "Computer Wins";
            default:
                return "Invalid Move";
        }
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rounds = 5;
        int wins = 0, losses = 0, draws = 0;

        String[][] summaryTable = new String[rounds][4];

        for (int i = 0; i < rounds; i++) {
            System.out.print("Round " + (i + 1) + " - Enter move (Rock, Paper, Scissors): ");
            String playerMove = scanner.nextLine().trim();
            String computerMove = moves[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);

            summaryTable[i][0] = String.valueOf(i + 1);
            summaryTable[i][1] = playerMove;
            summaryTable[i][2] = computerMove;
            summaryTable[i][3] = result;

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else if (result.equals("Draw")) draws++;
        }

        System.out.println("\n--- Final Summary ---");
        System.out.printf("%-8s | %-12s | %-13s | %-13s\n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("----------------------------------------------------------");
        for (String[] row : summaryTable) {
            System.out.printf("%-8s | %-12s | %-13s | %-13s\n", row[0], row[1], row[2], row[3]);
        }

        double winPercentage = ((double) wins / rounds) * 100;
        System.out.printf("\nWins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", wins, losses, draws, winPercentage);
        
        scanner.close();
    }
}
