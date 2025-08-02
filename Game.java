import java.util.Scanner;
import java.util.Random;

public class Game{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        int maxAttempt = 0;
        int finalscore = 0;
        int roundsPlayed = 0;
        
        System.out.println("Welcome to the Guess the Random Number Game");
        boolean playing = true;
        while(playing) {
            System.out.println("Choose the Difficulty level:");
            System.out.println("1. Easy (10 attempts)");
            System.out.println("2. Medium (7 attempts)");
            System.out.println("3. Hard (4 attempts)");
            System.out.print("Enter Your Choice (1-3): ");
            int Choice = scanner.nextInt();
            switch(Choice) {
                case 1: 
                    maxAttempt = 10;
                    break;
                case 2:
                    maxAttempt = 7;
                    break;
                case 3:
                    maxAttempt = 4;
                    break;
                default :
                    System.out.println("Invalid choice ");
            }
        
            int Number = random.nextInt(200) +1;
            int attemptsleft = maxAttempt;
            boolean guesscorrectly = false;
            System.out.println("\nRound started");
            System.out.println("I have selected the number. Now its your turn to guess it.");
            System.out.println("Guess a number between 1 and 200. You have " + maxAttempt + " attempts");

            while(attemptsleft > 0) {
                System.out.println("Enter Your Guess");
                int Guess = scanner.nextInt();

                if(Guess == Number) {
                    System.out.print("The Guess is Correct");
                    finalscore++;
                    guesscorrectly = true;
                    break;
                } else if ( Guess < Number) {
                    System.out.println("The Guess is too low");
                
                } else {
                    System.out.println("The Guess is too high");
                }
                attemptsleft--;
            }
            if(!guesscorrectly) {
                System.out.println("No more attempts left.  The Correct Number is " + Number);
            }
            roundsPlayed++;
            System.out.println("\nDo You Want To Play Again? (yes/no) ");
            String answer = scanner.next();
            playing = answer.equals("yes");
            
        }
        System.out.println("\nGame Over");
        System.out.println("Round played: " + roundsPlayed);
        System.out.println("Final Score: " + finalscore) ;
        System.out.println("Thanks For Playing!");
        scanner.close();
        
    }
}
