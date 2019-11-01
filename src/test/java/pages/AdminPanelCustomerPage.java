package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class AdminPanelCustomerPage extends TestBase {
	

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Sales')]")
	WebElement SalesLink;
	

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Orders')]")
	WebElement CustomerOrdersLink;
	
	@FindBy(how=How.XPATH,using= "//select[@id='customerGrid_export']")
	WebElement CSVdropdown;
	
	
	
	public void click_Customer_Orders(){
		Actions action= new Actions(driver);
		action.moveToElement(SalesLink).build().perform();
		
		CustomerOrdersLink.click();
		
	}
	
	public void select_CSVdropdown(){
		
	Select select = new Select(CSVdropdown);
	select.selectByIndex(1);
//	WebDriverWait wait = new WebDriverWait(driver,40);
	//   WebElement element = wait.until(
    //        ExpectedConditions.visibilityOf(CSVdropdown));
	   CSVdropdown.click();
	}
	}

