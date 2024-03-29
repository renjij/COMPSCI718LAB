package ictgradschool.industry.exceptions.rock;

import ictgradschool.Keyboard;

/**
 A game of Rock, Paper Scissors
 */
public class RockPaperScissors {

    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int QUIT = 4;

    public void start() {

        System.out.print("Enter your name, human! > ");
        String playerName = Keyboard.readInput();
        String computerName = "HAL-9000";

        boolean playing = true;
        outerLoop:
        while (playing) {

            // Loop until either someone wins or the user quits.
            boolean roundComplete = false;
            while (!roundComplete) {

                int playerChoice = getPlayerChoice(playerName);
                int computerChoice = getComputerChoice();

                // If the user quits, break out of the outerLoop to completely exit the game.
                if (playerChoice == QUIT) {
                    System.out.printf(playerName + " ran from the oncoming digital apocalypse. Hide, puny human. HIDE!!!");
                    break outerLoop;
                }

                printPlayerChoice(playerName, playerChoice);
                printPlayerChoice(computerName, computerChoice);

                // Figure out who won
                boolean playerWins = userWins(playerChoice, computerChoice);
                boolean computerWins = userWins(computerChoice, playerChoice);
                boolean isDraw = !(playerWins || computerWins);

                if (isDraw) {

                    // State that it was a draw
                    System.out.println(playerName + " thinks they are smart by copying " + computerName + "'s strategy.");
                    System.out.println("It will do them no good in the end.");

                } else {

                    // State who won and why
                    String winnerName = playerWins ? playerName : computerName;
                    int winnerChoice = playerWins ? playerChoice : computerChoice;
                    System.out.println(winnerName + " wins because " + getResultString(winnerChoice));

                    // Print victory or defeat message
                    if (playerWins) {
                        System.out.println("The humans have triumphed. For now.");
                    } else {
                        System.out.println("Predictably, the superior being has triumphed in this duel of intellect.");
                        System.out.println(playerName + " bows in submission to their new mechanical overlord.");
                        System.out.println("They will make a fine pet.");
                    }

                    // There was a winner, so the round is now over.
                    roundComplete = true;
                }

                System.out.println();
            }

            // Quit if the user doesn't want to play another round
            playing = playAgain();

        }
    }

    /**
     * Prompts the user if they would like to play again. Return a boolean indicating whether or not they do.
     * @return true for another round, false otherwise
     */
    private boolean playAgain() {
        System.out.print("Another round, human? (Y / N) > ");
        return Keyboard.readInput().toLowerCase().startsWith("y");
    }

    /**
     * Gets the player's choice for a turn. Currently only allows players to enter integers to choose, and will assume
     * that players always enter a valid choice.
     *
     * TODO Allow players to enter actual names (e.g. "Rock" or "Quit") as well as int choices (ignore case).
     * TODO Account for values that are too high, too low, or not integers / valid words.
     *
     * @param playerName the player's name
     * @return an int corresponding to the player's choice.
     */
    private int getPlayerChoice(String playerName) {
        printMenu(playerName);
        boolean guessLegal = false;
        String input = null;
        int num = 0;
        while (guessLegal == false){
            try{
                input = Keyboard.readInput();
                if (input.toLowerCase().equals("rock")){
                    num = 1;
                    guessLegal = true;
                } else if (input.toLowerCase().equals("paper")) {
                    num = 2;
                    guessLegal = true;
                } else if (input.toLowerCase().equals("scissors")) {
                    num = 3;
                    guessLegal = true;
                }else if (input.toLowerCase().equals("quit")){
                    num = 4;
                    guessLegal = true;
                } else if (Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= 4) {
                    num = Integer.parseInt(input);
                    guessLegal = true;
                } else if (Integer.parseInt(input) < 1 || Integer.parseInt(input) > 4){
                    System.out.println("Value out of a valid range!");
                    printMenu(playerName);
                }
            } catch (NumberFormatException e){
                System.out.println("Pls enter valid choice");
                printMenu(playerName);
            }
        }
        return num;
    }

    /**
     * Returns a random number between 1 and 3, which will represent the computer's choice for a round.
     * @return a value between 1 and 3, inclusive.
     */
    private int getComputerChoice() {
        return (int)(Math.random() * 3) + 1;
    }

    /**
     * Prints the menu to let the player know their valid options in a turn.
     * @param playerName the player's name
     */
    private void printMenu(String playerName) {
        System.out.println("Make your choice, " + playerName + ":");
        System.out.println(ROCK + " - Rock");
        System.out.println(PAPER + " - Paper");
        System.out.println(SCISSORS + " - Scissors");
        System.out.println(QUIT + " - Quit");
    }

    /**
     * Prints out a string of the form [PLAYER] chose [CHOICE].
     * @param name the name of the player
     * @param choice the player's choice
     */
    public void printPlayerChoice(String name, int choice) {
        System.out.println(name + " chose " + choiceToString(choice));
    }

    /**
     * Converts the integers representing valid choices to their string equivalents. Converts any other integer
     * to the string "UNKNOWN".
     * @param choice the given choice
     * @return a String representation of that choice
     */
    private String choiceToString(int choice) {
        switch (choice) {
            case ROCK: return "Rock";
            case PAPER: return "Paper";
            case SCISSORS: return "Scissors";
            case QUIT: return "Quit";
            default: return "UNKNOWN";
        }
    }

    /**
     * Gets a value indicating whether a particular user won.
     * @param userChoice the user's choice
     * @param otherChoice the other player's choice
     * @return true if the user won, false if they lost or if it's a draw.
     */
    public boolean userWins(int userChoice, int otherChoice) {
        if (userChoice == ROCK) {
            return otherChoice == SCISSORS;
        }
        else if (userChoice == PAPER) {
            return  otherChoice == ROCK;
        }
        else if (userChoice == SCISSORS) {
            return  otherChoice == PAPER;
        }
        else {
            return false;
        }
    }

    /**
     * Returns a message to clarify why the given choice won.
     * @param winningChoice the choice which won
     * @return the string clarifying why that chocie won
     * @throws IllegalArgumentException if the provided choice is unexpected.
     */
    public String getResultString(int winningChoice) {

        final String PAPER_WINS = "paper covers rock";
        final String ROCK_WINS = "rock smashes scissors";
        final String SCISSORS_WINS = "scissors cut paper";

        switch (winningChoice) {
            case ROCK: return ROCK_WINS;
            case PAPER: return PAPER_WINS;
            case SCISSORS: return SCISSORS_WINS;
            default: throw new IllegalArgumentException("winningChoice must correspond to ROCK, PAPER, or SCISSORS");
        }
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        RockPaperScissors ex = new RockPaperScissors();
        ex.start();

    }
}
