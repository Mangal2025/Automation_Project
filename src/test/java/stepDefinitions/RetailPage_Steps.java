package stepDefinitions;

import java.io.IOException;
import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPage_Obeject;
import utilities.Utilities;

//=================================================================================================
//          1st -  Scenario: Login to My Account Dash board
//==================================================================================================
    
public class RetailPage_Steps extends Base {
    	RetailPage_Obeject RetailPage = new RetailPage_Obeject();
    	
    	
    	@Given("User is on Retail website")
    	public void user_is_on_retail_website() {
    	}

    	@When("User click  Log in")
    	public void user_click_log_in() throws InterruptedException {
    	RetailPage.User_click_on_Log_in();
    	logger.info("User successfully clicked on log in ");
    	Thread.sleep(2000);
    	   
    	}
    	@Then("User enter username {string}")
    	public void user_enter_username(String string) throws InterruptedException {
    	RetailPage.enterLoginUserName("daud.mangal21@gmail.com");
    	logger.info("user entered username successfully");
	    Thread.sleep(3000);
    	    
    	}
    	@Then("User enter password {string}")
    	public void user_enter_password(String string) throws InterruptedException {
    	RetailPage.enterLoginPassword("Handkerchief@8");
    	logger.info("user entered password successfully");
    	Thread.sleep(3000);
    	    
    	}
    	@And ("User click on Login button")
    	public void user_click_on_Login_button() throws InterruptedException {
    	RetailPage.user_Click_on_login_Button();
    	logger.info("user clicked on login button successfully");
    	Thread.sleep(2000);
    		
    	}
        @Then ("User should be logged in to MyAccount dashboard") 
        public boolean user_should_be_logged_in_to_my_account_dashboard1() throws IOException {
            Assert.assertTrue(RetailPage.user_should_be_logged_in_to_myAccountDashboard());
    		RetailPage.user_should_be_logged_in_to_myAccountDashboard();
    		logger.info("user logged into My account dashboard successfuly ");
    		Utilities.takeScreenShot("My Account Dashboard");
    		return false;
    	}
   }
