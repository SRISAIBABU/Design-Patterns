import java.util.Scanner;

public class DriverClass {

	  public static void main(String args[]){  
		     Scanner sc = new Scanner(System.in);

		     // Composite Design Patterns
		     PersonComponent p = new PersonComponent(101,"Admin", "", "", "");
	         Person p1=new Student(102,"Sohan Kumar", "", "", "");  
	         Person p2=new Visitor(103,"Mohan Kumar", "", "", "");  
	         Person p3=new Jobseeker(104,"Mahiwal", "", "", "");   
 
	          String type, choice;
	          System.out.println("Are you a student, visitor and jobseeker?");
	          System.out.println("Enter s for student, v for visitor, j for jobseeker");
	          type = sc.nextLine();
	          if(type.equals("s"))
	          {
	        	  p.add(p1);
	 	          p1.print();
		          System.out.println("Do you want to take admission? y/n");
		          choice = sc.nextLine();
		          if(choice.equals("y"))
		          {
		        	  // Facade pattern
		        	  educationalInstitution ei = new educationalInstitution();
		        	  ei.admission();
		        	  //Observer design pattern
		        	  SimpleSubject simpleSubject = new SimpleSubject();
		      		  SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		      		  simpleSubject.setValue("Student apply for admission...");
		      		  simpleSubject.removeObserver(simpleObserver);
		        	  
		          }
		          else if(choice.equals("n"))
		          {
		        	System.out.println("you do not want to take admission anywhere..");
		        	System.exit(0);
		          }
		          else
		          {
			          System.out.println("Please enter the valid choice!!!");
		          }


	          }
	          else if(type.equals("v"))
	          {
	        	  p.add(p2);
	 	          p2.print();
	        	  // Facade pattern
	        	  Places place = new Places();
	        	  place.visit();
	          }
	          else if(type.equals("j"))
	          {
	        	  p.add(p3);
	 	          p3.print();
	        	  // Facade pattern
	 	          Job j = new Job();
	 	          j.type();
	          }
}  
}
