package steps;

import framework.pages.ChatPage;
import framework.pages.NewsPage;
import framework.pages.VKBasePage;
import framework.utils.PageFactory;
import framework.utils.UiDriver;
import io.cucumber.java8.En;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseSteps implements En {
    private UiDriver uiDriver;

    public BaseSteps(UiDriver uiDriver) {
        this.uiDriver = uiDriver;

        Given("Precondition step", () -> {
            uiDriver.getDriver().navigate().to("https://vk.com/");
            assertThat(1, equalTo(1));
        });

        Given("^Open '(http(?:s|)://[-A-z0-9./_=+@#$%:&?]*)' web page$", (String link) -> {
            System.out.println(link);
            uiDriver.getDriver().navigate().to(link);
        });


//        boolean isChat = !ChatOrEmpty.isEmpty();
//        if (isChat) {
//            pageName = "Chat";
//        }
        And("^The '([A-z]+(?: [A-z]+)*)' (chat |)page is opened$", (String pageName, String ChatOrEmpty) -> {
            VKBasePage page = PageFactory.getPage(pageName, uiDriver);

            String errorMessage = String.format("%s page should be opened!", page.getName());
            assertThat(errorMessage, page.isOpened());
        });
    }

    private void isOpenedForChat(String pageName){
        ChatPage page = (ChatPage) PageFactory.getPage(pageName, uiDriver);

    }
}
