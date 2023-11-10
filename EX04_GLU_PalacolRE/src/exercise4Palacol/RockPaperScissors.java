/* EX04_GLU_PalacolRE */

package exercise4Palacol;

import java.util.Scanner;

public class RockPaperScissors{
        private static int userInput = 0; 
        private static int roundsToWin = 2;
        private static String result = ""; 
        private static int playerPoints = 0; 
        private static int computerPoints = 0; 
        private static boolean gameStatus = true;  
                
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
                
                while (gameStatus == true){
                System.out.println();
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start Game");
                System.out.println("2. Change Number of Rounds"); 
                System.out.println("3. Exit Application");
                Scanner scnr = new Scanner(System.in); 
                int choice = scnr.nextInt(); 
                
                switch(choice){
                case 1: 
                
                while (playerPoints <= roundsToWin-1 || computerPoints <= roundsToWin-1){
                System.out.println("\nPick your move.\n1. Rock\n2. Paper\n3. Scissors");
                int playerChoice = scnr.nextInt();
                int computerChoice = (int) Math.floor(Math.random()*3) + 1;
                Move playerMove = null;
                Move computerMove = null;
                
                switch(playerChoice) {
                    case 1:
                        playerMove = rock;
                        break; 
                    case 2:
                        playerMove = paper;
                        break;
                    case 3:
                        playerMove = scissors;
                        break; 
                }
               
                switch(computerChoice) {
                    case 1:
                        computerMove = rock;
                        break;
                    case 2:
                        computerMove = paper;
                        break; 
                    case 3:
                        computerMove = scissors;      
                        break; 
                }
                
                int winner = Move.compareMoves(playerMove, computerMove);
                
                switch(winner){
                    case 0:
                        playerPoints++;
                        System.out.println("Player chose " + playerMove.getName() +". Computer chose " + computerMove.getName() + " Player wins round." );
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break; 
                    case 1:
                        computerPoints++;
                        System.out.println("Player chose " + playerMove.getName() +". Computer chose " + computerMove.getName() + " Computer wins round." );
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break; 
                                
                    case 2:
                        System.out.println("Player chose " + playerMove.getName() +". Computer chose " + computerMove.getName() + " Round is tied!" );
                        System.out.println("Player: " + playerPoints + " - Computer: " + computerPoints);
                        break; 
                    }
                    
                    if(playerPoints == roundsToWin){
                        System.out.println("Player Wins!");
                        break;
                    }
                    
                    else if (computerPoints == roundsToWin){
                       System.out.println("Computer Wins!");
                        break; 
                    }
                }
                
                break; 
                
                case 2:
                System.out.println("\nHow many wins are needed to win a match?");
                roundsToWin = scnr.nextInt(); 
                System.out.println("\nNew setting has been saved!");
                break; 
                
                case 3:
                System.exit(0);
                System.out.println("Thank you for playing!");
                gameStatus = false; 
                break; 
                }
             
        }
        
    }
    
       
}