package HarryJava;

import java.util.*;
import java.util.Random;

public class cwh_41_Ex2_sol {
    public static void main(String[] args) {

        // 0 for Rock , 1 for Paper , 2 for scissor

        while (true) {
            Scanner sc = new Scanner(System.in);
            int userInput;

            Random random = new Random();
            int computerInput;
            System.out.println("Enter 0 for Rock , 1 for Paper , 2 for scissor : ");
            userInput = sc.nextInt();
            computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                    || userInput == 2 && computerInput == 1) {
                System.err.println("Congratulations You win");
            } else {
                System.out.println("Computer Wins");
            }

            if (computerInput == 0) {
                System.out.println("Computer Choice : Rock.");
            } else if (computerInput == 1) {
                System.out.println("Computer Choice : Paper.");
            } else if (computerInput == 2) {
                System.out.println("Computer Choice : Scissor.");
            }
        }

    }
}
