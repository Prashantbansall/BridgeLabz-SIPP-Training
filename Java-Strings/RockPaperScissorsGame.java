package javaString;
import java.util.*;

public class RockPaperScissorsGame {
	
	public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    public static String[][] getStatistics(int userWins, int computerWins, int totalGames) {
        double userPercent = ((double) userWins / totalGames) * 100;
        double computerPercent = ((double) computerWins / totalGames) * 100;
        String[][] stats = {
            {"Player Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerPercent)},
        };
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Game", "Player Choice", "Computer Choice", "Winner");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-10s\n", i + 1, results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("\nStatistics:");
        System.out.printf("%-15s %-10s %-15s\n", "Result", "Count", "Percentage");
        for (String[] row : stats) {
            System.out.printf("%-15s %-10s %-15s\n", row[0], row[1], row[2]);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int userWins = 0, computerWins = 0;
        String[][] results = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) computerWins++;
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }
        String[][] stats = getStatistics(userWins, computerWins, n);
        displayResults(results, stats);
	}

}
