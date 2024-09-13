public class Easy_AI_First 
	{
	public static void playAgainstEasyAI()
		{
		Universal_Methods.prepareBoard();
	
	    while(!Universal_Methods.tie)
	    	{
			easyAITurnFirst();
		    Universal_Methods.isWonGame();
		    Universal_Methods.checkForTie();
		    Universal_Methods.playerInput();
			Universal_Methods.placeO();
		    Universal_Methods.isWonGame();
		    Universal_Methods.checkForTie();	
		    }
		}
	
	//level 1 AI makes random moves on the board
    public static void easyAITurnFirst()
    	{
        Universal_Methods.chosenRow = (int)(Math.random()*3);
        Universal_Methods.chosenCol = (int)(Math.random()*3);
    
        if(Universal_Methods.myMatrix[Universal_Methods.chosenRow][Universal_Methods.chosenCol].equals(" "))
        	{
            Universal_Methods.placeX();
            }
            
        else
        	{
            easyAITurnFirst();
            }
        }
	}