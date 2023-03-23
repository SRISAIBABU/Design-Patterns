
public class SimpleObserver implements Observer {

	private String value;
	private Subject simpleSubject;
	
	public SimpleObserver(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
		simpleSubject.registerObserver(this);
	}
	
	public void update(String value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println(value);
	}
}
