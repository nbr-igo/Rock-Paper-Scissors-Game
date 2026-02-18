import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    private final Scanner scanner;

    public rockPaperScissors() {
        this.scanner = new Scanner(System.in); // Scanner use all through out class
    }

    private void play(){ // Method: Confirm user wants to play
            System.out.println("Would you like to play {Rock-Paper-Scissors}? {YES-NO}");
            String playAgain =scanner.nextLine().toUpperCase();

            while(!playAgain.equals("YES") && !playAgain.equals("NO")){ // Validating Inputs
                System.out.println("Please enter a valid response {YES-NO}");
                playAgain =scanner.nextLine().toUpperCase();
            }
                if(playAgain.equals("YES")){ // Game Start
                    start();
                    System.out.println("Thanks For Playing"); // Thanking Player for playing: End Game
                } else {
                    System.out.println("Did not play a single match"); // User did not play: End Game
                }
    }

    private void start(){ // Method: Game start
        Random random = new Random();

        String[] choices = {"ROCK", "PAPER", "SCISSORS"};
        String playerChoice;
        String computerChoice;

        System.out.println("Enter your move!!{Rock-Paper-Scissors}"); // Players move
        playerChoice = scanner.nextLine().toUpperCase();

        while(!playerChoice.equals("ROCK") && !playerChoice.equals("PAPER") && !playerChoice.equals("SCISSORS")){ // Validating inputs
            System.out.println("Input not Valid, Please type: Rock-Paper-Scissors");
            playerChoice = scanner.nextLine().toUpperCase();
        }

        computerChoice = choices[random.nextInt(3)]; // Ok so random.nextInt(3) means give me the content from an index 0 to 3 but not including 3
        System.out.println("Computer chose:" + computerChoice);// Therefore only assiging the content from index 0 1 2

        if(playerChoice.equals(computerChoice)){ // If a tie occurs
            System.out.println("You lose, AI Won");
        }
        else if(playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS") // Checking who won
                || playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER") 
                || playerChoice.equals("PAPER") && computerChoice.equals("ROCK")){
            System.out.println("It's a Win");
        }
        else{ // Player lost
            System.out.println("It's a Loss");
        }
        again(); // Checking If player wants to play again
    }

    private void again(){ // Mehtod: Asking player if he wants to play again
        System.out.println("Would you like to play Again? {YES-NO}");
        String playAgain =scanner.nextLine().toUpperCase();

        while(!playAgain.equals("YES") && !playAgain.equals("NO")){//Validating inputs
            System.out.println("Please enter a valid response {YES-NO}");
            playAgain =scanner.nextLine().toUpperCase();
        }
            if(playAgain.equals("YES")){ // Play again
                start();
            }
    }

    public static void main(String[] args) throws Exception {
        rockPaperScissors game = new rockPaperScissors();
        System.out.println("Welcome to {Rock-Paper-Scissors}"); // Introduction to the game
        game.play(); // Asking if Player/User wants to play
    }

}
