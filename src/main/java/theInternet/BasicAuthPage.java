/*
  Landing page host links to all other pages on the site

 */

package main.java.theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicAuthPage extends AbstractPageObject {

    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.className("example");
    }


    By messageLocator = By.className("example");
    String successMessage = "Basic Auth\nCongratulations! You must have the proper credentials.";

    public Boolean isSuccessMessageDisplayed() {
        WebElement message = driver.findElement(messageLocator);
        if (message.getText().equals(successMessage)){
            return true;}
        return false;
    }
}
