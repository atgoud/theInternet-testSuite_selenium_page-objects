package test.java.theInternet;

import org.testng.annotations.Test;


public class ABTest extends BaseTest {

    public ABTest() {
        super();
    }

    @Test(groups = {"group1"})

    //hit the page 20 times, report back how many times each test was thrown

    //hit ab page
    //get text
    //if var1 dispalyed, switch var1appeared value to true and add to the count
    //if var2 displayed,  switch var2appeared value to true and add to the count
    //if var3 displayed,  switch var3appeared value to true and add to the count
    //retrun fail if eitehr var1, var2 or var3 appeared values are false



    public void doBothPagesAppear() {

        int PageRefreshCount = 10;

        boolean var1Appeared = false;
        boolean var2Appeared = false;
        boolean var3Appeared = false;

        int var1Count = 0;
        int var2Count = 0;
        int var3Count = 0;

        LandingPage landingPage = new LandingPage(driver);
        ABTestPage abTestPage = landingPage.clickABPageLink();

        for (int i=0; i<PageRefreshCount; i++)
        {

        if (abTestPage.isVar1Displayed().equals(true)){var1Appeared = true; var1Count+=1;}
        if (abTestPage.isVar2Displayed().equals(true)){var2Appeared = true; var2Count+=1;}
        if (abTestPage.isVar3Displayed().equals(true)){var3Appeared = true; var3Count+=1;}

        driver.navigate().refresh();

        }

        System.out.println("var1Appeared " + var1Count + " times" );
        System.out.println("var2Appeared " + var2Count + " times" );
        System.out.println("var3Appeared " + var3Count + " times" );

    }

}
