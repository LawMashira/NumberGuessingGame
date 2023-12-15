

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
        import java.util.Random;
        import java.util.Scanner;
public class Main
{
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuePlaying =true;
        int score = 0;
        int guesseAttempts=0;
        // Catchig invalid input try-block
        try{

            while(continuePlaying)
            {
                Random randomNumber = new Random();
                int num = randomNumber.nextInt(101);
                System.out.println("WELCOME TO THE NUMBER GAME");
                System.out.println("************************************");
                System.out.println("************************************");

                int inputNumber=0;
                while(inputNumber!=num){


                    System.out.println("Enter any  guesss number between 1 and 100");
                    inputNumber= scan.nextInt();

                    // Tracking the number of attempts entered by the user by incrementing
                    guesseAttempts++;

                    // block checking if the tendered number is bigger than the generated
                    if(inputNumber>num){
                        System.out.println("The guesssed number is too high");


                    }
                    // block checking if the tendered number is lower than the generated
                    if(inputNumber<num){
                        System.out.println("The guesssed number is too low");

                    }
                    if (inputNumber == num)
                    {
                        score++;
                        System.out.println(" Congratulations!!!  You have provided the correct guess number.");

                    }
                    // a block for terminating the program if maximum attempts reached
                    if(guesseAttempts==10){
                        System.out.println("Maximum attempts reached restart the game");
                        System.exit(0);
                    }


                }

                System.out.println(" Score   " + score );
                // Asking the user if he/ she wants to continue playing
                System.out.print("Do you want to play again? (1/0): ");
                int askingAgain = scan.nextInt();

                if (askingAgain == 0) {
                    continuePlaying = false;
                    System.out.println("Thank you for playing the number game");
                    System.out.println("Goodbye");

                }



            }

        }catch(Exception e)
        {
            System.out.println("Invalid input. Please enter a number");
        }

    }

}
