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


        System.out.println("Who is the current president of Nigeria?");
        System.out.println("a) Daniel");
        System.out.println("b) Messi");
        System.out.println("c) Balablu");
        System.out.println("d) Tinubu");


        System.out.println("How many states are in Nigeria?");
        System.out.println("a) 40");
        System.out.println("b) 36");
        System.out.println("c) 26");
        System.out.println("d) 19");

        responses[0] = input.next();
        responses[1] = input.next();
        responses[2] = input.next();

        int scores = 0;
        for (int i = 0; i < 3; i++) {
            if (responses[i].equalsIgnoreCase(answers[i])){
                scores++;
            }
        }
        System.out.println("you scored: " + scores + "/3");
    }
}
