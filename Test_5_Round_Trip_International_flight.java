package airline_test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import airline_source.Airline_Number_of_passanger_selection_page;
import airline_source.Airline_Round_Trip_International_Flight_Booking_Page;
import airline_source.Airline_booking_page;
import airline_source.Airline_signUp_Page;
import ddt.Excel_sheet_for_Login;

public class Test_5_Round_Trip_International_flight extends Airline_Launch_and_Quit
{
	@Test(groups="Test_5_Round_Trip_International_flight",dependsOnGroups = { "Test_4_OneWay_Flight" })
	public void test5() throws InterruptedException, EncryptedDocumentException, IOException
	{
//		Test_4_OneWay_Flight test_4_OneWay_Flight = new Test_4_OneWay_Flight();
//		test_4_OneWay_Flight.test4();
		
		Excel_sheet_for_Login.excel_data();
		Airline_signUp_Page sign_up=new Airline_signUp_Page(driver);
		sign_up.book_flight_tickets_link();
		sign_up.email_id();
		sign_up.continue_button();
		sign_up.pass();
		sign_up.submit();
		
		Airline_Round_Trip_International_Flight_Booking_Page round_trip_booking=new Airline_Round_Trip_International_Flight_Booking_Page(driver);
		round_trip_booking.round_trip_button();
		round_trip_booking.click_on_source_place_button();
		Thread.sleep(2000);
		round_trip_booking.enter_source_place_name();
		Thread.sleep(2000);
		round_trip_booking.select_source_place();
		Thread.sleep(2000);
		round_trip_booking.enter_destination_place_name();
		Thread.sleep(2000);
		round_trip_booking.select_destination_place();
		Thread.sleep(2000);
		round_trip_booking.select_start_date();
		Thread.sleep(2000);
		round_trip_booking.select_end_date();
		
		Airline_Number_of_passanger_selection_page number_of_adults_childs_infats=new Airline_Number_of_passanger_selection_page(driver);
		number_of_adults_childs_infats.select_adults2();
		number_of_adults_childs_infats.select_child1();
		number_of_adults_childs_infats.select_infant1();
		
		round_trip_booking.search_button();
		
		Airline_booking_page book_tickets=new Airline_booking_page(driver);
		Thread.sleep(2000);
		book_tickets.click_on_book_button();
		
	}
}
