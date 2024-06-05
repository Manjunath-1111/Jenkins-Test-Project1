package airline_test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import airline_source.Airline_Number_of_passanger_selection_page;
import airline_source.Airline_OneWay_Flight_Booking_Page;
import airline_source.Airline_View_Baggage_and_Cancellation_policy_and_fare_Details_Page;
import airline_source.Airline_booking_page;
import airline_source.Airline_signUp_Page;
import ddt.Excel_sheet_for_Login;

public class Test_10_View_Baggage_and_Cancellation_policy_and_fair_Details extends Airline_Launch_and_Quit
{
	@Test
	public void test10() throws InterruptedException, EncryptedDocumentException, IOException
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
		
		Airline_booking_page book_tickets=new Airline_booking_page(driver);
		book_tickets.click_on_book_button();
		
		Airline_View_Baggage_and_Cancellation_policy_and_fare_Details_Page bcf_details=new Airline_View_Baggage_and_Cancellation_policy_and_fare_Details_Page(driver);
		bcf_details.view_baggage_and_cancellation_policy_button();
		Thread.sleep(3000);
		bcf_details.cancellation_policy();
		Thread.sleep(3000);
		bcf_details.date_change_policy();
		Thread.sleep(3000);
		bcf_details.baggage_details();
		Thread.sleep(3000);
		bcf_details.view_fare_details();
		
	
		
	}
}
