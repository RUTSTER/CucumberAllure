package framework.pages;

import framework.elements.HtmlElement;
import framework.utils.UiDriver;
import org.openqa.selenium.By;

public class NewsPage extends VKBasePage{

    public NewsPage(UiDriver uiDriver) {
        super(uiDriver);
    }

    @Override
    public HtmlElement getUniquePageElement() {
        By locator = By.xpath(RIGHT_MENU_XPATH + "//span[text()='News']");
        return new HtmlElement(uiDriver, locator);
    }
}
