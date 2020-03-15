package framework.elements;

import org.openqa.selenium.*;
import framework.utils.UiDriver;

import java.util.List;

public class HtmlElement implements WebElement {

    private WebDriver webDriver;
    private By locator;

    public HtmlElement(WebDriver webDriver, By locator) {
        this.webDriver = webDriver;
        this.locator = locator;
    }

    public HtmlElement(UiDriver uiDriver, By locator) {
        this(uiDriver.getDriver(), locator);
    }

    private WebElement getThisWebElement(){
        return webDriver.findElement(locator);
    }

    @Override
    public void click() {
        getThisWebElement().click();
    }

    @Override
    public void submit() {
        getThisWebElement().submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        getThisWebElement().sendKeys(keysToSend);
    }

    @Override
    public void clear() {
        getThisWebElement().clear();
    }

    @Override
    public String getTagName() {
        return getThisWebElement().getTagName();
    }

    @Override
    public String getAttribute(String name) {
        return getThisWebElement().getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return getThisWebElement().isSelected();
    }

    @Override
    public boolean isEnabled() {
        return getThisWebElement().isEnabled();
    }

    @Override
    public String getText() {
        return getThisWebElement().getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return getThisWebElement().findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return getThisWebElement();
    }

    @Override
    public boolean isDisplayed() {
        return getThisWebElement().isDisplayed();
    }

    @Override
    public Point getLocation() {
        return getThisWebElement().getLocation();
    }

    @Override
    public Dimension getSize() {
        return getThisWebElement().getSize();
    }

    @Override
    public Rectangle getRect() {
        return getThisWebElement().getRect();
    }

    @Override
    public String getCssValue(String propertyName) {
        return getThisWebElement().getCssValue(propertyName);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return getThisWebElement().getScreenshotAs(target);
    }
}
