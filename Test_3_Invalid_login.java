package airline_test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import airline_source.Airline_signUp_Page;
import ddt.Excel_sheet_for_Login;

public class Test_3_Invalid_login extends Airline_Launch_and_Quit
{
	@Test
	public void test3() throws InterruptedException, EncryptedDocumentException, IOException
	{
//		Test_2_valid_login test_2_valid_login = new Test_2_valid_login();
//		test_2_valid_login.test2();
		
		Excel_sheet_for_Login.excel_data();
		String s1=driver.getTitle();
		System.out.println(s1);
		
		Airline_signUp_Page sign_up=new Airline_signUp_Page(driver);
		sign_up.book_flight_tickets_link();
		sign_up.wrong_email_id();
		sign_up.continue_button();
		sign_up.wrong_pass();
		sign_up.submit();
		
		String s2=driver.getTitle();
		System.out.println(s2);
		
		//Assert.assertEquals(s1, driver.getTitle(), "failed bcs both the titles are same");	
		Assert.assertSame(s2,"Flight Bookings on Amazon");		
	}
}
