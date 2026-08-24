import java.util.Random;
import java.util.Random.*;
import java.util.Scanner;


public class Numberguessing {
public  static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int Scretenumber = rand.nextInt(1000)+1;
    int Guess = 0;

    System.out.println("welcome to number guessing game");
    System.out.println("your number range should be 1 to 10 between only");

    while (Guess != Scretenumber) {
        System.out.println("enter your guess");
        Guess = sc.nextInt();
        if (Guess == Scretenumber) {
            System.out.println("you guessed it");

        } else if (Guess > Scretenumber) {
            System.out.println("too high");


        } else if (Guess < Scretenumber) {
            System.out.println("too low");
        } else {
            System.out.println("the number you entered is " + Guess);
        }
    }
    sc.close();
}
}
