package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class AdminPanelPage extends TestBase {
	
@FindBy(how=How.ID,using="username")	
WebElement UsernameBtn;


@FindBy(how=How.XPATH,using="//span[contains(text(),'close')]")
WebElement PopUpCloseBtn;

@FindBy(how=How.NAME,using="login[password]")
WebElement PasswordBtn;

@FindBy(how=How.CSS,using="#loginForm > div > div.form-buttons > input")
WebElement LoginBtn;


public void type_into_UsernameBtn(){
	UsernameBtn.sendKeys("user01");
}

public void type_into_PasswordBtn(){
	PasswordBtn.sendKeys("guru99com");
}

public void click_LoginBtn(){
	LoginBtn.click();
}

public void clickPopUp(){
	
/*Set<String> handler=  driver.getWindowHandles();

Iterator <String> it=	handler.iterator();

String parentWindowId =it.next();
System.out.println("The title of parentWindowId is "+ parentWindowId);

String childWindowId=it.next();
System.out.println(childWindowId);

driver.switchTo().window("The title of childWindowId is "+childWindowId);

System.out.println("child widow popup title is "+driver.getTitle());*/
	
	/*  WebDriverWait wait= new WebDriverWait(driver, 30);
      Alert alertMessage2=wait.until(ExpectedConditions.alertIsPresent());
	  
      System.out.println("alert message"+alertMessage2.getText());
      alertMessage2.dismiss();
      //PopUpCloseBtn.click()*/
PopUpCloseBtn.click();
}
}
