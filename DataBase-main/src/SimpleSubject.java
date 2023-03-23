import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {
	private List<Observer> observers;
	private String value = "";
	
	public SimpleSubject() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(String string) {
		this.value = string;
		notifyObservers();
	}
}
