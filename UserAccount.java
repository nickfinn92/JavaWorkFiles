package qa.com.main;

public class UserAccount {
	
	private String AccountId;
	private String UserName;
	private String Password;
	
	public UserAccount(String accountId, String userName, String password) {
		super();
		AccountId = accountId;
		UserName = userName;
		Password = password;
	}
	
	public String GetAccountId() {
		return AccountId;
	}
	
	public void setAccountId(String AccountId) {
		this.AccountId = AccountId;
	}

	
	public String GetUserName() {
		return UserName;
	}
	
	public void SetUserName(String UserName ) {
		this.UserName = UserName;
	}
	

	
	public String GetPassword(String passCode) {
		if (passCode == "pip") {
			return Password;
			} else {
		return "Incorrect Passcode";
	}
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
}


