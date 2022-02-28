import java.util.Random;
import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args) {

//added random utility which might be the same
// exact thing as scanner but scans for a random number
        Random r = new Random();
        int low = 1;
        int high = 10;
        int result = r.nextInt(low,high);
//Counting the amount of times the guesser has guessed
       // int timesTried = 0;
//Max amount of times the guesser can guess
       // int maxTries = 7;
        int MyNumber = result;
        int number = 0;

        System.out.println(result);
        System.out.println("Guess a number between 0 and 10.");
        //added scanner for system to scan number
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; number != result ; i++) {
             number = scanner.nextInt();
            if (number == result) {
                System.out.println("You have guessed the correct number!");
                System.out.println("The number was indeed " + MyNumber + ".");
                break;
            }
            else if (number > high || number < low) {
                System.out.println("Remember, the number is between 0 and 50. Try again");
            } else if (number > MyNumber) {
                System.out.println("You guess is too high.");
            } else if (number < MyNumber) {
                System.out.println("Your guess is too low.");
            }
        }
    }
}
