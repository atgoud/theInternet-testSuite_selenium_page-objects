package test.java.theInternet;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DragAndDropTest extends BaseTest {

    public DragAndDropTest() {
        super();
    }




    @Test(groups = {"group1"})

        public void canDragFromColumnAtoB() {

        LandingPage landingPage = new LandingPage(driver);
        DragAndDropPage dragAndDropPage = landingPage.clickDragAndDropPageLink();
        Assert.assertTrue(dragAndDropPage.canDragAndDropAtoB());

        }
        public void canDragFromColumnBtoA() {

        LandingPage landingPage = new LandingPage(driver);
        DragAndDropPage dragAndDropPage = landingPage.clickDragAndDropPageLink();
        Assert.assertTrue(dragAndDropPage.canDragAndDropBtoA());

        }

//    @Test(groups = {"group2"})
//    public void isLogoDisplayedTest() {
//        LandingPage landingPage = new LandingPage(driver);
//        Assert.assertTrue(landingPage.isQuestionsTabDisplayed());
//    }

}