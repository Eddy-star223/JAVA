import java.util.*;

public class Assessment {

    static class Question {
        int number;
        String question;
        String[] options;
        char correctOption;

        Question(int number, String question, String[] options, char correctOption) {
            this.number = number;
            this.question = question;
            this.options = options;
            this.correctOption = correctOption;
        }
    }
	 
	public static void main(String[] args) {
        loadQuestions();
        System.out.println(" Welcome to the Semicolon Assessment!");

        while (true) {
            List<Question> current = getAvailableQuestions();
            
	if (current.isEmpty()) {
                System.out.println(" No current questions.");
                break;
            }

            Question currentQuestion = available.get(new Random().nextInt(current.size()));
            askQuestion(currentQuestion);

            System.out.println("\nWhat would you like to do next?");
            System.out.println("1. Continue");
            System.out.println("2. Restart");
            System.out.println("3. Exit");
            String choice = scanner.nextLine();

            if (choice.equals("2")) {
                resetGame();
                System.out.println(" Game restarted.");
            } else if (choice.equals("3")) {
                break;
            }
        }

        System.out.println(" Final score: " + score + "/" + attempted);
    }

    static void loadQuestions() {

        Questions.add(new Question(1, "What is the capital of Ghana?",
            new String[]{"A. Nigeria", "B. London", "C. Paris", "D. "}, 'Accra'));
        Questions.add(new Question(2, "Which planet is closer to earth?",
            new String[]{"A. Neptune", "B. Mars", "C. Mecury", "D. Venus"}, 'B'));
        Questions.add(new Question(3, "What is 7 + 49?",
            new String[]{"A. 56", "B. 49", "C. 51", "D. 55"}, 'A'));
        Questions.add(new Question(4, "Who is the head of academic at semicolon?",
            new String[]{"A. Mrs. Kim", "B. Mr. Sikiru", "C. Mr. Chibuzo", "D. Mr. Chibuzo"}, 'D'));
        Questions.add(new Question(5, "Which language is used to create websites?",
            new String[]{"A. HTML", "B. Java", "C. Python", "D. JavaScript"}, 'A'));

	Questions.add(new Question(6, "Who was the best graduating student at semicolon cohort 18?",
            new String[]{"A. Mr Francis", "B. Mr. Evans", "C. Mr. Tobi", "D. Miss Ope"}, 'C'));

	 Questions.add(new Question(7, "What color is the sky on a clear day?",
            new String[]{"A. Red", "B. Blue", "C. Yellow", "D. Green"}, 'B'));

	 Questions.add(new Question(8, "Which month has 28 days?",
            new String[]{"A. February", "B. December", "C. January", "D. June"}, 'A'));

	 Questions.add(new Question(9 "Who is the chief priest of Semicolon cohort 25?",
            new String[]{"A. Okafor", "B. Timothy", "C. Justice", "D. Ibrahim"}, 'D'));

	Questions.add(new Question(9 "Who was the Second man on earth?",
            new String[]{"A. Adam", "B. Enoh", "C. Cain", "D. Abel"}, 'A'));


    }

while (attempts < 2) {
            System.out.println("\n" + question.question);
            for (String option : question.options) {
                if (!removed.contains(option.charAt(0))) {
                    System.out.println(option);
                }
            }

            System.out.print("Enter your answer (A-D): ");
            String input = scanner.nextLine().toUpperCase();

            if (input.length() != 1 || input.charAt(0) < 'A' || input.charAt(0) > 'D') {
                System.out.println(" Invalid input. Try A, B, C, or D.");
                continue;
            }

            char answer = input.charAt(0);
            if (removed.contains(answer)) {
                System.out.println(" That option was already tried.");
                continue;
            }

            if (answer == question.correctOption) {
                System.out.println(" Correct!");
                score++;
                attempted++;
                usedQuestionIds.add(question.id);
                if (question.id == 1) question1Used = true;
                lastQuestionId = question.id;
                return;
            } else {
                System.out.println(" Incorrect.");
                removed.add(answer);
                attempts++;
            }
        }








}

}



