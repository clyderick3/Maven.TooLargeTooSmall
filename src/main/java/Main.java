import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args){

        //added scanner for system to scan number
        Scanner scanner = new Scanner(System.in);
//added random utility which might be the same
// exact thing as scanner but scans for a random number
        Random r = new Random();
        int low = 1;
        int high = 50;
        int result = r.nextInt();
//Counting the amount of times the guesser has guessed
        int timesTried = 0;
//Max amount of times the guesser can guess
        int maxTries = 7;
        int Number = 33;

        System.out.println("Guess a number between 0 and 50.");
        scanner.nextInt();
        System.out.println("You guessed " + "this" + ".");
    }
}
