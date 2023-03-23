
public class Parks implements VisitorPlaces{

	public Parks() {
	}

	
	@Override
	public void visit() {
		System.out.println("Visitor visits Parks...");		
		
	}

	public void visitdetails()
	{
		System.out.println("The Hotel is located in many areas of city...");		
	}

}
