import java.util.Random;

public class Computer {
    //declaration of private instance
    private int choice;

    //method to allow computer random choice
    public void makeChoice(){
        Random random = new Random();
        //generates a random integer between 0 and 2
        //add 1 to the result to shift range to between 1 and 3
        this.choice = random.nextInt(3) + 1;
    }

    //method to return computers choice
    public int getChoice(){
        return choice;
    }

    //turn computers random numeric choice to string
    public String choicetoString(){
        switch (choice) {
            case 1: return "Paper";
            case 2: return "Rock";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}

