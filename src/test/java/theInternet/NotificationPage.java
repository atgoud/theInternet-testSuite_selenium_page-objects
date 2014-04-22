package test.java.theInternet;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NotificationPage extends BaseTest {

    public NotificationPage() {
        super();
    }




    @Test(groups = {"group1"})

        public void isCheckbox1Toggleable() {

        LandingPage landingPage = new LandingPage(driver);
        CheckboxPage basicAuthPage = landingPage.clickCheckboxPageLink();
        Assert.assertTrue(basicAuthPage.isCheckbox1Toggleable());
        Assert.assertTrue(basicAuthPage.isCheckbox2Toggleable());
    }
//
//    @Test(groups = {"group2"})
//    public void isLogoDisplayedTest() {
//        LandingPage landingPage = new LandingPage(driver);
//        Assert.assertTrue(landingPage.isQuestionsTabDisplayed());
//    }

}