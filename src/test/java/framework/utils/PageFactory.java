package framework.utils;

import framework.pages.VKBasePage;

import java.lang.reflect.Constructor;

public class PageFactory {

    public static VKBasePage getPage(String pageName, UiDriver uiDriver){
        String fullPageName = "framework.pages." + pageName.replaceAll(" ", "") + "Page";
        Object[] args = new Object[]{uiDriver};
        return (VKBasePage) createObject(getConstructor(fullPageName), args);
    }

    private static Constructor<?> getConstructor(String pageName){
        Constructor<?> constructor = null;
        try {
            System.out.println();
            Class<?> cl = Class.forName(pageName);
            constructor = cl.getConstructor(UiDriver.class);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        if(constructor == null){
            throw  new RuntimeException();
        }

        return constructor;
    }


    private static Object createObject(Constructor<?> constructor, Object[] arguments) {

        System.out.println("Constructor: " + constructor.toString());
        Object object = null;

        try {
            object = constructor.newInstance(arguments);
            System.out.println("Object: " + object.toString());
            return object;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return object;
    }
}
