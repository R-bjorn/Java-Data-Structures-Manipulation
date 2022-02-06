import java.util.Random;
import java.util.Scanner;

public class Random_Number_Guess {
    // Variables
    static int random_number, userInput, userTries = 0;
    static Scanner sc = new Scanner(System.in);
    static boolean Game_Status = true;

    // For Introduction Message
    public static void Intro_Greeting(){
        System.out.println("This is A Random Number Guessing Game!");
        System.out.println("You have to Find out the Random Number Between 1 to 100.");
        System.out.println("You will get 5 Tries! In this 5 tries, whatever you guess, The program will tell you if the Random Number is Higher/Lower than your Guessed Number!");
        System.out.println("Have Fun!!!!!!!!!!!!!!!!!\n");
    }

    // Generates Random Numbers between 1 to 100
    public static void Random_Gen(){
        Random random_gen = new Random();
        System.out.println("Generating a Random Number!");
        random_number = random_gen.nextInt(100) + 1;
        System.out.println("The Game has generated a Random Number!");
    }
    // Getting the input from the User!
    public static void User_Input(){
        System.out.print("\nTake you Guess :- ");
        userInput = sc.nextInt();
        Win_Or_Lose();
    }

    // Check if the user guessed the Random Number
    public static void Win_Or_Lose(){
        if(userTries < 4){
            if(random_number == userInput){
                System.out.println("\nYou Got It!!!");
                System.out.printf("The Random Number was %d,\nAnd You Guess it in %d Tries!\n\n",userInput,(userTries+1));
            }
            else{
                userTries++;
                System.out.println("\nOOPS!!!");
                if(random_number < userInput){
                    System.out.println("Your Guess is Higher than Game Random Number.");
                }
                else{
                    System.out.println("Your Guess is Lower than Game Random Number.");
                }
                System.out.printf("You Have %d Tries left!\n",(5-userTries));
                System.out.println("Guess again!");
                User_Input();
            }
        }else{
            System.out.println("\nYou used all your Tries!!");
            System.out.printf("The Game Random Number is : %d\n",random_number);
        }
    }

    // Asking the user to play again
    public static void Play_Again(){
        System.out.println("I hope you enjoyed the Game:)");
        System.out.println("Do you want to play Again : Y/N ");
        Scanner sc = new Scanner(System.in);
        String play_input = sc.next();
        if(play_input.toUpperCase().charAt(0) == 'N'){
            Game_Status = false;
        }else{
            userTries = 0;
        }
    }

    // Main
    public static void main(String[] Args){
        while(Game_Status){
            Intro_Greeting();
            Random_Gen();
            System.out.println(random_number);
            User_Input();
            Play_Again();
        }
    }
}
