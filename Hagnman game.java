{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] wordBank = {"apple", "banana", "orange", "grape", "melon", "strawberry", "pineapple", "peach", "kiwi", "blueberry", "watermelon", "mango", "papaya", "cherry", "pear", "apricot", "plum", "fig", "nectarine", "raspberry"};
        String secretWord = wordBank[random.nextInt(wordBank.length)];
        int attemptsLeft = 6;
        boolean wordGuessed = false;
        String guessedWord = "";

        for (int i = 0; i < secretWord.length(); i++) {
            guessedWord += "_";
        }

        while (attemptsLeft > 0 && !wordGuessed) {
            System.out.println("\nWord: " + guessedWord);
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Guess a letter: ");
            String input = scanner.next().toLowerCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Please enter a single valid letter.");
                continue;
            }

            char letter = input.charAt(0);
            boolean found = false;
            String newGuessedWord = "";

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    newGuessedWord += letter;
                    found = true;
                } else {
                    newGuessedWord += guessedWord.charAt(i);
                }
            }

            if (!found) {
                attemptsLeft--;
            }

            guessedWord = newGuessedWord;

            if (guessedWord.equals(secretWord)) {
                wordGuessed = true;
            }
        }

        if (wordGuessed) {
            System.out.println("\nCongratulations! You guessed the word: " + secretWord);
        } else {
            System.out.println("\nSorry, you ran out of attempts. The word was: " + secretWord);
        }

        System.out.println("\nThanks for playing Hangman!");
        scanner.close();
    }
}