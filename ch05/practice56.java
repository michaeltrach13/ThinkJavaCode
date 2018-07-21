import java.util.Random;
import java.util.Scanner;

public class practice56 {
   public static Random r = new Random();
    public static Scanner in = new Scanner(System.in);
    public static int randomNum = r.nextInt(99) + 1;

    public static void guessChecker() {

        int guess = in.nextInt();
        if (guess == randomNum) {
            System.out.println("You got it!");
            return;
        }
        if (guess < randomNum) {
            System.out.println("guess higher");
        } else {
            System.out.println("guess lower");
        }
        guessChecker();
    }

    public static void main(String[] args){
        System.out.println("Guees the number");
        guessChecker();


        }

    }

