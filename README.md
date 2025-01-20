# HangamanGame
The code implements a **Hangman game** in Java. This game allows a player to guess a randomly chosen word letter by letter, with a limited number of incorrect attempts allowed. Here’s a detailed breakdown:

---

### **1. Overview of the Class**
The program uses a single class, `HangmanGame`, which encapsulates all the game logic and maintains the state of the game. 

---

### **2. Key Variables**
- **`words`**: An array of predefined Java-related words that can be chosen as the secret word.
- **`secretWord`**: The word to be guessed, selected randomly from the `words` array.
- **`guessedWord`**: A `StringBuilder` that tracks the player’s progress by showing correctly guessed letters and underscores (`_`) for unguessed ones.
- **`attemptsLeft`**: Tracks how many incorrect guesses remain. Initialized to 7 (maximum number of attempts).
- **`score`**: Tracks the total score across multiple games. It increments based on the remaining attempts after correctly guessing a word.

---

### **3. Key Methods**
#### **a. `HangmanGame()` (Constructor)**
- Initializes the game by:
  - Setting up the `words` array with Java-related terms.
  - Randomly picking a secret word using the `pickRandomWord` method.
  - Initializing `guessedWord` with underscores (`_`) matching the length of the secret word.
  - Setting `attemptsLeft` to 7 and `score` to 0.

#### **b. `pickRandomWord()`**
- Randomly selects a word from the `words` array by generating a random index.

#### **c. `displayHangman()`**
- Displays a visual representation of the hangman based on the number of incorrect guesses made so far. It uses a `switch` statement to update the hangman figure step by step (e.g., head, body, arms, legs).

#### **d. `playGame()`**
- Main game loop. Handles:
  - User input for guessing letters.
  - Checking if the guessed letter exists in the `secretWord`. 
    - If correct: Updates `guessedWord` with the guessed letter at the appropriate positions.
    - If incorrect: Decrements `attemptsLeft` and shows a warning message.
  - Winning Condition: The player wins if they complete the word (`guessedWord` has no underscores left).
  - Losing Condition: The player loses if `attemptsLeft` reaches 0.
  - At the end of the game, it prompts the user to play again. If they choose "yes," it restarts the game with a new word.

#### **e. `main()`**
- The entry point of the program. Creates a `HangmanGame` instance and starts the game by calling `playGame()`.

---

### **4. Features**
1. **Random Word Selection**: Each game selects a random word from the predefined list.
2. **Visual Feedback**: The `displayHangman` method provides a progressively detailed representation of the hangman.
3. **User Interaction**:
   - Accepts letter guesses.
   - Displays progress with correctly guessed letters and remaining attempts.
4. **Replay Option**: After finishing a game, the user can decide whether to play again.
5. **Score Tracking**: Maintains a total score across multiple games based on the remaining attempts after a correct guess.

---

### **5. Enhancements Made**
- **Scoring System**: A `score` variable was added to accumulate points for each successfully guessed word based on the number of remaining attempts.
- **Play Again Prompt**: Added functionality to restart the game or exit after a round.
- **Error Feedback**: Displays a red error message when the user enters an incorrect letter.

---

### **6. Potential Improvements**
1. **Input Validation**: Add checks to ensure the user enters a single letter and not invalid inputs (e.g., numbers or multiple characters).
2. **Case Insensitivity**: Handle guesses in both uppercase and lowercase.
3. **Used Letters Display**: Show the letters the user has already guessed to avoid duplicate guesses.
4. **UI Enhancements**: Improve the display of the hangman or add colors for better visual appeal.

This code provides a solid foundation for a beginner-friendly, text-based Hangman game with basic features and customization options.
