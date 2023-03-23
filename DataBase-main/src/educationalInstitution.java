import java.util.Scanner;

public class educationalInstitution {

	private Institution college;
	private Institution university;

	public educationalInstitution() {
		// TODO Auto-generated constructor stub
		college=new College();
		university=new University();
	}

	public void admission()
	{
		int number;
		System.out.println("Where do you want to take admission?");
		System.out.println("1. college");
		System.out.println("2. university");

	    Scanner in = new Scanner(System.in);
		number=in.nextInt();

		if(number == 1)
		{
			college.apply();
		}
		else if(number == 2)
		{
			university.apply();
	    }

		else
		{
	          System.out.println("Please enter the valid choice!!!");

		}
	}
	
}
