package StarFighterJ;

import java.util.LinkedList;
import java.util.List;

import Interfaces.ISubscribe;

// controls the main aspects of the game
public class GameController implements ISubscribe
{
	private static List<ISubscribe> Subscribers = new LinkedList<ISubscribe>();
	private static GameController controller;
	
	private GameController(){
		
	}
	public static GameController getInstance()
	{
		if(controller == null)
		{
			controller = new GameController();
		}
		return controller;
	}

	@Override
	public void Subscribe(ISubscribe Subscriber) {
		Subscribers.add(Subscriber);
	}

	@Override
	public void notifySubscribers(String code, Object obj) {
		for(int i = 0; i < Subscribers.size(); i++)
		{
			Subscribers.get(i).getNotification(code,obj);
		}
		
	}

	@Override
	public void getNotification(String code, Object obj) {
		
	}
    
}
