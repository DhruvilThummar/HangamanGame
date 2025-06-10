import java.util.*;

class HangmanGame {

    String[] words;
    String secretWord;
    StringBuilder guessedWord;
    int attemptsLeft;
    int score; // Added score variable

    static {
        System.out.println(" ");
        System.out.println("\u001B[32mWelcome to Hangman Game!\u001B[0m");
        System.out.println("Try to guess the secret word related to Java programming.");
    } 
}

class Hard extends HangmanGame
{
    Hard() {
        super.words = new String[]{"java", "programming", "algorithm", "arrays", "binary", "compiler", "objects", "class", "break", "continue", "variable"};
        super.secretWord = pickRandomWord();
        super.guessedWord = new StringBuilder("_".repeat(secretWord.length()));
        super.attemptsLeft = 3;
        super.score = 0; // Initialize score to 0
    }
    String pickRandomWord() {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    void displayHangman() {
        int maxIncorrectGuesses = 3;
        int incorrectGuesses = maxIncorrectGuesses - super.attemptsLeft;

        System.out.println("Hangman Figure:");

        switch (incorrectGuesses) {
            case 1:
			    System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
                System.out.println("  |       |");
            
                break;
            case 2:
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       O");
            System.out.println("  |      /|\\");
            System.out.println("  |      / \\");
            break;
            default:    
			    System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
           
        }

        System.out.println("------------");
    }

    void playGame() {
        Scanner sc = new Scanner(System.in);
        char guess;
        boolean isGuessed;

        while (super.attemptsLeft > 0 && super.guessedWord.indexOf("_") != -1) {
            System.out.println("Attempts left: " + super.attemptsLeft);
            System.out.println("Current word: " + super.guessedWord);
            displayHangman();
            System.out.print("\u001B[32mEnter a letter guess: \u001B[0m");
            guess = sc.next().charAt(0);
            isGuessed = false;

            for (int i = 0; i < super.secretWord.length(); i++) {
                if (super.secretWord.charAt(i) == guess) {
                    super.guessedWord.setCharAt(i, guess);
                    isGuessed = true;
                }
            }

            if (!isGuessed) {
                super.attemptsLeft--;
                System.out.println("\033[0;31mPlease enter a valid letter!\033[0m");
            }
        }

        if (super.guessedWord.indexOf("_") == -1) {
            System.out.println("Congratulations! You guessed the word: " + super.secretWord);
            System.out.println("Your score: " + super.attemptsLeft);
            super.score += attemptsLeft; // Update the score
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + super.secretWord);
        }

        System.out.println("Do you want to play again? (yes/no): ");
        sc.nextLine();
        String playAgain = sc.nextLine();
        if (playAgain.equalsIgnoreCase("yes")) {
            Hard H=new Hard();
			System.out.println("  ");
            H.playGame();
        } else {
            System.out.println("Thanks for playing!");
            System.out.println("Total Score: " + super.score); // Display total score when exiting the game
        }
    }
}
class Medium extends HangmanGame
{
        Medium() {
        super.words = new String[]{"java", "programming", "algorithm", "arrays", "binary", "compiler", "objects", "class", "break", "continue", "variable"};
        super.secretWord = pickRandomWord();
        super.guessedWord = new StringBuilder("_".repeat(secretWord.length()));
        super.attemptsLeft = 5;
        super.score = 0; // Initialize score to 0
    }
    String pickRandomWord() {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    void displayHangman() {
        int maxIncorrectGuesses = 5;
        int incorrectGuesses = maxIncorrectGuesses - super.attemptsLeft;

        System.out.println("Hangman Figure:");

        switch (incorrectGuesses) {
            case 1:
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       O");
            System.out.println("  |       |");
            break;
            case 2:
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       O");
            System.out.println("  |      /|");
            break;
            case 3:
                System.out.println("  ________");
                System.out.println("  |       |");
                System.out.println("  |       O");
                System.out.println("  |      /|\\");
                break;
            case 4:
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       O");
            System.out.println("  |      /|\\");
            System.out.println("  |      / \\");
            break;
            default:
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       O");
            break;
        }

        System.out.println("------------");
    }

    void playGame() {
        Scanner sc = new Scanner(System.in);
        char guess;
        boolean isGuessed;

        System.out.println(" ");
        System.out.println("\u001B[32mWelcome to Hangman Game!\u001B[0m");
        System.out.println("Try to guess the secret word related to Java programming.");

        while (attemptsLeft > 0 && guessedWord.indexOf("_") != -1) {
            System.out.println("Attempts left: " + super.attemptsLeft);
            System.out.println("Current word: " + super.guessedWord);
            displayHangman();
            System.out.print("\u001B[32mEnter a letter guess: \u001B[0m");
            guess = sc.next().charAt(0);
            isGuessed = false;

            for (int i = 0; i < super.secretWord.length(); i++) {
                if (super.secretWord.charAt(i) == guess) {
                    super.guessedWord.setCharAt(i, guess);
                    isGuessed = true;
                }
            }

            if (!isGuessed) {
                super.attemptsLeft--;
                System.out.println("\033[0;31mPlease enter a valid letter!\033[0m");
            }
        }

        if (guessedWord.indexOf("_") == -1) {
            System.out.println("Congratulations! You guessed the word: " + super.secretWord);
            System.out.println("Your score: " + super.attemptsLeft);
            super.score += attemptsLeft; // Update the score
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + secretWord);
        }

        System.out.println("Do you want to play again? (yes/no): ");
        sc.nextLine();
        String playAgain = sc.nextLine();
        if (playAgain.equalsIgnoreCase("yes")) {
            System.out.println("  ");
            Medium M=new Medium();
            M.playGame();
            sc.nextLine();
        } else {
            System.out.println("Thanks for playing!");
            System.out.println("Total Score: " + super.score); // Display total score when exiting the game
        }
    }
}
class Easy extends HangmanGame
{
    Easy() {
        super.words = new String[]{"java", "programming", "algorithm", "arrays", "binary", "compiler", "objects", "class", "break", "continue", "variable"};
        super.secretWord = pickRandomWord();
        super.guessedWord = new StringBuilder("_".repeat(secretWord.length()));
        super.attemptsLeft = 7;
        super.score = 0; // Initialize score to 0
    }
    String pickRandomWord() {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    void displayHangman() {
        int maxIncorrectGuesses = 7;
        int incorrectGuesses = maxIncorrectGuesses - super.attemptsLeft;

        System.out.println("Hangman Figure:");

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

        while (super.attemptsLeft > 0 && super.guessedWord.indexOf("_") != -1) {
            System.out.println("Attempts left: " + super.attemptsLeft);
            System.out.println("Current word: " + super.guessedWord);
            displayHangman();
            System.out.print("\u001B[32mEnter a letter guess: \u001B[0m");
            guess = sc.next().charAt(0);
            isGuessed = false;

            for (int i = 0; i < super.secretWord.length(); i++) {
                if (super.secretWord.charAt(i) == guess) {
                    super.guessedWord.setCharAt(i, guess);
                    isGuessed = true;
                }
            }

            if (!isGuessed) {
                attemptsLeft--;
                System.out.println("\033[0;31mPlease enter a valid letter!\033[0m");
            }
        }

        if (super.guessedWord.indexOf("_") == -1) {
            System.out.println("Congratulations! You guessed the word: " + super.secretWord);
            System.out.println("Your score: " + super.attemptsLeft);
            super.score += attemptsLeft; // Update the score
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + super.secretWord);
        }

        System.out.println("Do you want to play again? (yes/no): ");
        sc.nextLine();
        String playAgain = sc.nextLine();
        if (playAgain.equalsIgnoreCase("yes")) {
            System.out.println("  ");
            Easy E=new Easy();
            E.playGame();
            sc.nextLine();
        } else {
            System.out.println("Thanks for playing!");
            System.out.println("Total Score: " + super.score); // Display total score when exiting the game
        }
    }
}
class Run 
{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        HangmanGame game = new HangmanGame();
        boolean b=true;
        while(b)
        {
			System.out.println(" ");
            System.out.println("Enter Your Choice");
            System.out.println("1. Hard");
            System.out.println("2. Medium");
            System.out.println("3. Easy");
            System.out.println("4. Exit");
            char choice= sc.next().charAt(0);
            switch(choice)
            {
                case '1': Hard H= new Hard();
                H.playGame();
                break;
                case '2': Medium M= new Medium();
                M.playGame();
                break;
                case '3': Easy E=new Easy();
                E.playGame();
                break;
                case '4': System.out.println("\u001B[34mThanks for playing!\u001B[0m");
                b=false;
                break;
                default:
                System.out.println("\033[0;31mPlease enter a valid Input!\033[0m");
                break;
            }
        }
    }
}
