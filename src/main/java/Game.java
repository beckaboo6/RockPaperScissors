import java.util.Scanner;


public class Game {

    //declare private variable to store references to objects
    private Player player;
    private Computer computer;
    private Scanner scanner;


    //initialise new game object
    public Game(Player player, Computer computer){
        this.player = player;
        this.computer = computer;
        this.scanner = new Scanner(System.in);
    }

    //determine the winner of the game
    private void determineWinner(){
        int playerChoice = player.getChoice();
        int computerChoice = computer.getChoice();

        if (playerChoice == computerChoice){
            System.out.println("it's a DRAW!");
        } else if ((playerChoice == 1 && computerChoice == 2) ||
                (playerChoice == 2 && computerChoice == 3) ||
                (playerChoice == 3 && computerChoice == 1)) {
            System.out.println(player.getName() + " WINS!");
        } else {
            System.out.println("Computer WINS!");
        }
    }

    //game loop method
    public boolean play(){
        boolean playAgain;
        do{
            player.makeChoice();
            computer.makeChoice();

            //get choices from player and computer and print
            System.out.println(player.getName() + " chose " + player.choiceToString());
            System.out.println("Computer chose " + computer.choicetoString());

            determineWinner();
            playAgain = checkDraw();

            //ask user if they want to play again
            if (!playAgain) {
                playAgain = promptReplay();
            }
        } while (playAgain);
        return playAgain;
    }

    //check if game drew
    private boolean checkDraw() {
        return player.getChoice() == computer.getChoice();
    }

    //prompt user do they want to play again
    private boolean promptReplay(){
        System.out.println("Would you like to play again? Yes = 1  No = 0");
        int response = scanner.nextInt();

        while (response != 1 && response != 0){
            System.out.println("Invalid choice. Please enter 1 to play again or 0 to exit");
            response = scanner.nextInt();
        }
        return response == 1;
    }
}
