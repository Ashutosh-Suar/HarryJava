package HarryJava;

import java.util.*;
import java.util.Random;

class Game {
    private int number;
    private int inputNumber;
    private int noOfGuesses = 0;
    private Scanner sc; // Declare a Scanner instance

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Constructor
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100); // Generate number between 1 and 100
        this.sc = new Scanner(System.in); // Initialize scanner
    }

    void takeUserInput() {
        System.out.print("Guess the number: ");
        inputNumber = sc.nextInt();
        noOfGuesses++; // Increment guesses count on every attempt
    }

    boolean isCorrectNumber() {
        if (inputNumber == number) {
            System.out.format("Yes, you guessed it right! It was %d.\nYou guessed it in %d attempts.\n", number,
                    noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }
        return false;
    }

    // Close the scanner when the game ends
    void closeScanner() {
        sc.close();
    }
}

public class cwh_50_Ex3_sol {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
        g.closeScanner(); // Close scanner after the game ends
    }
}
