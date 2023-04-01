package ictgradschool.industry.exceptions.guessing;

import ictgradschool.Keyboard;

/**
 * A guessing game!
 */
public class GuessingGame {

    /**
     * Plays the actual guessing game.
     *
     * You shouldn't need to edit this method for this exercise.
     */
    public void start() {

        int number = getRandomValue();
        int guess = 0;

        while (guess != number) {

            guess = getUserGuess();

            if (guess > number) {
                System.out.println("Too high!");
            }
            else if (guess < number) {
                System.out.println("Too low!");
            }
            else {
                System.out.println("Perfect!");
            }

        }

    }

    /**
     * Gets a random integer between 1 and 100.
     *
     * You shouldn't need to edit this method for this exercise.
     */
    private int getRandomValue() {
        return (int) (Math.random() * 100) + 1;
    }

    /**
     * Gets the user's guess from the keyboard. Currently assumes that the user will always enter a valid guess.
     *
     * TODO Implement some error handling, for the cases where the user enters a value that's too big, too small, or
     * TODO not an integer. Change this method so it's guaranteed to return an integer between 1 & 100, inclusive.
     */
    private int getUserGuess() {
        boolean guessLegal = false;
        int num = 0;
        while (guessLegal == false){
            System.out.print("Enter your guess: ");
            try{
                num = Integer.parseInt(Keyboard.readInput());
                if (num >= 0 & num <= 100){
                    guessLegal = true;
                }else {
                    System.out.println("Value out of a valid range!");
                }
            } catch (NumberFormatException e){
                System.out.println("only enter numbers!");
            }
        }
        return num;
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
