import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //get, read and store input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String playerName = scanner.nextLine();

        //create new object for the respective class
        Player player = new Player(playerName);
        Computer computer = new Computer();
        Game game = new Game(player, computer);

        //call play method to run game
        game.play();
    }
}
