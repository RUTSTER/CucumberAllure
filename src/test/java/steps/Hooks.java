package steps;

import framework.utils.UiDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private UiDriver uiDriver;

    public Hooks(UiDriver uiDriver){
        this.uiDriver = uiDriver;
    }

    @Before
    public void setUp(){
        uiDriver.setUp();
    }

    @After
    public void tearDown(){
        uiDriver.tearDown();
    }
}
