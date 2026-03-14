//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    String playA;
    String playB;
    String trash = "";
    String repeat;
    boolean done = false;

    do {
        do {
            System.out.println("Player A enter your RPS move (R for Rock, P for Paper, or S for Scissors):  ");
            playA = in.next();

            if (playA.equalsIgnoreCase("R") || playA.equalsIgnoreCase("P") || playA.equalsIgnoreCase("S")) {
                done = true;
            } else {
                System.out.println("Each move has to be one of the valid choices (R, P, or S). Please try again. ");

            }
        } while (!done);

    done = false;



        do {
            System.out.println("Player B enter your RPS move (R for Rock, P for Paper, or S for Scissors): ");
            playB = in.next();
            if (playB.equalsIgnoreCase("R") || playB.equalsIgnoreCase("P") || playB.equalsIgnoreCase("S")) {
                done = true;
            } else {
                System.out.println("Each move has to be one of the valid choices (R, P, or S). Please try again. ");
            }

        } while (!done);

        if (playA.equalsIgnoreCase("R") && playB.equalsIgnoreCase("P")) {
            System.out.println("Paper covers Rock, Player B wins!");
        } else if (playA.equalsIgnoreCase("P") && playB.equalsIgnoreCase("R")) {
            System.out.println("Paper covers Rock, Player A wins!");
        } else if (playA.equalsIgnoreCase("P") && playB.equalsIgnoreCase("S")) {
            System.out.println("Scissors cuts Paper, Player B wins!");
        } else if (playA.equalsIgnoreCase("S") && playB.equalsIgnoreCase("P")) {
            System.out.println("Scissors cuts Paper, Player A wins!");
        } else if (playA.equalsIgnoreCase("S") && playB.equalsIgnoreCase("R")) {
            System.out.println("Rock breaks Scissors, Player B wins!");
        } else if (playA.equalsIgnoreCase("R") && playB.equalsIgnoreCase("S")) {
            System.out.println("Rock breaks Scissors, Player A wins!");
        } else if (playA.equalsIgnoreCase(playB)) {
            System.out.println(playA + " vs " + playB + " it's a tie!");
        }
            System.out.println("Do you want to play again? [Y/N]: ");
            repeat = in.next();
    } while(repeat.equalsIgnoreCase("Y"));
}