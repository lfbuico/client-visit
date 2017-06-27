package ph.com.ibm.cvp;

public class CvpUser {

	String userName;
	String greetings;
	
	
	public CvpUser(String userName, String greetings) {
		this.userName = userName;
		this.greetings = greetings;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGreetings() {
		return greetings;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	
	
	
}
