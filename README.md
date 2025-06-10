-----

# Hangman Game

This is a console-based Hangman game implemented in Java. Players can choose from different difficulty levels (Easy, Medium, Hard) and try to guess Java programming-related words. The game tracks your score and provides a visual representation of the Hangman figure as you make incorrect guesses.

-----

## Features

  * **Multiple Difficulty Levels:** Choose between Easy, Medium, and Hard, each with a different number of attempts.
  * **Java Programming Theme:** All secret words are related to Java programming concepts.
  * **Interactive Gameplay:** Guess letters, see your progress, and watch the Hangman figure appear with each incorrect guess.
  * **Scoring System:** Your score is updated based on the number of attempts remaining when you successfully guess a word.
  * **Play Again Option:** Easily restart the game after a round.

-----

## How to Play

1.  **Run the `Run.java` file.** This will start the game.
2.  **Choose a Difficulty:** At the start, you'll be prompted to select a difficulty level (1 for Hard, 2 for Medium, 3 for Easy).
3.  **Guess Letters:** Enter one letter at a time when prompted.
4.  **Monitor Your Progress:** The game will show you the current state of the word (e.g., `_ _ _ _`) and the number of attempts you have left.
5.  **Win or Lose:**
      * If you guess the word before running out of attempts, you win\! Your remaining attempts will be added to your score.
      * If you run out of attempts, you lose, and the correct word will be revealed.
6.  **Play Again:** After each round, you'll be asked if you want to play again.

-----

## Getting Started

### Prerequisites

To compile and run this game, you'll need:

  * **Java Development Kit (JDK) 8 or higher**

### Compiling and Running

1.  **Save the code:** Save all the provided Java code into a single file named `HangmanGame.java` (or separate them into `HangmanGame.java`, `Hard.java`, `Medium.java`, `Easy.java`, and `Run.java` if you prefer to structure them that way). For simplicity, keeping them in one `Run.java` file is fine as long as `Run` is the main class.

    *Self-correction: The provided code has multiple classes in one file, and the `Run` class contains the `main` method. It's best to keep the filename as `Run.java` to avoid compilation issues.*

2.  **Open a terminal or command prompt.**

3.  **Navigate to the directory** where you saved the `Run.java` file.

4.  **Compile the code:**

    ```bash
    javac Run.java
    ```

5.  **Run the game:**

    ```bash
    java Run
    ```

-----

## Code Structure

  * **`HangmanGame` class:** This is the base class that defines the core properties of the Hangman game, including `words`, `secretWord`, `guessedWord`, `attemptsLeft`, and `score`.
  * **`Hard`, `Medium`, and `Easy` classes:** These classes extend `HangmanGame` and represent the different difficulty levels. Each sets its own initial number of attempts and provides a `displayHangman()` method to show the corresponding Hangman figure based on incorrect guesses. The `playGame()` method contains the main game loop logic.
  * **`Run` class:** This class contains the `main` method, which serves as the entry point for the application. It allows the user to select a difficulty level and start the game.

-----

## Future Enhancements

  * Expand the word list for each difficulty level.
  * Implement a way to track and display high scores.
  * Add more detailed input validation (e.g., ensuring only single letters are entered).
  * Improve the user interface with more advanced console output or a graphical interface.
  * Allow for different themes of words, not just Java programming.
    A clear and informative `README.md` is essential for any project. It serves as the entry point for others (and your future self\!) to understand what your code does, how to use it, and how to contribute.

Here's a `README.md` for your Hangman game:

-----

# 🎮 Java Hangman Game

A classic command-line Hangman game implemented in Java, offering different difficulty levels and a scoring system. Test your vocabulary and Java knowledge\!

-----

## 🌟 Features

  * **Multiple Difficulty Levels**: Choose between Easy, Medium, and Hard, each with a varying number of attempts.
  * **Java-themed Words**: All secret words are related to Java programming concepts.
  * **Interactive Gameplay**: Guess letters, see your progress, and watch the Hangman figure develop with incorrect guesses.
  * **Scoring System**: Earn points based on remaining attempts when you guess a word correctly.
  * **Play Again Option**: Easily restart the game or select a new difficulty.

-----

## 🚀 Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need to have the **Java Development Kit (JDK)** installed on your system. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/downloads/).

### Installation

1.  **Clone the repository (or download the source code):**

    ```bash
    git clone <repository_url_here>
    ```

    (Replace `<repository_url_here>` with the actual URL of your repository if you're hosting it on GitHub, GitLab, etc.)

2.  **Navigate to the project directory:**

    ```bash
    cd HangmanGame
    ```

    (Assuming "HangmanGame" is the name of your project directory)

3.  **Compile the Java code:**

    ```bash
    javac *.java
    ```

    This command compiles all `.java` files in the current directory.

-----

## 🕹️ How to Play

1.  **Run the compiled code:**

    ```bash
    java Run
    ```

2.  **Select a difficulty:**
    The game will present you with a menu to choose between "Hard", "Medium", "Easy", or "Exit". Enter the corresponding number (1, 2, 3, or 4).

3.  **Guess letters:**
    Once the game starts, you'll see the masked secret word (underscores representing hidden letters) and your remaining attempts. Enter one letter at a time to guess.

4.  **Win or Lose:**

      * If you guess the word before running out of attempts, you win\! Your remaining attempts will be added to your score.
      * If you run out of attempts, you lose, and the secret word will be revealed.

5.  **Play Again:**
    After each game, you'll be prompted to play again. Enter "yes" or "no". If you choose "yes", you'll return to the difficulty selection menu. Your total score will be displayed when you exit the game.

-----

## 🛠️ Built With

  * **Java**

-----

## 🤝 Contributing

Contributions are welcome\! If you have suggestions for improvements, new features, or bug fixes, feel free to:

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4.  Push to the branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request.

-----
