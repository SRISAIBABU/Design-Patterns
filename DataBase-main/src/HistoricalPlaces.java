
public class HistoricalPlaces implements VisitorPlaces{

	public HistoricalPlaces() {

	}

	@Override
	public void visit() {
		System.out.println("Visitor visits Historical places...");		
	}
	public void visitdetails()
	{
		System.out.println("The Historical place is located in the mid of city...");		

	}


}
