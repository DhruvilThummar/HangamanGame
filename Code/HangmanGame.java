import java.util.Scanner;

class HangmanGame {

    String[] words;
    String secretWord;
    StringBuilder guessedWord;
    int attemptsLeft;
    int score; // Added score variable

    HangmanGame() {
        words = new String[]{"java", "programming", "algorithm", "arrays", "binary", "compiler", "objects", "class", "break", "continue", "variable"};
        secretWord = pickRandomWord();
        guessedWord = new StringBuilder("_".repeat(secretWord.length()));
        attemptsLeft = 7;
        score = 0; // Initialize score to 0
    }

    String pickRandomWord() {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    void displayHangman() {
        int maxIncorrectGuesses = 7;
        int incorrectGuesses = maxIncorrectGuesses - attemptsLeft;

        System.out.println("\nHangman Figure:");

        switch (incorrectGuesses) {
            case 1:
                System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
                break;
            case 2:
                System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
                System.out.println("  |       |");
                break;
            case 3:
                System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
                System.out.println("  |      /|");
                break;
            case 4:
                System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
                System.out.println("  |      /|\\");
                break;
            case 5:
                System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
                System.out.println("  |      /|\\");
                System.out.println("  |      /");
                break;
            case 6:
                System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
                System.out.println("  |      /|\\");
                System.out.println("  |      / \\");
                break;
            default:
                System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |");
        }

        System.out.println("------------");
    }

    void playGame() {
        Scanner sc = new Scanner(System.in);
        char guess;
        boolean isGuessed;

        System.out.println("\u001B[32mWelcome to Hangman Game!\u001B[0m");  
        System.out.println("Try to guess the secret word related to Java programming.");

        while (attemptsLeft > 0 && guessedWord.indexOf("_") != -1) {
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.println("Current word: " + guessedWord);
            displayHangman();
            System.out.print("Enter a letter guess: ");
            guess = sc.next().charAt(0);
            isGuessed = false;

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedWord.setCharAt(i, guess);
                    isGuessed = true;
                }
            }

            if (!isGuessed) {
                attemptsLeft--;
                System.out.println("\033[0;31mPlease enter a valid letter!\033[0m");
            }
        }

        if (guessedWord.indexOf("_") == -1) {
            System.out.println("Congratulations! You guessed the word: " + secretWord);
            System.out.println("Your score: " + attemptsLeft);
            score += attemptsLeft; // Update the score
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + secretWord);
        }

        System.out.println("Do you want to play again? (yes/no): ");
        sc.nextLine();
        String playAgain = sc.nextLine();
        if (playAgain.equals("yes")) {
            HangmanGame H=new HangmanGame();
            H.playGame();
            sc.nextLine();
        } else {
            System.out.println("Thanks for playing!");
            System.out.println("Total Score: " + score); // Display total score when exiting the game
        }
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.playGame();
    }
}
