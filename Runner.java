package qa.com.main;

public class Runner {
	
	public static void main(String[] args) {

		UserAccount user1 = new UserAccount("1", "NickFinn92", "password123");
		
		//System.out.println(user1.GetPassword());
		
		user1.setAccountId("12");
		System.out.println(user1.GetAccountId());
		System.out.println(user1.GetPassword("pop"));
}
}