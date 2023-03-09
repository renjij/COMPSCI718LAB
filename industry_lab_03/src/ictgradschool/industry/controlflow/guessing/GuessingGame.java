package ictgradschool.industry.controlflow.guessing;
import ictgradschool.Keyboard;

/**
 * A guessing game!
 */
public class GuessingGame {

    public void start() {
        int num = (int)(Math.random() * 100);
        int guess = 0;
        while (num != guess){
            System.out.println("Enter your guess (1 – 100): ");
            guess = Integer.parseInt(Keyboard.readInput());
            if (guess < num){
                System.out.println("Too low, try again");
            }else if (guess > num) {
                System.out.println("Too high, try again");
            }else {
                System.out.println("Perfect!");
            }
        }
        System.out.println("Goodbye!");
        // TODO Write your code here.
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
