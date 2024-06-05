package airline_test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import airline_source.Airline_Number_of_passanger_selection_page;
import airline_source.Airline_OneWay_Flight_Booking_Page;
import airline_source.Airline_Sign_out_Page;
import airline_source.Airline_signUp_Page;
import ddt.Excel_sheet_for_Login;

public class Test_12_login_search_flight_logout extends Airline_Launch_and_Quit
{
	@Test
	public void test12() throws InterruptedException, EncryptedDocumentException, IOException
	{
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
		
		Airline_Sign_out_Page sign_out=new Airline_Sign_out_Page(driver);
		Thread.sleep(2000);
		sign_out.accounts_and_lists_button();
		sign_out.sign_out_button();
		

		
		
		
	}
}
