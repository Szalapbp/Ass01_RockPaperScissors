
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        String playerOne;
        String playerTwo;
        String playAgain;
        boolean playerInput = false;
        do
        {

            Scanner in = new Scanner (System.in);
            do {
                System.out.print("Player 1 enter Rock Paper or Scissors(R, P, S): ");
                playerOne = in.nextLine();
                if(playerOne.equalsIgnoreCase("R"))
                {
                    playerInput = true;
                }
                else if(playerOne.equalsIgnoreCase("P"))
                {
                    playerInput = true;
                }
                else if(playerOne.equalsIgnoreCase("S"))
                {
                    playerInput = true;
                }
                else
                {
                    playerInput = false;
                    System.out.println("Invalid input of: " + playerOne);
                }
            }while(!playerInput);

            do {
                System.out.print("Player 2 enter Rock Paper or Scissors(R, P, S): ");
                playerTwo = in.nextLine();
                if(playerTwo.equalsIgnoreCase("R"))
                {
                    playerInput = true;
                }
                else if(playerTwo.equalsIgnoreCase("P"))
                {
                    playerInput = true;
                }
                else if(playerTwo.equalsIgnoreCase("S"))
                {
                    playerInput = true;
                }
                else
                {
                    playerInput = false;
                    System.out.println("Invalid input of: " + playerTwo);
                }
            }while(!playerInput);


            if(playerOne.equalsIgnoreCase("R"))
            {
                if(playerTwo.equalsIgnoreCase("S"))
                {
                    System.out.println("\nRock Smashes Scissors, Player 1 Wins!");
                }
                else if(playerTwo.equalsIgnoreCase("p"))
                {
                    System.out.println("\nPaper Covers Rock, Player 2 Wins!");
                }
                else
                {
                    System.out.println("\nIt's a Draw!");
                }
            }
            else if(playerOne.equalsIgnoreCase("P"))
            {
                if(playerTwo.equalsIgnoreCase("R"))
                {
                    System.out.println("\nPaper Covers Rock, Player 1 Wins!");
                }
                else if(playerTwo.equalsIgnoreCase("S"))
                {
                    System.out.println("\nScissors Cut Paper, Player 2 Wins!");
                }
                else
                {
                    System.out.println("\nIt's a Draw!");
                }
            }
            else
            {
                if(playerTwo.equalsIgnoreCase("P")){
                    System.out.println("\nScissors Cut Paper, Player 1 Wins!");
                }
                else if(playerTwo.equalsIgnoreCase("R"))
                {
                    System.out.println("\nRock Smashes Scissors, Player 2 Wins!");
                }
                else
                {
                    System.out.println("\nIt's a Draw!");
                }
            }


            System.out.println("\nWould you like to play again?(Y/N):");
            playAgain = in.nextLine();

        }while(playAgain.equalsIgnoreCase("Y"));
        System.out.println("Thanks for Playing!");

    }
}
