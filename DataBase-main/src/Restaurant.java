
public class Restaurant implements VisitorPlaces{

	public Restaurant() {
	}

	@Override
	public void visit() {
		System.out.println("Visitor visits Resturant...");		
		
	}

	public void visitdetails()
	{
		System.out.println("The Restaurant is located in many different areas of city...");		
	}
}
