package airline_test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import airline_source.Airline_Different_Classes_Page;
import airline_source.Airline_Number_of_passanger_selection_page;
import airline_source.Airline_OneWay_Flight_Booking_Page;
import airline_source.Airline_booking_Adult_traveller_details_page;
import airline_source.Airline_booking_Child_traveller_details_page;
import airline_source.Airline_booking_Infants_traveller_details_page;
import airline_source.Airline_booking_page;
import airline_source.Airline_offers_and_PromoCode_Page;
import airline_source.Airline_signUp_Page;
import ddt.Excel_sheet_for_Login;

public class Test_11_enter_details_in_every_text_field_and_apply_promo_code extends Airline_Launch_and_Quit
{
	@Test
	public void test11() throws InterruptedException, EncryptedDocumentException, IOException
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
		
		Airline_Different_Classes_Page select_class=new Airline_Different_Classes_Page(driver);
		select_class.economy_class();
		
		one_way_booking.search_button();
		
		Airline_booking_page book_ticet=new Airline_booking_page(driver);
		book_ticet.click_on_book_button();
		
		Airline_offers_and_PromoCode_Page apply_offer=new Airline_offers_and_PromoCode_Page(driver);
		Thread.sleep(2000);
		apply_offer.apply_offer_button();
		
		Thread.sleep(2000);
		book_ticet.proceed_to_travellers_details_button();
		Thread.sleep(2000);
		
		Airline_booking_Adult_traveller_details_page add_adults=new Airline_booking_Adult_traveller_details_page(driver);
		add_adults.add_new_adults_button();
		add_adults.gender_button();
		add_adults.select_gender();
		add_adults.enter_first_name();
		Thread.sleep(1000);
		add_adults.enter_last_name();
		Thread.sleep(1000);
		add_adults.add_adult_button();
		Thread.sleep(1000);
		add_adults.add_new_adults_button1();
		add_adults.gender_button1();
		add_adults.select_gender1();
		add_adults.enter_first_name1();
		Thread.sleep(1000);
		add_adults.enter_last_name1();
		Thread.sleep(1000);
		add_adults.add_adult_button1();
		Thread.sleep(1000);
		add_adults.add_new_adults_button2();
		add_adults.gender_button2();
		add_adults.select_gender2();
		add_adults.enter_first_name2();
		Thread.sleep(1000);
		add_adults.enter_last_name2();
		Thread.sleep(1000);
		add_adults.add_adult_button2();
		Thread.sleep(1000);
		add_adults.add_new_adults_button3();
		add_adults.gender_button3();
		add_adults.select_gender3();
		add_adults.enter_first_name3();
		Thread.sleep(1000);
		add_adults.enter_last_name3();
		Thread.sleep(1000);
		add_adults.add_adult_button3();
		Thread.sleep(1000);
		add_adults.add_new_adults_button4();
		add_adults.gender_button4();
		add_adults.select_gender4();
		add_adults.enter_first_name4();
		Thread.sleep(1000);
		add_adults.enter_last_name4();
		Thread.sleep(1000);
		add_adults.add_adult_button4();
		Thread.sleep(1000);
		add_adults.add_new_adults_button5();
		add_adults.gender_button5();
		add_adults.select_gender5();
		add_adults.enter_first_name5();
		Thread.sleep(1000);
		add_adults.enter_last_name5();
		Thread.sleep(1000);
		add_adults.add_adult_button5();
		Thread.sleep(1000);
		add_adults.add_new_adults_button6();
		add_adults.gender_button6();
		add_adults.select_gender6();
		add_adults.enter_first_name6();
		Thread.sleep(1000);
		add_adults.enter_last_name6();
		Thread.sleep(1000);
		add_adults.add_adult_button6();
		Thread.sleep(1000);
		add_adults.add_new_adults_button7();
		add_adults.gender_button7();
		add_adults.select_gender7();
		add_adults.enter_first_name7();
		Thread.sleep(1000);
		add_adults.enter_last_name7();
		Thread.sleep(1000);
		add_adults.add_adult_button7();
		Thread.sleep(1000);
		add_adults.add_new_adults_button8();
		add_adults.gender_button8();
		add_adults.select_gender8();
		add_adults.enter_first_name8();
		Thread.sleep(1000);
		add_adults.enter_last_name8();
		Thread.sleep(1000);
		add_adults.add_adult_button8();
		Thread.sleep(1000);							
		
