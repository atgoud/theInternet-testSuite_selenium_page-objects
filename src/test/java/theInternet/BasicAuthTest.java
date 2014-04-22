package test.java.theInternet;

import org.testng.Assert;
import org.testng.annotations.Test;


public class BasicAuthTest extends BaseTest {

    public BasicAuthTest() {
        super();
    }
//
//    @Override
//    public void loadWebApplication() {
//        String username = "admin";
//        String password = "admin";
//        driver.get("http://"+username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
//        driver.get("http://the-internet.herokuapp.com/");
//    }


    @Test(groups = {"group1"})

        public void completeBasicAuthentication() {

        String username = "admin";
        String password = "admin";
        driver.get("http://"+username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
        driver.get("http://the-internet.herokuapp.com/");

        LandingPage landingPage = new LandingPage(driver);
        BasicAuthPage basicAuthPage = landingPage.clickBasicAuthPageLink();
        Assert.assertTrue(basicAuthPage.isSuccessMessageDisplayed());
    }
//
//    @Test(groups = {"group2"})
//    public void isLogoDisplayedTest() {
//        LandingPage landingPage = new LandingPage(driver);
//        Assert.assertTrue(landingPage.isQuestionsTabDisplayed());
//    }

}