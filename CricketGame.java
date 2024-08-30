import java.util.*;

class CricketGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice = -1;
    int player1Score = 0;
    int player2Score = 0;

    System.out.println("Welcome to Cricket Game!");

    while (choice != 0 && choice != 2) {
      System.out.println("\nEnter your choice:");
      System.out.println("0 - Instructions");
      System.out.println("1 - Start Game");
      System.out.println("2 - Quit Game");

      choice = scanner.nextInt();

      switch (choice) {
        case 0:
          System.out.println("\nInstructions:");
          System.out.println("1. Two players play this game.");
          System.out.println("2. Each player gets to bat for a maximum of 6 balls.");
          System.out.println("3. The player with the highest score at the end of the game wins.");
          break;

        case 1:
          System.out.println("\nGame started!");

          for (int i = 1; i <= 6; i++) {
            System.out.println("\nBall " + i + ":");
            System.out.println("Player 1, enter your score:");
            player1Score += scanner.nextInt();

            System.out.println("Player 2, enter your score:");
            player2Score += scanner.nextInt();
          }

          System.out.println("\nGame over!");

          if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
          } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
          } else {
            System.out.println("It's a tie!");
          }

          break;

        case 2:
          System.out.println("\nGoodbye!");
          break;

        default:
          System.out.println("\nInvalid choice. Please enter 0, 1, or 2.");
          break;
      }
    }
  }
}