import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] responses = {"", "", ""};

        String[] answers = {"a", "d", "b"};

        System.out.println("What is the sum of 2 + 2?");
        System.out.println("a) 4");
        System.out.println("b) 3");
        System.out.println("c) 2");
        System.out.println("d) 1");

        boolean validInput = false;
        while (!validInput) {
            try {
                String userInput = input.next();

                if (!userInput.matches("[abcd]")) {
                    throw new IllegalArgumentException("Invalid input. Only a, b, c, or d are allowed.");
                }
                responses[0] = userInput;
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid option (a, b, c, or d):");
            }
        }

        System.out.println("Who is the current president of Nigeria?");
        System.out.println("a) Daniel");
        System.out.println("b) Messi");
        System.out.println("c) Balablu");
        System.out.println("d) Tinubu");

        boolean validInput1 = false;
        while (!validInput1) {
            try {
                String userInput = input.next();

                if (!userInput.matches("[abcd]")) {
                    throw new IllegalArgumentException("Invalid input. Only a, b, c, or d are allowed.");
                }
                responses[1] = userInput;
                validInput1 = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid option (a, b, c, or d):");
            }
        }

        System.out.println("How many states are in Nigeria?");
        System.out.println("a) 40");
        System.out.println("b) 36");
        System.out.println("c) 26");
        System.out.println("d) 19");

        boolean validInput2 = false;
        while (!validInput2) {
            try {
                String userInput = input.next();

                if (!userInput.matches("[abcd]")) {
                    throw new IllegalArgumentException("invalid input . only 'a', 'b', 'c', or 'd' are allowed.");
                }
                responses[2] = userInput;
                validInput2 = true;
            } catch (IllegalArgumentException e) {
                System.out.println("error: " + e.getMessage());
                System.out.println("please enter a valid option (a, b, c, or d):");
            }
        }

        int scores = 0;
        for (int i = 0; i < 3; i++) {
            if (responses[i].equalsIgnoreCase(answers[i])){
                scores++;
            }
        }
        System.out.println("you scored: " + scores + "/3");
    }
}
