/*
  Landing page host links to all other pages on the site

 */

package main.java.theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDropPage extends AbstractPageObject {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.id("columns");
    }

    By columnListLocator = By.className("column");
    By dragboxLocatorA = By.id("column-a");
    By dragboxLocatorB = By.id("column-b");


    public Boolean canDragAndDropAtoB()
    {
        WebElement dragboxA = driver.findElement(dragboxLocatorA);
        WebElement dragboxB = driver.findElement(dragboxLocatorB);
        return canDragAndDrop(dragboxA, dragboxB);
    }

    public Boolean canDragAndDropBtoA()
    {
        WebElement dragboxA = driver.findElement(dragboxLocatorA);
        WebElement dragboxB = driver.findElement(dragboxLocatorB);
        return canDragAndDrop(dragboxB, dragboxA);
    }

    private Boolean canDragAndDrop(WebElement source, WebElement target){

        //Get position of boxes in the DOM before the switch
        List<WebElement> columnListBefore = driver.findElements(columnListLocator);
        (new Actions(driver)).dragAndDrop(source, target).perform();

        //Get position of boxes in the DOM after the switch and compare to previous position
        List<WebElement> columnListAfter = driver.findElements(columnListLocator);
        if (columnListBefore.get(0).equals(columnListAfter.get(1)))
        {
            return true;
        }
        return false;
    }

}
