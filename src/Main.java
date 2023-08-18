import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {

            System.out.print("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
            String myMove = read.next();

            if (myMove.equals("quit")) {
                break;
            }

            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
                System.out.println("Your move isn't valid!");
            } else {
                int rand = (int)(Math.random() * 3);

                String ComputerMove = "";
                if (rand == 0) {
                    ComputerMove = "rock" ;
                } else if (rand == 1) {
                    ComputerMove = "paper";
                } else {
                    ComputerMove = "scissors";
                }
                System.out.println("Computer move: " + ComputerMove);

                if (myMove.equals(ComputerMove)) {
                    System.out.println("It's a tie!");
                } else if ((myMove.equals("rock") && ComputerMove.equals("scissors")) || (myMove.equals("scissors") && ComputerMove.equals("paper")) || (myMove.equals("paper") && ComputerMove.equals("rock"))) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }

            }
        }
    }
}