		Airline_booking_Child_traveller_details_page add_child=new Airline_booking_Child_traveller_details_page(driver);
		add_child.add_new_child_button();
		add_child.gender_button_child();
		add_child.select_gender_child();
		add_child.enter_first_name_child();
		add_child.enter_last_name_child();
		Thread.sleep(1000);
		add_child.child_date_of_birth();
		Thread.sleep(1000);
		add_child.year_button();
		Thread.sleep(1000);
		add_child.select_year();
		Thread.sleep(1000);
		add_child.month_button();
		Thread.sleep(1000);
		add_child.select_month();
		Thread.sleep(1000);
		add_child.select_day();
		Thread.sleep(1000);
		add_child.add_child_button();
		
		Thread.sleep(1000);
		add_child.add_new_child_button1();
		add_child.gender_button_child1();
		add_child.select_gender_child1();
		add_child.enter_first_name_child1();
		add_child.enter_last_name_child1();
		Thread.sleep(1000);
		add_child.child_date_of_birth1();
		Thread.sleep(1000);
		add_child.year_button1();
		Thread.sleep(1000);
		add_child.select_year1();
		Thread.sleep(1000);
		add_child.month_button1();
		Thread.sleep(1000);
		add_child.select_month1();
		Thread.sleep(1000);
		add_child.select_day1();
		Thread.sleep(1000);
		add_child.add_child_button1();
		Thread.sleep(1000);
		add_child.add_new_child_button2();
		add_child.gender_button_child2();
		add_child.select_gender_child2();
		add_child.enter_first_name_child2();
		add_child.enter_last_name_child2();
		Thread.sleep(1000);
		add_child.child_date_of_birth2();
		Thread.sleep(1000);
		add_child.year_button2();
		Thread.sleep(1000);
		add_child.select_year2();
		Thread.sleep(2000);
		add_child.month_button2();
		Thread.sleep(1000);
		add_child.select_month2();
		Thread.sleep(2000);
		add_child.select_day2();
		Thread.sleep(1000);
		add_child.add_child_button2();
		Thread.sleep(1000);
		add_child.add_new_child_button3();
		add_child.gender_button_child3();
		add_child.select_gender_child3();
		add_child.enter_first_name_child3();
		add_child.enter_last_name_child3();
		Thread.sleep(1000);
		add_child.child_date_of_birth3();
		Thread.sleep(1000);
		add_child.year_button3();
		add_child.select_year3();
		Thread.sleep(1000);
		add_child.month_button3();
		Thread.sleep(1000);
		add_child.select_month3();
		Thread.sleep(1000);
		add_child.select_day3();
		Thread.sleep(1000);
		add_child.add_child_button3();
		Thread.sleep(1000);
		add_child.add_new_child_button4();
		add_child.gender_button_child4();
		add_child.select_gender_child4();
		add_child.enter_first_name_child4();
		add_child.enter_last_name_child4();
		Thread.sleep(1000);
		add_child.child_date_of_birth4();
		Thread.sleep(1000);
		add_child.year_button4();
		Thread.sleep(1000);
		add_child.select_year4();
		Thread.sleep(1000);
		add_child.month_button4();
		Thread.sleep(1000);
		add_child.select_month4();
		Thread.sleep(1000);
		add_child.select_day4();
		Thread.sleep(1000);
		add_child.add_child_button4();
		Thread.sleep(1000);
		add_child.add_new_child_button5();
		add_child.gender_button_child5();
		add_child.select_gender_child5();
		add_child.enter_first_name_child5();
		add_child.enter_last_name_child5();
		Thread.sleep(1000);
		add_child.child_date_of_birth5();
		Thread.sleep(1000);
		add_child.year_button5();
		Thread.sleep(1000);
		add_child.select_year5();
		Thread.sleep(1000);
		add_child.month_button5();
		Thread.sleep(1000);
		add_child.select_month5();
		Thread.sleep(1000);
		add_child.select_day5();
		Thread.sleep(1000);
		add_child.add_child_button5();
		Thread.sleep(1000);
		add_child.add_new_child_button6();
		add_child.gender_button_child6();
		add_child.select_gender_child6();
		add_child.enter_first_name_child6();
		add_child.enter_last_name_child6();
		Thread.sleep(1000);
		add_child.child_date_of_birth6();
		Thread.sleep(1000);
		add_child.year_button6();
		Thread.sleep(1000);
		add_child.select_year6();
		Thread.sleep(1000);
		add_child.month_button6();
		Thread.sleep(1000);
		add_child.select_month6();
		Thread.sleep(1000);
		add_child.select_day6();
		Thread.sleep(1000);
		add_child.add_child_button6();
		Thread.sleep(1000);
		add_child.add_new_child_button7();
		add_child.gender_button_child7();
		add_child.select_gender_child7();
		add_child.enter_first_name_child7();
		add_child.enter_last_name_child7();
		Thread.sleep(1000);
		add_child.child_date_of_birth7();
		Thread.sleep(1000);
		add_child.year_button7();
		Thread.sleep(1000);
		add_child.select_year7();
		Thread.sleep(1000);
		add_child.month_button7();
		Thread.sleep(1000);
		add_child.select_month7();
		Thread.sleep(1000);
		add_child.select_day7();
		Thread.sleep(1000);
		add_child.add_child_button7();
		Thread.sleep(1000);
		Airline_booking_Infants_traveller_details_page add_infants=new Airline_booking_Infants_traveller_details_page(driver);
		add_infants.add_new_infant_button();
		add_infants.gender_button_infant();
		add_infants.select_gender_infant();
		add_infants.enter_first_name_infant();
		add_infants.enter_last_name_infant();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth();
		Thread.sleep(1000);
		add_infants.year_button_infant();
		Thread.sleep(1000);
		add_infants.select_year_infant();
		Thread.sleep(1000);
		add_infants.month_button_infant();
		Thread.sleep(1000);
		add_infants.select_month_infant();
		Thread.sleep(1000);
		add_infants.select_day_infant();
		Thread.sleep(1000);
		add_infants.add_infant_button();
		Thread.sleep(1000);
		add_infants.add_new_infant_button1();
		add_infants.gender_button_infant1();
		add_infants.select_gender_infant1();
		add_infants.enter_first_name_infant1();
		add_infants.enter_last_name_infant1();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth1();
		Thread.sleep(1000);
		add_infants.year_button_infant1();
		Thread.sleep(1000);
		add_infants.select_year_infant1();
		Thread.sleep(1000);
		add_infants.month_button_infant1();
		Thread.sleep(1000);
		add_infants.select_month_infant1();
		Thread.sleep(1000);
		add_infants.select_day_infant1();
		Thread.sleep(1000);
		add_infants.add_infant_button1();
		Thread.sleep(1000);
		add_infants.add_new_infant_button2();
		add_infants.gender_button_infant2();
		add_infants.select_gender_infant2();
		add_infants.enter_first_name_infant2();
		add_infants.enter_last_name_infant2();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth2();
		Thread.sleep(1000);
		add_infants.year_button_infant2();
		Thread.sleep(1000);
		add_infants.select_year_infant2();
		Thread.sleep(1000);
		add_infants.month_button_infant2();
		Thread.sleep(1000);
		add_infants.select_month_infant2();
		Thread.sleep(1000);
		add_infants.select_day_infant2();
		Thread.sleep(1000);
		add_infants.add_infant_button2();
		Thread.sleep(1000);
		add_infants.add_new_infant_button3();
		add_infants.gender_button_infant3();
		add_infants.select_gender_infant3();
		add_infants.enter_first_name_infant3();
		add_infants.enter_last_name_infant3();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth3();
		Thread.sleep(1000);
		add_infants.year_button_infant3();
		Thread.sleep(1000);
		add_infants.select_year_infant3();
		Thread.sleep(1000);
		add_infants.month_button_infant3();
		Thread.sleep(1000);
		add_infants.select_month_infant3();
		Thread.sleep(1000);
		add_infants.select_day_infant3();
		Thread.sleep(1000);
		add_infants.add_infant_button3();
		Thread.sleep(1000);
		add_infants.add_new_infant_button4();
		add_infants.gender_button_infant4();
		add_infants.select_gender_infant4();
		add_infants.enter_first_name_infant4();
		add_infants.enter_last_name_infant4();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth4();
		Thread.sleep(1000);
		add_infants.year_button_infant4();
		Thread.sleep(1000);
		add_infants.select_year_infant4();
		Thread.sleep(1000);
		add_infants.month_button_infant4();
		Thread.sleep(1000);
		add_infants.select_month_infant4();
		Thread.sleep(1000);
		add_infants.select_day_infant4();
		Thread.sleep(1000);
		add_infants.add_infant_button4();
		Thread.sleep(1000);
		add_infants.add_new_infant_button5();
		add_infants.gender_button_infant5();
		add_infants.select_gender_infant5();
		add_infants.enter_first_name_infant5();
		add_infants.enter_last_name_infant5();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth5();
		Thread.sleep(1000);
		add_infants.year_button_infant5();
		Thread.sleep(1000);
		add_infants.select_year_infant5();
		Thread.sleep(1000);
		add_infants.month_button_infant5();
		Thread.sleep(1000);
		add_infants.select_month_infant5();
		Thread.sleep(1000);
		add_infants.select_day_infant5();
		Thread.sleep(1000);
		add_infants.add_infant_button5();
		Thread.sleep(1000);
		add_infants.add_new_infant_button6();
		add_infants.gender_button_infant6();
		add_infants.select_gender_infant6();
		add_infants.enter_first_name_infant6();
		add_infants.enter_last_name_infant6();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth6();
		Thread.sleep(1000);
		add_infants.year_button_infant6();
		Thread.sleep(1000);
		add_infants.select_year_infant6();
		Thread.sleep(1000);
		add_infants.month_button_infant6();
		Thread.sleep(1000);
		add_infants.select_month_infant6();
		Thread.sleep(1000);
		add_infants.select_day_infant6();
		Thread.sleep(1000);
		add_infants.add_infant_button6();
		Thread.sleep(1000);
		add_infants.add_new_infant_button7();
		add_infants.gender_button_infant7();
		add_infants.select_gender_infant7();
		add_infants.enter_first_name_infant7();
		add_infants.enter_last_name_infant7();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth7();
		Thread.sleep(1000);
		add_infants.year_button_infant7();
		Thread.sleep(1000);
		add_infants.select_year_infant7();
		Thread.sleep(1000);
		add_infants.month_button_infant7();
		Thread.sleep(1000);
		add_infants.select_month_infant7();
		Thread.sleep(1000);
		add_infants.select_day_infant7();
		Thread.sleep(1000);
		add_infants.add_infant_button7();
		Thread.sleep(1000);
		add_infants.add_new_infant_button8();
		add_infants.gender_button_infant8();
		add_infants.select_gender_infant8();
		add_infants.enter_first_name_infant8();
		add_infants.enter_last_name_infant8();
		Thread.sleep(1000);
		add_infants.infant_date_of_birth8();
		Thread.sleep(1000);
		add_infants.year_button_infant8();
		Thread.sleep(1000);
		add_infants.select_year_infant8();
		Thread.sleep(1000);
		add_infants.month_button_infant8();
		Thread.sleep(1000);
		add_infants.select_month_infant8();
		Thread.sleep(1000);
		add_infants.select_day_infant8();
		Thread.sleep(1000);
		add_infants.add_infant_button8();
		Thread.sleep(2000);								
		
	}
}
