import java.util.Scanner;
import java.util.Random;

public class WheelOfMisfortune {
    private static final String[] PUZZLES = {
            "SMART SAVINGS", "JAVA PROGRAMMING", "WHEEL OF FORTUNE", "MODERATE SUCCESS"
    };
    private static final int[] WHEEL_VALUES = { 100, 250, 500, 750, 1000, 1500, -1, -2 };
    private static final int VOWEL_COST = 250;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String puzzle = PUZZLES[random.nextInt(PUZZLES.length)].toUpperCase();
        char[] guessedPuzzle = new char[puzzle.length()];
        for (int i = 0; i < puzzle.length(); i++) {
            guessedPuzzle[i] = (puzzle.charAt(i) == ' ') ? ' ' : '_';
        }

        int points = 0;
        int turns = 10; // Maximum turns
        boolean gameOver = false;

        while (!gameOver && turns > 0) {
            System.out.printf("\nPuzzle: %s\n", new String(guessedPuzzle));
            System.out.printf("Current Points: %d\n", points);
            System.out.printf("Turns Left: %d\n", turns);

            System.out.printf("Do you want to guess the puzzle or spin the wheel? (Enter 'guess' or 'spin'): ");
            String action = scanner.next().toLowerCase();

            if (action.equals("guess")) {
                System.out.printf("Enter your guess for the puzzle: ");
                scanner.nextLine(); // Clear the newline character
                String phraseGuess = scanner.nextLine().toUpperCase();

                if (phraseGuess.equals(puzzle)) {
                    System.out.printf("\nCongratulations! You've correctly guessed the puzzle: %s\n", puzzle);
                    gameOver = true;
                } else {
                    System.out.println("Incorrect guess.");
                    turns--;
                }
            } else if (action.equals("spin")) {
                int spinResult = WHEEL_VALUES[random.nextInt(WHEEL_VALUES.length)];
                if (spinResult == -1) {
                    points = 0;
                    System.out.println("You landed on BANKRUPT! All points lost.");
                } else if (spinResult == -2) {
                    System.out.println("You landed on LOSE TURN!");
                    turns--;
                    continue;
                } else {
                    System.out.printf("You landed on %d points.\n", spinResult);
                }

                System.out.printf("Guess a letter (or type 'vowel' to buy a vowel): ");
                String guess = scanner.next().toUpperCase();

                if (guess.equals("VOWEL")) {
                    if (points >= VOWEL_COST) {
                        System.out.printf("Enter a vowel: ");
                        guess = scanner.next().toUpperCase();
                        points -= VOWEL_COST;
                    } else {
                        System.out.println("Not enough points to buy a vowel.");
                        continue;
                    }
                }

                if (guess.length() == 1) {
                    char letter = guess.charAt(0);
                    boolean correct = false;

                    for (int i = 0; i < puzzle.length(); i++) {
                        if (puzzle.charAt(i) == letter) {
                            guessedPuzzle[i] = letter;
                            correct = true;
                        }
                    }

                    if (correct) {
                        points += spinResult;
                        System.out.println("Correct guess!");
                    } else {
                        System.out.println("Incorrect guess.");
                        turns--;
                    }
                } else {
                    System.out.println("Invalid input.");
                }

                if (new String(guessedPuzzle).equals(puzzle)) {
                    System.out.printf("\nCongratulations! You've solved the puzzle: %s\n", puzzle);
                    gameOver = true;
                }
            } else {
                System.out.println("Invalid action. Please enter 'guess' or 'spin'.");
            }
        }

        if (!gameOver) {
            System.out.printf("\nGame over! The puzzle was: %s\n", puzzle);
        }

        System.out.printf("Total Points: %d\n", points);
        scanner.close();
    }
}
