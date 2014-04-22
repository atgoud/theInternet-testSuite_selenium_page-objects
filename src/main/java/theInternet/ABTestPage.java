/*
  Landing page host links to all other pages on the site

 */

package main.java.theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ABTestPage extends AbstractPageObject {

    public ABTestPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.id("content");
    }

    By pageTitleLocator = By.cssSelector("#content > div > h3");
    String var1Text = "A/B Test Variation 1";
    String var2Text = "No A/B Test";
    String var3Text = "A/B Test Control";
    //A/B testing page


//
//    public QuestionsPage clickQuestionsTab() {
//        WebElement questionsTab = driver.findElement(pageTitleLocator);
//        questionsTab.click();
//        return new QuestionsPage(driver);
//    }

    public Boolean isVar1Displayed(){
        WebElement pageTitle = driver.findElement(pageTitleLocator);

        //debug
        System.out.println(pageTitle.getText());

        if (pageTitle.getText().equals(var1Text))
        {
            return true;
        }
        return false;
    }

    public Boolean isVar2Displayed(){
        WebElement pageTitle = driver.findElement(pageTitleLocator);
        if (pageTitle.getText().equals(var2Text))
        {
            return true;
        }
        return false;
    }

    public Boolean isVar3Displayed(){
        WebElement pageTitle = driver.findElement(pageTitleLocator);
        if (pageTitle.getText().equals(var3Text))
        {
            return true;
        }
        return false;
    }


}
