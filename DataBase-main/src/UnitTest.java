import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {
		// Test Composite Design Patterns
		//we can also add more than 1 student, visitor and job seeker
	    PersonComponent p = new PersonComponent(101,"Admin", "admin@123.com", "asdfgh", "0987654321");
        Person p1=new Student(102,"Sohan Kumar", "", "", "");  
        Person p2=new Visitor(103,"Mohan Kumar", "", "", "");  
        Person p3=new Jobseeker(104,"Mahiwal", "", "", "");   

		p.add(p1);
		p.print();

		// Facade pattern
  	    educationalInstitution ei = new educationalInstitution();
  	    Institution college = new College();
  	    college.apply();
  	    //Observer design pattern
  	    SimpleSubject simpleSubject = new SimpleSubject();
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		simpleSubject.setValue("Student apply for college...");
		
		simpleSubject.removeObserver(simpleObserver);
  	    //Visitors
		p.add(p2);
		// Facade pattern
		 Places place = new Places();
		 VisitorPlaces hotel = new Hotels();
		 hotel.visitdetails();
		 hotel.visit();
		 //Observer design pattern
	  	 simpleSubject.setValue("Visitor visits hotel...");	
		 simpleSubject.removeObserver(simpleObserver);
	  	 
		 VisitorPlaces libarary = new Library();
		 libarary.visitdetails();
		 libarary.visit();
		 //Job seekers
		p.add(p3);
		// Facade pattern
		 Job j = new Job();
		 		
         // Decorator pattern
         ParttimeJob partime = new ParttimeJob();
         home h  = new home(partime);
		 System.out.println(h.getjob());
		fail("Not yet implemented");
	}

}
