package framework.pages;

import framework.elements.HtmlElement;
import framework.utils.UiDriver;
import org.openqa.selenium.By;

public class ChatPage extends VKBasePage {

    public ChatPage(UiDriver uiDriver) {
        super(uiDriver);
    }

    @Override
    public HtmlElement getUniquePageElement() {
        By locator = By.xpath(RIGHT_MENU_XPATH + "//span[text()='News']");
        return new HtmlElement(uiDriver, locator);
    }

    public boolean isOpenedWith(){
        if(!isOpened()){
            return false;
        }
        //TODO: add implementation
        return false;
    };
}
