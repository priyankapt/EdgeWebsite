package com.quinbay.qa.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPage {

    WebDriver driver;

    public DemoPage(WebDriver webDriver){
        driver=webDriver;
    }
    @FindBy(xpath="//input[@type='search']")
    WebElement searchBox;

    @FindBy(xpath = "//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg'")
    WebElement button;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homeTab;

    @FindBy(xpath = "/header/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement button1;
    @FindBy(id = "#billing_first_name")
    WebElement name;
    @FindBy(xpath="//input[@id='billing_last_name']")
    WebElement secname;
    @FindBy(xpath="//input[@id='billing_company']")
    WebElement comname;
    @FindBy(xpath="//input[@id='billing_address_1']")
    WebElement address;
    @FindBy(xpath="//input[@id='billing_city']")
    WebElement address1;
    @FindBy(xpath="//select[@name='billing_state']")
    WebElement state;
    @FindBy(xpath="//input[@id='billing_postcode']")
    WebElement zip;
    @FindBy(xpath="//input[@id='billing_phone']")
    WebElement phone;
    @FindBy(xpath="//input[@id='billing_email']")
    WebElement email;
    @FindBy(xpath="//button[@id='place_order']")
    WebElement Place_order;
    public void clickSearch()
    {

    }
    public void setSearchText(String item) {
        searchBox.sendKeys(item);
    }
    public void setAddress(String item) {
        address.sendKeys(item);
    }

    public void setAddress1(String item) {
        address1.sendKeys(item);
    }

    public void setButton() {
        button.click();
    }

    public void setButton1() {
        button1.click();
    }

    public void setComname(String item) {
        comname.sendKeys(item);
    }

    public void setEmail(String item) {
        email.sendKeys(item);
    }

    public void setPhone(String item) {
        phone.sendKeys(item);
    }

    public void setState(String item) {
        state.sendKeys(item);
    }

    public void setZip(String item) {
        zip.sendKeys(item);
    }
}
