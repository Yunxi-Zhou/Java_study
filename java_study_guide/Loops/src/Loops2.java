import java.util.Random;
import java.util.Scanner;


public class Loops2 {
    public static void main(String[] args) throws Exception {


        //String s="abcdefghijklmnopqrstuvwxyz";
        guessingGame();
        
    }


    public static void guessingGame(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int r = random.nextInt(9)+1;
        int guess;

        System.out.print("Guess");
        guess = scanner.nextInt();

        while(guess != r){


            System.out.print("Sorry incorrect, again: ");
            guess = scanner.nextInt();
            r = random.nextInt(9)+1;


        }


        System.out.println("number is " + guess);
        scanner.close();


    }
}
