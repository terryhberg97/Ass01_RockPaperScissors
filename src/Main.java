//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    String playA;
    String playB;
    String choice;
    String trash = "";
    boolean done = false;

    do {
        System.out.println("Player A enter your RPS move (R for Rock, P for Paper, or S for Scissors):  ");
        playA = in.next();

        if (playA.equalsIgnoreCase("R") || playA.equalsIgnoreCase("P") || playA.equalsIgnoreCase("S"))
        {
            done = true;
        }
        else
        {
            System.out.println("Each move has to be one of the valid choices (R, P, or S). Please try again. ");

        }
    } while (!done);

    done = false;

    do
    {
        System.out.println("Player B enter your RPS move (R for Rock, P for Paper, or S for Scissors): ");
        playB = in.next();
        if (playB.equalsIgnoreCase("R") || playB.equalsIgnoreCase("P") || playB.equalsIgnoreCase("S"))
        {
            done = true;
        }
        else
        {
            System.out.println("Each move has to be one of the valid choices (R, P, or S). Please try again. ");
        }

    } while (!done);


}