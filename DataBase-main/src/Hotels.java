
public class Hotels implements VisitorPlaces{

	public Hotels() {

	}

	@Override
	public void visit() {
		System.out.println("Visitor visits Hotel...");		
		
	}

	@Override
	public void visitdetails() {
		// TODO Auto-generated method stub
		System.out.println("Hotel is placed in every corner of the city...");		

		
	}

}
