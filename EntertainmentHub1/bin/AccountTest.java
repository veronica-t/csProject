import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	
	static Account testAccount;

	@Test
	void testGetName() {
		testAccount.setName();
}
	
	@Test
	void testgetPassword() {
		testAccount.setPassword();
	}
	
	@Test
	void testGetUserName() {
		testAccount.setUsername();
	}
	
	@Test
	void testGetAccType() {
		testAccount.setAccountType();
	}
	
	
	@Test
	void testDeleteAccNULL() {
		testAccount.deleteAccount(null,null);
	}
	
	
	@Test
	void testAddAcc() {
		testAccount.addAccount("testing", "test1","test123",AccountType.Student);
		assertEquals(1,testAccount.accounts.size());
	}
}
