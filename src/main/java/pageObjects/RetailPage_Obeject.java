package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
//===============================================================================================
//              1st-  Scenario: Login to My Account Dash board
//===============================================================================================
public class RetailPage_Obeject extends Base {
	
	public RetailPage_Obeject() {
		PageFactory.initElements(driver, this);
}
	@FindBy(id = "login2")
	private WebElement Log_inTab;
	public void User_click_on_Log_in() {
		Log_inTab.click();	
	}
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement userNameInputBox;
	public void enterLoginUserName(String userEmail) {
		userNameInputBox.sendKeys(userEmail);
	}
	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement userPasswordInputBox;
	public void enterLoginPassword(String userPassword) {
		userPasswordInputBox.sendKeys(userPassword);
	}
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement userClickOnloginButton;
	public void user_Click_on_login_Button() {
		userClickOnloginButton.click();
	}
	
	@FindBy(xpath="//a [@class ='navbar-brand']")
	private WebElement myAccountDashboard;
	public boolean user_should_be_logged_in_to_myAccountDashboard() {
				
		String expectedTitle = "STORE"; // Replace with the actual title
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test Passed: User is on dashboard page. The title of page is  : " + expectedTitle);
        } else {
            System.out.println("Test Failed: Page title does not match. Expected: " + expectedTitle + ", but got: " + actualTitle);
        }
        return myAccountDashboard.isDisplayed();
	}
}




