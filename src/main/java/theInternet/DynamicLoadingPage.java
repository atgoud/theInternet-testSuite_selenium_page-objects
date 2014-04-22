/*
  Landing page host links to all other pages on the site

 */

package main.java.theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends AbstractPageObject {

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.className("example");
    }


    By checkboxLocator1 = By.cssSelector("input[type=\"checkbox\"]:nth-child(1)");
    By checkboxLocator2 = By.cssSelector("input[type=\"checkbox\"]:nth-child(3)");

}
