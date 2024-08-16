import java.util.Scanner;

public class Player {

    //declaration of private instance
    private String name;
    private int choice; //referencing user choice between rock/paper/scissors

    //constructor method to take parameter "name"
    public Player(String name){
        this.name = name;
    }

    //method that can be accessed outside 'Player' class
    public String getName(){
        return name;
    }

    //method that can be accessed outside 'Player' class
    public int getChoice(){
        return choice;
    }

    //method to allow user to make a choice
    public void makeChoice(){
        Scanner scanner = new Scanner(System.in);
        //User options print out
        System.out.println("Choose an Option:" +
                "1 = Paper, 2 = Rock, 3 = Scissors");
        //assign input to choice variable
        this.choice = scanner.nextInt();
    }

    //turn players numeric choice to string
    public String choiceToString(){
        switch (choice){
            case 1: return "Paper";
            case 2: return "Rock";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}
