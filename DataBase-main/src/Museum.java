
public class Museum implements VisitorPlaces{

	public Museum() {
	}

	@Override
	public void visit() {

		System.out.println("Visitor visits museum...");		

	}


	public void visitdetails()
	{
		System.out.println("The Museum is located in the end of the city...");		
	}
}
