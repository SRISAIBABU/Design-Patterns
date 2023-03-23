import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonComponent extends Person{
		private int id;
		private String name;
		private String email;
		private String address;
		private String phoneno;

	    List<Person> persons = new ArrayList<Person>();  

		public PersonComponent(int id, String name, String email, String address, String phoneno)
		{
			this.id = id;
			this.name = name;
			this.email = email;
			this.address = address;
			this.phoneno = phoneno;
		}

		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getPhoneno() {
			return phoneno;
		}


		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}


		public List<Person> getPersons() {
			return persons;
		}


		public void setPersons(List<Person> persons) {
			this.persons = persons;
		}


		@Override
		public void print() {
			 System.out.println (id + ","+name +","+ email
				      +","+ address + ","
				      + phoneno);
				      Iterator<Person> iterator = persons.iterator();
						while (iterator.hasNext()) {
							Person menuComponent = 
								(Person)iterator.next();
							menuComponent.print();
						}
					}  	
		@Override
		public void add(Person p) {
		persons.add(p);
				   }   		

		@Override
		public void remove(Person p) {
			persons.remove(p);	
			}

		@Override
		public Person getChild(int i) {
			return (Person)persons.get(i);
		}

	}
