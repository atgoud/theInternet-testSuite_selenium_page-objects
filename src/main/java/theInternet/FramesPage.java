/*
  Landing page host links to all other pages on the site

 */

package main.java.theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage extends AbstractPageObject {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.className("example");
    }


    By checkboxLocator1 = By.cssSelector("input[type=\"checkbox\"]:nth-child(1)");
    By checkboxLocator2 = By.cssSelector("input[type=\"checkbox\"]:nth-child(3)");


    public Boolean isCheckbox1Toggleable(){
        WebElement checkbox1 = driver.findElement(checkboxLocator1);
        return false;
    }

}
