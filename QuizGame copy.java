import java.util.Random;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?", 
            "Who painted the Mona Lisa?", 
            "What is the powerhouse of the cell?",
            "What is the largest planet in our solar system?",
            "Who is known as the father of computing?",
            "Which country is known as the Land of the Rising Sun?",
            "What is the boiling point of water in Celsius?",
            "Which ocean is the largest and deepest?",
            "Who wrote the play 'Hamlet'?",
            "What is the longest river in the world?"
        };

        String[] categories = {
            "Geography",
            "Art",
            "Biology",
            "Astronomy",
            "Technology",
            "Geography",
            "Science",
            "Geography",
            "Literature",
            "Geography"
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        boolean[] askedQuestions = new boolean[questions.length];

        try {
            int questionCount = 0;
            while (questionCount < 10) {
                int randomIndex = random.nextInt(questions.length);

                if (!askedQuestions[randomIndex]) {
                    askedQuestions[randomIndex] = true;
                    questionCount = questionCount + 1;

                    System.out.println("Question " + questionCount + " (" + categories[randomIndex] + "): " + questions[randomIndex]);
                    System.out.print("Your answer: ");
                    String answer = scanner.nextLine();

                    if (randomIndex == 0 && answer.equalsIgnoreCase("Paris")) {
                        score = score + 1;
                        System.out.println("Correct AGUILUCHO!");
                    } else if (randomIndex == 1 && answer.equalsIgnoreCase("Leonardo da Vinci")) {
                        score = score + 1;
                        System.out.println("Correct PANCHITO!");
                    } else if (randomIndex == 2 && answer.equalsIgnoreCase("Mitochondria")) {
                        score = score + 1;
                        System.out.println("Correct PANCHO!");
                    } else if (randomIndex == 3 && answer.equalsIgnoreCase("Jupiter")) {
                        score = score + 1;
                        System.out.println("Correct PEELY!");
                    } else if (randomIndex == 4 && answer.equalsIgnoreCase("Charles Babbage")) {
                        score = score + 1;
                        System.out.println("Correct PEELY!");
                    } else if (randomIndex == 5 && answer.equalsIgnoreCase("Japan")) {
                        score = score + 1;
                        System.out.println("Correct!");
                    } else if (randomIndex == 6 && answer.equalsIgnoreCase("100")) {
                        score = score + 1;
                        System.out.println("Correct!");
                    } else if (randomIndex == 7 && answer.equalsIgnoreCase("Pacific")) {
                        score = score + 1;
                        System.out.println("Correct!");
                    } else if (randomIndex == 8 && answer.equalsIgnoreCase("William Shakespeare")) {
                        score = score + 1;
                        System.out.println("Correct!");
                    } else if (randomIndex == 9 && answer.equalsIgnoreCase("Nile")) {
                        score = score + 1;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong answer!");
                    }
                }
            }

            System.out.println("\nYour final score: " + score);

            if (score >= 7) {
                System.out.println("Congratulations! You win!");
            } else {
                System.out.println("Sorry, you didn't get enough correct answers to win.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
