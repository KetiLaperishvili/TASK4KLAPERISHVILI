import java.util.Random;
import java.util.Scanner;

public class task5keti {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(50) + 1;
        int guess = 0;


        System.out.println("Guess the number (between 1 and 50):");

        while (guess != randomNumber) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();


            if (guess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        }


        scanner.close();
    }
}
