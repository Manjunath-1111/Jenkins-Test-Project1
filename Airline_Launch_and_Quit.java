package airline_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Airline_Launch_and_Quit 
{
    WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fflights%3Fref_%3Dbosh_search_alexa%26pd_rd_w%3Dv1Mre%26content-id%3Damzn1.sym.69d5bccf-d80d-4166-ab75-81ffa3935d08%3Aamzn1.sym.69d5bccf-d80d-4166-ab75-81ffa3935d08%26pf_rd_p%3D69d5bccf-d80d-4166-ab75-81ffa3935d08%26pf_rd_r%3DRQ9MH1H9Z4Z09X46BVMK%26pd_rd_wg%3DXGbiK%26pd_rd_r%3D7361fbd7-4221-4204-8786-f8ec7aa4bd3a%26qid%3D1716131191%26ref%3Dsxts_aspa_qna%26c_c%3D-1699251100&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_hfctl_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@AfterMethod
	public void quit()
	{
		//driver.close();
	}
}
