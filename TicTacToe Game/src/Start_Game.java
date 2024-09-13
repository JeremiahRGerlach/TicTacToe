import java.util.Scanner;

public class Start_Game 
	{
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner(System.in);
	static int aiLevel;
	public static void greetUser()
    	{
	    System.out.println("Hello, what is your name?");
	    String name = userStringInput.nextLine();
	    System.out.println("Hello," + name + " let's play a game of tic tac toe!");
	    System.out.println("Are there (1) 1 player, or (2) 2 players ?");
	    int numPlayers = userIntInput.nextInt();
	
	    if(numPlayers == 1)
	    	{
	        whichAI();
	        }
	
	    if(numPlayers == 2)
	    	{
	        Two_Players.playWith2Players();
	        }
	    }
	
	public static void playTurn()
		{
		System.out.println("Would you like to play (1) First or (2) Second?");
		int turn = userIntInput.nextInt();
		
		if(aiLevel == 1 && turn == 1)
			{
			Easy_AI_Second.playAgainstEasyAI();
			}
		
		else if(aiLevel == 1 && turn == 2)
			{
			Easy_AI_First.playAgainstEasyAI();
			}
		
		else if(aiLevel == 2 && turn == 1)
			{
			Hard_AI_Second.playAgainstHardAI();
			}
		
		else if(aiLevel == 2 && turn == 2)
			{
			Hard_AI_First.playAgainstHardAI();
			}
		}

  public static void whichAI()
  	{
    Scanner userStringInput = new Scanner(System.in);
    Scanner userIntInput = new Scanner(System.in);
    
    System.out.println("Which level ai would you like you play against? (1) easy or (2) hard");
    aiLevel = userIntInput.nextInt();
    
    if(aiLevel != 1 && aiLevel != 2)
      {
      System.out.println("I'm sorry, I don't understand!");
      whichAI();
      }
    
    else
    	{
    	playTurn();
    	}
    
    }
  }