package framework.pages;

import framework.elements.HtmlElement;
import framework.utils.UiDriver;

public abstract class VKBasePage {

    protected final String RIGHT_MENU_XPATH = "/html/body/div[@id='page_wrap']//div[@id='page_body']" +
            "//div[@class='im-right-menu' or @id='narrow_column']";

    public final UiDriver uiDriver;

    public VKBasePage(UiDriver uiDriver) {
        this.uiDriver = uiDriver;
    }

    public String getName(){
        return "VKBasePage";
    }

    public abstract HtmlElement getUniquePageElement();

    public boolean isOpened(){
        return getUniquePageElement().isDisplayed();
    }
}
