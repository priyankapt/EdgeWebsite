package com.quinbay.qa.training.Actions;
import com.quinbay.qa.training.pages.DemoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DemoPageActions {
    public DemoPage demoPage;
    public DemoPageActions(WebDriver driver)
    {
        demoPage=PageFactory.initElements(driver, DemoPage.class);
    }
    public void searchForAnItem(String item){
        demoPage.setSearchText(item);
    }
    public void fillDetails(String item){
        demoPage.setAddress(item);
        demoPage.setAddress1(item);
        /*demoPage.setButton();
        demoPage.setButton1(); */
        demoPage.setComname(item);
        demoPage.setEmail(item);
        demoPage.setPhone(item);
        demoPage.setState(item);
        demoPage.setZip(item);
    }
    public void button()
    {
        demoPage.setButton();
        demoPage.setButton1();
    }
}
