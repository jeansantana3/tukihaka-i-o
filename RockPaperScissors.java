import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String playerInput;
        boolean exitGame = false;

        while (!exitGame) {
            System.out.println("Choose Rock, Paper, Scissors or Exit to quit:");
            playerInput = scanner.nextLine().toLowerCase();

            if (playerInput.equals("exit")) {
                exitGame = true;
                continue;
            }

            int computerChoice = random.nextInt(3); // 0, 1, or 2

            try {
                if (!playerInput.equals("rock") && !playerInput.equals("paper") && !playerInput.equals("scissors")) {
                    throw new IllegalArgumentException("Invalid input. Please choose Rock, Paper, or Scissors.");
                }

                if ((playerInput.equals("rock") && computerChoice == 2) ||
                    (playerInput.equals("paper") && computerChoice == 0) ||
                    (playerInput.equals("scissors") && computerChoice == 1)) {
                    System.out.println("You win!");
                } else if ((playerInput.equals("rock") && computerChoice == 1) ||
                           (playerInput.equals("paper") && computerChoice == 2) ||
                           (playerInput.equals("scissors") && computerChoice == 0)) {
                    System.out.println("You lose palomaso!");
                } else {
                    System.out.println("It's a tie cheposo!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Thanks for playing!");
    }
}