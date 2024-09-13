public class Easy_AI_Second 
	{
	public static void playAgainstEasyAI()
		{
		Universal_Methods.prepareBoard();
		Universal_Methods.displayBoard();
	
	    while(!Universal_Methods.tie)
	    	{
			Universal_Methods.playerInput();
			Universal_Methods.placeX();
		    Universal_Methods.isWonGame();
		    Universal_Methods.checkForTie();
		    easyAITurnSecond();
		    Universal_Methods.isWonGame();
		    Universal_Methods.checkForTie();	
		    }
		}
	
	//level 1 AI makes random moves on the board
    public static void easyAITurnSecond()
    	{
        Universal_Methods.chosenRow = (int)(Math.random()*3);
        Universal_Methods.chosenCol = (int)(Math.random()*3);
    
        if(Universal_Methods.myMatrix[Universal_Methods.chosenRow][Universal_Methods.chosenCol].equals(" "))
        	{
            Universal_Methods.placeO();
            }
            
        else
        	{
            easyAITurnSecond();
            }
        }
	}
