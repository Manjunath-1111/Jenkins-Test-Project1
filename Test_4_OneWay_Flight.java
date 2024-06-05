package airline_test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import airline_source.Airline_Number_of_passanger_selection_page;
import airline_source.Airline_OneWay_Flight_Booking_Page;
import airline_source.Airline_booking_page;
import airline_source.Airline_signUp_Page;
import ddt.Excel_sheet_for_Login;

public class Test_4_OneWay_Flight extends Airline_Launch_and_Quit
{
	@Test(groups="Test_4_OneWay_Flight",dependsOnGroups={ "Test_2_valid_login" })
	public void test4() throws InterruptedException, EncryptedDocumentException, IOException
	{
//		Test_3_Invalid_login test_3_Invalid_login = new Test_3_Invalid_login();
//		test_3_Invalid_login.test3();
		
		Excel_sheet_for_Login.excel_data();
		Airline_signUp_Page sign_up=new Airline_signUp_Page(driver);
		sign_up.book_flight_tickets_link();
		sign_up.email_id();
		sign_up.continue_button();
		sign_up.pass();
		sign_up.submit();
		
		Airline_OneWay_Flight_Booking_Page one_way_booking=new Airline_OneWay_Flight_Booking_Page(driver);
		one_way_booking.one_way_booking();
		one_way_booking.click_on_source_place_button();
		Thread.sleep(2000);
		one_way_booking.enter_source_place_name();
		Thread.sleep(2000);
		one_way_booking.select_source_place();
		Thread.sleep(2000);
		one_way_booking.enter_destination_place_name();
		Thread.sleep(2000);
		one_way_booking.select_destination_place();
		one_way_booking.select_date();
		
		Airline_Number_of_passanger_selection_page number_of_adults_childs_infats=new Airline_Number_of_passanger_selection_page(driver);
		number_of_adults_childs_infats.select_adults6();
		number_of_adults_childs_infats.select_child3();
		number_of_adults_childs_infats.select_infant1();
	
		one_way_booking.search_button();
		
		Airline_booking_page book_tickets=new Airline_booking_page(driver);
		book_tickets.click_on_book_button();
		
	
		
	}
}
