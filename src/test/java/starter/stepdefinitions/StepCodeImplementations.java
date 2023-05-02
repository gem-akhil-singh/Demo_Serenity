package starter.stepdefinitions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.Xpath.Locators;

import java.util.Objects;
import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class StepCodeImplementations extends PageObject {

    WebDriver driver = getDriver();
    public void launchURL(String url) {
        driver.get(url);
        waitABit(5000);

    }

    public void userClickAction(String element) throws InterruptedException {
        waitABit(7000);
        By xpathValue;
        WebElementFacade button ;

        switch (element){
            case "Text Box" : xpathValue = By.xpath("(//*[@id='item-0'])[1]"); break;
            case "Banner" : xpathValue = By.xpath("//*[@class='banner-image']");break;
            case "SearchButton" : xpathValue =By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']");break;
             default : xpathValue= Locators.elementName(element) ;
        }
       // waitFor(button);
        button = find(xpathValue);
        if(isElementVisible(xpathValue)){
             button.click();}

    }

    public void userEnters(String value,String element) throws InterruptedException {
        waitABit(2000);
        WebElementFacade field = find(Locators.fieldName(element));
        field.type(value);



    }

    public void verifyNewWindow() {
       Set<String> windowHandels = getDriver().getWindowHandles();
       String windowTitle = getDriver().getTitle();
        System.out.println(windowTitle);
        String currentWindow = getDriver().getWindowHandle();

        for (String windowHandle : windowHandels) {
            if(currentWindow!=windowHandle){
                getDriver().switchTo().window(windowHandle);
                waitABit(3000);
                Assert.assertTrue(!windowTitle.equals(getDriver().getTitle()));

        }
    }

        }

    public void searchQuery(String search) {

        typeInto($(By.name("q")),search);


    }
}
