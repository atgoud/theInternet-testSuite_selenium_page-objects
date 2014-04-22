/*
  Landing page host links to all other pages on the site

 */

package main.java.theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends AbstractPageObject {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.id("content");
    }

    By pageTitleLocator = By.className("example");
    By abTestPageLocator = By.cssSelector("#content > ul > li:nth-child(1) > a");
    By basicAuthPageLocator = By.cssSelector("#content > ul > li:nth-child(2) > a");
    By checkboxPageLocator = By.cssSelector("#content > ul > li:nth-child(3) > a");
    By dragAndDropPageLocator = By.cssSelector("#content > ul > li:nth-child(4) > a");
    By dropdownPageLocator = By.cssSelector("#content > ul > li:nth-child(5) > a");
    By dynamicLoadingPageLocator = By.cssSelector("#content > ul > li:nth-child(6) > a");
    By fileDownloadPageLocator = By.cssSelector("#content > ul > li:nth-child(7) > a");
    By fileUploadPageLocator = By.cssSelector("#content > ul > li:nth-child(8) > a");
    By forgotPasswordPageLocator = By.cssSelector("#content > ul > li:nth-child(9) > a");
    By formAuthenticationPageLocator = By.cssSelector("#content > ul > li:nth-child(10) > a");
    By framesPageLocator = By.cssSelector("#content > ul > li:nth-child(11) > a");
    By geolocationPageLocator = By.cssSelector("#content > ul > li:nth-child(12) > a");
    By jqueryMenusPageLocator = By.cssSelector("#content > ul > li:nth-child(13) > a");
    By jsAlertsPageLocator = By.cssSelector("#content > ul > li:nth-child(14) > a");
    By jsOnloadPageLocator = By.cssSelector("#content > ul > li:nth-child(15) > a");
    By largeDeepDomPageLocator = By.cssSelector("#content > ul > li:nth-child(16) > a");
    By multiwindowPageLocator = By.cssSelector("#content > ul > li:nth-child(17) > a");
    By notifiicationMessagesPageLocator = By.cssSelector("#content > ul > li:nth-child(18) > a");
    By redirectPageLocator = By.cssSelector("#content > ul > li:nth-child(19) > a");
    By sortableTablesPageLocator = By.cssSelector("#content > ul > li:nth-child(20) > a");
    By statusCodesPageLocator = By.cssSelector("#content > ul > li:nth-child(21) > a");



    //A/B testing page



    public ABTestPage clickABPageLink() {
        WebElement abPageLink = driver.findElement(abTestPageLocator);
        abPageLink.click();
        return new ABTestPage(driver);
    }

    public BasicAuthPage clickBasicAuthPageLink() {

        WebElement basicAuthPageLink = driver.findElement(basicAuthPageLocator);
        basicAuthPageLink.click();
        return new BasicAuthPage(driver);
    }

    public CheckboxPage clickCheckboxPageLink() {

        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
        checkboxPageLink.click();
        return new CheckboxPage(driver);
    }

    public DragAndDropPage clickDragAndDropPageLink() {

        WebElement draganddropPageLink = driver.findElement(dragAndDropPageLocator);
        draganddropPageLink.click();
        return new DragAndDropPage(driver);
    }

//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }
//
//    public CheckboxPage clickCheckboxPageLink() {
//
//        WebElement checkboxPageLink = driver.findElement(checkboxPageLocator);
//        checkboxPageLink.click();
//        return new CheckboxPage(driver);
//    }

    public Boolean isQuestionsTabDisplayed() {
        List<WebElement> questionsTab = driver.findElements(pageTitleLocator);
        return questionsTab.size() > 0;
    }
}

