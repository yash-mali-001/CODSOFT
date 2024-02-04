import java.util.Random;
import java.util.Scanner;

/**
 * number_game
 */
public class number_game {
    public static void main(String args[]) {
        Random random = new Random();
        int random_num = random.nextInt(100) + 1;
        int again = 1;

        while (again == 1) {
            int user_guess;
            int attempts = 1;
            int max_attempts;
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of attempts you want : ");
            max_attempts = sc.nextInt();
            do {
                if (attempts == 1) {
                    System.out.println("Enter your guess between (1-100) : ");
                }
                user_guess = sc.nextInt();
                if (user_guess <= 100 && user_guess >= 1) {
                    if (user_guess == random_num) {
                        System.out.println("Yeah.. You Guessed It Right");
                        break;
                    } else if (random_num <= user_guess) {
                        System.out.println("Number is Smaller!!");
                        if (attempts < max_attempts) {
                            System.out.println("Enter your guess less than " + user_guess);
                        }
                        attempts++;

                    } else {
                        System.out.println("Number is bigger!!");
                        if (attempts < max_attempts) {
                            System.out.println("Enter your guess greater than " + user_guess);
                        }
                        attempts++;
                    }
                } else {
                    System.out.println("Enter your guess between 1-100 ");
                }

            } while (random_num != user_guess && attempts <= max_attempts);
            System.out.println("Number was "+ random_num);
            System.out.println("Do you want to play again ? 1 / 0 ");
            again = sc.nextInt();
        }
    }
}