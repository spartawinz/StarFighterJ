package Interfaces;

public interface ISubscribe {
	public void Subscribe(ISubscribe Subscriber);
	public void notifySubscribers(String code, Object obj);
	public void getNotification(String code, Object obj);
}
