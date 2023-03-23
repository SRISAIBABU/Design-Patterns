
public class home extends decorator{

	public home(Job job) {
		this.job=job; 
	}

	@Override
	public String getjob() {
		
		return "Your job will be home based job";
	}

}
