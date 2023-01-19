import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        // Initialize player stats
        int playerHealth = 100;
        int playerAttack = 10;
        int playerDefense = 5;

        // Initialize enemy stats
        int enemyHealth = 50;
        int enemyAttack = 8;
        int enemyDefense = 3;

        // Game loop
        while (playerHealth > 0 && enemyHealth > 0) {
          // Display player and enemy stats
          System.out.println("Player Health: " + playerHealth);
          System.out.println("Enemy Health: " + enemyHealth);

          // Player turn
          System.out.println("Enter attack strength (1-10): ");
          int attackStrength = scanner.nextInt();
          int damage = attackStrength * playerAttack - enemyDefense;
          enemyHealth -= damage;
          System.out.println("You hit the enemy for " + damage + " damage!");

          // Enemy turn
          damage = enemyAttack - playerDefense;
          playerHealth -= damage;
          System.out.println("The enemy hits you for " + damage + " damage!");
        }

        // Display win or lose message
        if (playerHealth <= 0) {
          System.out.println("You have been defeated!");
        } else {
          System.out.println("You have defeated the enemy!");
        }
    }
  }
}
