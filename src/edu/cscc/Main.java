package edu.cscc;
import java.util.*;

public class Main {

    /**
     * Main class
     * @author Nathan Glick
     * 10/14/2019
     */

    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

        /**
         * Constructor
         * @param h_pick Human Pick
         * @param c_pick Computer Pick
         * @param answer Human Answer to play again
         * @param isValid Makes sure the human pick is a valid pick
         */

        /**
         * @return is the human choice valid
         */

        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);
            /**
             * @return computer pick
             */

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            /**
             * @return who wins
             */

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }

            /**
             * @return do you want to play again
             */

            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}