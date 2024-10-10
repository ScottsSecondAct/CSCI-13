/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
import java.util.Random;
import java.util.Scanner;

/*
 * A simple dice game called Solo Dice Duel.
 */
public class SoloDiceDuel {
    private static final int TARGET_SCORE = 100;
    private static final Random random = new Random();
    private static int score = 0;
    private static int currentRoundScore = 0;
    private static int point = 0;

    /*
     * Main entry point of the program.
     */
    public static void main(String[] args) {
        printObjectiveAndRules();
        Scanner scanner = new Scanner(System.in);

        while (score < TARGET_SCORE) {
            if (currentRoundScore == 0) {
                System.out.println("Press enter to roll.");
            } else {
                System.out.println("Press enter to roll, or type 'b' or 'bank' followed by enter to bank winnings.");
            }
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("")) {
                rollDice();
            } else if (input.equals("b") || input.equals("bank")) {
                bankWinnings(scanner);
            }
        }

        System.out.println("Congratulations! You've reached the target score of "
                + TARGET_SCORE + " and won the game!");
        scanner.close();
    }

    /*a
     * Print the objective and rules of the game.
     */
    private static void printObjectiveAndRules() {
        System.out.println("Welcome to Solo Dice Duel!");
        System.out.println("Objective: Reach a score of 100 points.");
        System.out.println("Rules:");
        System.out.println("- Roll two dice.");
        System.out.println("- Roll 7 or 11: Gain 10 points.");
        System.out.println("- Roll 2, 3, or 12: Lose 5 points.");
        System.out.println("- Any other roll sets a 'Point'.");
        System.out.println("- Rolling the Point again gains 5 points.");
        System.out.println("- Rolling a 7 before hitting the Point loses 10 points.");
        System.out.println("- You can bank points at any time.");
        System.out.println("- After banking, you can try 'double or nothing'.");
        System.out.println("- Reach 100 points to win.");
        System.out.println();
    }

    /*
     * Roll two dice and calculate the score based on the rules.
     */
    private static void rollDice() {
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int roll = dice1 + dice2;

        System.out.println("You rolled: " + roll);

        if (point == 0) {
            if (roll == 7 || roll == 11) {
                System.out.println("You gained 10 points!");
                currentRoundScore += 10;
            } else if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("You lost 5 points!");
                currentRoundScore -= 5;
            } else {
                point = roll;
                System.out.println("Point is set to: " + point);
            }
        } else {
            if (roll == point) {
                System.out.println("You hit the Point! Gained 5 points.");
                currentRoundScore += 5;
            } else if (roll == 7) {
                System.out.println("You rolled a 7 and lost 10 points.");
                currentRoundScore -= 10;
                point = 0; // Reset point
            } else {
                System.out.println("Roll again.");
            }
        }

        System.out.println("Current round score: " + currentRoundScore);
        System.out.println("Total score: " + score);
    }

    /*
     * Bank the winnings and optionally play 'double or nothing'.
     *
     * @param scanner the Scanner object to read user input
     */
    private static void bankWinnings(Scanner scanner) {
        score += currentRoundScore;
        System.out.println("You banked " + currentRoundScore + " points.");
        System.out.println("Total score: " + score);

        if (score < TARGET_SCORE) {
            System.out.println("Do you want to try double or nothing? (y/n)");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) {
                doubleOrNothing();
            }
        }

        currentRoundScore = 0;
        point = 0; // Reset point for the next round
    }

    private static void doubleOrNothing() {
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int roll = dice1 + dice2;

        System.out.println("You rolled: " + roll);

        if (roll == 7 || roll == 11) {
            score += currentRoundScore;
            System.out.println("You doubled your points! Total score: " + score);
        } else if (roll == 2 || roll == 3 || roll == 12) {
            score -= currentRoundScore;
            System.out.println("You lost your banked points! Total score: " + score);
        } else {
            System.out.println("Nothing happened. You keep your banked points.");
        }
    }
}
