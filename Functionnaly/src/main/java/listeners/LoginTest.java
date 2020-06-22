package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	


@Test
public void LoginByEmail() {
	System.out.println("Login by Email");
	Assert.assertEquals("samia", "samia");//true
}
@Test
public void LoginByFacebook() {
	System.out.println("Login by Facebook");
	Assert.assertEquals("samia", "abba");//false
}
	

}
