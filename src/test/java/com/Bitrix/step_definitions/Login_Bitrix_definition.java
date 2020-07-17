package com.Bitrix.step_definitions;

import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Login_Bitrix_definition {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User logs in  on the login page");
        
    }



    @Then("User login in and see the dashboard")
    public void user_login_in_and_see_the_dashboard() {
        System.out.println("User see the dashboard");
    }

}
