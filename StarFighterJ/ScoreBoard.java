package StarFighterJ;

import Interfaces.ISubscribe;

public class ScoreBoard implements ISubscribe
{
    private ScoreBoard board;
    private int score = 0;
    
    private ScoreBoard()
    {
        GameController.getInstance().Subscribe(getInstance());
    }
    
    public ScoreBoard getInstance()
    {
        if(board == null)
        {
            board = new ScoreBoard();
        }
        return board;
    }
    
	@Override
	public void Subscribe(ISubscribe Subscriber) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void notifySubscribers(String code, Object obj) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getNotification(String code, Object obj) {
		if(code == "Score")
		{
			if(obj instanceof Integer)
			{
				score += (int)obj;
			}
		}
		if(code == "Reset")
		{
			score = 0;
		}
		
	}
}
