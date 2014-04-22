/*
  Landing page host links to all other pages on the site

 */

package main.java.theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage extends AbstractPageObject {

    public CheckboxPage(WebDriver driver) {
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
        return isCheckBoxToggleable(checkbox1);
    }

    public Boolean isCheckbox2Toggleable(){
        WebElement checkbox2 = driver.findElement(checkboxLocator2);
        return isCheckBoxToggleable(checkbox2);
    }

    //reusable internal helper method
    private Boolean isCheckBoxToggleable(WebElement checkbox){
        boolean isChecked = checkbox.isSelected();
        checkbox.click();

        //can toggle 1 way?
        if (checkbox.isSelected()== isChecked)
        {
            return false;
        }

        checkbox.click();

        //can toggle both ways?
        if (checkbox.isSelected()== isChecked)
        {
            return true;
        }

        return false;
    }
}
