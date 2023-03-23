
public class Library implements VisitorPlaces{

	public Library() {
	}

	@Override
	public void visit() {

		System.out.println("Visitor visits Library...");		

	}

	public void visitdetails()
	{
		System.out.println("The Library is located in the left corner of city...");		
	}
}
