package backend;

public class UserAccount {
	
	private String userEmail;
	private String userPassword;
	
	public UserAccount (String _userEmail, String _userPassword) {
		
		setUserEmail(_userEmail);
		setUserPassword(_userPassword);
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
