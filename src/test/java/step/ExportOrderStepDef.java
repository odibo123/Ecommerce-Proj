package step;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AdminPanelCustomerPage;
//import pages.AdminPanelCustomerPage;
import pages.AdminPanelPage;

public class ExportOrderStepDef extends TestBase{
	
	 AdminPanelPage  adminPanelPage = new  AdminPanelPage();
	 AdminPanelCustomerPage adminPanelCustomerPage = new AdminPanelCustomerPage();

	 
	 @Given("^user is on live\\.demoguru(\\d+)\\.com/index\\.php/backendlogin Home Page$")
	 public void user_is_on_live_demoguru_com_index_php_backendlogin_Home_Page(int arg1) throws Throwable {
	     TestBase.initialization();
	 }
@When("^user login with the credentials provided$")
public void user_login_with_the_credentials_provided() throws Throwable {
	 AdminPanelPage  adminPanelPage= PageFactory.initElements(driver, AdminPanelPage.class);
	 adminPanelPage.type_into_UsernameBtn();
	 adminPanelPage.type_into_PasswordBtn();
	 adminPanelPage.click_LoginBtn();
	 Thread.sleep(4000);
	// adminPanelPage.clickPopUp();
	// Alert alert= driver.switchTo().alert();
	// alert.accept();
	// Thread.sleep(5000);
	// adminPanelCustomerPage.dismiss_PopUpCloseBtn();
}
@When("^user verify seeing a pop up window$")
public void user_verify_seeing_a_pop_up_window() throws Throwable {
	 AdminPanelPage  adminPanelPage= PageFactory.initElements(driver, AdminPanelPage.class);
			 adminPanelPage.clickPopUp();
			 
				try {
					// Close alerts if present
				driver.switchTo().alert().accept();
			} catch (NoAlertPresentException ex) {
				// Nothing to do...
			}
	

}
@When("^user mouses hover to Order menu$")
public void user_mouses_hover_to_Order_menu() throws Throwable {
	AdminPanelCustomerPage adminPanelCustomerPage  = PageFactory.initElements(driver, AdminPanelCustomerPage.class);
	adminPanelCustomerPage.click_Customer_Orders();
	Thread.sleep(5000);
}

@Then("^user select CSV to dropdown and click  Export$")
public void user_select_CSV_to_dropdown_and_click_Export() throws Throwable {
	
	AdminPanelCustomerPage adminPanelCustomerPage  = PageFactory.initElements(driver, AdminPanelCustomerPage.class); 
	//Thread.sleep(5000);
	adminPanelCustomerPage.select_CSVdropdown();
}
}
