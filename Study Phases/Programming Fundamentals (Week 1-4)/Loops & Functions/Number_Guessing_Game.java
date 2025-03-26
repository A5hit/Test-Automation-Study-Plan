/*

Create a Number Guessing Game where:

    - The program randomly selects a number between 1-100.

    - The user guesses the number and receives hints (Too High / Too Low).

    - The game continues until the user guesses correctly.

    - The program tracks the number of attempts.

Bonus Features:

    - Allow multiple rounds.

    - Set a max limit of attempts and end the game if exceeded.

 */

import java.util.Scanner;

public class Number_Guessing_Game {

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        Scanner input = new Scanner(System.in);
        Boolean playAgain = true;
        while (playAgain) {
            System.out.println("Guess a number between 0 and 100");
            int randomNumber = (int) (Math.random() * 100);
            gameLogic(randomNumber);
            System.out.println("Play Again : Yes or No");
            if (input.nextLine().equalsIgnoreCase("Yes")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }
    }

    public static void gameLogic(int randomNumber) {

//        for (int i = 1; i < 10; i++) {
//            Scanner sc = new Scanner(System.in);
//            int userGuess = sc.nextInt();
//            if (randomNumber == userGuess) {
//                System.out.println("Congratulations! You guessed the number " + randomNumber + "!");
//                break;
//            } else if (userGuess < randomNumber) {
//                System.out.println("Too Low");
//            } else {
//                System.out.println("Too High");
//            }
//        }

        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();
        int countAttempts = 1;

        while (userGuess != randomNumber) {
            if (userGuess < randomNumber) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
            userGuess = sc.nextInt();
            countAttempts++;
        }
        System.out.println("You guessed the number " + randomNumber + " with " + countAttempts + " attempts");

    }

}
