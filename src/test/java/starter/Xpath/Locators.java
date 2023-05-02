package starter.Xpath;

import net.serenitybdd.core.pages.ResolvableElement;
import org.openqa.selenium.By;

public class Locators {

    public static By elementName(String nameOfElement){
        return By.xpath("//*[text()='"+nameOfElement+"']");
    }

    public static By fieldName(String element) {

        switch (element){
            case "Name": return By.id("userName");
            case "Email": return By.id("userEmail");
            case "Address": return By.id("currentAddress");
            default: return null;
        }


    }
}
