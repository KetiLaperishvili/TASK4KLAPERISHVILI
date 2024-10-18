import java.util.Scanner;

public class task4keti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {

            if (i % 2 == 0) {
                sum += i;
            } else {

            }
            i++;
        }

        // Print the result
        System.out.println("The sum of even numbers between 1 and " + n + " is: " + sum);


        scanner.close();
    }
}
