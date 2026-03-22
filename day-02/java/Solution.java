import java.util.Scanner;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double marks;
        while (true) {
            System.out.print("Enter your marks: ");
            marks = sc.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            }
            System.out.println("Invalid marks");
        }
        sc.nextLine(); // clear newline after nextDouble() so RPS input reads correctly

        int category = (int) marks / 10;
        switch (category) {
            case 10:
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("A-");
                break;
            case 6:
                System.out.println("B+");
                break;
            case 5:
                System.out.println("B");
                break;
            case 4:
                System.out.println("B-");
                break;
            case 3:
                System.out.println("C+");
                break;
            case 2:
                System.out.println("C");
                break;
            case 1:
                System.out.println("C-");
                break;
            default:
                System.out.println("F");
                break;
        }

        System.out.println("-------------- Rock Paper Scissors ----------------");
        Random rd = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};
        String computer = options[rd.nextInt(options.length)];

        System.out.print("Enter Rock, Paper, or Scissors: ");
        String raw = sc.nextLine().trim();
        String user;
        switch (raw.toLowerCase()) {
            case "rock":
                user = "Rock";
                break;
            case "paper":
                user = "Paper";
                break;
            case "scissors":
                user = "Scissors";
                break;
            default:
                user = null;
                break;
        }

        if (user == null) {
            System.out.println("Invalid choice. Use rock, paper, or scissors.");
        } else if (user.equals(computer)) {
            System.out.println("Tie!");
        } else if (userWins(user, computer)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        System.out.println("Computer chose: " + computer);

        sc.close();
    }

    private static boolean userWins(String user, String computer) {
        return (user.equals("Rock") && computer.equals("Scissors"))
                || (user.equals("Scissors") && computer.equals("Paper"))
                || (user.equals("Paper") && computer.equals("Rock"));
    }
}
