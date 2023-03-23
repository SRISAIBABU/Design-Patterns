import java.util.Scanner;

public class Places {

	private VisitorPlaces hotel;
	private VisitorPlaces restaurant;
	private VisitorPlaces museum;
	private VisitorPlaces historicalplaces ;
	private VisitorPlaces libarary;
	private VisitorPlaces park;

	public Places() {

		hotel= new Hotels();
		restaurant =new Restaurant();
		museum =new Museum();
		historicalplaces =new HistoricalPlaces();
		libarary=new Library();
		park=new Parks();
		
	}
	
	public void visit()
	{
		int number;
		System.out.println("Which place do you want to visit?");
		System.out.println("1. Hotel");
		System.out.println("2. Resturant");
		System.out.println("3. Museum");
		System.out.println("4. Park");
		System.out.println("5. Library");
		System.out.println("6. Historical Places");
	    Scanner in = new Scanner(System.in);
		number=in.nextInt();

		if(number == 1)
		{
			hotel.visitdetails();
			System.out.println("");
			hotel.visit();

		}
		else if(number == 2)
		{
			restaurant.visitdetails();
			System.out.println("");
			restaurant.visit();

		}
		else if(number == 3)
		{
			museum.visitdetails();
			System.out.println("");
			museum.visit();


		}
		else if(number == 4)
		{
			park.visitdetails();
			System.out.println("");
			park.visit();


		}
		else if(number == 5)
		{
			libarary.visitdetails();
			System.out.println("");
			libarary.visit();


		}
		else if(number == 6)
		{
			historicalplaces.visitdetails();
			System.out.println("");
			historicalplaces.visit();
		}
		else
		{
	          System.out.println("Please enter the valid choice!!!");
		}
	}

}
