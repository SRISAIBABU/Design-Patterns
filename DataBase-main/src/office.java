
public class office extends decorator{

	public office(Job job) {
		this.job=job; 
	}

	@Override
	public String getjob() {
		
		return "Your job  will be office based job";
	}

}